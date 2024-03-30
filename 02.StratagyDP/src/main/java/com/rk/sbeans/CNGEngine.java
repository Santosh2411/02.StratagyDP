package com.rk.sbeans;

import org.springframework.stereotype.Component;

@Component("cEngg")
public class CNGEngine implements Engine{

	public CNGEngine() {
		System.out.println("0-Parm Conructor of CNGEngine()");
	}
	
	@Override
	public void start() {

		System.out.println("CNGEngine Start");
	}

	@Override
	public void stop() {

		System.out.println("CNGEngine Stop");
	}
	

}
