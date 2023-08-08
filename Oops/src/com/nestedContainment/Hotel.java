package com.nestedContainment;

class Item {
	private int iId;
	private String iName;
	private int iPrice;

	public void setIId(int mId) {
		this.iId = mId;
	}

	public void setIName(String mName) {
		this.iName = mName;
	}

	public void setIPrice(int iPrice) {
		this.iPrice = iPrice;
	}

	public int getIId() {
		return iId;
	}

	public String getIName() {
		return iName;
	}

	public int getIPrice() {
		return iPrice;
	}
	
	public String toString() {
		return " " + iId + " " + iName + " " + iPrice; 
	}
}

class Menu {
	private int mId;
	private String mName;
	Item i;

	public void setMId(int mId) {
		this.mId = mId;
	}

	public void setMName(String mName) {
		this.mName = mName;
	}

	public void setI(Item i) {
		this.i = i;
	}

	public int getMId() {
		return mId;
	}

	public String getMName() {
		return mName;
	}

	public Item getI() {
		return i;
	}
	public String toString() {
		return " " + mId + " " + mName + " " + " " + i; 
	}
}

public class Hotel {
	private int hId;
	private String hName;
	Menu m;

	public void setHId(int hId) {
		this.hId = hId;
	}

	public void setHName(String hName) {
		this.hName = hName;
	}

	public void setM(Menu m) {
		this.m = m;
	}

	public int getHId() {
		return hId;
	}

	public String getHName() {
		return hName;
	}

	public Menu getM() {
		return m;
	}
	
	public String toString() {
		return " " + hId + " " + hName + " " + m; 
	}

	public static void main(String[] args) {

		Hotel h = new Hotel(); 
		h.setHId(001);
		h.setHName("Hotel Taj");
		h.setM(new Menu());
		
		h.getM().setMId(001);
		h.getM().setMName("South Indian");
		h.getM().setI(new Item());
		
		h.getM().getI().setIId(005);
		h.getM().getI().setIName("Masala Dosa");
		h.getM().getI().setIPrice(110);
		
		System.out.println(h);
	}
}
