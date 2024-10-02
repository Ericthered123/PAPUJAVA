import Classes.ReproductorMultimedia;
import Classes.VideoClip;

public class Main {
    public static void main(String[] args) {


        VideoClip youtube= new ReproductorMultimedia("Youtube");


        System.out.println(  youtube.toString());
        youtube.stop();
        youtube.play();

        System.out.println(youtube.status());

        }
    }
