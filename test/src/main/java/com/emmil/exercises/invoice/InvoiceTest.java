package com.emmil.exercises.invoice;

//import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {

		Invoice iv1 = new Invoice();
        double total=0;
		

		iv1.setPartNumber("786BGHX");
		iv1.setPartDescription("2021 TESLA MODEL X");
        iv1.setItemQuantity(24);
        iv1.setPricePerItem(32.75);
		System.out.println(iv1.getPartNumber() + "\n" + iv1.getPartDescription() + "\n" + iv1.getItemQuantity());
		System.out.println(iv1.getPricePerItem() + "\n" + iv1.getInvoiceAmount(total));

	}

}
