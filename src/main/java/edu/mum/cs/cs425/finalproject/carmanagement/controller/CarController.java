package edu.mum.cs.cs425.finalproject.carmanagement.controller;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import edu.mum.cs.cs425.finalproject.carmanagement.model.Car;
import edu.mum.cs.cs425.finalproject.carmanagement.model.Condition;
import edu.mum.cs.cs425.finalproject.carmanagement.model.Make;
import edu.mum.cs.cs425.finalproject.carmanagement.model.CarModel;
import edu.mum.cs.cs425.finalproject.carmanagement.model.Style;
import edu.mum.cs.cs425.finalproject.carmanagement.service.CarService;
import edu.mum.cs.cs425.finalproject.carmanagement.service.ConditionService;
import edu.mum.cs.cs425.finalproject.carmanagement.service.MakeService;
import edu.mum.cs.cs425.finalproject.carmanagement.service.CarModelService;
import edu.mum.cs.cs425.finalproject.carmanagement.service.StyleService;


@Controller
public class CarController {
	
	@Autowired 
	private CarService carService;
	
	@Autowired 
	private ConditionService conditionService;
	
	@Autowired 
	private MakeService makeService;
	
	@Autowired 
	private CarModelService carModelService;
	
	@Autowired 
	private StyleService styleService;
	
	@GetMapping(value = "/ecarmanagement/secured/car/list")
	public ModelAndView listCars(@RequestParam(defaultValue = "0") int pageno) {
		ModelAndView modelAndView = new ModelAndView();
		Page<Car> cars = this.carService.getAllCarsPaged(pageno);		
        modelAndView.addObject("cars", cars);        
        modelAndView.addObject("carsCount", cars.getTotalPages());        
        modelAndView.addObject("currentPageNo", pageno); 
        modelAndView.addObject("now", LocalDate.now());
        modelAndView.setViewName("secured/car/list");
        return modelAndView;
	}
	
	@GetMapping(value = {"/ecarmanagement/secured/car/new"})
    public String displayNewCarForm(Model model) {
        List<Condition> conditions = conditionService.getAllConditions();
        List<Make> makes = makeService.getAllMakes();
        List<CarModel> carModels = carModelService.getAllCarModels();
        List<Style> styles = styleService.getAllStyles();
        model.addAttribute("car", new Car());
        model.addAttribute("conditions", conditions);  
        model.addAttribute("makes", makes);  
        model.addAttribute("carModels", carModels);  
        model.addAttribute("styles", styles);  
        model.addAttribute("now", LocalDate.now());       
        
        return "secured/car/new";
    }
	
	
	
	@PostMapping(value = {"/ecarmanagement/secured/car/new"})
    public String addNewCar(@Valid @ModelAttribute("car") Car car,    								    		
                                     BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            List<Condition> conditions = conditionService.getAllConditions();
            List<Make> makes = makeService.getAllMakes();
            List<CarModel> carModels = carModelService.getAllCarModels();
            List<Style> styles = styleService.getAllStyles();            
            model.addAttribute("conditions", conditions);  
            model.addAttribute("makes", makes);  
            model.addAttribute("carModels", carModels);  
            model.addAttribute("styles", styles);  
            model.addAttribute("now", LocalDate.now());  
            return "secured/car/new";
        }
        carService.saveCar(car);
        return "redirect:/ecarmanagement/secured/car/list";
    }
	
	@GetMapping(value = {"/ecarmanagement/secured/car/edit/{carId}"})
    public String editCar(@PathVariable Long carId, Model model) {
        Car car = carService.getCarById(carId);
        if (car != null) {
        	model.addAttribute("car", car);
        	List<Condition> conditions = conditionService.getAllConditions();
            List<Make> makes = makeService.getAllMakes();
            List<CarModel> carModels = carModelService.getAllCarModels();
            List<Style> styles = styleService.getAllStyles();            
            model.addAttribute("conditions", conditions);  
            model.addAttribute("makes", makes);  
            model.addAttribute("carModels", carModels);  
            model.addAttribute("styles", styles); 
            return "secured/car/edit";
        }
        return "secured/car/list";
    }

    @PostMapping(value = {"/ecarmanagement/secured/car/edit"})
    public String updateCar(@Valid @ModelAttribute("car") Car car,
                                BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
        	model.addAttribute("errors", bindingResult.getAllErrors());
        	List<Condition> conditions = conditionService.getAllConditions();
            List<Make> makes = makeService.getAllMakes();
            List<CarModel> carModels = carModelService.getAllCarModels();
            List<Style> styles = styleService.getAllStyles();            
            model.addAttribute("conditions", conditions);  
            model.addAttribute("makes", makes);  
            model.addAttribute("carModels", carModels);  
            model.addAttribute("styles", styles); 
            return "secured/car/edit";
        }
        car = carService.saveCar(car);
        return "redirect:/ecarmanagement/secured/car/list";
    }
    
    @GetMapping(value = {"/ecarmanagement/secured/car/delete/{carId}"})
    public String deleteCar(@PathVariable Long carId, Model model) {
    	carService.deleteCarById(carId);
        return "redirect:/ecarmanagement/secured/car/list";
    }
    
  //no paging
//	@GetMapping(value = "/ecarmanagement/secured/car/search")
//	public ModelAndView searchCars(@RequestParam String searchString) {
//		ModelAndView modelAndView = new ModelAndView();
//		List<Car> cars = this.carService.searchCars(searchString);
//        modelAndView.addObject("cars", cars);
//        modelAndView.addObject("searchString", "");
//        modelAndView.addObject("carsCount", cars.size());        
//        modelAndView.setViewName("car/list");
//        return modelAndView;
//	}
	
//	@GetMapping(value = "/ecarmanagement/secured/car/search")
//	public ModelAndView searchCars(@RequestParam(defaultValue = "0") int pageno, @RequestParam String searchString) {
//		ModelAndView modelAndView = new ModelAndView();
//		Page<Car> cars = this.carService.searchCarsPaged(pageno, searchString);
//        modelAndView.addObject("cars", cars);
//        modelAndView.addObject("searchString", searchString);
//        modelAndView.addObject("carsCount", cars.getSize());
//        modelAndView.addObject("currentPageNo", pageno);
//        modelAndView.setViewName("car/list");
//        return modelAndView;
//	}

}
