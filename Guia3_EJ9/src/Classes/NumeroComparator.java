package Classes;

import java.util.Comparator;

public class NumeroComparator {

    public static Comparator<Integer> porValor(){
        return Comparator.comparing(Integer::valueOf);

    }
    public static Comparator<Integer> ordenInverso(){

        return Comparator.reverseOrder();
    }
}
