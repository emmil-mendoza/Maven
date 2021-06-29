package com.emmil;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {

	private String partNumber;
	private String partDescription;
	private int itemQuantity;
	private double pricePerItem;

	public double getInvoiceAmount(double y) {
		y = itemQuantity * pricePerItem;
		return y;
	}

}