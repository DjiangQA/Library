package main;

public abstract class Items extends ItemManager {
	String itemName;
	int itemID;
	int numberAvailable;
	String publishDate;

	public Items(String itemName, int itemID, int numberAvailable, String publishDate) {
		this.itemName = itemName;
		this.itemID = itemID;
		this.numberAvailable = numberAvailable;
		this.publishDate = publishDate;
	}

	public String getItemName() {
		return itemName;
	}

	public String setItemName(String itemName) {
		return this.itemName = itemName;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public int getNumberAvailable() {
		return numberAvailable;
	}

	public void setNumberAvailable(int numberAvailable) {
		this.numberAvailable = numberAvailable;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	
	
	

}
