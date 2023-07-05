
public class Dog extends Animal {
	public Dog() {
		super("Dog");
	}

	@Override
	public void eat() {
		System.out.println("I eat bone!");
	}

	@Override
	public void makeSound() {
		System.out.println("Gau gau");
	}

}
