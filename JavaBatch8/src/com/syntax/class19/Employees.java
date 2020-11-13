package com.syntax.class19;

import com.syntax.class18.Employee;

public class Employees {

    //static int number;
   // static String name;
    //static char character;

   // static void print(){
   //     System.out.println("Number"+ number+" name "+name+"character "+character);
   // }

    //public static void main(String[] args) {
    //    print();
   //     int num;
   //     System.out.println(num);
   // }
    int age;
     String name;
     char grade;

     Employees(){
         System.out.println("I will be called everytime you create an object of this class");
     }
     Employees(int ageValue, String nameValue, char gradeValue) {
         System.out.println("I am not a useless constructor I am initializing your fields");

         if (ageValue > 60| ageValue<18) {
             System.out.println("You should not be working. Please retire. Or, wait until you are 18 years old");
         } else {
             age = ageValue;
         }
         if(nameValue.length()>25){
             System.out.println("Please us shorter name like Aladdin");
         }else{
             name = nameValue;
             grade = gradeValue;
         }
     }
     void print(){
        System.out.println("Number"+ age+" name "+name+"character "+grade);
    }


}
