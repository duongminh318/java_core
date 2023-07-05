package Test;
import java.io.File;
import java.util.Scanner;

import main.DanhSachSinhVien;

import main.SinhVien;
public class Test {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		DanhSachSinhVien dssv= new DanhSachSinhVien();
		int luaChon=0;
		do {
			System.out.println("MENU...+++++++______====");
			System.out.println("====Please choice Function===:");
			System.out.println( ""
					+ "1.	add a studen to the list .\n"
					+ "2.	Print the list of students on the screen.\n"
					+ "3.	Check if the list is empty or not.\n"
					+ "4.	Get the number of students in the list.\n"
					+ "5.	Empty the list of students.\n"
					+ "6.	Check if a student exists in the list, based on student ID.\n"
					+ "7.	Remove a student from the list based on student ID.\n"
					+ "8.	Search all students based on Name entered from keyboard.\n"
					+ "9.	Output a list of students with high to low scores.\n"
					+ "10.	Save in TXT.FIle.\n"
					+ "0.   Exit the program");
			luaChon=sc.nextInt();
			sc.nextLine();
				if(luaChon==1) {
					System.out.println("you have selected 1: add student:  ");
					System.out.println("Enter the ID of student: ");
					String maSinhVien= sc.nextLine();
					
					System.out.println("Enter the Name of student: ");
					String hoVaTen= sc.nextLine();
					
					System.out.println("Enter the Birday year of student: ");
					int namSinh= sc.nextInt();
					
					System.out.println("Enter the GPA of student");
					float diemTrungBinh= sc.nextFloat();
					SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
				
					dssv.themSinhVien(sv);
					System.out.println("add done");
				}	
				else if(luaChon==2) {
//					System.out.println("2.	Print the list of students on the screen.");
					dssv.inDanhSachSinhVien();
					
				}else if(luaChon==3) {
					Boolean empty= dssv.kiemTraDanhSachRong();
					if(empty) {
						
						System.out.println("The List is Empty");
					}
					else
					{
						
						System.out.println("The List is NOT Empty");
					}
					
					
				}else if(luaChon==4) {
					System.out.println("number of students in the list: "+dssv.laySoLuongSV());
					
				}else if(luaChon==5) {
					System.out.println("Remove all ");
					dssv.lamRongToanDS();
				}else if(luaChon==6) {
					System.out.println("Check if a student exists in the list, based on student ID");
					System.out.println("Enter the ID of student: ");
					String maSinhVien= sc.nextLine();
					
					SinhVien sv= new SinhVien(maSinhVien);
					System.out.println("check the student in the list: "+dssv.kiemTraTonTai(sv));
					
				}else if(luaChon==7) {
					
					System.out.println("you want delete_ Enter the ID of student you want delete: ");
					String maSinhVien= sc.nextLine();
					
					SinhVien sv= new SinhVien(maSinhVien);
					System.out.println("delete a student in the list"+dssv.xoaSinhVien(sv));
					
				}else if(luaChon==8) {
//					8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.
					System.out.println("Nhập họ và tên: "); String hoVaTen = sc.nextLine();
					System.out.println("Kết quả tìm kiếm: ");
					dssv.timSinhVien(hoVaTen);
					
				}else if(luaChon==9) {
//					9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.
					dssv.sapXepSinhVienGiamDanTheoDiem();
					dssv.inDanhSachSinhVien();
					
				}else if(luaChon==0) {
					System.out.println("Good Bye");
				}else if(luaChon==10) {
//					System.out.println("Nhập họ và tên: "); String hoVaTen = sc.nextLine();
//					System.out.println("Nhap ten file: ");
//					String tenFile = sc.nextLine();
					File f = new File("D:\\LEARNING\\CODE\\Java\\TITV\\core\\JV73_ghiDoiTuongXuongFile\\File.data");
					dssv.ghiDuLieuXuongFile(f);
				}
				else {
					System.out.println("choice does not exist");
				}
				
				
				
		}while(luaChon!=0);
	}
}
