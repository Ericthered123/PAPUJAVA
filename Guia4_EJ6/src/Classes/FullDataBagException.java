package Classes;

public class FullDataBagException extends Exception{

    private String name;
    private int size;

    public FullDataBagException(String name, int size){
        this.name = name;
        this.size = size;
    }

    @Override
    public String getMessage(){
        return " La bolsa " + name + " esta llena, su capacidad de  " + size + " esta al maximo";

    }


}
