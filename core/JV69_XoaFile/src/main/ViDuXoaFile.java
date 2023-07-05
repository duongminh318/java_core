package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class ViDuXoaFile {
//	xoa tu trong ra ngoai
	public static void xoaFile(File fx) {
		if(fx.isFile()==true) {
			// Xoa neu la tap tin
			System.out.println("Da xoa: "+fx.getAbsolutePath());
			//fx.delete();
		}else if (fx.isDirectory()) {
			// Lay cac file con
			File[] mangCon = fx.listFiles();
			for(File f: mangCon) {
				// Xoa cac file con
				xoaFile(f);
			}
			// Xoa ban than thu muc sau khi da xoa cac file con
			System.out.println("Da xoa: "+fx.getAbsolutePath());
			//fx.delete();
		}
	}
// hàm files.delete
	 public static void xoaThuMuc(Path thuMuc) throws IOException {
	        // Kiểm tra xem thư mục có tồn tại hay không
	        if (Files.exists(thuMuc)) {
	            // Sử dụng Files.walk để lặp qua tất cả các tệp tin và thư mục bên trong thư mục được truyền vào
	            Files.walk(thuMuc)
	                    // Sắp xếp danh sách các đường dẫn theo thứ tự ngược lại để xóa các tệp tin và thư mục con trước
	                    .sorted(java.util.Comparator.reverseOrder())
	                    // Sử dụng forEach để xử lý từng đường dẫn
	                    .forEach(path -> {
	                        try {
	                            // Xóa từng tệp tin và thư mục
	                            Files.delete(path);
	                        } catch (IOException e) {
	                            // Xử lý ngoại lệ nếu không thể xóa đường dẫn
	                            System.out.println("Không thể xóa: " + path);
	                        }
	                    });
	        }
	    }

	
	public static void main(String[] args) {
		
//	cách 1:	su dung class file xoa tap tin hoac thu muc
		File f0= new File("D:\\LEARNING\\CODE\\Java\\TITV\\core\\JV69_XoaFile\\F0");
		File f0_1= new File("D:\\LEARNING\\CODE\\Java\\TITV\\core\\JV69_XoaFile\\F0_1");
		File f_vidu= new File("D:\\LEARNING\\CODE\\Java\\TITV\\core\\JV69_XoaFile\\a.txt");
		File rong= new File("D:\\LEARNING\\CODE\\Java\\TITV\\core\\JV69_XoaFile\\rong");
		File rong2= new File("D:\\LEARNING\\CODE\\Java\\TITV\\core\\JV69_XoaFile\\backup");
//		f0.delete();
//		f0.deleteOnExit();
		//f0_1.deleteOnExit(); // xoa duoc vi la thu muc rong
		//f0_1.mkdir();
		System.out.println(f0_1.exists());
		//f_vidu.deleteOnExit();  // xoa duoc vi la tap tin
		//rong.delete();	
		
//		ViDuXoaFile.xoaFile(rong2);
		
// Su dung class Files xoa tap tin va thu muc
		
		Path p0 = f0.toPath();
		Path p0_1 = f0_1.toPath();
		Path p_vidu = f_vidu.toPath();
//		try {
//			//Files.deleteIfExists(p0);
//			Files.deleteIfExists(p0_1);
//			Files.deleteIfExists(p_vidu);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}	
		 try {
	            xoaThuMuc(p0);
	            System.out.println("Đã xóa thư mục thành công.");
	        } catch (IOException e) {
	            System.out.println("Không thể xóa thư mục: " + e.getMessage());
	        }
	}

}
