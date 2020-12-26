package com.syntax.repl;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

class Student{
    public String name, lastName;
    public int studentId;
     Student(String name, String lastName, int studentId){
        this.name=name;
        this.lastName=lastName;
        this.studentId=studentId;

    }
    public void Studentinfo(){
        System.out.println("Student details: "+ name+" "+lastName+" with id: "+studentId);
    }


}
public class Set202{

    public static void main(String[] args) {
    Set<Student> set=new LinkedHashSet<>();
    set.add(new Student("Samir", "Jawaid", 101));
        set.add(new Student("Asel", "Umurzakova", 102));
        set.add(new Student("Diego", "Juarez", 103));
        set.add(new Student("Sohil", "Aryan", 104));
        set.add(new Student("Alijon", "Nazarov", 105));

        for (Student student:set
             ) {
            student.Studentinfo();

        }
    }
}
