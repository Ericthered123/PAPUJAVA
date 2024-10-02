package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Numeros {
    public List<Integer> numeros;

    public Numeros(){
        this.numeros = new ArrayList<>();
    }


    public void addInteger(Integer y){
        getNumeros().add(y);
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    @Override
    public String toString() {
        return "Numeros{" +
                "numeros=" + numeros +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Numeros numeros1)) return false;
        return Objects.equals(getNumeros(), numeros1.getNumeros());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNumeros());
    }

    public void sortBigger(){
        getNumeros().sort(NumeroComparator.porValor());


    }
    public void sortInverso(){

        getNumeros().sort(NumeroComparator.ordenInverso());
    }


}



