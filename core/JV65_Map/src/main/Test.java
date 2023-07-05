// -*- coding: utf-8 -*-
package main;
import java.util.Scanner;
import java.util.Locale;

public class Test {
	
	public static void main(String[] args) {
		

		TuDien tuDien= new TuDien();
		int luaChon =0;
		Scanner sc= new Scanner(System.in);
		do {
			System.out.println("---------------");
			System.out.println("MENU ");
			System.out.println("Dictionary English- VietNamese:\n"
					+ "1. Add word (Keywords, Meaning)\n"
					+ "2. Delete word từ\n"
					+ "3. Find the meaning of the keyword ⇒ Search Word\n"
					+ "4. Print out a list of keywords\n"
					+ "5. Get word count\n"
					+ "6. Remove all keywords\n"
					+ "0. Exit the program\n"
					+ "");
			luaChon = sc.nextInt(); sc.nextLine();
			if(luaChon==1) {
				System.out.println("Enter the Keyword: ");
				String tuKhoa = sc.nextLine();
				System.out.println("Enter the meaning: ");
				String yNghia = sc.nextLine();
				tuDien.add(tuKhoa, yNghia);
			}else if(luaChon==2 || luaChon==3) {
				System.out.println("Enter the Keyword: ");
				String tuKhoa = sc.nextLine();
				if(luaChon==2) {
					tuDien.delete(tuKhoa);
				}else {
					System.out.println("Meaning is: "+ tuDien.Search(tuKhoa));
				}
			}else if(luaChon==4) {
				tuDien.printKey();;;
			}else if(luaChon==5) {
				System.out.println("The number of keywords is: "+tuDien.laySoLuong());
			}else if(luaChon==6) {
				tuDien.xoaTatCa();;
			}
		}while(luaChon!=0);
	}

	

}
