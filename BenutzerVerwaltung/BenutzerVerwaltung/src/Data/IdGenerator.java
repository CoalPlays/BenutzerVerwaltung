package Data;

public class IdGenerator {
    private int ident = 1;

    public IdGenerator() {
    }

    public String getID(){
        String id = "";
        String idPart = Integer.toString(ident);
        if (ident < 10){
            id = "00" + idPart;
        }
        if (9 < ident && ident < 100){
            id = "0" + idPart;
        }
        if (ident > 99){
            id += idPart;
        }
        ident++;
        return id;
    }
    public String getID(int presentID){
        String id = "";
        String idPart = Integer.toString(ident);
        if (presentID < 10){
            id = "00" + presentID;
        }
        if (9 < presentID && presentID < 100){
            id = "0" + presentID;
        }
        if (ident > 99){
            id += presentID;
        }
        return id;
    }

    public void setNewId() {
        ident = ident -1;
    }
}
