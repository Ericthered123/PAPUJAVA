import Classes.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text

        Comedor unnobaComedor= new Comedor("Unnoba",2364326,"Newbery");

        Alumno eric = new Alumno("Eric",2364326);
        Profesor jp = new Profesor("Jp",2364326);

        Particular pedro = new Particular("Pedro",2364326);

        Plato arroz = new Plato(100,"Arroz",DiaSemana.LUNES);
        Plato plato2 = new Plato(300,"Pan de carne",DiaSemana.MARTES);

        unnobaComedor.addReserva(pedro,arroz);
        unnobaComedor.addReserva(eric,arroz);
        unnobaComedor.addReserva(jp,arroz);

        System.out.println(unnobaComedor.toString());
        System.out.println(unnobaComedor.totalPlatosReservados());
        System.out.println(unnobaComedor.totalValorReservas());

    }
    // to see how IntelliJ IDEA suggests fixing it.

}


