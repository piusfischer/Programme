package rechner;

import Rechner.InvalidFormatException;

public class Rechner{
	public static float[][] multi(float [][]a, float [][]b)throws InvalidFormatException {
		
		if(a[1].length != b.length) {
			throw new InvalidFormatException();
		}
		try {
			float [][]erg = new float [][];
			
			for(int i=0; i<a.length;i++) {
				for(int e=0; e<a[0].length;e++) {
					erg[i][e]=((a[i][e]*b[i][e])+(a[i][e+1]*b[i+1][e]));
				}
			}
			
		}catch(NumberFormatException e) {
			throw new InvalidFormatException();
		}
		
		
		
		return erg;
	}
}
