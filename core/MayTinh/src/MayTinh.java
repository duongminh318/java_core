
public class MayTinh {
	private HangSX Hang;
	private Ngay NgaySX;
	private double GiaBan;
	private int ThoiGianBaoHanh;
	
	public MayTinh(HangSX hang, Ngay ngaySX, double giaBan, int thoiGianBaoHanh) {
		Hang = hang;
		NgaySX = ngaySX;
		GiaBan = giaBan;
		ThoiGianBaoHanh = thoiGianBaoHanh;
	}

	public HangSX getHang() {
		return Hang;
	}

	public void setHang(HangSX hang) {
		Hang = hang;
	}

	public Ngay getNgaySX() {
		return NgaySX;
	}

	public void setNgaySX(Ngay ngaySX) {
		NgaySX = ngaySX;
	}

	public double getGiaBan() {
		return GiaBan;
	}

	public void setGiaBan(double giaBan) {
		GiaBan = giaBan;
	}

	public int getThoiGianBaoHanh() {
		return ThoiGianBaoHanh;
	}

	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		ThoiGianBaoHanh = thoiGianBaoHanh;
	}
	
	public boolean ktGiaCaoHonKhong(MayTinh mtkhac) {
		
		return this.GiaBan>mtkhac.GiaBan;
	}
	
	public String TenQuocGiaSX() {
		
		return this.Hang.layTenQuocGia();
	}
	
	
	
	

}
