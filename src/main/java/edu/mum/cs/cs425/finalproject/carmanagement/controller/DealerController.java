package edu.mum.cs.cs425.finalproject.carmanagement.controller;

import edu.mum.cs.cs425.finalproject.carmanagement.model.Dealer;
import edu.mum.cs.cs425.finalproject.carmanagement.service.IDealerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import javax.validation.Valid;
import java.time.LocalDate;

@Controller
//@RequestMapping(value = "/carmanagement/dealer")
public class DealerController {

    @Autowired
    private IDealerService dealerService;

    @GetMapping(value={"/carmanagement/dealer/list"})
    public ModelAndView listDealers(@RequestParam(defaultValue = "0") int pageno) {
        ModelAndView mav = new ModelAndView();
        Page<Dealer> dealers = dealerService.getAllDealers(pageno);
        mav.addObject("dealers", dealers);
        mav.addObject("dealersCount", dealers.getContent().size());
        mav.addObject("currentPageNo", pageno);
        mav.addObject("now", LocalDate.now());
        mav.setViewName("dealer/list");
        return mav;
    }

    @GetMapping(value={"/carmanagement/dealer/new"})
    public String newDealerForm(Model model) {
        model.addAttribute("dealer", new Dealer());
        model.addAttribute("now", LocalDate.now());
        return "dealer/new";
    }

    @PostMapping(value = {"/carmanagement/dealer/new"})
    public String registerNewDealer(
            @Valid
            @ModelAttribute("dealer")
            Dealer dealer,
            BindingResult bindingResult,
            Model model
    ) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "dealer/new";
        }
        dealerService.registerNewDealer(dealer);
        return "redirect:/carmanagement/dealer/list";
    }

    @GetMapping(value = {"/carmanagement/dealer/edit/{dealerId}"})
    public String editDealer(@PathVariable Long dealerId, Model model) {
        Dealer dealer = dealerService.getDealerById(dealerId);
        if (dealer != null) {
            model.addAttribute("dealer", dealer);
            return "dealer/edit";
        }
        return "dealer/list";
    }

    @PostMapping(value = {"/carmanagement/dealer/edit"})
    public String updateDealer(@Valid @ModelAttribute("dealer") Dealer dealer,
                                 BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "dealer/edit";
        }
        dealer = dealerService.saveDealer(dealer);
        return "redirect:/carmanagement/dealer/list";
    }

    @GetMapping(value = {"/carmanagement/dealer/delete/{dealerId}"})
    public String deleteDealer(@PathVariable Long dealerId, Model model) {
        dealerService.deleteDealerById(dealerId);
        return "redirect:/carmanagement/dealer/list";
    }

    @RequestMapping(value = "/carmanagement/dealer/search", method = RequestMethod.GET)
    public ModelAndView searchDealers(@RequestParam(value = "searchString", required = false) String searchString, @RequestParam(defaultValue = "0") int pageno, Model model) {
        ModelAndView modelAndView = new ModelAndView();
        Page<Dealer> dealers = dealerService.searchDealers(searchString, pageno);
        modelAndView.addObject("dealers", dealers);
        modelAndView.addObject("searchString", searchString);
        modelAndView.addObject("dealersCount", dealers.getContent().size());
        modelAndView.addObject("currentPageNo", pageno);
        modelAndView.setViewName("dealer/list");
        return modelAndView;
    }
}
