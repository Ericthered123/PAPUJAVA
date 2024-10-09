
/*Cree la clase ColaDeTrabajo que permite encolar diversos trabajos. O sea, los trabajos
a encolar deben implementar la interfaz Trabajo. Defina en la clase ColaDeTrabajo
un método sacar() que retorna el próximo trabajo a procesar. Además, agregue en
dicha clase los atributos nombre y lista que representan el nombre de la cola y si está
lista o no para retornar trabajos. Tenga presente, que cuando no existan trabajos en la
cola o cuando la misma no esté lista se debe lanzar las siguientes excepciones:
NoListaException y SinTrabajoEnColaException*/


import Classes.*;

public class Main {
    public static void main(String[] args) {


        Trabajo lawyer = new Abogado();
        Trabajo worker = new Obrero();
        ColaDeTrabajo jobs1= new ColaDeTrabajo("NormalJobs");
        jobs1.addTrabajo(worker);
        jobs1.addTrabajo(lawyer);
        jobs1.setLista(true);
        try {
            System.out.println(jobs1.sacar());
            System.out.println(jobs1.sacar());
            System.out.println(jobs1.sacar());
        }catch (NoListaException e){
            System.out.println(e.getMessage());
        } catch (SinTrabajoEnColaException e) {
            System.out.println(e.getMessage());
        }










    }
}