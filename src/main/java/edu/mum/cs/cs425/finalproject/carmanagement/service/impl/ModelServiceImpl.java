package edu.mum.cs.cs425.finalproject.carmanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import edu.mum.cs.cs425.finalproject.carmanagement.model.Model;
import edu.mum.cs.cs425.finalproject.carmanagement.repository.ModelRepository;
import edu.mum.cs.cs425.finalproject.carmanagement.service.ModelService;

public class ModelServiceImpl implements ModelService{
	
	public static String ORDER_BY_COLUMN_NAME = "modelName";
	
	@Autowired
	private ModelRepository repository;
	
	@Override
	public List<Model> getAllModels() {
		return repository.findAll(Sort.by(ORDER_BY_COLUMN_NAME));
	}
	
}
