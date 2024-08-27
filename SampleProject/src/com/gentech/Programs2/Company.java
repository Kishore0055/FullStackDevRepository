package com.gentech.Programs2;

class Product 
{
    String productName;
    int quantity;
    Product()
    {
        productName = "HeadPhone";
        quantity = 1000;
        System.out.println("Product Name : " + productName);
        System.out.println("Quantity : " + quantity);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
    }
}

class Sales 
{
    String salesDate;
    int salesQuantity;
    Sales()
    {
        salesDate = "2023-06-06";
        salesQuantity = 200;
        System.out.println("Sales Date : " + salesDate);
        System.out.println("Sales Quantity : " + salesQuantity);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
    }
}

class Order 
{
    String orderDate;
    int orderQuantity;
    Order()
    {
        orderDate = "2023-05-05";
        orderQuantity = 300;
        System.out.println("Order Date : " + orderDate);
        System.out.println("Order Quantity : " + orderQuantity);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}

class Inventory 
{
    int totalQuantity;
    Inventory(Product obj1, Sales obj2, Order obj3)
    {
        totalQuantity = obj1.quantity - obj2.salesQuantity + obj3.orderQuantity;
        System.out.println("Total Quantity in Inventory : " + totalQuantity);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}

public class Company  
{
    public static void main(String[] args) 
    {
        Product obj1 = new Product();

        Sales obj2 = new Sales();
        
        Order obj3 = new Order();

        Inventory obj4 = new Inventory(obj1, obj2, obj3);
        
    }
}