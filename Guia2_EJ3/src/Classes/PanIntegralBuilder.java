package Classes;

import java.security.PublicKey;

public class PanIntegralBuilder implements PanBuilder{
    private PanIntegral panIntegral;

    public PanIntegralBuilder(){
        this.reset();
    }

    public void reset(){
        this.panIntegral = new PanIntegral();
    }
    public PanIntegral getPanIntegral(){
        return this.panIntegral;
    }
    public void checkTemperature() {
        System.out.println("Checkeando temperatura");
    }

    @Override
    public void prepareWaterYSalt() {
        System.out.println("Preparando AGUA y Sal");
    }

    @Override
    public void prepareLevadura() {
        System.out.println("Preparando LEVADURA");
    }

    @Override
    public void addWaterYShake() {
        System.out.println("Adicionando agua y batiendo");

    }

    @Override
    public void addHarinaYRemove() {
        System.out.println("Adicionando harina con grano de trigo entero y removiendo");

    }

    @Override
    public void amasar() {
        System.out.println("Amasando");
    }

    @Override
    public void letRest() {
        System.out.println("Dejando descansar");

    }

    @Override
    public void cutMass() {
        System.out.println("Cutando Mass");

    }

    @Override
    public void takeToOven() {
        System.out.println("Llevando al horno");

    }

    public PanIntegral getProduct() {
        PanIntegral product = getPanIntegral();
        reset();
        return product;
    }

}
