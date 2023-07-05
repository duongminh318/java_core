
public class Label {
//	public static void main(String[] args) {
//		outer: for(int i=2; i<=9; i++) {
//			for(int j=1; j<=10; j++) {
//				if(j>5)
//					continue outer; // bỏ qua các lệnh còn lại của nhãn 
//				System.out.println(i+" x "+j +" = "+(i*j));
//			}
//			System.out.println("---");
//		}
//}
	
//	public static void main(String[] args) {
//	int out, in = 0;
//	dung: for (out = 0; out < 10; out++) {
//		for (in = 0; in < 20; in++) {
//			if (in > 10)
//				break dung;
//			System.out.println("bên trong vòng lặp out: out = " + out + ", in = " + in);
//		}
//		
//	}
//	System.out.println("bên ngoài vòng lặp out: out = " + out + ", in = " + in);
//}
	
	
	
	public static void main(String[] args) {
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=10; j++) {
				if(j>5)
					return;				// kết thúc luôn
				System.out.println(i+" x "+j +" = "+(i*j));
			}
			System.out.println("---");
		}
		System.out.println("ABC");
	}
	
}
