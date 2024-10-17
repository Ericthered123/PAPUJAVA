package Classes;

public class CuentaCorriente extends CuentaBancaria {

    public CuentaCorriente( Persona titular) {
        super(10, titular,10);
    }

    public void extraer(double valor) throws SuperaLimiteMinimoException {
        if ((getSaldoActual()-valor)<getLimiteMinExtracc()) {
            throw new SuperaLimiteMinimoException(getTitular().getName(),getLimiteMinExtracc(),getSaldoActual(),valor);
        }
        else{
            setSaldoActual(getSaldoActual()-valor);

        }
    }
}
