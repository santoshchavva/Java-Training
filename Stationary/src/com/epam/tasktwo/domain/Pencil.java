package com.epam.tasktwo.domain;

public class Pencil extends StationaryItem implements Writable {

	public Pencil(String name, float price,int length) {
		super(name, price);
		this.length = length;
	}
	
	private int length;

	@Override
	public boolean isRefillable() {
		// TODO Auto-generated method stub
		return false;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Pencil [length=" + length + ", getName()=" + getName()
				+ ", getPrice()=" + getPrice() + "]";
	}

	
}
