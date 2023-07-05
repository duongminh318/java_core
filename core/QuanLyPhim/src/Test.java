
public class Test {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(15, 05, 2022);
		Ngay ngay2 = new Ngay(31, 01, 2025);
		Ngay ngay3 = new Ngay(16, 02, 2030);
		
		HangSanXuat hangSanXuat1 = new HangSanXuat("Hãng A", "Việt Nam");
		HangSanXuat hangSanXuat2 = new HangSanXuat("Hãng B", "Mỹ");
		HangSanXuat hangSanXuat3 = new HangSanXuat("Hãng C", "Ba Lan");
		
		BoPhim boPhim1 = new BoPhim("Bố Già", 2020, hangSanXuat1, 100, ngay1);
		BoPhim boPhim2 = new BoPhim("Running Man", 2021, hangSanXuat2, 200, ngay2);
		BoPhim boPhim3 = new BoPhim("Khám phá Ba Lan", 2025, hangSanXuat3, 500, ngay3);
	
		System.out.println("SS gia 1 re hon 2: "+ boPhim1.kiemTraGiaVeReHon(boPhim2));
		System.out.println("SS gia 3 re hon 2: "+ boPhim3.kiemTraGiaVeReHon(boPhim2));
		
//		BoPhim boPhim3 = new BoPhim("Khám phá Ba Lan", 2025, hangSanXuat3, 115000, ngay3);
		
		System.out.println("SS gia 1 re hon 2: "+ boPhim1.kiemTraGiaVeReHon(boPhim2));
		System.out.println("SS gia 3 re hon 2: "+ boPhim3.kiemTraGiaVeReHon(boPhim2));
	
		System.out.println("Tên hãng sản xuất BP 3: "+boPhim3.layTenHangSanXuat());
	
		System.out.println("BP1 giam 10%: "+ boPhim1.giaSauKhuyenMai(10));
		System.out.println("BP2 giam 20%: "+ boPhim2.giaSauKhuyenMai(20));
		System.out.println("BP3 giam 50%: "+ boPhim3.giaSauKhuyenMai(50));
	}
}
