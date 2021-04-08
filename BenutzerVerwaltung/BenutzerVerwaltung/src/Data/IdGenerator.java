package Data;

public class IdGenerator {
    private int ident = 1;

    public IdGenerator() {
    }

    public String getID(){
        String id = String.format("%03d",ident);
        ident++;
        return id;
    }
    public String getID(int presentID){
        String id = String.format("%03d",presentID);
        return id;
    }

    public void setNewId() {
        ident = ident -1;
    }
}
