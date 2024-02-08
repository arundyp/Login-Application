package com.arun.service;

import java.util.List;

import com.arun.entity.Pen;

public interface PenService {
	
	Pen createPen(Pen pen);
	List<Pen> getAllPen();
	Pen getPen(int id);
	

}
