package com.spring.Impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.gov.PrimeMinister;
import com.spring.interfaces.Services;

public class IndianArmy implements Services{
	
	ClassPathXmlApplicationContext ax = null;

	public void setAppContext(ClassPathXmlApplicationContext ax)
	{
		this.ax = ax;
	}
	
	@Override
	public void addressPM() {
		PrimeMinister pm = (PrimeMinister)ax.getBean("pm");
		System.out.println("IndianArmy: "+pm.PM_Name);
		System.out.println("IndianArmy: "+pm);
	}

}
