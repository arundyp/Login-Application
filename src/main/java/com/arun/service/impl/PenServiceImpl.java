package com.arun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arun.entity.Pen;
import com.arun.repo.PenRepo;
import com.arun.service.PenService;

@Service
public class PenServiceImpl implements PenService {
	
	@Autowired
	private PenRepo penRepo;

	@Override
	public Pen createPen(Pen pen) {
		Pen save = this.penRepo.save(pen);
		return save;
	}

	@Override
	public List<Pen> getAllPen() {
		
		List<Pen> findAll = this.penRepo.findAll();
		return findAll;
	}

	@Override
	public Pen getPen(int id) {
		 Pen pen = this.penRepo.findById(id).get();
		return pen;
	}
	

}
