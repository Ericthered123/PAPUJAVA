package Classes;

import java.util.Comparator;

public class ClimaComparator {     //Wrapper
    public static Comparator<Clima> porFecha(){

        return Comparator.comparing(Clima::getUltimaActualizacion);
    }
    public static Comparator<Clima> porTemperatura(){
        return Comparator.comparingDouble(Clima::getActualTemperature);
    }

}
