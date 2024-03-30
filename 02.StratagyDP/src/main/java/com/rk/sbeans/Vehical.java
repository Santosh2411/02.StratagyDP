package com.rk.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehical")
public class Vehical {
	
	
	@Autowired
	@Qualifier("dEngg")
	private Engine engg;
	
	public Vehical() {
          System.out.println("0- Param Constructor Vehical()");
	}
	
	public void move(String source,String distination)
	{
		engg.start();
		System.out.println("Journy start..."+source);
		System.out.println("Journy Continues...");
		engg.stop();
		System.out.println("Journy End.."+distination);
		
		
	}
	
	

}
