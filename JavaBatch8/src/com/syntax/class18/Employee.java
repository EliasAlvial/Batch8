package com.syntax.class18;

public class Employee {
    /* Create a class called Epmloyee

     */
    int empID;
    double salary;
   static String CEO;

    public static void main(String[] args) {
        Employee employee1=new Employee();
        employee1.empID=123;
        employee1.salary=100000;
        Employee.CEO="Sumair";

        Employee employee2=new Employee();
        employee2.empID=234;
        employee2.salary=150000;

        System.out.println(employee2.CEO);
    }
}
