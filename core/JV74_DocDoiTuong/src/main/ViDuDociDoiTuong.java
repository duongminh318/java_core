package main;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
public class ViDuDociDoiTuong {
	public static void main(String[] args) {
	
		try {
			File file = new File("D:\\LEARNING\\CODE\\Java\\TITV\\core\\JV74_DocDoiTuong\\file.data");
			InputStream is = new FileInputStream(file);
			ObjectInputStream ois =new ObjectInputStream(is);
			
			SinhVien st = (SinhVien) ois.readObject();
			System.out.println(st.getDiemTrungBinh());
			System.out.println(st);
			ois.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
