package com.gentech.Programs;

class Student 
{
    String studentName;
    int studentRollNo;
}

class Library 
{
    String libraryName;
    int noOfBooks;
}

class Sports 
{
    String sportsName;
    String sportsCoach;
}

class ComputerLab 
{
    String labName;
    int noOfComputers;
}

public class SchoolDetails 
{
    public static void main(String[] args) 
    {
        Student obj1 = new Student();
        obj1.studentName = "Aryan";
        obj1.studentRollNo = 101;
        System.out.println("Student Name : " + obj1.studentName);
        System.out.println("Student Roll No : " + obj1.studentRollNo);
        System.out.println("------------------------------");

        Library obj2 = new Library();
        obj2.libraryName = "Central Library";
        obj2.noOfBooks = 10000;
        System.out.println("Library Name : " + obj2.libraryName);
        System.out.println("No of Books : " + obj2.noOfBooks);
        System.out.println("------------------------------");

        Sports obj3 = new Sports();
        obj3.sportsName = "Cricket";
        obj3.sportsCoach = "Mr. Rahul";
        System.out.println("Sports Name : " + obj3.sportsName);
        System.out.println("Sports Coach : " + obj3.sportsCoach);
        System.out.println("------------------------------");

        ComputerLab obj4 = new ComputerLab();
        obj4.labName = "Computer Science Lab";
        obj4.noOfComputers = 50;
        System.out.println("Lab Name : " + obj4.labName);
        System.out.println("No of Computers : " + obj4.noOfComputers);
        System.out.println("------------------------------");
    }
}
