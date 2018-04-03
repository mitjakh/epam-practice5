package task5_1.Model;

public class JournalEntry
{
    private String lastName;
    private String firstName;
    private String birthday;
    private String phoneNumber;
    private String homeAddress;

    public JournalEntry(String lastName, String firstName, String birthday, String phoneNumber, String homeAddress)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.homeAddress = homeAddress;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getBirthday()
    {
        return birthday;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public String getHomeAddress()
    {
        return homeAddress;
    }

    @Override
    public String toString()
    {
        return getLastName() + " " + getFirstName() + "; " + getBirthday() + "; phone: " + getPhoneNumber() + "; address:" + getHomeAddress() + ".";
    }
}
