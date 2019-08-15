package edu.mum.cs.cs425.finalproject.carmanagement.service;

import edu.mum.cs.cs425.finalproject.carmanagement.model.Customer;
import edu.mum.cs.cs425.finalproject.carmanagement.model.Dealer;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    
    public abstract Customer getCustomerByEmail(String email);
    
}   
