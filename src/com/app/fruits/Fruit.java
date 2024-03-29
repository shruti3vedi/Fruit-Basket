package com.app.fruits;

public abstract class Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean fresh;
	public Fruit(String color, double weight, String name, boolean fresh) {
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.fresh = fresh;
	}
	
	@Override
	public String toString() {
		return "Fruit [color=" + color + ", weight=" + weight + ", name=" + name + "]";
	}
	
	public String taste() {
		return "no specific taste";
	}

	public String getColor() {
		return color;
	}

	public double getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}

	public boolean isFresh() {
		return fresh;
	}
	
	
	
	
}
