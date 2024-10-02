package Classes;

public class PizzaMargheritaBuilder implements PizzaBuilder{

    private Pizza pizza;
    private String tipoMasa;
    private String salsa;
    private String queso;
    private boolean pepperoni;
    private boolean mushrooms;

    public PizzaMargheritaBuilder() {
        this.reset();
    }

    public void reset(){
        this.pizza= new Pizza();
    }

    public Pizza getPizza(){
        return this.pizza;
    }



    @Override
    public void setTipoMasa(String tipoMasa) {
        this.tipoMasa=tipoMasa;

    }

    @Override
    public void setSalsa(String salsa) {
        this.salsa=salsa;
    }

    @Override
    public void setQueso(String queso) {
        this.queso=queso;
    }

    @Override
    public void addPepperoni() {
        this.pepperoni=true;
    }

    @Override
    public void addMushrooms() {
        this.mushrooms=true;
    }

    @Override
    public Pizza buildPizza() {
        Pizza product = new Pizza(tipoMasa,salsa,queso,pepperoni,mushrooms);
        reset();
        return product;
    }
}
