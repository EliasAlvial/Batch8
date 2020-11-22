package com.syntax.class27;
abstract class File{
    String dataType;
    File(String dataType){
        this.dataType=dataType;
    }
    public void edit(){
        System.out.println(dataType+" will edit");

    }
   public void close(){
       System.out.println(dataType+" will close");
    }
    public abstract void open();
}

class JavaFile extends File{

    JavaFile(String dataType) {
        super(dataType);
    }

    @Override
    public void open() {
        System.out.println(dataType+ " to open .java file we need notepad++ ");
    }
}
class WordFile extends File {

    WordFile(String dataType) {
        super(dataType);
    }

    @Override
    public void open() {
        System.out.println(dataType+" to open .doc file we need Microsoft word to be installed");
    }

}
class PdfFile extends File{

    PdfFile(String dataType) {
        super(dataType);
    }

    @Override
    public void open() {
        System.out.println(dataType+" to open .PDF file we will need to install IOS");

    }
}



public class Task {
    /*
    Create a class File that will have the following behaviors: open, edit, close.
    Edit and close are implemented method while open is an abstract.
    Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific
    implementation of open behaviour: Example: to open .java file we need notepad++
    or sublime text, to open .doc file we need Microsoft word to be installed etc
     */


    public static void main(String[] args) {
        PdfFile pdfFile=new PdfFile("PDF File");
        pdfFile.open();
        pdfFile.close();
        pdfFile.edit();
        WordFile wordFile=new WordFile("Word File");
        wordFile.open();
        wordFile.close();
        wordFile.edit();
        JavaFile javaFile=new JavaFile("Java File");
        javaFile.open();
        javaFile.close();
        javaFile.edit();

    }
}
