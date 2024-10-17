package Classes;

import java.util.ArrayList;
import java.util.List;

public class DataBag <T> {

    private List<T> bag;
    private int maxSize;
    private String name;

    public DataBag() {
        this.bag= new ArrayList<T>();
        maxSize= 10;

    }

    public DataBag(int maxSize,String name) {
        this.maxSize= maxSize;
        this.bag= new ArrayList<>();
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<T> getBag() {
        return bag;
    }

    public int getMaxSize() {
        return maxSize;
    }

    @Override
    public String toString() {
        return "DataBag{" +
                "bag=" + bag +
                ", maxSize=" + maxSize +
                '}';
    }


    public int actualSize(){
        return getBag().size();
    }

    public void add(T element) throws FullDataBagException {
        if (actualSize()==getMaxSize()){
            throw new FullDataBagException(getName(),getMaxSize());
        }
        bag.add(element);
    }

    public void remove() throws EmptyDataBagException {
        if (actualSize()==0){
            throw new EmptyDataBagException(getName(),getMaxSize());
        }
        getBag().remove(bag.size()-1);
    }


}
