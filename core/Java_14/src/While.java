import java.util.Random;

public class While {
	public static void main(String[] args) {
		
		Random random = new Random();

        // Tạo số lần lặp ngẫu nhiên trong khoảng từ 1 đến 10
        int iterations = random.nextInt(100) + 1;

        int i = 0;
        while (i < iterations) {
            System.out.println("Lần lặp thứ " + (i + 1));
            i++;
        }
	}

}
