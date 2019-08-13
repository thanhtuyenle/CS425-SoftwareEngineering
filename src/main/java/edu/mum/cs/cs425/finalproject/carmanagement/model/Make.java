package edu.mum.cs.cs425.finalproject.carmanagement.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "makes")
public class Make {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@NotBlank(message = "* Make is required")
	@Column(nullable = false, unique = true)
	private String makeName;
	
	@OneToMany(mappedBy = "make", cascade = CascadeType.ALL)
	List<CarModel> carModels = new ArrayList();

}
