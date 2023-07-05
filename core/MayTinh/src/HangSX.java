
public class HangSX {
	private String TenHang;
	private QuocGia QuocGia;
	public HangSX(String tenHang, QuocGia quocGia) {	
		TenHang = tenHang;
		QuocGia = quocGia;
	}
	public String getTenHang() {
		return TenHang;
	}
	public void setTenHang(String tenHang) {
		TenHang = tenHang;
	}
	public QuocGia getQuocGia() {
		return QuocGia;
	}
	public void setQuocGia(QuocGia quocGia) {
		QuocGia = quocGia;
	}
	
	public String layTenQuocGia() {
		
		return this.QuocGia.getTenQuocGia();
	}
	

}
