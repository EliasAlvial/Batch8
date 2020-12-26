package com.syntax.repl;

import java.util.*;

class Employee{
    String FullName;
    double  salary;
    int ssn;

    public String getFullName() {
        return FullName;
    }

    public int getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }

    public  Employee(String FullName, int ssn, double salary){
        this.FullName=FullName;
        this.ssn=ssn;
        this.salary=salary;
    }


}

public class Set203  {


    public static void main(String[] args) {


    List<Employee> emp=new ArrayList<>();
    emp.add(new Employee("John Doe", 123456789, 80000));
    emp.add(new Employee("Jane Smith", 987654321, 90000));
    emp.add(new Employee("Jackie Chan", 0, 1000000));


            Iterator<Employee> iterator= emp.iterator();
            while (iterator.hasNext()){
                Employee employee=iterator.next();
                System.out.println(employee.getFullName());
                System.out.println(employee.getSsn());
                System.out.println(employee.getSalary());

        }





}
}
