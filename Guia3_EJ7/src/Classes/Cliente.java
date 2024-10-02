package Classes;

public class Cliente {
    public static void main(String [] args){
        PizzaBuilder pz = new PizzaMargheritaBuilder();

        pz.setTipoMasa("Delgada");
        pz.setQueso("Mozarella");
        pz.setSalsa("Tomate");
        pz.addMushrooms();
        pz.addPepperoni();

        Pizza pizza = pz.buildPizza();
        System.out.println(pizza);
        Pizza p2 = pz.buildPizza();
        System.out.println(p2);

    }

}
