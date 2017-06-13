package com.epam.tasktwo.domain;

public class Pen extends StationaryItem implements Writable {

	@Override
	public boolean isRefillable() {
		// TODO Auto-generated method stub
		return true;
	}
	
	private String inkColor;

	public String getInkColor() {
		return inkColor;
	}

	public void setInkColor(String inkColor) {
		this.inkColor = inkColor;
	}

	public Pen(String name, float price, String inkColor) {
		super(name, price);
		this.inkColor = inkColor;
	}

	@Override
	public String toString() {
		return "Pen [inkColor=" + inkColor + ", getName()=" + getName()
				+ ", getPrice()=" + getPrice() + "]";
	}

	

}
