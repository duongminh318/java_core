package viDu;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Test {

//	tu viet ham dao nguoc mang
	public static int[] reverse(int[] x) {
		int[] rs = new int[x.length];
		int index = 0;
		for (int i = x.length - 1; i >= 0; i--) {
			rs[index] = x[i];
			index++;
		}
		return rs;
	}
	
//	cách 2
	public static void reverseArray(int[] arr) {
	    int start = 0;
	    int end = arr.length - 1;
	    while (start < end) {
	        int temp = arr[start];
	        arr[start] = arr[end];
	        arr[end] = temp;
	        start++;
	        end--;
	    }
	}

	public static void main(String[] args) {
		int[] a = new int[] { 1, 8, 2, 6, 4, 3, 7, 9 };
		int[] b = new int[15];

//		luc chua sap xep
		System.out.println("a ban dau: " + Arrays.toString(a));

//		ham sap xep
		Arrays.sort(a);
		System.out.println("a sau khi da sap xep: " + Arrays.toString(a));

//		ham tim kiem
		int ketQuaTimKiem = Arrays.binarySearch(a, -9);
		System.out.println(ketQuaTimKiem);

		System.out.println(" co so 5 trong mang khong: " + Arrays.binarySearch(a, 9));

////vi du nhap mang		
//		int[] c= new int[5];
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Input the element of C: ");
//
////	duyet mang
//		for (int i=0; i<c.length; i++) {
//			System.out.print("Input element "+(i+1)+": ");
//			c[i]=sc.nextInt();
//		}
//		
//		System.out.println(Arrays.toString(c));
//		
////		sort
//		Arrays.sort(c);
//		System.out.println("C after Sort: "+Arrays.toString(c));
////		tim kiem sau khi da sap xep
//		
//		System.out.print("Enter the number want find: ");
//		int tim= sc.nextInt();
//		int kqtim= Arrays.binarySearch(c, tim);
//		if(kqtim>=0)
//		{
//			System.out.println(tim+" o vi tri "+kqtim+ " trong mang c");
//		}
//		else {
//			System.out.println(tim+"khong ton tai trong mang c roi thim oi ");
//		}
		Scanner sc = new Scanner(System.in);
		// Hàm điền giá trị
		Arrays.fill(b, 5);
		System.out.println("b sau khi điền giá trị: " + Arrays.toString(b));

		// Hàm sắp xếp giảm dần
		Arrays.sort(a);
		a = Test.reverse(a);
		System.out.println("a sau khi sắp xếp giảm dần: " + Arrays.toString(a));
		
		Test.reverseArray(a);
		System.out.println(Arrays.toString(a));
	}

}
