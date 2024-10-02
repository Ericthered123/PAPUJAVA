package Classes;

public class Gato extends Animal{



    public Gato() {}

    public Gato(String name, String raza){
        super(name, raza);
    }


    @Override
    public void habla(){
        System.out.println("Miau!");
    }




}
