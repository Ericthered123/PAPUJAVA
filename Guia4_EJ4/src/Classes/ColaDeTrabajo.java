package Classes;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

public class ColaDeTrabajo {

    private Queue<Trabajo> trabajos;
    private String name;
    private boolean lista;

    public ColaDeTrabajo() {

    }
    public ColaDeTrabajo(String name, boolean lista) {
        this.name = name;
        this.lista = lista;
        trabajos = new LinkedList<Trabajo>();
    }
    public ColaDeTrabajo(String name) {
        this.name = name;
        this.lista = false;
        trabajos = new LinkedList<Trabajo>();
    }

    public Queue<Trabajo> getTrabajos() {
        return trabajos;
    }

    public String getName() {
        return name;
    }

    public boolean isLista() {
        return lista;
    }

    public void setLista(boolean lista) {
        this.lista = lista;
    }

    public void addTrabajo(Trabajo trabajo) {
        getTrabajos().add(trabajo);
    }


    @Override
    public String toString() {
        return "ColaDeTrabajo{" +
                "trabajos=" + trabajos +
                ", name='" + name + '\'' +
                ", lista=" + lista +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ColaDeTrabajo that)) return false;
        return isLista() == that.isLista() && Objects.equals(getTrabajos(), that.getTrabajos()) && Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTrabajos(), getName(), isLista());
    }


    public int size(){
        return getTrabajos().size();
    }

    public Trabajo sacar() throws SinTrabajoEnColaException, NoListaException{
        if (getTrabajos().isEmpty()) {

            throw new SinTrabajoEnColaException(getName());
        }
        if (!isLista()){

            throw new NoListaException(getName(),size());
        }

        System.out.println("Trabajo procesado; Restantes = " + (size()-1));
        return trabajos.poll();



    }




}
