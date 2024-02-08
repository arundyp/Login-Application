package com.arun.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arun.entity.Pen;

public interface PenRepo  extends JpaRepository<Pen, Integer>{
	
	Optional<Pen> findByEmail(String email);

}
