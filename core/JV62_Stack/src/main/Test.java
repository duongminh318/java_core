package main;

import java.util.Scanner;
import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		Stack stackChuoi = new Stack();
//		stackChuoi.push("giatri");
//		stackChuoi.push("giatri2");
//		String chuoi = (String) stackChuoi.peek();
//		System.out.println(chuoi);
//		System.out.println(stackChuoi.size());
//		System.out.println(stackChuoi.contains("giatri3"));
//		System.out.println(stackChuoi.pop());
//		stackChuoi.clear();
//		System.out.println(stackChuoi.size());
		

//		Stack<String> stackChuoi= new Stack<String>();
//		System.out.println("Enter the String");
//		String s=sc.nextLine();
//		//TITV
//		for(int i=0; i<s.length();i++) {
//			stackChuoi.push(s.charAt(i)+"");
//		}
//		System.out.println("reverse string: ");
//		for(int i=0; i<s.length();i++) {
//			System.out.print(stackChuoi.pop());
//		}
	
//		vi du chuyển từ hệ thập phân sang hệ nhị phân
		Stack<Integer> stackSoDu= new Stack<Integer>();
		System.out.println("Enter an interger num : ");
		int x= sc.nextInt();
		while(x>0) {
			int soDu=x%2;
			stackSoDu.push(soDu);
			x=x/2;
			
		}
		int n=stackSoDu.size();
		System.out.println("convert decimal to binary: ");
		for(int i=0; i<n;i++) {
			System.out.print(stackSoDu.pop());
		}
		
		
	}
}
