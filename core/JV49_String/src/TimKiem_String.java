import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TimKiem_String {
	public static void main(String[] args) {
		String chuoi1 = "cong san nhat dinh phai bi sup do, cong";
		String chuoi2 = "cong";
		String chuoi3 = "cong san nhu long";

		char kytu = 'o';

		// ham indexof(chuoicantim) => tim vi tri xuat hien chuoi
		System.out.println(" vi tri cua chuoi2 trong chuoi1 la: " + chuoi1.indexOf(chuoi2));
		System.out.println(" vi tri cua chuoi2 trong chuoi1 la: " + chuoi1.indexOf("o"));

		// Sử dụng vị trí bắt đầu tim kiếm
		System.out.println("Vị trí của s2 trong chuoi1 là: " + chuoi1.indexOf("san", 0));

		// Tìm kiếm char
		System.out.println("Vị trí của kytu trong chuoi1 là: " + chuoi1.indexOf(kytu));
		System.out.println("Vị trí của kytu trong chuoi1 là: " + chuoi1.indexOf(kytu, 20));

		// Hàm lastIndexof => tìm kiếm từ phải sang trái, tìm cuoi cung
		System.out.println("Vị trí của chuoi2 trong chuoi1 (từ phải sang trái) là: " + chuoi1.lastIndexOf(chuoi2));

		Scanner scanner = new Scanner(System.in);

		// Nhập câu từ người dùng
		System.out.print("Nhập câu: ");
		String sentence = scanner.nextLine();

		// Nhập từ cần tìm kiếm
		System.out.print("Nhập từ cần tìm: ");
		String word = scanner.nextLine();

		// Tìm và lưu trữ các vị trí xuất hiện của từ
		List<Integer> positions = new ArrayList<>();
		int lastIndex = -1;

		while (true) {
			lastIndex = sentence.indexOf(word, lastIndex + 1);
			if (lastIndex == -1) {
				break;
			}
			positions.add(lastIndex);
		}

		// Hiển thị kết quả
		if (positions.isEmpty()) {
			System.out.println("Từ '" + word + "' không xuất hiện trong câu.");
		} else {
			System.out.println("Từ '" + word + "' xuất hiện tại các vị trí sau trong câu:");
			for (int position : positions) {
				System.out.println(position);
			}
		}

	}

}
