package com.gentech.Programs3;

class Product 
{
    String productName;
    int quantity;
    Product(String name, int qty)
    {
        productName = name;
        quantity = qty;
        System.out.println("Product Name : " + productName);
        System.out.println("Quantity : " + quantity);
        System.out.println("______________________________________________________");
    }
}
class Sales 
{
    String salesDate;
    int salesQuantity;
    Sales(String date, int qty)
    {
        salesDate = date;
        salesQuantity = qty;
        System.out.println("Sales Date : " + salesDate);
        System.out.println("Sales Quantity : " + salesQuantity);
        System.out.println("______________________________________________________");
    }
}
class Order 
{
    String orderDate;
    int orderQuantity;
    Order(String date, int qty)
    {
        orderDate = date;
        orderQuantity = qty;
        System.out.println("Order Date : " + orderDate);
        System.out.println("Order Quantity : " + orderQuantity);
        System.out.println("___________________________________________________");
    }
}
class Inventory 
{
    int totalQuantity;
    Inventory(Product obj1, Sales obj2, Order obj3)
    {
        totalQuantity = obj1.quantity - obj2.salesQuantity + obj3.orderQuantity;
        System.out.println("Total Quantity in Inventory : " + totalQuantity);
        System.out.println("____________________________________________________________");
    }
}
public class Company  
{
    public static void main(String[] args) 
    {
        Product obj1 = new Product("HairDryer", 150);

        Sales obj2 = new Sales("2021-12-21", 200);
        
        Order obj3 = new Order("2021-05-01", 100);

        Inventory obj4 = new Inventory(obj1, obj2, obj3);
        
    }
}