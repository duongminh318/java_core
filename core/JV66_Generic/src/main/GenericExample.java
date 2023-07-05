package main;

public class GenericExample<T> {
	    private T value;

	    public GenericExample(T value) {
	        this.value = value;
	    }

	    public T getValue() {
	        return value;
	    }

	    public void setValue(T value) {
	        this.value = value;
	    }
	
}
