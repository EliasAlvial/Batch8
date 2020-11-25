package com.syntax.DaddyChill;

public  class Registration {
    protected String email;

    protected String UserName;

    protected String password;

}

class User extends Registration {
    public User(String email, String Username, String password) {
        this.email = email;
        this.UserName = Username;
        this.password = password;
    }


    void validateDomain(String email) {
        this.email=email;
        if (email.contains("yahoo.com")) {

        } else {
            System.out.println("Invalid domain");
        }

    }
    void validateUsername(String Username) {
        int length=Username.length();
        this.UserName=Username;
        if(length==0){
            System.out.println("invalid Username");
        }else{
        }
    }

    void validatePassword(String password) {
        int length=password.length();
        this.password=password;
        if(length<6|| length==0 && password.toLowerCase().contains(UserName.toLowerCase())){
            System.out.println("invalid password");
        }else{
        }
    }

}
class Main2{
    public static void main(String[] args) {
        User user = new User("techsquad@gmail.com","", "DEEz1234" );

        user.validateDomain(user.email);
        user.validateUsername(user.UserName);
        user.validatePassword(user.password);

    }
}
