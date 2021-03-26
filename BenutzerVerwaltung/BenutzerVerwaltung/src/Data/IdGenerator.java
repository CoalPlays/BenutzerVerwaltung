package Data;

public class IdGenerator {
    private int ident = 0;

    public IdGenerator() {
    }

    public String getID(){
        ident++;
        String id = "";
        String idPart = Integer.toString(ident);
        if (ident < 10){
            id = "00" + ident;
        }
        if (9 < ident && ident < 100){
            id = "0" + idPart;
        }
        if (ident > 99){
            id += ident;
        }
        return id;
    }
}
