package com.gentech.Programs4;

public class Invoice 
{
	String customerName;
	String invoiceDate;
	String productName;
	int quantity;
	double unitPrice;
	double total;

	public Invoice(String customerName, String invoiceDate, String productName, int quantity, double unitPrice) {
		this.customerName = customerName;
		this.invoiceDate = invoiceDate;
		this.productName = productName;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.total = quantity * unitPrice;
	}
	public Invoice(String customerName, String invoiceDate, String productName) 
	{
		this(customerName, invoiceDate, productName, 1, 0.0); 
	}

	public void displayInvoice() 
	{
		System.out.println("Invoice Details:");
		System.out.println("Customer Name: " + customerName);
		System.out.println("Invoice Date: " + invoiceDate);
		System.out.println("Product Name: " + productName);
		System.out.println("Quantity: " + quantity);
		System.out.println("Unit Price: $" + unitPrice);
		System.out.println("Total: $" + total);
	}
	public static void main(String[] args) 
	{
		Invoice invoice1 = new Invoice("Janardhan", "2022-01-01", "Laptop", 2, 1000.0);
		invoice1.displayInvoice();

		Invoice invoice2 = new Invoice("Jhonny", "2022-01-02", "Mouse");
		invoice2.displayInvoice();
	}
}
