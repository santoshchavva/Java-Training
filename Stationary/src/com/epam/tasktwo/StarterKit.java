package com.epam.tasktwo;

import java.util.ArrayList;
import java.util.List;

import com.epam.tasktwo.domain.StationaryItem;

public class StarterKit {
	
	List<StationaryItem> item = new ArrayList<>();
	
	public int addStationaryItem(StationaryItem item){
		this.item.add(item);
		
		return this.item.size();
	}

	public List<StationaryItem> getItem() {
		return item;
	}
	

}
