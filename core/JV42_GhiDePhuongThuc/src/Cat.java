
public class Cat extends Animal {
	public Cat() {
		super("Cat");
	}

	@Override
	public void eat() {
		System.out.println("I eat Fish!");
	}

	@Override
	public void makeSound() {
		System.out.println("Meo meo");
	}
}
