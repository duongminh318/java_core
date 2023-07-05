package model;

public class TimKiemModel {
	private String vanBan;
	private String tuKhoa;
	private String ketQua;
	
	public TimKiemModel() {
		// TODO Auto-generated constructor stub
		this.vanBan="";
		this.tuKhoa="";
		this.ketQua="";
		
		
		
	}

	public String getVanBan() {
		return vanBan;
	}

	public void setVanBan(String vanBan) {
		this.vanBan = vanBan;
	}

	public String getTuKhoa() {
		return tuKhoa;
	}

	public void setTuKhoa(String tuKhoa) {
		this.tuKhoa = tuKhoa;
	}

	public String getKetQua() {
		return ketQua;
	}

	public void setKetQua(String ketQua) {
		this.ketQua = ketQua;
	}
	
// dem xem co bao nhieu lan xuat hien
	public void timKiem() {
		int dem=0;
		int index=0;
		while(true) {
			int i=this.vanBan.indexOf(this.tuKhoa, index);
			if(i==-1) {
				//khong tim thay 
				break;
			}else {
				dem++;
				index=i+1;
			}
		}
		this.ketQua="ket qua : co " +dem+ " thang lol " + this.tuKhoa;
		
		
	}
}
