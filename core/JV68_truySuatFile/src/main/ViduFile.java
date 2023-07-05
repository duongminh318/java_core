package main;

import java.io.File;

public class ViduFile {
	File file;

	public ViduFile(String tenfile) {
	
		this.file = new File(tenfile);
	}
	
//1	kt quyen thuc thi
	public boolean checkExe() {
		return this.file.canExecute();
	}
	
//2	kt file co the doc
	public boolean checkRead() {
		return this.file.canRead();
	}
	
//3	kt file co the ghi
	public boolean checkWrite() {
		return this.file.canWrite();
	}

//4 in duong dan
	public void printPath() {
		String path= this.file.getAbsolutePath();
		System.out.println(path);
	}
	
//5	in ten file
	public void printFileName() {
		String fileName= this.file.getName();
		System.out.println(fileName);
	}
	
//	6. kt thu muc hoac tap tin
	public String checkFolderFile() {
		String type="";
		if(this.file.isDirectory()) {
			 type="this is folder";
		}else if (this.file.isFile()) {
			 type="this is File";
		
			}
		return type;
	}	
	
//	7. in danh sach cac file con
	// dau tien kiem tra duong dan co dung khong
	// lay ra list file va gan vao mot danh sach- 
	//	sau do duyet mang va xuat ra duong dan
public void inDanhSachCacFileCon() {
	if(this.file.isDirectory()) {
		File[] childList= this.file.listFiles();
		for(File element:childList) {	
			System.out.println(element.getAbsolutePath());
		}
	}else if(this.file.isFile()) {
		System.out.println("This is the File, haven`t data");
	}
}		
public void inCayThuMuc() {
	this.inChiTietCayThucMuc(this.file, 1);
}

public void inChiTietCayThucMuc(File f, int bac) {
    // In các ký tự thụt lề dựa trên mức độ thụt lề tương ứng với số bậc
    for (int i = 0; i < bac; i++) {
        System.out.print("\t");
    }
    System.out.print("|__"); // Đánh dấu thư mục hiện tại
    System.out.println(f.getName()); // In tên thư mục hiện tại
    // Kiểm tra nếu thư mục hiện tại có quyền đọc và là thư mục
    if (f.canRead() && f.isDirectory()) {
        File[] mangCon = f.listFiles(); // Lấy danh sách các file và thư mục con
        for (File fx : mangCon) {
            inChiTietCayThucMuc(fx, bac + 1); // Gọi đệ quy với thư mục con và mức độ thụt lề tăng lên 1
        }
    }
}

}
