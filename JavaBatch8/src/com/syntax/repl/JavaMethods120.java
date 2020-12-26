package com.syntax.repl;

public class JavaMethods120 {
    public void sumEvenToX(int x){ int sum = 0;
        for (int i = 0; i <=x ; i+=2) {
            if(i%2==0){
                sum+=i;
            }






        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        JavaMethods120 mm=new JavaMethods120();
        mm.sumEvenToX(8);
    }
}
