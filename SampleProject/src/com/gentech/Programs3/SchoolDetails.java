package com.gentech.Programs3;

class Student 
{
    String studentName;
    int studentRollNo;
    Student(String name, int rollNo)
    {
        studentName = name;
        studentRollNo = rollNo;
        System.out.println("Student Name : " + studentName);
        System.out.println("Student Roll No : " + studentRollNo);
        System.out.println("___________________________________________________");
    }
}
class Library 
{
    String libraryName;
    int noOfBooks;
    Library(String name, int noOfBooks)
    {
        libraryName = name;
        this.noOfBooks = noOfBooks;
        System.out.println("Library Name : " + libraryName);
        System.out.println("No of Books : " + noOfBooks);
        System.out.println("____________________________________________________");

    }
}
class Sports 
{
    String sportsName;
    String sportsCoach;
    Sports(String name, String coach)
    {
        sportsName = name;
        sportsCoach = coach;
        System.out.println("Sports Name : " + sportsName);
        System.out.println("Sports Coach : " + sportsCoach);
        System.out.println("____________________________________________________________");

    }
}
class ComputerLab 
{
    String labName;
    int noOfComputers;
    ComputerLab(String name, int noOfComputers)
    {
        labName = name;
        this.noOfComputers = noOfComputers;
        System.out.println("Lab Name : " + labName);
        System.out.println("No of Computers : " +noOfComputers);
        System.out.println("____________________________________________________");
    }
}
public class SchoolDetails 
{
    public static void main(String[] args) 
    {
        Student obj1 = new Student("Aryan", 101);

        Library obj2 = new Library("Central Library", 10000);
        
        Sports obj3 = new Sports("Cricket", "Mr. Rahul");
        
        ComputerLab obj4 = new ComputerLab("Computer Science Lab", 50);
        
    }
}