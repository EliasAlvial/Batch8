package com.syntax.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayClassDemo2 {
    public static void main(String[] args) {
        ArrayList<Double>doubleArrayList=new ArrayList<>();
        doubleArrayList.add(18.99);
        doubleArrayList.add(15.90);
        doubleArrayList.add(150.00);
        doubleArrayList.add(152.00);
        doubleArrayList.add(189.00);
        doubleArrayList.add(158.00);
        doubleArrayList.add(15.00);
        System.out.println("Before removal");
        System.out.println(doubleArrayList);




        /*for (Double element:doubleArrayList){ RuntimeException because we are tryg to perform multiple operations in the same for loop
            if(element<20){//element are the arrays that are in the "big box"
            //first operation
                doubleArrayList.remove(element);//secondoperation
            }
        }

         */
        //Unexpected results or runtime exceptions

     /*  for (int i = 0; i < doubleArrayList.size(); i++) {
            doubleArrayList.remove(doubleArrayList.get(i));
        }
        System.out.println("after removal");
        System.out.println(doubleArrayList);

      */
        Iterator<Double> iterator=doubleArrayList.iterator();
        while (iterator.hasNext()){
           // iterator.next();
            if(iterator.next()<20){
                iterator.remove();
            }
        }
        System.out.println("after removal");
        System.out.println(doubleArrayList);
    }

}
