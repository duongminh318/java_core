
import java.util.Scanner;
public class KiemTra_String {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s;
		System.out.println("Nhap vao chuoi: ");
		s= sc.nextLine();
		System.out.println("------");
		
		//ham length() => lay do dai cua chuoi
		 System.out.println(s.length());
		 
		 //ham charAt() => lay ra ky tu tai vi tri bat ky trong chuoi
		 System.out.println(s.charAt(3)); //=> I
		 
		 for (int i=0; i< s.length();i++)
		 {
			 System.out.println("Vi tri "+i+": "+ s.charAt(i));
		 }
		
		 // ham getChars(vi tri bat dau, vi tri ket thuc, 
		 //mang luu du lieu, vt bat dau luu cua mang)
		 System.out.println("----------------");
		 char[] arraychar= new char[100];
		 s.getChars(6, 15, arraychar, 2);
		 for(int i=0; i< arraychar.length;i++) {
			 
			 System.out.println("vi tri "+i+": "+arraychar[i]);
		 }
		 
		 System.out.println("=======");
		 
		 // ham getBytes lay ra cac ky tu tra ve mang
		 // duoi dang so AsCi
		 byte [] arrayBytes = s.getBytes();
		 int stt=1;
		 for (byte b :arrayBytes) {
			 
			 System.out.println("vi tri "+stt+": "+b);
			 stt+=1;
			 
		 }
				 
		
	}
}
