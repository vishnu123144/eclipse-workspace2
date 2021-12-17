package com.brillio;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import com.brillio.CalculatorService;

public class CalculatrorServiceTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//create mock object
				CalculatorService dummyObj=Mockito.mock(CalculatorService.class);
				//add the behavior
				Mockito.when(dummyObj.addition(10,10)).thenReturn(20);
				assertEquals(20,dummyObj.addition(10, 10));
				Mockito.verify(dummyObj,times(1)).addition(10,10);
				
			}
	}


