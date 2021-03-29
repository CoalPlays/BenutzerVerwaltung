package Model;

import Data.*;

import javax.swing.*;
import java.util.ArrayList;

public class Model {
    private ArrayList<UserData> data = new ArrayList<>();
    private IdGenerator id = new IdGenerator();
    private DefaultListModel model1 = new DefaultListModel();

    public Model() {

    }

    public Model(UserData userData) {
        createUser(userData);
    }

    public void createUser(UserData userData) {
        String text = userData.getID() + " " + userData.getVorname() + " " + userData.getNachname();
        model1.addElement(text);
        data.add(userData);
    }

    public DefaultListModel getList (){
        return model1;
    }

}
