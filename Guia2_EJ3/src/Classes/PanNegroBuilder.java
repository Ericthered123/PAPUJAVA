package Classes;

public class PanNegroBuilder implements PanBuilder{
    private PanNegro panBlack;

    public PanNegroBuilder(){
        this.reset();
    }

    public void reset(){
        this.panBlack = new PanNegro(); //Usually, after returning the end result to the client, a
        // builder instance is expected to be ready to start
        // producing another product
        // However, this behavior isn't
        // mandatory, and you can make your builder wait for an
        // explicit reset call from the client code before disposing
        // of the previous result.
    }

    @Override
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
        System.out.println("Adicionando harina sin salvado y germen de trigo y removiendo");

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
    public PanNegro getPanBlack(){
        return this.panBlack;
    }
    public PanNegro getProduct() {
        PanNegro product = getPanBlack();
        reset();
        return product;
    }

}
