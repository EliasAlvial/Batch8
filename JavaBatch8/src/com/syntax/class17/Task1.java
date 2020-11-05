package com.syntax.class17;

public class Task1 {
    /* Create a method createEmail().
    Based on values of users name, lastName and email type,
    your method should return complete email Address.
    Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
     */
    String createEmail(String FirstName, String LastName, String Domain){
        return FirstName+LastName+"@"+Domain+".com";
    }

}
