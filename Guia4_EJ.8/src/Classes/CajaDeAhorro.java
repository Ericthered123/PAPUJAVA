package Classes;

public class CajaDeAhorro extends CuentaBancaria{


    private int maxExtracciones;
    private int limiteMax;
    public CajaDeAhorro( Persona titular) {
        super(-150, titular, 0);
        this.maxExtracciones = 5;
        this.limiteMax = 5;
    }

    public void setMaxExtracciones(int maxExtracciones) {
        this.maxExtracciones = maxExtracciones;
    }

    public int getLimiteMax(){
        return limiteMax;
    }

    public int getMaxExtracciones() {
        return maxExtracciones;
    }
    public void reset(){
        setMaxExtracciones(5);
    }

    @Override
    public void extraer(double value) throws SuperaLimiteMinimoException, SuperaCantidadExtraccionesException {

        if(getMaxExtracciones()!=0) {


            if ((getSaldoActual() - value) < getLimiteMinExtracc()) {
                throw new SuperaLimiteMinimoException(getTitular().getName(),getLimiteMinExtracc(),getSaldoActual(),value);
            } else {
                setSaldoActual(getSaldoActual() - value);
                setMaxExtracciones(getMaxExtracciones() - 1);

            }
        }
        else{
            throw new SuperaCantidadExtraccionesException(getTitular().getName(), 5,value);
        }



    }



}
