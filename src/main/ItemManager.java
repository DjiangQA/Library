package main;

import java.util.ArrayList;

public class ItemManager {

	ArrayList<Items> itemList = new ArrayList<Items>();
	
	static Books b1 = new Books("Book1", 1, 10, "date1", "G1");
	static Books b2 = new Books("Book2", 2, 20, "date2", "G2");
	static Books b3 = new Books("Book3", 3, 30, "date3", "G3");
	static Books b4 = new Books("Book4", 4, 40, "date4", "G4");
	static Newspaper n1 = new Newspaper("Newspaper1", 5, 10, "date1", "P1", false);
	static Newspaper n2 = new Newspaper("Newspaper2", 6, 20, "date2", "P1", true);
	static Newspaper n3 = new Newspaper("Newspaper3", 7, 30, "date3", "P1", false);
	static Newspaper n4 = new Newspaper("Newspaper4", 8, 40, "date4", "P1", true);
	static Maps m1 = new Maps("map1", 9, 10, "date1", "L1", "AC1");
	static Maps m2 = new Maps("map2", 10, 20, "date2", "L1", "AC2");
	static Maps m3 = new Maps("map3", 11, 30, "date3", "L1", "AC3");
	static Maps m4 = new Maps("map4", 12, 40, "date4", "L1", "AC4");

	public void addItem(Items I) {
		itemList.add(I);
	}

	public void removeItemById(int itemID) {
		for (int i = 0; i < itemList.size(); i++) {
			if (itemList.get(i).itemID == itemID) {
				itemList.remove(i);
			}
		}
	}

	public void outputItem() {
		for (Items I : itemList) {
			System.out.println("Item ID:" + I.itemID + " Item Name:" + I.itemName + " Ammount Available:"
					+ I.numberAvailable + " Publish date:" + I.publishDate);
		}
	}

	public void emptyItem() {
		itemList.clear();
	}

	public void updateItem(Items I) {
		for (int i = 0; i < itemList.size(); i++) {
			if (itemList.get(i).itemID == I.itemID) {
				itemList.remove(i);
			}
			itemList.add(I);
		}
	}
	
	public String getName() {
		for (Items I : itemList) {
			return I.itemName;

		}
		return null;
	}
	
	public int getID() {
		for (Items I : itemList) {
			return I.itemID;

		}
		return 000;
	}
	
	public int getAvailable() {
		for (Items I : itemList) {
			return I.numberAvailable;
		}
		return 000;
	}
	
	public String getPublishDate() {
		for (Items I : itemList) {
			return I.publishDate;

		}
		return null;
	}

}
