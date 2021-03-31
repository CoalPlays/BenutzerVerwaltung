package Model;

import Data.*;

import javax.swing.*;
import java.util.ArrayList;

public class Model {
    private ArrayList<UserData> data = new ArrayList<>();
    private IdGenerator id = new IdGenerator();
    private DefaultListModel model1 = new DefaultListModel();
    private String value;


    public Model() {

    }


    public void createUser(UserData userData) {
        String text = userData.getID() + "    " + userData.getVorname() + " " + userData.getNachname();
        model1.addElement(text);
        data.add(userData);
    }

    public DefaultListModel getList (){

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


}
