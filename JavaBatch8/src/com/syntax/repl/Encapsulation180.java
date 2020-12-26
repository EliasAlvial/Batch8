package com.syntax.repl;
class EncapsulationDemo{
    private String empName;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    private int empAge;

}

public class Encapsulation180 extends EncapsulationDemo{
    public static void main(String[] args) {
      EncapsulationDemo mm=new EncapsulationDemo();
        mm.setEmpAge(30);
        mm.setEmpName("John");
        System.out.println("Employee Name: "+mm.getEmpName());
        System.out.println("Employee Age: "+mm.getEmpAge());

    }

}
