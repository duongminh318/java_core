
public class main {
	
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		
		MyDate md = new MyDate(31, 5, 2021);
		System.out.println("Day = "+ md.getDay());
		md.setDay(35);
		System.out.println("Day = "+ md.getDay());
		md.setDay(30);
		System.out.println("Day = "+ md.getDay());
		
		System.out.println("Month = "+ md.getMonth());
		md.setMonth(13);
		System.out.println("Month = "+ md.getMonth());
		md.setMonth(5);
		System.out.println("Month = "+ md.getMonth());
		
		System.out.println(md); // In ra "28/4/2023"
	}
	
}
