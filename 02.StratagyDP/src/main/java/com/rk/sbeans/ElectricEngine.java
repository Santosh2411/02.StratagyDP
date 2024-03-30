package com.rk.sbeans;

import org.springframework.stereotype.Component;

@Component("eEngg")
public class ElectricEngine implements Engine{

	public ElectricEngine() {
		System.out.println("0-Parm Conructor of ElectricEngine()");
	}
	
	@Override
	public void start() {

		System.out.println("ElectricEngine Start");
	}

	@Override
	public void stop() {

		System.out.println("ElectricEngine Stop");
	}
	

}
