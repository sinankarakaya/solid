package entity;

public class User {
    
    public long userID;
    public Address address;
    public Profile profile;


    public User(long userID,Address address,Profile profile){
        this.userID = userID;
        this.address = address;
        this.profile = profile;
    }
}
