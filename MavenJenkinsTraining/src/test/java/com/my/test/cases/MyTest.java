package com.my.test.cases;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.when;

import my.com.service.CalculatorService;

@RunWith(MockitoJUnitRunner.class)
public class MyTest {
	
	@Mock
	CalculatorService serv;
	
	@Test
	public void testCalculatorService()
	{
		when(serv.add(1, 2)).thenReturn(5);
		Assert.assertEquals(serv.add(1, 2),5);
		
	}
	

}
