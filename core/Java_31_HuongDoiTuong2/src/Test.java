
public class Test {
	public static void main(String[] args) {
		HoaDonCaPhe hd = new HoaDonCaPhe("Trung Nguyen", 100000, 1.5);
		HoaDonCaPhe hd2 = new HoaDonCaPhe("Trung Nguyen", 100000, 5.5);
		System.out.println(hd.getTenLoaiCaPhe());
		System.out.println("Tong tien Hd: " + hd.tinhTongTien());
		System.out.println("Kiem tra khoi luong > 2kg "+ hd.kiemTraKhoiLuongLonHon(2));
		System.out.println("Kiem tra khoi luong > 1kg "+ hd2.kiemTraKhoiLuongLonHon(1));
		System.out.println("Kiem tra tong tien > 500k "+ hd.kiemTraTongTienLonHon500K());
		System.out.println("Kiem tra tong tien > 500k "+ hd2.kiemTraTongTienLonHon500K());
		System.out.println("Giam gia cua Hd: "+ hd.giamGia(10));
		System.out.println("Giam gia cua Hd2: "+ hd2.giamGia(10));
		System.out.println("Sau giam gia cua Hd: "+ hd.giaSauKhiGiam(10));
		System.out.println("Sau giam gia cua Hd2: "+ hd2.giaSauKhiGiam(10));
	}

}
