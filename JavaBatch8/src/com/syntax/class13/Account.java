package com.syntax.class13;

public class Account {
    String accountId;
    String userName;
    String password;
    double balance;
    String typeOfAccount;
    double limit;
    boolean isBlocked;
   //write a method that takes the amnount that user wantes to withdraw
    //transfer it deducgts the amount from your balance
    //returns the amount of transfer in case of succes or a 0
    //if false falure

    boolean login(String enteredUserName, String enteredpassword) {//speccify datatype, first
        if (userName.equals(enteredUserName) &&
                password.equals(enteredpassword)) {
            return true;//this is consistant with datatype
        } else {
            return false;
        }
    }
    double transfer(double transferAmount){
        if(limit<=transferAmount){
           return balance=limit-transferAmount;
        }else {
            return 0;
        }

    }



}
