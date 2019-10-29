package mx.ipn.cic.geo.databindingactivities;

/*
public class UserInfo {
    public String firstName;
    public String lastName;

    /*
    public String firstName;
    public String lastName;
    public Date birthDate;
    public String address;
    public String state;
    public String country;
    public String email;
    public String phone;
    public String facebook;


    public UserInfo(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
*/

// Usando Beans.
public class UserInfo
{
    private String firstName;
    private String lastName;

    UserInfo(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() { return this.firstName; }
    public String getLastName() { return this.lastName; }
}

