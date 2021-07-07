package com.emmil.exercises.invoice;



public class Invoice {

	private String partNumber;
	private String partDescription;
	private int itemQuantity;
	private double pricePerItem;

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}

	public double getPricePerItem() {
		return pricePerItem > 0 ? pricePerItem : 0.0d;
	}

	public double getInvoiceAmount(double y) {
		y = itemQuantity * pricePerItem;
		return y;
	}

}