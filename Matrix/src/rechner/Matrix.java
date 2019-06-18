package rechner;

public class Matrix

{
	private float value;
	private float[] [] array;
	public Matrix(float[] [] a)
	{
		array=a;
	}
	public Matrix(int row, int colums) {
		array = new float [row][colums];
	}


	public float[][] multiMatrix(Matrix m2) throws InvalidCalculationException 
	{
		float[] [] array2=m2.getArray();
		float[] [] arrayneu = new float[array.length][array2[0].length];
		
		if (array.length!=array2[0].length)
		{
			throw new InvalidCalculationException();
		}
		
		
		for(int i=0;i<array2[0].length;i++)
		{
			for(int a=0;a<array2.length;a++)
			{
				for(int j=0;j<array[0].length;j++)
				{
					arrayneu[a][i]+=array[a][j]*array2[j][i];
				}
			}
		}
		
		return arrayneu;
		
	}
	
	public float[][] skalMul(float wert) 
	{
		float[] [] arrayneu = new float[array.length][array[0].length];
		// TODO Auto-generated method stub
		for(int i=0;i<array[0].length;i++)
		{
			for(int a=0;a<array.length;a++)
			{
				arrayneu[i][a]+=array[i][a]*wert;
			}
		}
		return arrayneu;
	}
	
	public float[][] addMatrix(Matrix m2)
	{
		float[] [] array2=m2.getArray();
		float[] [] arrayneu = new float[][]{{4,2},{2,3}};
		for (int i=0;i<array2.length;i++)
		{
			for (int a=0;a<array2[0].length;a++)
			{
				arrayneu[i][a]=array2[i][a]+array[i][a];
			}
		}
		
		return arrayneu;
	}
	
	

	private float[][] getArray() {
		// TODO Auto-generated method stub
		return array;
	}

	public boolean equalsM(float[][] c) {
		// TODO Auto-generated method stub
		boolean kontrolle=false;
		for(int i=0;i<array.length;i++)
		{
			for(int a=0;a<array.length;a++)
			{
				if(c[i][a]==array[i][a])
				{
					kontrolle=true;
				}
				else
				{
					kontrolle=false;
				}
			}
		}
		return kontrolle;
		
	}
	
	
	public float[][] sigmMatrix()
	{
		
		for (int i=0;i<array.length;i++)
		{
			for (int a=0;a<array[0].length;a++)
			{
				
				array[i][a]=(float) (1 / (1 + Math.exp(-array[i][a])));
				array[i][a]= (float) (Math.round(100.0*array[i][a])/100.0);
				
			}
			
		}
		return array;
	}
	
	public void setValue(float[][] a) throws InvalidArrayLengthException{
		if(a.length==this.array.length&& a[0].length==this.array[0].length) {
			for(int i=0;i<this.array.length;i++)
			{
				for(int e=0;e<this.array[0].length;e++)
				{
					this.array[i][e]=a[i][e];
				}
			}
		}
		else
		{
			throw new InvalidArrayLengthException();
		}
	}
	
	public int getRow() {
		return array.length;
	}
	public int getColum() {
		return array[0].length;
	}


	

	

}