package edu.mum.cs.cs425.finalproject.carmanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import edu.mum.cs.cs425.finalproject.carmanagement.model.Make;
import edu.mum.cs.cs425.finalproject.carmanagement.repository.MakeRepository;
import edu.mum.cs.cs425.finalproject.carmanagement.service.MakeService;

public class MakeServiceImpl implements MakeService{
	
	public static String ORDER_BY_COLUMN_NAME = "makeName";
	
	@Autowired
	private MakeRepository repository;
	
	@Override
	public List<Make> getAllMakes() {
		return repository.findAll(Sort.by(ORDER_BY_COLUMN_NAME));
	}
	
}
