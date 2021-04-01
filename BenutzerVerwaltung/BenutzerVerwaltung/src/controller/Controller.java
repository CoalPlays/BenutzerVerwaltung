package controller;

import Data.IdGenerator;
import Data.UserData;
import GUI.CreateGUI;
import GUI.MainGUI;
import GUI.ViewGUI;
import Model.Model;
import sun.applet.Main;

import javax.swing.*;
import java.util.ArrayList;

public class Controller {

    private Model model;
    private CreateGUI createGUI;
    private MainGUI mainGUI;
    private ViewGUI viewGUI;
    private UserData userData;
    private IdGenerator idGenerator;


    public Controller() {
        idGenerator = new IdGenerator();
        model = new Model(this);
        userData = new UserData();
        setMainVis();
    }

    public void addUser(UserData userData){
        model.createUser(userData);
    }

    public DefaultListModel transferList(){
        DefaultListModel model1 = model.getList();
        return model1;
    }

    public void setMainVis() {
        vanish();
        mainGUI = new MainGUI(this);
    }
    public void setCreateVis() {
        vanish();
        createGUI = new CreateGUI(this, userData);
    }
    public void setDetailVis(int index) {
        vanish();
        viewGUI = new ViewGUI(this, index);
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
    public String getID() {
        return idGenerator.getID();
    }
    public String getId(int id){
        String idText = idGenerator.getID(id);
        return idText;
    }
    public void setNewId() {
        idGenerator.setNewId();
    }

    public String getName(int index, int entry){
        return model.getName(index, entry);
    }
    public void deleteUser(int index){
        model.deleteUser(index);
        setMainVis();
    }





}
