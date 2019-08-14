package edu.mum.cs.cs425.finalproject.carmanagement.service.impl;


import edu.mum.cs.cs425.finalproject.carmanagement.model.Dealer;
import edu.mum.cs.cs425.finalproject.carmanagement.repository.IDealerRepository;
import edu.mum.cs.cs425.finalproject.carmanagement.service.IDealerService;
import org.apache.el.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.servlet.RequestDispatcher;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

@Service
public class DealerServiceImpl implements IDealerService {

    @Autowired
    private IDealerRepository dealerRepository;

    @Override
    public List<Dealer> getAllDealers() {
        return dealerRepository.findAll(Sort.by("dealerNumber"));
    }

    @Override
    public Page<Dealer> getAllDealers(int pageNo) {
        return dealerRepository.findAll(PageRequest.of(pageNo, 3, Sort.by("dealerNumber")));
    }

    @Override
    public Dealer registerNewDealer(Dealer dealer) {
        return dealerRepository.save(dealer);
    }

    @Override
    public Dealer getDealerById(Long dealerId) {
        return dealerRepository.findById(dealerId).orElse(null);
    }

    public Dealer saveDealer(Dealer dealer) {

        return dealerRepository.save(dealer);
    }


    @Override
    public void deleteDealerById(Long dealerId) {
        dealerRepository.deleteById(dealerId);
    }

    @Override
    public Optional<Dealer> findByDealerNumber(String dealerNumber) {
        return dealerRepository.findDealerByDealerNumber(dealerNumber);
    }

    @Override
    public Page<Dealer> searchDealers(String searchString, int pageNo) {

            return dealerRepository.findAllByDealerNumberContainingOrNameContainingOrAddressContainingOrWebsiteContainingOrPhoneNumberContainingOrEmailContaining
                    (searchString, searchString, searchString, searchString, searchString, searchString, PageRequest.of(pageNo, 3, Sort.by("dealerNumber")));

    }
}
