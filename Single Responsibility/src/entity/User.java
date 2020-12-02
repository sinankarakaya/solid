package entity;

public class User {
    
    public long userID;
    public String firstName;
    public String lastName;
    public String street;
    public String zipCode;
    public String username;
    public String password;

    public User(long userID,String firstName,String lastName,String street,String zipCode,String username,String password){
        this.userID = userID;
        this.lastName = lastName;
        this.street = street;
        this.zipCode = zipCode;
        this.username = username;
        this.password = password;
    }
}
