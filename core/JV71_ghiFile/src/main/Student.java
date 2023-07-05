package main;

public class Student {
	private int mSSV;
	private String hoTen;
	
	public Student(int mSSV, String hoTen) {
		
		this.mSSV = mSSV;
		this.hoTen = hoTen;
	}

	@Override
	public String toString() {
		return "Student [mSSV=" + mSSV + ", hoTen=" + hoTen + "]";
	}
	
 
}
