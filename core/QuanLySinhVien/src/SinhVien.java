
public class SinhVien {
	private String Mssv;
	private String HoTen;
	private Ngay NgaySinh;
	private double DiemTB;
	private Lop Lop;
	
	public SinhVien(String mssv, String hoTen, Ngay ngaySinh, double diemTB, Lop lop) {	
		Mssv = mssv;
		HoTen = hoTen;
		NgaySinh = ngaySinh;
		DiemTB = diemTB;
		Lop = lop;
	}

	public String getMssv() {
		return Mssv;
	}

	public void setMssv(String mssv) {
		Mssv = mssv;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public Ngay getNgaySinh() {
		return NgaySinh;
	}

	public void setNgaySinh(Ngay ngaySinh) {
		NgaySinh = ngaySinh;
	}

	public double getDiemTB() {
		return DiemTB;
	}

	public void setDiemTB(double diemTB) {
		DiemTB = diemTB;
	}

	public Lop getLop() {
		return Lop;
	}

	public void setLop(Lop lop) {
		Lop = lop;
	}
	
	
	public String layTenKhoa()
	{
		return this.Lop.getTenKhoa();
	}
	
	public boolean dauKhong() {
		
		return this.DiemTB>=5;
	}
//	hàm equals	-> hàm so sánh bằng giữ hai đối tương
	public boolean sinhCungNgay(SinhVien svkhac) {
		
		
		return this.NgaySinh.equals(svkhac.NgaySinh);
	}
	
}
