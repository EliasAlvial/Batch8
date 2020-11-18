package com.syntax.reviewClass4;

public class Main {

    public static void main(String[] args) {
        Book[] books=new Book[2];
        Student[] students=new Student[3];
        Book book1=new Book("HarryPotter","HarryPotter",
                "JK Rolling",1999, "123", true);
        Book book2=new Book("Java","Java",
                "Aladdin",1995, "12345", true);
        System.out.println(book1.getTitle());
        System.out.println(book2.getTitle());
        book1.setBookName("NewBook");
        System.out.println(book1.getTitle());
        books[0]=book1;
        books[1]=book2;

        System.out.println(books[1].getAuthor());
        System.out.println(book1.getTitle());

        Student student1=new Student("Moneer", "Moneer123",20);
        Student student2=new Student("Bryan", "Bryan123",25);
        Student student3=new Student("Mike", "Mike123",27);
        students[0]=student1;
        students[1]=student2;
        students[2]=student3;

    }
}
