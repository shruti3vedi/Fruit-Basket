package com.app.fruits;

public class Mango extends Fruit {

	public Mango(String color, double weight, boolean fresh) {
		super(color, weight, "Mango", fresh);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Mango [toString()=" + super.toString() + "]";
	}

	public String taste() {
		return "sweet";
	}

	public void pulp() {
		System.out.println(getName() + " " + getColor() + " Creating pupl!");
	}
}
