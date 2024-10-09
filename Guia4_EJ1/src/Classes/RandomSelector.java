package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;



public class RandomSelector <T> {
    private List<T> randomList;

    public RandomSelector() {

        randomList = new ArrayList<>();

    }


    public List<T> getRandomList() {
        return randomList;
    }


    public void addElement(T element){
        getRandomList().add(element);
    }

    public T selectNext() throws IndexOutOfBoundsException{

        if (randomList.isEmpty()){
            throw new IndexOutOfBoundsException("No objects to select at the moment");
        }
        return getRandomList().get(new Random().nextInt(quantity()));

    }

    public int quantity(){
        return getRandomList().size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RandomSelector<?> that)) return false;
        return Objects.equals(getRandomList(), that.getRandomList());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getRandomList());
    }

    @Override
    public String toString() {
        return "RandomSelector{" +
                "randomList=" + randomList +
                '}';
    }
}
