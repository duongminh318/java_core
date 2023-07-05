
public class MayBay extends PhuongTienDiChuyen {
	
	private String loaiNhienLieu;
	



	public MayBay(HangSanXuat hangSanXuat, String loaiNhienLieu) {
		super("May bay", hangSanXuat);
		this.loaiNhienLieu = loaiNhienLieu;
	}

	@Override
	public double LayVanToc() {
		// TODO Auto-generated method stub
		return 500;
		
	}
	
	public void catCanh() {
		System.out.println("cat canh de ....");
	}

	public void haCanh() {
		System.out.println("Ha canh thoi ...");
	}





}
