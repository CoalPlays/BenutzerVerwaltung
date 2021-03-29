package Model;

import Data.*;

import java.util.ArrayList;

public class Model {
    private ArrayList<UserData> data = new ArrayList<>();
    private IdGenerator id = new IdGenerator();

    public Model() {

    }

    public Model(UserData userData) {

        createUser(userData);
    }

    public void createUser(UserData userData) {

        data.add(userData);
    }


}
