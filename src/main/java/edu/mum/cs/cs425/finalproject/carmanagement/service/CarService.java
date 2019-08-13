package edu.mum.cs.cs425.finalproject.carmanagement.service;

import org.springframework.data.domain.Page;

import edu.mum.cs.cs425.finalproject.carmanagement.model.Car;

public interface CarService {

//	public abstract List<Citizen> getAllCitizens();
	public abstract Page<Car> getAllCarsPaged(int pageNo);
	public abstract Car saveCar(Car car);
//	public abstract Double getTotalYearlyIncome();
	
//	public abstract Citizen getCitizenById(Long productId);	
//	public abstract Optional<Citizen> findByCitizenNumber(Long productNumber);	
}
