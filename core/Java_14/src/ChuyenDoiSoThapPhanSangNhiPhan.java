
import java.util.Scanner;
public class ChuyenDoiSoThapPhanSangNhiPhan {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen n>0");
		n = sc.nextInt();
		
		String nhiPhan = "";
		while(n>0) {
			nhiPhan = (n%2) + nhiPhan;
			n = n/2;
		}
		System.out.println("So he nhi phan la: "+nhiPhan);
		
		/*
		 * Chia lien tuc cho 2 va lay phan du
		 * Dao nguoc chuoi => Ket qua
		 * 10:2 = 5  du 0
		 * 5:2 = 2 du 1
		 * 2:2 = 1 du 0
		 * 1:2 = 0 du 1
		 * 0
		 * 10
		 * 010
		 * 1010
		 */
	}
}
