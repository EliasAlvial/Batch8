package com.syntax.class16;

public class Task5 {
    /* Create a method createEmail().
    Based on values of users name, lastName and email type,
    your method should return complete email Address.
    Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
     */
    public static void createEmail(String FirstName, String LastName, String Domain){
        System.out.println(FirstName+LastName+"@"+Domain+".com");
    }

}
