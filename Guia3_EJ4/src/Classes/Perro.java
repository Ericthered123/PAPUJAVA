package Classes;

public class Perro extends Animal{


    public Perro(String name,String raza){
        super(name,raza);
    }

    @Override
    public void habla(){
        System.out.println("Guau!");
    }


}
