package main;

public class Test_Box {
	public static void main(String[] args) {
		// Tạo một đối tượng GenericExample với kiểu dữ liệu Integer
        GenericExample<Integer> integerExample = new GenericExample<>(10);
        System.out.println("Integer value: " + integerExample.getValue());

        // Tạo một đối tượng GenericExample với kiểu dữ liệu String
        GenericExample<String> stringExample = new GenericExample<>("Hello");
        System.out.println("String value: " + stringExample.getValue());
	}
}
