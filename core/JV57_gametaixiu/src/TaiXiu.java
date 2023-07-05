

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
/*
 * Một người chơi sẽ có tài khoản. Người chơi có quyền đặt cược số tiền ít hơn hoặc bằng
 * số tiền họ đang có.
 * Luật chơi như sau:
 * Có 3 viên xúc xắc. Mõi viên xúc có 6 mặt có giá tị từ 1 đến 6.
 * Mỗi lần lắc sẽ ra một kết quả. Kết quả = giá trị xx1 + giá trị xx2 + giá xx3
 * 1. Nếu tổng = 3 hoặc 18 => Cái ăn hết, người chơi thua.
 * 2. Nếu tổng = (4->10) <-> xỉu => nếu người chơi đặt xỉu thì người chơi thắng, ngược lại thua
 * 3. Nếu tổng = (11-17) <-> tài => nếu người chơi đặt xỉu thì người chơi thắng, ngược lại thua
 */
public class TaiXiu {
	public static void main(String[] args) {
		double taiKhoanNguoiChoi = 5000000.99;
		Scanner sc = new Scanner(System.in);

		//Locale lc = new Locale("vi", "VN");
		// NumberFormat numf = NumberFormat.getInstance(lc);
		// NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
		Locale lc = new Locale("en", "US");
		NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
		
		int luaChon = 0;
		do {
			System.out.println("----------- Moi Ban Chon -----------");
			System.out.println("Chọn (1) để tiếp tục chơi.");
			System.out.println("Chọn (phím kỳ) để tiếp thoát.");
			luaChon = sc.nextInt();
			if(luaChon==1) {
				System.out.println("*** BẮT ĐẦU CHƠI: ");
				// đặt cược
				System.out.println("****** Tài khoản của bạn: " + numf.format(taiKhoanNguoiChoi)
						+ "    , bạn muốn cược bao nhiêu? ");
				double datCuoc = 0;
				do {
					System.out.println("****** Đặt cược (0< so tien cuoc <="+ taiKhoanNguoiChoi+": ");
					datCuoc=sc.nextDouble();
					}while(datCuoc<=0 || datCuoc>taiKhoanNguoiChoi);
				
				// Chọn tài xỉu
				int luaChonTaiXiu = 0;
				do {
					System.out.println("****** Chon: 1<-> Tài hoặc 2 <-> Xỉu");
					luaChonTaiXiu = sc.nextInt();
				} while (luaChonTaiXiu != 1 && luaChonTaiXiu != 2);
				
				
				// Tung xúc xắc
				Random xucXac1 = new Random();
				Random xucXac2 = new Random();
				Random xucXac3 = new Random();

				int giaTri1 = xucXac1.nextInt(5) + 1;
				int giaTri2 = xucXac2.nextInt(5) + 1;
				int giaTri3 = xucXac3.nextInt(5) + 1;
				int tong = giaTri1 + giaTri2 + giaTri3;
				// Tinh toán kết quả:
				System.out.println("****** Kết quả: " + giaTri1 + " - " + giaTri2 + " - " + giaTri3);
				if (tong == 3 || tong == 18) {
					taiKhoanNguoiChoi -= datCuoc;
					System.out.println("****** Tổng là: " + tong + " => Nhà cái ăn hết, bạn đã thua!");
					System.out.println("****** Tài khoản của bạn là: " + taiKhoanNguoiChoi);
				} else if (tong >= 4 && tong <= 10) {
					System.out.println("****** Tổng là: " + tong + " => Xỉu");
					if (luaChonTaiXiu == 2) {
						System.out.println("****** Bạn đã thắng cược");
						taiKhoanNguoiChoi += datCuoc;
						System.out.println("****** Tài khoản của bạn là: " + numf.format(taiKhoanNguoiChoi));
					} else {
						System.out.println("****** Bạn đã thua cược");
						taiKhoanNguoiChoi -= datCuoc;
						System.out.println("****** Tài khoản của bạn là: " + numf.format(taiKhoanNguoiChoi));
					}
				} else {
					System.out.println("****** Tổng là: " + tong + " => Tài");
					if (luaChonTaiXiu == 1) {
						System.out.println("****** Bạn đã thắng cược");
						taiKhoanNguoiChoi += datCuoc;
						System.out.println("****** Tài khoản của bạn là: " + numf.format(taiKhoanNguoiChoi));
					} else {
						System.out.println("****** Bạn đã thua cược");
						taiKhoanNguoiChoi -= datCuoc;
						System.out.println("****** Tài khoản của bạn là: " + numf.format(taiKhoanNguoiChoi));
					}
				}
			}
			else {
				System.out.println("thoat chuong trinh");
			}

		}while(luaChon == 1);
		
		
	}
	
}
