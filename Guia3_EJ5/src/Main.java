
import Classes.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FabricaMuebles factory=null;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Select family: (1)Victo (2)Modern (3) ArtDeco :");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                factory= new FabricaVictoriana();
                break;
            case 2:
                factory= new FabricaModerna();
                break;
            case 3:
                factory= new FabricaArtDeco();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        if (factory!=null) {
            System.out.println("Pick the material: ");
            String material = scanner.next();//Se podria hacer otro switch/choice para el material
            Silla s1 = factory.createChair(4,material);
            System.out.println(s1.hasLegs() + s1.toString());
        }

        scanner.close();




        }
    }
