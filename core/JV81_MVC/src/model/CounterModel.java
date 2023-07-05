package model;
/* lien quan den du lieu*/
public class CounterModel {
	private int value;

	public CounterModel() {
		this.value=0;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
//tang
	public void increment() {
		this.value++;
	}
//	giam
	public void decrement() {
		this.value--;
	}
	
	public void reset() {
		this.value=0;
	}

}
