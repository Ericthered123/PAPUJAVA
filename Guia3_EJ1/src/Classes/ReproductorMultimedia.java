package Classes;

import java.util.Objects;

public class ReproductorMultimedia implements VideoClip{

    private String name;
    private boolean isPlaying;
    private boolean isLooping;

    public ReproductorMultimedia(String name){
        this.name = name;
        isPlaying = false;
        isLooping = false;
    }
    public ReproductorMultimedia(){}

    public boolean isPlaying() {
        return isPlaying;
    }

    public String getName() {
        return name;
    }

    public boolean isLooping() {
        return isLooping;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ReproductorMultimedia that)) return false;
        return isPlaying == that.isPlaying && isLooping == that.isLooping && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isPlaying, isLooping);
    }

    @Override
    public String toString() {
        return "ReproductorMultimedia{" +
                "name='" + getName() + '\'' +
                ", isPlaying=" + isPlaying() +
                ", isLooping=" + isLooping() +
                '}';
    }

    public boolean compareTo(ReproductorMultimedia that){
        return this.name.equals(that.name);

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }

    public void setLooping(boolean looping) {
        isLooping = looping;
    }

    @Override
    public void play() {
        if (isPlaying()){
            System.out.println("El video ya esta en reproduccion");

        }
        else{
            setPlaying(true);
            setLooping(false);
            System.out.println("Reproduccion activada");
        }

    }

    @Override
    public void bucle() {

        if (isLooping()){
            System.out.println("El video esta reproduciendo en bucle");
        }
        else {
            setPlaying(true);
            setLooping(true);
            System.out.println("Reproduccion en loop activada");
        }

    }

    @Override
    public void stop() {
    if (isLooping()||isPlaying()){
        setPlaying(false);
        setLooping(false);
        System.out.println("Reproduccion detenida");

    }
    else {
        System.out.println("Video no esta en reproduccion");
    }


    }

    public String status(){
        if (!isLooping()&&isPlaying()){
            return "El video esta en reproduccion";
        }
        else if (isLooping()){
            return "El video esta reproduciendo en bucle";
        }
        else {
            return "El video esta detenido";
        }


    }
}
