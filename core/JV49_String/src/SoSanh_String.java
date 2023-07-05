import java.util.Scanner;

public class SoSanh_String {
	public static void main(String[] args) {
		String s1 = "titv.vn";
		String s2 = "TITV.vn";
		String s3 = "titv.vn";

		// Hàm equals => so sánh 2 chuỗi giống nhau, có phân biệt Hoa Thường
		System.out.println("s1 equals s2: " + s1.equals(s2));
		System.out.println("s1 equals s3: " + s1.equals(s3));

		// Hàm equalsIgnoreCase, so sánh 2 chuỗi giống nhau, ko phân biệt hoa thường
		System.out.println("s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s2));
		System.out.println("s1 equalsIgnoreCase s3: " + s1.equalsIgnoreCase(s3));
		
		// Hàm compareTo => so sánh > < =
				String sv1 = "Nguyễn Văn";
				String sv2 = "Nguyễn Văn A";
				String sv3 = "Nguyễn Văn B";
				String sv4 = "Nguyễn Văn a";
				String sv5= "minh";
				String sv6= "linh d";
				
				
				System.out.println("sv1 compareTo sv2: "+ sv1.compareTo(sv2));
				System.out.println("sv2 compareTo sv3: "+ sv2.compareTo(sv3));
				System.out.println("sv2 compareTo sv4: "+ sv2.compareTo(sv4));
				System.out.println("sv5 compareTo sv6: "+ sv5.compareTo(sv6));
				
				// hàm compareToIgnoreCase => tương tự hàm compareTO, không phân biệt Hoa thường
				System.out.println("Apple comparetoIngnoreCase apple : "+"Apple".compareToIgnoreCase("apple"));
				// Hàm regionMatches => so sánh một đoạn
				String r1 = "TITV.vn";
				String r2 = "TV.v";
				boolean check = r1.regionMatches(2, r2, 0, 4);
				System.out.println(check);
				
				// Hàm startWith => Hàm kiểm tra chuỗi bắt đầu bằng ....
				Scanner sc= new Scanner(System.in);
				System.out.print("nhap cmm so dien thoai do: ");
				String sdt = sc.nextLine();
				boolean check2 =sdt.startsWith("035");
				if(check2)
				{
					System.out.println("Mang viettel");
				}
				else
					System.out.println("Mang lol j deo biet");
				
				
				// Hàm endWith => Hàm kiểm tra chuỗi kết thúc bằng ...
				String tenFile = "I love you.JPG";
				String tenFile2 = "Hoc Java.PDF";
				
				if (tenFile.endsWith(".JPG")) {
					System.out.println("File 1 là hình ảnh!");
				}else if (tenFile.endsWith(".PDF")) {
					System.out.println("File 1 là file PDF!");
				}
				
				if (tenFile2.endsWith(".JPG")) {
					System.out.println("File 2 là hình ảnh!");
				}else if (tenFile2.endsWith(".PDF")) {
					System.out.println("File 2 là file PDF!");
				}
				
	}

}
