package com.app.fruits;

public class Orange extends Fruit {

	public Orange(String color, double weight, boolean fresh) {
		super(color, weight, "Orange", fresh);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Orange [toString()=" + super.toString() + "]";
	}

	public String taste() {
		return "sour";
	}

	public void juice() {
System.out.println(getName() + " " + getWeight() + " extracting juice!!");
	}
}
