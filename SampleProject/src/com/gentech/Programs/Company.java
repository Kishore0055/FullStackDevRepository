package com.gentech.Programs;

class Product 
{
    String productName;
    int quantity;
}

class Sales 
{
    String salesDate;
    int salesQuantity;
}

class Order 
{
    String orderDate;
    int orderQuantity;
}

class Inventory {
    int totalQuantity;
}

public class Company  {
    public static void main(String[] args) {
        Product obj1 = new Product();
        obj1.productName = "Laptop";
        obj1.quantity = 100;
        System.out.println("Product Name : " + obj1.productName);
        System.out.println("Quantity : " + obj1.quantity);
        System.out.println("------------------------------");

        Sales obj2 = new Sales();
        obj2.salesDate = "2022-01-01";
        obj2.salesQuantity = 20;
        System.out.println("Sales Date : " + obj2.salesDate);
        System.out.println("Sales Quantity : " + obj2.salesQuantity);
        System.out.println("------------------------------");

        Order obj3 = new Order();
        obj3.orderDate = "2022-01-05";
        obj3.orderQuantity = 30;
        System.out.println("Order Date : " + obj3.orderDate);
        System.out.println("Order Quantity : " + obj3.orderQuantity);
        System.out.println("------------------------------");

        Inventory obj4 = new Inventory();
        obj4.totalQuantity = obj1.quantity - obj2.salesQuantity + obj3.orderQuantity;
        System.out.println("Total Quantity in Inventory : " + obj4.totalQuantity);
        System.out.println("------------------------------");
    }
}

