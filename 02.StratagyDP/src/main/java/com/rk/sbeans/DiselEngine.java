package com.rk.sbeans;

import org.springframework.stereotype.Component;

@Component("dEngg")
public class DiselEngine implements Engine{

	public DiselEngine() {
		System.out.println("0-Parm Conructor of DiselEngine()");
	}
	
	@Override
	public void start() {

		System.out.println("Disel Engine Start");
	}

	@Override
	public void stop() {

		System.out.println("Disel Engine Stop");
	}
	

}
