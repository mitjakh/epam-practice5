package task5_1.View;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class View
{
    Scanner scanner = new Scanner(System.in);

    public String getLastName()
    {
        String lastName;
        String template = "[A-Z][a-z]{1,20}";
        Pattern pattern = Pattern.compile(template);

        while (true)
        {
            System.out.print("Creating new entry.\nEnter last name: ");
            lastName = scanner.nextLine();
            Matcher matcher = pattern.matcher(lastName);
            if (!matcher.find())
            {
                System.out.println("No correct last name entered.");
                break;
            }
            else
                lastName = matcher.group();
        }

        return lastName;
    }

    public String getFirstName()
    {
        String firstName;
        String template = "[A-Z][a-z]{1,20}";
        Pattern pattern = Pattern.compile(template);

        while (true)
        {
            System.out.print("Enter first name: ");
            firstName = scanner.nextLine();
            Matcher matcher = pattern.matcher(firstName);
            if (!matcher.find())
            {
                System.out.println("No correct first name entered.");
                break;
            }
            else
                firstName = matcher.group();
        }

        return firstName;
    }

    public String getBirthday()
    {
        String birthday;
        String template = "\\d{2,2}[./]\\d{2,2}[./]\\d{2,4}";
        Pattern pattern = Pattern.compile(template);

        while (true)
        {
            System.out.print("Enter birthday: ");
            birthday = scanner.nextLine();
            Matcher matcher = pattern.matcher(birthday);
            if (!matcher.find())
            {
                System.out.println("No correct birthday entered.");
                break;
            }
            else
                birthday = matcher.group();
        }

        return birthday;
    }

    public String getPhoneNumber()
    {
        String phoneNumber;
        String template = "[\\d]{12,12}";
        Pattern pattern = Pattern.compile(template);

        while (true)
        {
            System.out.print("Enter phone number: ");
            phoneNumber = scanner.nextLine();
            Matcher matcher = pattern.matcher(phoneNumber);
            if (!matcher.find())
            {
                System.out.println("No correct phone number entered.");
                break;
            }
            else
                phoneNumber = matcher.group();
        }

        return phoneNumber;
    }

    public String getHomeAddress()
    {
        String homeAddress;
        String template = "([A-Z][a-z]+[\\s.,;])+[\\d]{2,3}[\\s,.;]+[\\d]{2,4}";
        Pattern pattern = Pattern.compile(template);

        while (true)
        {
            System.out.print("Enter home address: ");
            homeAddress = scanner.nextLine();
            Matcher matcher = pattern.matcher(homeAddress);
            if (!matcher.find())
            {
                System.out.println("No correct home address entered.");
                break;
            }
            else
                homeAddress = matcher.group();
        }

        return homeAddress;
    }
}