package Classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EstacionMeteorologica {

    private Ubicacion ciudad;
    private List<Clima> historialClimas;
    private Clima climaActual;
    public EstacionMeteorologica(){
        this.historialClimas = new ArrayList<Clima>();
    }
    public EstacionMeteorologica(Ubicacion ciudad,double actTemp, double pressure,char escala
    ,double vientoVel,String direccion,double humedad,double visibilidad){
        this.ciudad = ciudad;
        this.climaActual = new Clima(ciudad,actTemp,pressure,escala,vientoVel,direccion,humedad,visibilidad);
        this.historialClimas = new ArrayList<Clima>();
    }

    public Ubicacion getCiudad() {
        return ciudad;
    }

    public List<Clima> getHistorialClimas() {
        return historialClimas;
    }

    public Clima climaActual(){
        return climaActual;
    }
    public void addClima(Clima  clima){
        getHistorialClimas().add(clima);
    }
    public void removeClima(Clima  clima){
        getHistorialClimas().remove(clima);
    }
    public void actualizar(double actTemp, double pressure
            ,double vientoVel,String direccion,double humedad,double visibilidad){
        Clima climaNuevo= new Clima(getCiudad(),actTemp,pressure, climaActual().getEscala(), vientoVel,direccion,humedad,visibilidad);
        addClima(climaActual());
        climaActual=climaNuevo;

    }

    public void ordenarClimaPorFecha(){
        getHistorialClimas().sort(ClimaComparator.porFecha());

    }

    public void ordenarClimaTemperatura(){
        getHistorialClimas().sort(ClimaComparator.porTemperatura());

    }



    @Override
    public String toString() {
        return "EstacionMeteorologica{" +
                "ciudad=" + ciudad +
                ", historialClimas=" + historialClimas +
                '}';
    }





}
