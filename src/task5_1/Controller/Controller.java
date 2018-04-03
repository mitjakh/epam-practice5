package task5_1.Controller;

import task5_1.Model.*;
import task5_1.View.View;

public class Controller
{
    private Model model = new Model();
    private View view = new View();

    public Controller(Model model, View view)
    {
        this.model = model;
        this.view = view;
    }


}
