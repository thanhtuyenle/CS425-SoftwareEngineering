package edu.mum.cs.cs425.finalproject.carmanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "styles")
public class Style {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	@NotBlank(message = "* Style is required")
	@Column(nullable = false, unique = true)
	private String styleName;

}
