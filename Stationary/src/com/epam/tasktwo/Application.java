package com.epam.tasktwo;

import java.util.Collections;

import com.epam.tasktwo.domain.Marker;
import com.epam.tasktwo.domain.Pen;
import com.epam.tasktwo.domain.Pencil;
import com.epam.tasktwo.domain.StationaryItem;

import static com.epam.tasktwo.domain.StationaryItem.SortOrder.*;

public class Application {

	public static void main(String[] args) {
		StarterKit kit = new StarterKit();
		StationaryItem marker = new Marker("MarkerName", 12.5f, true);
		
		StationaryItem pen = new Pen("penName", 9.5f, "RED");
		
		StationaryItem pencil = new Pencil("pencil", 3.4f, 1);

		kit.addStationaryItem(pen);
		kit.addStationaryItem(marker);
		kit.addStationaryItem(pencil);
		
		Collections.sort(kit.getItem(), combineSortOrders(NAME, PRICE));
		System.out.println("In Ascending Order");
		for (StationaryItem p : kit.getItem()) {
			System.out.println(p.toString());
		}

		Collections.sort(kit.getItem(),
				combineSortOrders(invertOrder(NAME), invertOrder(PRICE)));
		System.out.println("In Descending Order");
		for (StationaryItem p : kit.getItem()) {
			System.out.println(p.toString());
		}
		
		Collections.sort(kit.getItem(), combineSortOrders(PRICE, NAME));
		System.out.println("In Ascending Order");
		for (StationaryItem p : kit.getItem()) {
			System.out.println(p.toString());
		}
		
	}

}
