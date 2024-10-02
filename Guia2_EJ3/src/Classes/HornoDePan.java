package Classes;

public class HornoDePan {

    public HornoDePan(){

    }

    public  void makePan(PanBuilder builder){

        builder.checkTemperature();
        builder.prepareWaterYSalt();
        builder.prepareLevadura();
        builder.addWaterYShake();
        builder.addHarinaYRemove();
        builder.amasar();
        builder.letRest();
        builder.cutMass();
        builder.takeToOven();

    }

}
