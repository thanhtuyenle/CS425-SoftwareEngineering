package edu.mum.cs.cs425.finalproject.carmanagement.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs.cs425.finalproject.carmanagement.model.Car;
import edu.mum.cs.cs425.finalproject.carmanagement.model.Dealer;

@Repository
public interface CarRepository extends JpaRepository<Car, Long>{
	
	Page<Car> findAllByDealer(Dealer dealer, Pageable pageable);

}
