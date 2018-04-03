package task5_1.View;

import java.io.IOException;
import java.util.Scanner;

public class Menu
{
    private String[] menuEntries = new String[]{"1. Add new entry.",
            "2. Show last entry",
            "3. Show specific entry",
            "4. Show all entries",
            "0. Exit"};

    public void showMenu()
    {
        for (String menuEntry : menuEntries)
        {
            System.out.println(menuEntry);
        }
    }

//    reading user choice. if no correct input found returns 1252 to trigger default "wrong input" statement
    public int userChoice()
    {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt())
            return scanner.nextInt();
        else
            return 1252;
    }
}
