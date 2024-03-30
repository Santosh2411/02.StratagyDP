package com.rk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.rk.sbeans.Vehical;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ApplicationContext ctx=SpringApplication.run(Application.class, args);
	Vehical v=(Vehical) ctx.getBean("vehical",Vehical.class);
	v.move("Pune", "Kanyakumary");
	((ConfigurableApplicationContext) ctx).close();
	}
	

}
