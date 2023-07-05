import java.util.Scanner;
import java.math.*;


public class HinhTron {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("moi thim nhap ban kinh r: ");
		double r= sc.nextDouble();
		
		double chuVi, Dientich;
		String s= "a";
		//tính chu vi
		chuVi = 2*Math.PI*r;
		System.out.println("Chu vi = "+ chuVi);
		System.out.println("Chu vi = "+ Math.round(chuVi));
		System.out.println("Chu vi = "+ Math.round(chuVi*100.0)/100.0);
	
		// tinh dien tich
		Dientich=Math.PI*Math.pow(r, 2);
		System.out.println("Dien tich = "+ Dientich);
		System.out.println("Dien tich = "+ Math.round(Dientich));
		System.out.println("Dien tich = "+ Math.round(Dientich*100.0)/100.0);
		
		
	}

}
