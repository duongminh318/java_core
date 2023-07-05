import java.util.Arrays;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Vidu {
	public static void main(String[] args) {
	
		String thongBao = "Hole ";
		String hoVaTen = "Duong Khoi Minh";
		String tenSach;
		tenSach = "Lap trinh Java";
		
		System.out.println("Thong bao: "+ thongBao);
		System.out.println("Ho & Ten: "+hoVaTen);
		System.out.println("Ten sach: "+ tenSach);
		
		int count = 0; // Biến đếm
		String userName = "John"; // Tên người dùng
		double averageScore = 8.5; // Điểm trung bình
		boolean isFinished = true; // Biến kiểm tra đã hoàn thành hay chưa
		
		
		System.out.println(count);
		System.out.println(averageScore);
		System.out.println(isFinished);
		
		final int Hangso=10;
		System.out.println(Hangso);
//		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("nhap a: ");
		int a= sc.nextInt();
		System.out.println("nhap b: ");
		int b= sc.nextInt();
		
		float Thuong=(float) a/b;
		System.out.println("thuong la: "+Thuong);

	}
	
}
