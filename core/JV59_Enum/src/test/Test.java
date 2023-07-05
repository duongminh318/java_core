package test;

public class Test {
	public static void main(String[] args) {
		ThoiKhoaBieu tkb2= new ThoiKhoaBieu(Day.Monday, "math, physics, chemistry");
		ThoiKhoaBieu tkb3= new ThoiKhoaBieu(Day.Tuesday, "chemistry, biology, computer");
		ThoiKhoaBieu tkb4= new ThoiKhoaBieu(Day.Thursday, "history, georaphy, literature");
		ThoiKhoaBieu tkb5= new ThoiKhoaBieu(Day.Wednesday, "exercise");
		ThoiKhoaBieu tkb6= new ThoiKhoaBieu(Day.Friday, "IT, Music");
		
		System.out.println(tkb3.toString());
		
		int x = Thang.Thang_mot.soNgay();
		System.out.println(x);
	}

}
