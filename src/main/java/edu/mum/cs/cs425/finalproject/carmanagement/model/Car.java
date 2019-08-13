package edu.mum.cs.cs425.finalproject.carmanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "cars")
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	@NotNull(message = "* Year is required")
	@Column(nullable = false)
	private int year;
	
	@NotNull(message = "* Price is required")
	@Column(nullable = false)
	private double price;
	
	@NotNull(message = "* Mileage is required")
	@Column(nullable = false)
	private long mileage;
	
	@NotBlank(message = "* Image path is required")
	@Column(nullable = false)
	private String imagePath;
	
	@ManyToOne
	@JoinColumn(name = "make_id", nullable = false)
	private Make make;
	
	@ManyToOne
	@JoinColumn(name = "model_id", nullable = false)
	private Model model;
	
	@ManyToOne
	@JoinColumn(name = "style_id", nullable = false)
	private Style style;
	
	@ManyToOne
	@JoinColumn(name = "condition_id", nullable = false)
	private Condition condition;

}
