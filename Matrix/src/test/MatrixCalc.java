package test;

import org.junit.Test;

import rechner.InvalidFormatException;
import rechner.Matrix;
import rechner.Rechner;
import rechner.InvalidCalculationException;

public class MatrixCalc {
	
	@Test
	public void invalidMultiplication() throws InvalidCalculationException, InvalidFormatException{
		Matrix a= new Matrix(new int [][] {{1,2},{3,4}});
		Matrix b= new Matrix(new int [][] {{5,6},{7,8}});
		
		//for (int i=0; i<a.getData().length;i++)
		//{
		//	for (int e = 0; e < a.getData()[i].length; e++) {
		//		System.out.print(a.getData()[i][e]);
		//	}
		//	System.out.println();
		//}
		Matrix c= a.multi(b);
		Matrix shouldbeC= new Matrix(new int [][] {{23,34},{31,46}});
		assertTrue(shouldbeC.equals(c));
	}
	
	@Test(expected=InvalidFormatException.class)
	public void invalidFormat() throws InvalidFormatException {
		Matrix a= new Matrix(new int [][] {{1,2,3},{4,5}});
		
		
	}
	
	
	
	
	//a.length gibt die Zeilenanzahl an				00	01	02	
	//a[0].length gibt die Spaltenanzahl an			10	11	12

}
