package com.app.fruits;

public class Apple extends Fruit {

	public Apple(String color, double weight, boolean fresh) {
		super(color, weight, "Apple", fresh);

	}

	@Override
	public String toString() {
		return "Apple [toString()=" + super.toString() + "]";
	}

	public String taste() {
		return "sweet and sour";
	}

	public void jam() {
System.out.println(getName() + " making jam!");
	}

}
