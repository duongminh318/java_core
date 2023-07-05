
public class Test {
	public static void main(String[] args) {
		System.out.println("Kiểm tra");
		BabyDog bbd = new BabyDog();
		bbd.eat();
		bbd.bark();
		bbd.weep();
		
		Dog d = new Dog();
		d.eat();
		d.bark();
		
		Cat c = new Cat();
		c.eat();
		c.meow();
		
		Bird b = new Bird();
		b.eat();
		b.fly();
		
		BabyBird bbb= new BabyBird();
		System.out.println(bbb.getName());
		
	
	}
}
