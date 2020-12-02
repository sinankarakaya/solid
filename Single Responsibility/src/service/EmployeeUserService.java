package service;

import entity.User;

public class EmployeeUserService {

    User user;

    public EmployeeUserService(User user){
        this.user = user;
    }

    public void changePassword(String newPassword){
        System.out.println("Changed password to new password");
    }

    public void changeAddress(String street,String zipCode,String city) {
        System.out.println("Changed address");
    }

    public String getUserHolderFirstName(long UserID){
        return this.user.firstName;
    }

    public String getUserHolderLastName(long UserID){
        return this.user.firstName;
    }

    public void depositMoney(Double amount){
        System.out.println(amount + " has beend deposited to "+ this.user.firstName);
    }

    public void withDrawMoney (Double amount) {
        System.out.println(amount + " has beend withdraw from "+ this.user.firstName);
    }

    public void login(String username,String password){
        System.out.println(this.user.username +" has tried to log in");
    }

    public void logout(String username) {
        System.out.println(this.user.username+" has tried to log out");
    }
}
