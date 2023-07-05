
public class Test {

	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(15, 8, 2025);
		Ngay ngay2 = new Ngay(1, 3, 2025);
		Ngay ngay3 = new Ngay(6, 9, 2025);
		
		QuocGia quocGia1 = new QuocGia("VN", "Việt Nam Cong Hoa");
		QuocGia quocGia2 = new QuocGia("USA", "AmeriCan");
		QuocGia quocGia3 = new QuocGia("TW", "TaiWan");
		
		HangSX hangSanXuat1 = new HangSX("VNLaptop", quocGia1);
		HangSX hangSanXuat2 = new HangSX("Macbook", quocGia2);
		HangSX hangSanXuat3 = new HangSX("Asus", quocGia3);
		
		MayTinh mayTinh1 = new MayTinh(hangSanXuat1, ngay1, 1500, 12);
		MayTinh mayTinh2 = new MayTinh(hangSanXuat2, ngay2, 2000, 24);
		MayTinh mayTinh3 = new MayTinh(hangSanXuat3, ngay3, 1000, 12);
		
		
		
		System.out.println("Tên quốc gia: ");
		System.out.println("M1: "+ mayTinh1.TenQuocGiaSX());
		System.out.println("M2: "+ mayTinh2.TenQuocGiaSX());
		System.out.println("M3: "+ mayTinh3.TenQuocGiaSX());
		
		
		System.out.println("So sanh gia thấp hơn: ");
		System.out.println("M1 > M2: "+ mayTinh1.ktGiaCaoHonKhong(mayTinh2));
		System.out.println("M1 > M3: "+ mayTinh1.ktGiaCaoHonKhong(mayTinh3));
	}

}
