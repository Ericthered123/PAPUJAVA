package Classes;

public class EmptyDataBagException extends Exception{
    private String name;
    private int size;


    public EmptyDataBagException(String name, int size) {
        this.name = name;
        this.size = size;

    }

    @Override
    public String getMessage() {
        return "La bolsa " + name + " de cantidad maxima " + size + " esta vacia, por lo que no se puede remover algun elemento";

    }


}
