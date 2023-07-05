
public class Test {
	public static void main(String[] args) {
		HangSanXuat h1= new HangSanXuat("Apple", "USA");
		HangSanXuat h2= new HangSanXuat("KaWasahi", "Japan");
		HangSanXuat h3= new HangSanXuat("AirBus", "England");
		
		PhuongTienDiChuyen p1= new MayBay(h3, "Xang");
		PhuongTienDiChuyen p2= new XeOto(h2, "Xang");
		PhuongTienDiChuyen p3= new XeDap(h1);
		MayBay mb2= new MayBay(h3, "dien");
		
		
		System.out.println("lay hang san xuat: "+p1.layTenHangSanXuat());
		
		p2.batDau();
		
		
		System.out.println(p3.LayVanToc());
		mb2.catCanh();
		mb2.haCanh();
		
		
	}
	

}
