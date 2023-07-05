/*
 * overloading ghi de phuong thuc
 * 
 * */
public class MyMath {
	
	
	public int timMin(int a, int b) {
		
		int min;
		if(a<b)
			min=a;
		else min=b;
		return min;
	}
	
	
	public int timMin(int[] arr) {
		
		int min=arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]<min)
			{
				min= arr[i];
				
			}
			
		}

		return min;
	}
	
	
	public double sum(double[] mang) {
		double sum=0;
		for(int i=0; i<mang.length; i++) {
			
			sum+=mang[i];
		}		
		return sum;
	}
	
	
	public int sum(int a, int b) {	
		return a+b;
	
	}
	
	

}
