package com.arun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.arun.entity.Pen;
import com.arun.service.PenService;

@RestController
public class PenController {

	@Autowired
	private PenService penService;

	// get All pen
	@GetMapping("/pen")
	public List<Pen> getAll() {

		List<Pen> allPen = this.penService.getAllPen();
		return allPen;
	}

	// get Single pen

	@GetMapping("/pen/{id}")
	public Pen getSinglePen(@PathVariable int id) {
		Pen pen = this.penService.getPen(id);

		return pen;

	}
	
	
	//create pen
	
	@PostMapping("/")
	public Pen createPens(@RequestBody Pen pen) {
		
		Pen createPen = this.penService.createPen(pen);
		
		return createPen;
	}
	
	

}
