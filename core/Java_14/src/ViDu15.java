import java.util.Scanner;

public class ViDu15 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a = ");
		int a = sc.nextInt();
		
		Boolean kq= (a%2==0)?true:false;
		System.out.println(a+" la so chan "+kq);
		
		
	}

}
