package test;

import static org.junit.Assert.*;

import org.junit.Test;

import Rechner.InvalidFormatException;
import Rechner.Rechner;

public class TDDCalcSum {

	@Test
	public void validInput() throws InvalidFormatException{
		assertEquals(11,Rechner.add("4;7"));
	}
	
	@Test(expected=InvalidFormatException.class)
	public void invalidDelimeter() throws InvalidFormatException {
			Rechner.add("4 7");
	}
	
	@Test(expected=InvalidFormatException.class)
	public void invalidNumber() throws InvalidFormatException {
		Rechner.add("4;a");
	}
	
	@Test 
	public void moreNumbers() throws InvalidFormatException{
		assertEquals(16,Rechner.add("4;4;4;4"));
	}

}
