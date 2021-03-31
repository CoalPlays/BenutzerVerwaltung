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
        if (entry == 1){
            value = safe.getNachname();
        }
        if (entry == 2){
            value = safe.getVorname();
        }
        if (entry == 3){
            value = safe.getGeburtsdatum();
        }
        if (entry == 4){
            value = safe.getGeschlecht();
        }
        if (entry == 5){
            value = safe.getStrasse();
        }
        if (entry == 6){
            value = safe.getPlz();
        }
        if (entry == 7){
            value = safe.getOrt();
        }
        if (entry == 8){
            value = safe.getNumber();
        }
        return value;
    }


}
