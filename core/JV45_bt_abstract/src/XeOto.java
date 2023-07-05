
public class XeOto extends PhuongTienDiChuyen {
	private String loaiNhienLieu;

	public XeOto( HangSanXuat hangSanXuat, String loaiNhienLieu) {
		super("Xe Oto", hangSanXuat);
		this.loaiNhienLieu = loaiNhienLieu;
	}

	@Override
	public double LayVanToc() {
		// TODO Auto-generated method stub
		
		return 120;
		
	}
	
	

}
