package Classes;

import java.util.ArrayList;
import java.util.Objects;

public class GraphEditor {
    private ArrayList<FiguraGeometrica> figurasGeometricas;
    private String name;

    public GraphEditor() {
        this.figurasGeometricas= new ArrayList<>();
    }

    public GraphEditor(String name, ArrayList<FiguraGeometrica> figurasGeometricas) {
        this.name = name;
        this.figurasGeometricas = figurasGeometricas;
    }
    public GraphEditor(String name){
        this.name = name;
        this.figurasGeometricas = new ArrayList<>();
    }

    public ArrayList<FiguraGeometrica> getFigurasGeometricas() {
        return figurasGeometricas;
    }

    public String getName() {
        return name;
    }

    public void addFiguraGeometrica(FiguraGeometrica figuraGeometrica) {
        getFigurasGeometricas().add(figuraGeometrica);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GraphEditor that)) return false;
        return Objects.equals(getFigurasGeometricas(), that.getFigurasGeometricas()) && Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFigurasGeometricas(), getName());
    }

    @Override
    public String toString() {
        return "GraphEditor{" +
                "figurasGeometricas=" + figurasGeometricas +
                ", name='" + name + '\'' +
                '}';
    }

    public void removeFigura(FiguraGeometrica figuraGeometrica) {
        getFigurasGeometricas().remove(figuraGeometrica);
    }

    public double areaTotal(){
        double area = 0;
        for (FiguraGeometrica figura : getFigurasGeometricas()) {
            System.out.println("Area cubierta por: " + figura.toString() + " "  + figura.area() + " metros^2");
            area += figura.area();
        }
        return area;
    }

    public void moverFiguras(int value, String direccion) {

        for(FiguraGeometrica fg : getFigurasGeometricas() ){
            fg.mover(value, direccion);
        }

    }


}
