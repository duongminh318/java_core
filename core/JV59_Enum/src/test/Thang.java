package test;

public enum Thang {
	Thang_mot(31),
	Thang_hai(29),
	Thang_ba(31),
	Thang_tư(30),
	Thang_năm(31),
	Thang_sáu(30),
	Thang_bảy(31),
	Thang_tám(31),
	Thang_chín(30),
	Thang_mười(31),
	Thang_mười_một(30),
	Thang_mười_hai(31);
	
	private final int soNgay;
    Thang(int soNgay){
    	this.soNgay = soNgay;
    }
    public int soNgay() {
    	return soNgay;
    }
}
