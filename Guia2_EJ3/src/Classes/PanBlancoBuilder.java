package Classes;

public class PanBlancoBuilder implements PanBuilder{

    private PanBlanco panBlanco;

    public PanBlancoBuilder(){
        this.reset();
    }
    public void reset(){
        this.panBlanco = new PanBlanco();
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
        System.out.println("Adicionando harina con solo parte central del grano y removiendo");

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
    public PanBlanco getPanBlanco(){
        return this.panBlanco;
    }
    public PanBlanco getProduct() {
        PanBlanco product = getPanBlanco();
        reset();
        return product;
    }
}
