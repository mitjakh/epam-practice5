package task5_1.Model;

import java.util.*;
import java.util.regex.*;

public class Model
{
    private JournalEntry[] entryList = new JournalEntry[10];
    private int counter = 0;

    public String handleMenu(int userMenuChoice)
    {
        String output;

        switch (userMenuChoice)
        {
            case 1:
            {

            }
            case 2:
            {

            }
            case 3:
            {

            }
            case 4:
            {

            }
            case 0:
            {
                System.exit(0);
            }
            default:
            {
                output = "Wrong input, try again.";
            }
        }
        return output;
    }

    public void createJournalEntry(String input)
    {
        String template = "[A-Z][a-z]{2,20}[\\s,;][A-Z][a-z]{2,20}[\\s,;]\\d{2,2}[./]\\d{2,2}[./]\\d{2,4}[\\s,;][\\d]{12,12}[\\s,;]([A-Z][a-z]+[\\s.,;])+[\\d]{2,3}[\\s,.;]+[\\d]{2,4}";
        Pattern pattern = Pattern.compile(template);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find())
        {
            String separatedParts[] = input.split("[\\s,;]");

            entryList[counter].setLastName(separatedParts[0]);
            entryList[counter].setFirstName(separatedParts[1]);
            entryList[counter].setBirthday(separatedParts[2]);
            entryList[counter].setPhoneNumber(separatedParts[3]);
            entryList[counter].setHomeAddress(separatedParts[4]);

        }
        counter++;
    }
}
