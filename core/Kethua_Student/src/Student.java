
public class Student extends Human {
	private String Lop;
	private String Truong;
	
	
	public Student(String hoTen, int namSinh, String lop, String truong) {
		super(hoTen, namSinh);
		Lop = lop;
		Truong = truong;
	}


	public String getLop() {
		return Lop;
	}


	public void setLop(String lop) {
		Lop = lop;
	}


	public String getTruong() {
		return Truong;
	}


	public void setTruong(String truong) {
		Truong = truong;
	}
	
	
	public void Dohomework() {
		
		System.out.println("......do ....do ");
	}
	
	
	

}
