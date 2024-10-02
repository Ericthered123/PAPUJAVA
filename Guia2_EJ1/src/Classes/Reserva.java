package Classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Reserva {
    private Cliente cliente;
    private LocalDate fecha;
    private ArrayList<Plato> platos;

    public Reserva(Cliente cliente,ArrayList<Plato> platos) {
        this.cliente = cliente;
        this.fecha = LocalDate.now();
        this.platos = platos;
    }
    public Reserva(Cliente cliente,Plato plato) {
        this.cliente = cliente;
        this.fecha = LocalDate.now();
        this.platos= new ArrayList<>();
        this.platos.add(plato);
    }
    public Reserva(){
        this.platos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "cliente=" + cliente +
                ", fecha=" + fecha +
                ", platos=" + platos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reserva reserva)) return false;
        return Objects.equals(cliente, reserva.cliente) && Objects.equals(fecha, reserva.fecha) && Objects.equals(platos, reserva.platos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cliente, fecha, platos);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void  addPlato(Plato plato) {
        getPlatos().add(plato);

    }

    public int cantPlatos(){
        return getPlatos().size();
    }


    public double calcularTotal(){
        double total=0;


        for (Plato plato : getPlatos()) {
            total+= getCliente().getDescuento(plato.getPrecio());


        }
        if (cantPlatos()>1){
            total*= (0.95);
        }
        return total;
    }





}
