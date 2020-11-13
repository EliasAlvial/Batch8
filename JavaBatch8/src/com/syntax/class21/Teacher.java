package com.syntax.class21;

public class Teacher {
    //Write a  Java program called Teacher
    //Identify features and behaviors of that Class
    //Create 3 subclasses Math teacher, ChemistryTeacher and PianoTeacher
    //That would have it their own features and behaviors

    String name;
    int experience;
    double salary;
    String degree;
    String education;
    String subject;

    //Teacher(String name, int experience, String degree, String subject){
    //    this.name=name;
      //  this.experience=experience;
        //this.degree=degree;
        //this.subject=subject;
   // }
    //Teacher(String name, int experience, String degree, String subject, double salary, String education){
      //  this(name, experience, degree, subject);
        //this.salary=salary;
        //this.education=education;
   // }
    void print(){
        System.out.println("The teacher "+name+" has "+experience+" years experience of teaching and "  + degree + " degree");
    }


}
