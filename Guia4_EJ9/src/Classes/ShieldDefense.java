package Classes;

public class ShieldDefense implements DefenseStrategy {

    public ShieldDefense(){

    }

    @Override
    public int defend(int attack){
        return 30;
    }


}
