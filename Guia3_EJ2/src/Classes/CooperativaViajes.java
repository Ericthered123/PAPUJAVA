package Classes;
import java.util.*;


public class CooperativaViajes {

    private ArrayList<Chofer> chofers;
    private String name;

    public CooperativaViajes(String name){
        this.name = name;
        this.chofers = new ArrayList<>();

    }

    public ArrayList<Chofer> getChofers() {
        return chofers;
    }

    public String getName() {
        return name;
    }

    public void addChofer(Chofer chofer){
        getChofers().add(chofer);
    }

    public Chofer realizarViaje(int cantPasajeros, double km){
        Chofer chofer = null;
        int aux=Integer.MAX_VALUE;
        for (Chofer c : getChofers()) {
            if ((c.getCantPas()>=cantPasajeros || c.getCantPas()<aux)) {
                chofer=c;
                aux=c.getCantPas();
            }



        }

        if (chofer!=null){
            chofer.viajar(km);
        }

        return chofer;

    }

    public Colectivo mayorKm(){
        Colectivo colectivoMayor = null;
        double kmAux=0;
        for (Chofer c : getChofers()) {
            if (c.millas()>kmAux) {
                kmAux=c.millas();
                colectivoMayor=c.getColectivo();
            }
        }
        return colectivoMayor;
    }

}
