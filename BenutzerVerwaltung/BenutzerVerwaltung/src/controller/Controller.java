package controller;

import Data.UserData;
import GUI.CreateGUI;
import GUI.MainGUI;
import GUI.ViewGUI;
import Model.Model;
import sun.applet.Main;

import java.util.ArrayList;

public class Controller {

    private Model model;
    private CreateGUI createGUI;
    private MainGUI mainGUI;
    private ViewGUI viewGUI;


    public Controller() {
        model = new Model();
        setMainVis();
    }

    public void addUser(UserData userData){
        model.createUser(userData);
    }



    public void setMainVis() {
        vanish();
        mainGUI = new MainGUI(this);
    }
    public void setCreateVis() {
        vanish();
        createGUI = new CreateGUI(this);
    }
    public void setDetailVis() {
        vanish();
        viewGUI = new ViewGUI(this);
    }

    private void vanish() {

        if (mainGUI != null) {
            mainGUI.getFrame().dispose();
        }
        if (viewGUI != null) {
            viewGUI.getFrame().dispose();
        }
        if (createGUI != null) {
            createGUI.getFrame().dispose();
        }
    }
}
