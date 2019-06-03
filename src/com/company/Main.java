package com.company;

import com.company.Controller.Controller;
import com.company.Model.Model;
import com.company.View.View;


public class Main {

    public static void main(String[] args) {

        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model,view);
        controller.startGame();
    }
}
