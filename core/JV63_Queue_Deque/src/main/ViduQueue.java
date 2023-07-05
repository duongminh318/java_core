package main;

import java.util.LinkedList;
import java.util.Queue;

public class ViduQueue {
	public static void main(String[] args) {
		Queue<String> danhSachSV= new LinkedList<String>();
		
		danhSachSV.offer("Duong Khoi Minh");
		danhSachSV.offer("Dep Trai");
		danhSachSV.offer("Khoa To");
		danhSachSV.offer("vo dich thien ha");
	
		while(true) {
			String ten = danhSachSV.poll();  // => lấy ra và xóa
			if(ten==null) {
				break;
			}
			//peek => lấy ra nhưng không xóa.
			System.out.println(ten);
		}
		
		
		
	}

}
