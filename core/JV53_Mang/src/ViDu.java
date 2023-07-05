import java.util.Arrays;

public class ViDu {
	public static void main(String[] args) {
		// Kiểu nguyên thủy
		int[] mang1 = { 1, 2, 3 };
		String names[] = new String[3];
		names[0] = "Duong";
		names[1] = "Khoi";
		names[2] = "Minh";

		System.out.println("Mang name: " + Arrays.toString(names));
		int i = 0;
		for (String element : names) {

			System.out.println("names[" + i + "] :" + element);
			i++;
		}

		// Copy mảng cách 1
		int[] mang1_a = mang1;
		mang1_a[0] = 100;
		System.out.println("Mảng 1: " + Arrays.toString(mang1));
		System.out.println("Mảng 1_a: " + Arrays.toString(mang1_a));

		// Copy mảng cách 2 - dùng hàm clone
		int[] mang1_b = mang1.clone();
		mang1_a[0] = 50;
		System.out.println("Mảng 1_b: " + Arrays.toString(mang1_a));

		// Copy mảng cách 3 - dùng hàm System.arraycopy
		int[] mang1_c = new int[mang1.length];
		System.arraycopy(mang1, 0, mang1_c, 0, mang1.length);
		mang1_c[0] = 90;
		System.out.println("Mảng 1_c: " + Arrays.toString(mang1_c));

		// Kiểu đối tượng
		String[] mang_doi_tuong = { "TITV", ".vn" };
		String[] mang_doi_tuong1 = mang_doi_tuong;
		mang_doi_tuong1[0] = "";
		System.out.println("Mảng 1: " + Arrays.toString(mang_doi_tuong1));

//		copy cách 2 clone
		String[] mang_doi_tuong2 = mang_doi_tuong.clone();
		mang_doi_tuong2[0] = "50";
		System.out.println("mang_doi_tuong 2: " + Arrays.toString(mang_doi_tuong2));

		// Copy mảng cách 3 - dùng hàm System.arraycopy
		String[] mang_doi_tuong3 = new String[mang_doi_tuong.length];
		System.arraycopy(mang_doi_tuong, 1, mang_doi_tuong3, 1, mang_doi_tuong.length-1);
		
		System.out.println("mang_doi_tuong3: " + Arrays.toString(mang_doi_tuong3));

	}
}
