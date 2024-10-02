package Classes;

public class Ubicacion {
    private String pais;
    private String provincia;
    private String ciudad;

    public Ubicacion(String pais, String provincia, String ciudad) {
        this.pais = pais;
        this.provincia = provincia;
        this.ciudad = ciudad;
    }
    public String getPais() {
        return pais;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getCiudad() {
        return ciudad;
    }
    public String mostrarUbicacion(){
        return pais + " , " + provincia + " , " + ciudad;
    }


}
