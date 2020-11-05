package com.syntax.class13;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
      int transferAmount;
        Account burjuAccount=new Account();
        burjuAccount.accountId="123";
        burjuAccount.userName="Burju";
        burjuAccount.password="pass123";
        burjuAccount.balance=1000000;
        burjuAccount.typeOfAccount="checking";
        burjuAccount.limit=125;
        boolean isLoggedIn=burjuAccount.login("Burju",
               "pass123");
        System.out.println(isLoggedIn);

        System.out.println("Please enter amount you would like to withdraw");
        transferAmount=scan.nextInt();
        double canWithdraw=burjuAccount.transfer(transferAmount);{
            if  (transferAmount>= burjuAccount.limit){
                System.out.println("insufficient balance");
            }else{
                System.out.println(transferAmount+" Withdrawn");
            }
        }


        Account eliasAccount=new Account();
        eliasAccount.accountId="125";
        eliasAccount.userName="Elias";
        eliasAccount.password="pass123";
        eliasAccount.balance=1500;
        eliasAccount.typeOfAccount="saving";
        eliasAccount.limit=100;




    }
}
