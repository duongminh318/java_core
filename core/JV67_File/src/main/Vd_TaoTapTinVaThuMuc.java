package main;

import java.io.File;
import java.io.IOException;

public class Vd_TaoTapTinVaThuMuc {
	public static void main(String[] args) {
//		luu y: 
//		ms Window: \ => \\  vidu:"C:\\thumuc1\\thumuc2"
//		linux, masOS: => / | vidu: "/thumuc1/thumuc2/teptin.xxx"
//		kiem traa thu muc hoac tap tin co ton tai khong
		File folder1 = new File("D:\\LEARNING\\CODE\\Java\\TITV\\core\\JV67_File");
		System.out.println("kt folder1 co ton tai khong " + folder1.exists());

		// Tạo thư mục
		// Phương thức mkdir() => Tạo 1 thư mục
		File d1 = new File("D:\\LEARNING\\CODE\\Java\\TITV\\core\\JV67_File\\Directory_1");
		d1.mkdir();
		
		File d2 = new File("D:\\LEARNING\\CODE\\Java\\TITV\\core\\JV67_File\\Directory_1/Directory_2/Directory_3/Directory_4");
		d2.mkdirs();
		
		// Tạo tập tin (có phần mở rộng: .exe, .txt, .doc, .xls .....)
				File file1 = new File("D:\\\\LEARNING\\\\CODE\\\\Java\\\\TITV\\\\core\\\\JV67_File\\\\Directory_1\\Vidu1.txt");
				File file2 = new File("D:\\\\LEARNING\\\\CODE\\\\Java\\\\TITV\\\\core\\\\JV67_File\\\\Directory_1\\Vidu2.pdf");
				try {
					file1.createNewFile();
					file2.createNewFile();
				} catch (IOException e) {
					// Không có quyền tạo tập tin
					// Ổ cứng bị đầy
					// Đường dẫn sai
					e.printStackTrace();
				}

	}
}
