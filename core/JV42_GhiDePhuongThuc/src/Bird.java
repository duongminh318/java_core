
public class Bird extends Animal {
	public Bird() {
		super("Bird");
	}

	@Override
	public void eat() {
		System.out.println("I eat worm!");
	}

	@Override
	public void sleep() {
		System.out.println("bird sleep");
	}

	@Override
	public void makeSound() {
		System.out.println("Liu lo");
	}
}
