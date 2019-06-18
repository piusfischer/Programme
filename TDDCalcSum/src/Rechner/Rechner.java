package Rechner;

public class Rechner {
	
	public static int add(String input, String del) throws InvalidFormatException {
		
		String[] stringNumbers = input.split(del);
		int erg=0;
		
		if(stringNumbers.length<2) {
			throw new InvalidFormatException();
		}
		try {
			for(int i=0;i<stringNumbers.length;i++) {
				erg=erg+Integer.parseInt(stringNumbers[i]);
			}
		return erg;
		}catch(NumberFormatException e) {
			throw new InvalidFormatException();
		}
		
	}
	public static int add(String input) throws InvalidFormatException {
		return add(input, ";");
	}
		
		
		

}
