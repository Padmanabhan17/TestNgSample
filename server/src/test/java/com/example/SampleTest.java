package com.example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;


public class SampleTest {
	
	static Calculator c; 
	
	
	@BeforeClass
	public void beforeClass() {
		c= new Calculator();
	}

	@AfterClass
	public void afterClass() {
		System.gc();
	}
	

	
	@Test
	  public void testAdd() {
		  assertTrue(c.Add(1,2)==3);
	  }
	
	@Test
	  public void testSub() {
		  assertTrue(c.Sub(3,2)==1);
	  }
	
	@Test
	  public void testMul() {
		  assertTrue(c.Mul(1,2)==2);
	  }
	
	@Test
	  public void testDiv() {
		  assertTrue(c.Div(8,2)==4);
	  }
	
	
	}
