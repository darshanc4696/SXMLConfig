package com.spring.Impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.gov.PrimeMinister;
import com.spring.interfaces.Services;

public class IndianNavy implements Services{

	ClassPathXmlApplicationContext nx = null;

	public void setAppContext(ClassPathXmlApplicationContext nx)
	{
		this.nx = nx;
	}
	
	@Override
	public void addressPM() {
		PrimeMinister pm = (PrimeMinister)nx.getBean("pm");
		System.out.println("IndianNavy: "+pm.PM_Name);
		System.out.println("IndianNavy: "+pm);
	}

}
