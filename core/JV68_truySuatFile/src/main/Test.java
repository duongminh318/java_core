package main;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
//		khoi tao doi tuong thuoc class ViduFile
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the File Name: ");
		String tenFile= sc.nextLine();
		ViduFile vdf= new ViduFile(tenFile);
		
//		tao MENU
		int luaChon=0;
		do {
//			System.out.println("MENU ---------- ");
//			System.out.println("1. Kiểm tra file có thể thực thi: ");
//			System.out.println("2. Kiểm tra file có thể đọc: ");
//			System.out.println("3. Kiểm tra file có thể ghi: ");
//			System.out.println("4. In đường dẫn: ");
//			System.out.println("5. In tên file: ");
//			System.out.println("6. Kiểm tra file là thư mục hoặc tập tin: ");
//			System.out.println("7. In ra danh sách các file con: ");
//			System.out.println("8. In ra cây thư mục: ");
//			System.out.println("0. Thoát chương trình.");
		System.out.println("MENU ---------- ");
		System.out.println("1. Check the executable file: ");
		System.out.println("2. Check file readable: ");
		System.out.println("3. Check writable file: ");
		System.out.println("4. Print path: ");
		System.out.println("5. Print file name: ");
		System.out.println("6. Check file is directory or file: ");
		System.out.println("7. Print out a list of subfiles: ");
		System.out.println("8. Print the directory tree: ");
		System.out.println("0. Exit App.");
			luaChon=sc.nextInt();
			sc.nextLine();
		switch (luaChon) {
		case 1:
			System.out.println(vdf.checkExe());
			break;
		case 2:
			System.out.println(vdf.checkRead());
			break;
		case 3:
			System.out.println(vdf.checkWrite());
			break;
		case 4:
			vdf.printPath();
			break;
		case 5:
			vdf.printFileName();
			break;
		case 6:
			String kqc= vdf.checkFolderFile();
			System.out.println(kqc);
			break;
		case 7:
			vdf.inDanhSachCacFileCon();
			break;
		case 8:
			vdf.inCayThuMuc();
			break;
		default:
			break;
		}
			
		}while(luaChon!=0);
		
	}

}
