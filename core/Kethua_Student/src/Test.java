
public class Test {
	public static void main(String[] args) {
		
		Human nguoi1= new Human("Tran Van Teo", 1998);
		Human nguoi2= new Human("Tran Van Tun", 1999);
		Human nguoi3= new Human("Tran Thi Ti", 2000);
		
		nguoi1.Ngu();
		nguoi2.An();
		
		Student hs1= new Student("Johnny Phonten", 1987, "Tin Hoc", "ICU");
		hs1.Uong();
		hs1.Dohomework();
		
		hs1.setNamSinh(1899);
		
		System.out.println("nam sinh cua hs1: "+hs1.getNamSinh());
		
		
		
	}
}
