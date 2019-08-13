package edu.mum.cs.cs425.finalproject.carmanagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import edu.mum.cs.cs425.finalproject.carmanagement.model.Car;
import edu.mum.cs.cs425.finalproject.carmanagement.repository.CarRepository;
import edu.mum.cs.cs425.finalproject.carmanagement.service.CarService;


@Service
public class CarServiceImpl implements CarService {
	
	public static Integer NUM_EACH_PAGE = 10;
	public static String ORDER_BY_COLUMN_NAME = "year";

	@Autowired
	private CarRepository repository;	
	

	@Override
	public Page<Car> getAllCarsPaged(int pageNo) {
		return repository.findAll(PageRequest.of(pageNo, NUM_EACH_PAGE, Sort.by(ORDER_BY_COLUMN_NAME)));
	}

	@Override
	public Car saveCar(Car car) {
		return repository.save(car);
	}

	@Override
	public Car getCarById(Long carId) {
		return repository.findById(carId).orElse(null);
	}
	
	@Override
	public void deleteCarById(Long carId) {
		repository.deleteById(carId);		
	}
}
