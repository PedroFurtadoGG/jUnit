package test;

import org.junit.Assert;
import org.junit.Test;

import classes.ConversorTemperatura;
import classes.TemperaturaCelsius;


public class Teste {
	
	@Test
	public void testadorCelsiusFaren() {		
		Assert.assertEquals(104.3, ConversorTemperatura.converteCelsiusParaFarenheit(40.0), 0.5);
	}
	
	@Test
	public void testadorFarenheitCelsius() {		

		Assert.assertEquals(10.0, ConversorTemperatura.converteFarenheitCelsius(50.0), 0.0);
	}
	
	@Test
	public void testadorTemperaturaCelsius() {		

		TemperaturaCelsius instance = new TemperaturaCelsius(0);
		double expResult = 32.0;
		Assert.assertEquals(expResult, instance.converteCelsiusParaFahrenheit(), 0.0);
	}
}
