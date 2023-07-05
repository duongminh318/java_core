package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RutThamTrungThuong_HashSet {
Set thungPhieuDuThuong = new HashSet();
	



//	public RutThamTrungThuong_HashSet() {
//	}
	
	public boolean themPhieu(String giaTri) {
		return this.thungPhieuDuThuong.add(giaTri);
	}
	
	public boolean xoaPhieu(String giaTri) {
		return this.thungPhieuDuThuong.remove(giaTri);
	}
	
	public boolean kiemTraPhieuTonTai(String giaTri) {
		return this.thungPhieuDuThuong.contains(giaTri);
	}
	
	public void xoaTatCaPhieuDuThuong() {
		this.thungPhieuDuThuong.clear();
	}
	
	public int laySoLuong() {
		return this.thungPhieuDuThuong.size();
	}
	

	
//	xuất ra ngẫu nhiên một phần tử trong hashset
	public String rutMotPhieu() {
		String ketQua = "";
		Random rd = new Random();
		int viTri = rd.nextInt(this.thungPhieuDuThuong.size());
		ketQua = (String) this.thungPhieuDuThuong.toArray()[viTri];
		return ketQua;
	}
	
	public void inTatCa() {
		System.out.println(Arrays.toString(this.thungPhieuDuThuong.toArray()));
		// tương tụ xuât ra một phiêu ở trên nhưng gán vào một mảng và xuất hết ra
	}
	
//	mot so ham tu mo
//	kiểm tra xem hashset có rông hay không
	public boolean kTRong() {
		return this.thungPhieuDuThuong.isEmpty();
	}
	
	
	public static void main(String[] args) {
		int luaChon = 0;
		Scanner sc = new Scanner(System.in);
		RutThamTrungThuong_HashSet rt = new RutThamTrungThuong_HashSet();
		do {
			System.out.println("--------------------------------------");
			System.out.println("MENU: ");
			System.out.println("1. Add bonus code..");
			System.out.println("2. Delete the bonus code.");
			System.out.println("3. Check if the bonus code exists or not?");
			System.out.println("4. Delete all coupons.");
			System.out.println("5. Number of coupons.");
			System.out.println("6. Sweepstakes.");
			System.out.println("7. Print out all the votes.");
			System.out.println("8. Check the box is empty");
			System.out.println("0. Exit the program");
			luaChon = sc.nextInt();
			sc.nextLine();
			if(luaChon==1 || luaChon==2||luaChon==3) {
				System.out.println("Enter the coupon code: ");
				String giaTri = sc.nextLine();
				if(luaChon==1) {
					rt.themPhieu(giaTri);
				}else if(luaChon==2) {
					rt.xoaPhieu(giaTri);
				}else {
					System.out.println("Test results: "+rt.kiemTraPhieuTonTai(giaTri));
				}
			}else if(luaChon==4) {
				rt.xoaTatCaPhieuDuThuong();
			}else if(luaChon==5) {
				System.out.println("The number of votes is: "+ rt.laySoLuong());
			}else if(luaChon==6) {
				System.out.println("The winning code is: "+ rt.rutMotPhieu());
			}else if(luaChon==7) {
				System.out.println("The coupon codes are:: ");
				rt.inTatCa();
			}else if(luaChon==0) {
				System.out.println("Good Bye");
			}else if(luaChon==8) {
				
				System.out.println("The ballot box is empty: "+rt.kTRong());
			}
			
		}while(luaChon!=0);
	}
}
