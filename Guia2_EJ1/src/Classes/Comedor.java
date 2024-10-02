package Classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;


public class Comedor {

    private String nombre;
    private int telefono;
    private String direccion;
    private ArrayList<Reserva> reservas;

    public Comedor(String nombre, int telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.reservas = new ArrayList<Reserva>();
    }
    public Comedor(){}
    @Override
    public String toString() {
        return "Comedor{" +
                "nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                ", direccion='" + direccion + '\'' +
                ", reservas=" + reservas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Comedor comedor)) return false;
        return telefono == comedor.telefono && Objects.equals(nombre, comedor.nombre) && Objects.equals(direccion, comedor.direccion) && Objects.equals(reservas, comedor.reservas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, telefono, direccion, reservas);
    }

    public void setNombre(){
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }


    public void addReserva(Reserva reserva){
        getReservas().add(reserva);
    }
    public void addReserva(Cliente client, Plato plato){
        Reserva toAdd= new Reserva(client,plato);
        getReservas().add(toAdd);
    }
    public void addReservas(Cliente client, ArrayList<Plato> platos){
        Reserva toAdd= new Reserva(client,platos);
        getReservas().add(toAdd);
    }

    public double valorReserva(Reserva reserva) {
        if (reserva != null) {
            return reserva.calcularTotal();
        }
        return 0;
    }
    public double totalValorReservas(){
        //double total = 0;
        //for (Reserva reserva : getReservas()) {
           // total += reserva.calcularTotal();
        //}
        //return total;

        //EJ14 con Streams

        return getReservas().stream()
                .mapToDouble(Reserva::calcularTotal)
                .reduce(0, Double::sum);


    }
    public int totalPlatosReservados(){
        //int total = 0;
        //for (Reserva reserva : getReservas()) {
            //total += reserva.cantPlatos();
        //}
        //return total;

        return getReservas().stream()
                .mapToInt(Reserva::cantPlatos)
                .sum();

    }
    public Reserva reservaMasPlatos(){
        //Reserva reservaMayor = null;
        //int aux=0;
        //for (Reserva reserva : getReservas()) {
            //if (reserva.cantPlatos()>aux){
                //reservaMayor = reserva;
                //aux=reserva.cantPlatos();
            //}

        //}
        //return reservaMayor;

        return getReservas().stream()
                .max(Comparator.comparingInt(Reserva::cantPlatos))
                .orElse(null);
    }





}
