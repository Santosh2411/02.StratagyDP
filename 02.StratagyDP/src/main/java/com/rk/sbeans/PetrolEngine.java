package com.rk.sbeans;

import org.springframework.stereotype.Component;

@Component("pEngg")
public class PetrolEngine implements Engine{

	public PetrolEngine() {
		System.out.println("0-Parm Conructor of PetrolEngine()");
	}
	
	@Override
	public void start() {

		System.out.println("PetrolEngine Start");
	}

	@Override
	public void stop() {

		System.out.println("PetrolEngine Stop");
	}
	

}
