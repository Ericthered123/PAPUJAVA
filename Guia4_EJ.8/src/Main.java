/*Implemente en JAVA una CuentaBancaria con sus respectivas subclases
CajaDeAhorro y CuentaCorriente las cuales permiten extraer y depositar dinero.
Ambas poseen un saldo, el cual se puede consultar. Además, ambas poseen un
limiteMinimo de extracción, es decir que el saldo no puede quedar menor a eso.
Mientras que en la caja de ahorro el limiteMinimo es de 10, en la cuenta corriente es
de -150. La caja de ahorro tiene un máximo de extracciones (inicialmente 5 y se
“resetea manualmente una vez al mes”) y la cuenta corriente no.
Ambas cuentas tienen un titular (uno y solo uno) que es de la clase Persona (La cual
posee todos los atributos de una persona) y una fecha de apertura de cuenta.
Por otro lado, se desea llevar un control de las transacciones realizada, es por ellos que
cada vez que se realice una transacción, la misma se debe guardar en la cuenta. De cada
Transacción se conoce la fecha, el monto y el tipo de transacción.
*/


import Classes.*;

public class Main {
    public static void main(String[] args) {


        Persona titular = new Persona("Eric", 20);
        CajaDeAhorro c1 = new CajaDeAhorro(titular);
        CuentaCorriente c2 = new CuentaCorriente(titular);

        c1.depositar(1000);
        c2.depositar(1000);

        try {
            c2.extraer(100);
            c1.extraer(10);
            c1.extraer(10);
            c1.extraer(10);
            c1.extraer(10);
            c1.extraer(10);
            c1.reset();
            c1.extraer(10);

        } catch (SuperaLimiteMinimoException | SuperaCantidadExtraccionesException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finishing operation...");
        }




    }

}
