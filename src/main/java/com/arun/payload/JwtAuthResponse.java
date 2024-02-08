package com.arun.payload;

import com.arun.entity.Pen;

import lombok.Data;

@Data
public class JwtAuthResponse {

	private String token;
	
	private Pen user;
}
