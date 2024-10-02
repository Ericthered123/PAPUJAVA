package Classes;

public class Pizza {
    private String tipoMasa;
    private String salsa;
    private String queso;
    private boolean pepperoni;
    private boolean mushrooms;

    public Pizza(){}
    public Pizza(String tipoMasa, String salsa, String queso) {
        this.tipoMasa = tipoMasa;
        this.salsa = salsa;
        this.queso = queso;
        this.pepperoni = false;
        this.mushrooms = false;
    }
    public Pizza(String tipoMasa, String salsa, String queso, boolean pepperoni, boolean mushrooms) {
        this.tipoMasa = tipoMasa;
        this.salsa = salsa;
        this.queso = queso;
        this.pepperoni = pepperoni;
        this.mushrooms = mushrooms;

    }

    public void setTipoMasa(String tipoMasa) {
        this.tipoMasa = tipoMasa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public void setQueso(String queso) {
        this.queso = queso;
    }

    public void setPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
    }

    public void setMushrooms(boolean mushrooms) {
        this.mushrooms = mushrooms;
    }

    public String getTipoMasa() {
        return tipoMasa;
    }

    public String getSalsa() {
        return salsa;
    }

    public String getQueso() {
        return queso;
    }

    public boolean isPepperoni() {
        return pepperoni;
    }

    public boolean isMushrooms() {
        return mushrooms;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "tipoMasa='" + tipoMasa + '\'' +
                ", salsa='" + salsa + '\'' +
                ", queso='" + queso + '\'' +
                ", pepperoni=" + pepperoni +
                ", mushrooms=" + mushrooms +
                '}';
    }
}
