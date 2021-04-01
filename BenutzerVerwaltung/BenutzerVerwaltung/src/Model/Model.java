package Model;

import Data.*;
import controller.Controller;

import javax.swing.*;
import java.util.ArrayList;

public class Model {
    private ArrayList<UserData> data = new ArrayList<>();
    private IdGenerator id = new IdGenerator();
    private String value;
    private Controller controller;

    public Model(Controller controller) {
        this.controller = controller;
    }


    public void createUser(UserData userData) {

        data.add(userData);
    }

    public DefaultListModel getList (){
        DefaultListModel model1 = new DefaultListModel();
        for (UserData d: data) {
            String text = d.getID() + "    " + d.getVorname() + " " + d.getNachname();
            model1.addElement(text);
        }
        return model1;
    }
    public String getName(int index, int entry){
        UserData safe = data.get(index);
        switch (entry) {
            case 1:
                value = safe.getNachname();
                break;
            case 2:
                value = safe.getVorname();
                break;
            case 3:
                value = safe.getGeburtsdatum();
                break;
            case 4:
                value = safe.getGeschlecht();
                break;
            case 5:
                value = safe.getStrasse();
                break;
            case 6:
                value = safe.getPlz();
                break;
            case 7:
                value = safe.getOrt();
                break;
            case 8:
                value = safe.getNumber();
                break;
        }
        return value;
    }

    public void deleteUser(int Index) {
        controller.setNewId();
        data.remove(Index++);
        for (UserData d: data) {
            int id = Integer.parseInt(d.getID());
            if (id > Index){
                id--;
                d.setID(controller.getId(id));
            }

        }
    }
}
