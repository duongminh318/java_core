
public class XuLy {
	public static void main(String[] args) {
		String s1 = "tItv";
		String s2 = ".Vn";

		String s3 = s1 + s2;
		// Hàm concat => nối chuỗi
		String s4 = s1.concat(s2);
		System.out.println("s3= " + s3);
		System.out.println("s4= " + s4);

		// Hàm replaceAll => thay thế
		String s5 = "Tung.vn";
		String s6 = s5.replaceAll("Tung", "TITV");
		System.out.println("s6 = " + s6);

		// toLowerCase => chuyển về viết thường
		// toUpperCase => chuyển về viết hoa
		String s7 = s3.toLowerCase();
		String s8 = s3.toUpperCase();
		System.out.println("s7 = " + s7);
		System.out.println("s8 = " + s8);

		// trim() => xóa khoảng trắng dư thừa ở đầu chuỗi
		String s9 = "Xin chào các bạn, mình là TITV.vn    ";
		System.out.println(s9.trim());

		/// subString => cắt chuỗi con
		String s10 = "Xin chào các bạn, mình là TITV.vn";
		String s11 = s10.substring(10);
		String s12 = s10.substring(10, 15);
		System.out.println("s11 = " + s11);
		System.out.println("s12 = " + s12);
	}

}
