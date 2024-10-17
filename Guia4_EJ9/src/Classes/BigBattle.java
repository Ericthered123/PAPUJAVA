package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BigBattle extends Battle{

    private List<Robot> robots;
    private final Random RANDOM= new Random();


    public BigBattle(){
        robots = new ArrayList<Robot>();
    }


    public List<Robot> getRobots() {
        return robots;
    }

    public void addRobot(Robot robot){
        getRobots().add(robot);
    }

    public int size(){
        return getRobots().size();
    }

    public void remove(Robot robot){
        getRobots().remove(robot);
    }

    public void start(){
        System.out.println("La batalla comienza entre los robots");

        while(getRobots().size()!=1){
            Robot attacker= getRobots().get(RANDOM.nextInt(size()));
            Robot defender= getRobots().get(RANDOM.nextInt(size()));
            if (attacker!=defender) {
                takeTurn(attacker, defender);
                if (defender.isAlive()) {
                    takeTurn(defender, attacker);
                }
                if (!attacker.isAlive()) {
                    System.out.println("El robot : " + attacker.getName() + " perdio");
                    remove(attacker);
                }
                if (!defender.isAlive()) {
                    System.out.println("El robot : " + defender.getName() + " perdio");
                    remove(defender);
                }
            }

        }

        System.out.println("El robot : " + getRobots().get(0).getName() + " gano la gran batalla con " + getRobots().get(0).getHealth() + " puntos de vida restantes");


    }




}
