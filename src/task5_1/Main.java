package task5_1;

import task5_1.Controller.Controller;
import task5_1.Model.JournalEntry;
import task5_1.View.View;

public class Main
{
    View view = new View();
    JournalEntry journalEntry = new JournalEntry();

    Controller controller = new Controller(journalEntry, view);
}
