package Classes;

public interface PizzaBuilder {
    public void setTipoMasa(String tipoMasa);
    public void setSalsa(String salsa);
    public void setQueso(String queso);
    public void addPepperoni();
    public void addMushrooms();
    public Pizza buildPizza();
    //public PizzaType setPizzaType(PizzaType pType);


}
