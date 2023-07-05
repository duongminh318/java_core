import java.util.Arrays;

public class Test {
	public static void main(String[] args) {

		String s = "Xin chào các bạn, tui là Peter!";

		String[] a = s.split(" ");
		System.out.println(Arrays.toString(a));

		String[] b = s.split(",");
		System.out.println(Arrays.toString(b));

		String s2 = "Xin chào, mình là Peter. Mình là lập trình viên!";
		String[] c = s2.split("\\.|\\,");
		System.out.println(Arrays.toString(c));

		String s3 = "Nguyen Van A";
		String[] d = s3.split(" ");
		System.out.println(Arrays.toString(d));
		System.out.println("Tên: " + d[d.length - 1]);
		
		
		String s4 = "Nguyen.Van,A;toan ngoc";
		String[] e = s4.split("\\.|\\,|\\;|\\ ");
		System.out.println(Arrays.toString(e));
	}

}
