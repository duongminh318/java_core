package model;

import java.util.StringTokenizer;

public class ThucDonModel {
	private String luaChon_MonChinh;
	private String luaChon_MonPhu;
	private double tongTien;
	
	public ThucDonModel() {
		this.luaChon_MonChinh = "";
		this.luaChon_MonPhu = "";
		this.tongTien = 0;
	}

	public String getLuaChon_MonChinh() {
		return luaChon_MonChinh;
	}

	public void setLuaChon_MonChinh(String luaChon_MonChinh) {
		this.luaChon_MonChinh = luaChon_MonChinh;
	}

	public String getLuaChon_MonPhu() {
		return luaChon_MonPhu;
	}

	public void setLuaChon_MonPhu(String luaChon_MonPhu) {
		this.luaChon_MonPhu = luaChon_MonPhu;
	}

	public double getTongTien() {
		return tongTien;
	}

	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}

	// tinh tong tien
	public void tinhTongTien() {
		this.tongTien = 0;
		if(this.luaChon_MonChinh.equals("CƠM")) {
			tongTien+= 20000;
		}else if(this.luaChon_MonChinh.equals("PHỞ")) {
			tongTien+= 50000;
		}else if(this.luaChon_MonChinh.equals("BÁNH MÌ")) {
			tongTien+= 15000;
		}
		
		
		StringTokenizer stk = new StringTokenizer(this.luaChon_MonPhu, ";");
		while(stk.hasMoreElements()) {
			String monPhu = stk.nextToken();
			monPhu = monPhu.trim();
			if(monPhu.equals("TRÀ SỮA")) {
				tongTien+= 5000;
			}else if(monPhu.equals("COCACOLA")) {
				tongTien+= 10000;
			}else if(monPhu.equals("BÁNH NGỌT")) {
				tongTien+= 15000;
			}else if(monPhu.equals("NEM")) {
				tongTien+= 20000;
			}
		}
	}
}
