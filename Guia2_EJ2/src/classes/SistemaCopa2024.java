package classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class SistemaCopa2024 {

    private String nombre;
    private ArrayList<Partido> partidos;


    public SistemaCopa2024(String nombre) {
        this.nombre = nombre;
        this.partidos = new ArrayList<>();
    }

    public SistemaCopa2024(){}

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void addPartido(Partido partido) {
        getPartidos().add(partido);
    }

    public Estadio estadioMasGrande(){
        //Estadio estadioM=null;
        //int aux=0;
        //for (Partido partido : partidos) {
            //if (estadioM==null || partido.getEstadio().getCapacity()>aux){
            //    estadioM=partido.getEstadio();
          //  }
        //}

        //return estadioM;

       return getPartidos().stream()
               .map(Partido::getEstadio)
               .distinct()
               .max(Comparator.comparingInt(Estadio::getCapacity))
               .orElse(null);


    }


    public int cantidadTotalEspectadores() {
        //  int aux=0;
        //for(Partido partido : getPartidos()){
        //  aux+=partido.getEstadio().getCapacity();
        //}
        //   return aux;
        //}

        return getPartidos().stream()
                .map(Partido::getEstadio)
                .distinct()
                .mapToInt(Estadio::getCapacity)
                .sum();
    }
    public double montoRecaudado(Partido partido){

        return partido.getTotalValue();
    }

    public double montoTotalRecaudado(){
        //double aux=0;
        //for (Partido partido : getPartidos()) {
          //  aux+=partido.getTotalValue();
        //}
        //return aux;

        return getPartidos().stream()
                .mapToDouble(Partido::getTotalValue)
                .sum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SistemaCopa2024 that)) return false;
        return Objects.equals(nombre, that.nombre) && Objects.equals(partidos, that.partidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, partidos);
    }

    @Override
    public String toString() {
        return "SistemaCopa2024{" +
                "nombre='" + nombre + '\'' +
                ", partidos=" + partidos +
                '}';
    }
}
