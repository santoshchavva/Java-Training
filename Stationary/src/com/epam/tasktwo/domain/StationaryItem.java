package com.epam.tasktwo.domain;

import java.util.Comparator;

public class StationaryItem {
	
	private String name;
	
	private float price;

	public StationaryItem(String name, float price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(price);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		StationaryItem other = (StationaryItem) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		return true;
	}
	
	public abstract static class SortOrder implements Comparator<StationaryItem> {
		public static SortOrder NAME = new SortOrder() {
			public int compare(StationaryItem item1, StationaryItem item2) {
				return item1.getName().compareTo(item2.getName());
			}
		};

		public static SortOrder PRICE = new SortOrder() {
			public int compare(StationaryItem item1, StationaryItem item2) {
				return Float.valueOf(item1.getPrice()).compareTo(Float.valueOf(item2.getPrice()));
			}
		};
		
		public static SortOrder invertOrder(final SortOrder toInvert) {
			return new SortOrder() {
				public int compare(StationaryItem item1, StationaryItem item2) {
					return -1 * toInvert.compare(item1, item2);
				}
			};
		}

		public static Comparator<StationaryItem> combineSortOrders(final SortOrder... multipleSortOrders) {
			return new Comparator<StationaryItem>() {
				public int compare(StationaryItem item1, StationaryItem item2) {
					for (SortOrder personComparator: multipleSortOrders) {
						int result = personComparator.compare(item1, item2);
						if (result != 0) {
							return result;
						}
					}
					return 0;
				}
			};
		}
	}

}
