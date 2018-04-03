package task5_1;

import task5_1.Controller.Controller;
import task5_1.Model.*;
import task5_1.View.View;

public class Main
{
    public static void main(String[] args)
    {
//        Initialization of MVC and running
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, view);
        controller.run();
    }
}
