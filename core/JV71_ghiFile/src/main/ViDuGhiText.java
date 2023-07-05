package main;

import java.io.PrintWriter;

public class ViDuGhiText {
	public static void main(String[] args) {
		
		try {
			PrintWriter pw= new PrintWriter("D:\\LEARNING\\CODE\\Java\\TITV\\core\\JV71_ghiFile\\File.txt","UTF-8");
			pw.println("hello Bruce");
			pw.println("DKM");
			pw.println();
			pw.print("DMCS= ");
			pw.println(21);
			
			Student st = new Student(100, "Nguyễn Văn Tèo");
			
			pw.println(st);
			pw.flush();
			pw.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	

}
