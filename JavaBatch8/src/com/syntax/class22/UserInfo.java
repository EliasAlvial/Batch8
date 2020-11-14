package com.syntax.class22;

public class UserInfo extends UserClass{
    String userAddress;
    UserInfo(String name, String mobileNumber, String userAddress){
        super(name, mobileNumber);
        this.userAddress=userAddress;
    }

    void userDetails(){
        System.out.println("Name is "+super.getName()+" Phone Number is "+super.getMobileNumber()+" address is "+userAddress);
    }

    public static void main(String[] args) {
        UserInfo userInfo=new UserInfo("Valerie", "2408686686", "Iquique, Chile");
        UserInfo userInfo1=new UserInfo("Jacob", "3018486696", "Caracas, Venezuela");

    }
}
