package entity;

public class EmployeeUser {

    public long employeeUserID;
    public Address address;
    public Profile profile;

    public EmployeeUser(long userID,Address address,Profile profile){
        this.userID = userID;
        this.address = address;
        this.profile = profile;
    }
}
