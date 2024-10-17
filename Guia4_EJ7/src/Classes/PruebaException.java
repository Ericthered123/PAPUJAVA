package Classes;

public class PruebaException extends Exception{

    public static void main(String st[]){
        PruebaException t1 = new PruebaException();
        t1.metodo(5,0);
    }
    public void metodo(int a, int b){
        try {
            int c = a/b;
            System.out.println("Después de la división");
        } catch (ArithmeticException ae) {
            System.out.println("Excepción Aritmética");
        }
        catch (Exception e) {
            System.out.println("Otra Excepción");
        }
        finally {
            System.out.println("Bloque Finally"); //Se ejecuta sin importar si hubo o no una excepcion
        } // Finally suele ser usado para liberar recursos al trabajar con recursos externos, como archivos o conexiones a bases de datos, las cuales deben cerrarse
        // despues de su uso
        System.out.println("Después del bloque finally");
    }
}



