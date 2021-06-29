package com.emmil;

//import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {

		Invoice iv1 = new Invoice();

		double a = 79.85d; // Price per item
		int d = 25; // Item Quantity
		int total = 0;

		if (a < 0.0d) {

			iv1.setPricePerItem(0.0d);
		}

		else {
			iv1.setPricePerItem(a);
		}

		if (d < 0) {

			iv1.setItemQuantity(0);
		}

		else {

			iv1.setItemQuantity(d);
		}

		iv1.setPartNumber("786BGHX");
		iv1.setPartDescription("2021 TESLA MODEL X");

		System.out.println(iv1.getPartNumber() + "\n" + iv1.getPartDescription() + "\n" + iv1.getItemQuantity());
		System.out.println(iv1.getPricePerItem() + "\n" + iv1.getInvoiceAmount(total));

	}

}
