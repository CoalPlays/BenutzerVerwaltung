package controller;

import Data.UserData;
import Model.Model;

public class Controller {

    private Model model;

    public Controller() {
    }

    public void addUser(UserData userData) {
        model = new Model(userData);
    }
}
