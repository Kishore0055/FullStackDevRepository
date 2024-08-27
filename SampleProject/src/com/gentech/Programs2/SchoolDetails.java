package com.gentech.Programs2;

class Student 
{
    String studentName;
    int studentRollNo;
    Student()
    {
    	studentName = "Aryan";
        studentRollNo = 101;
        System.out.println("Student Name : " + studentName);
        System.out.println("Student Roll No : " + studentRollNo);
        System.out.println("------------------------------");
    }
}

class Library 
{
    String libraryName;
    int noOfBooks;
    Library()
    {
    	libraryName = "Main Library";
        noOfBooks = 15400;
        System.out.println("Library Name : " + libraryName);
        System.out.println("No of Books : " + noOfBooks);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");

    }
}
class Sports 
{
    String sportsName;
    String sportsCoach;
    Sports()
    {
    	sportsName = "VolleyBall";
        sportsCoach = "Mr. Gautham";
        System.out.println("Sports Name : " + sportsName);
        System.out.println("Sports Coach : " + sportsCoach);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

    }
}
class ComputerLab 
{
    String labName;
    int noOfComputers;
    ComputerLab()
    {
    	labName = "Computer Science Lab";
        noOfComputers = 20;
        System.out.println("Lab Name : " + labName);
        System.out.println("No of Computers : " +noOfComputers);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
public class SchoolDetails 
{
    public static void main(String[] args) 
    {
        Student obj1 = new Student();

        Library obj2 = new Library();
        
        Sports obj3 = new Sports();
        
        ComputerLab obj4 = new ComputerLab();
        
    }
}
