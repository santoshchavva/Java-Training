package com.epam.tasktwo.domain;

public class Marker extends StationaryItem implements Writable {

	public Marker(String color, float price, boolean isPermanant) {
		super(color, price);
		this.isPermanant = isPermanant;
	}

	@Override
	public boolean isRefillable() {
		return true;
	}

	private boolean isPermanant;

	public boolean isPermanant() {
		return isPermanant;
	}

	public void setPermanant(boolean isPermanant) {
		this.isPermanant = isPermanant;
	}

	@Override
	public String toString() {
		return "Marker [isPermanant=" + isPermanant + ", getName()="
				+ getName() + ", getPrice()=" + getPrice() + "]";
	}
	
	

}
