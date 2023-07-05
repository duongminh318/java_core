
public class Test {
	public static void main(String[] args) {
		MyMath mm= new MyMath();
		int min1= mm.timMin(111, 12);
		System.out.println(min1);
		
		int arr[]= new int[] {1, 2, -3, 4, 5};
		int min2=mm.timMin(arr);
		System.out.println(min2);
		double arr2[]= new double[] {1, 2, -3, 4, 5.5};
		System.out.println("tong: "+mm.sum(arr2));
		

		System.out.println(mm.sum(4, 11));
		
	}
	
	
	

}
