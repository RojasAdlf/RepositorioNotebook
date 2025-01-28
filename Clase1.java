public class Clase1{

    public static void main(String[] args) {
    
        System.out.println("Primer commit   :)");

        System.out.println("Editado desde segunda rama");

        Clase1 miOperacion = new Clase1();

        miOperacion.suma(55,  125);

    }

    public int suma(int numero1, int numero2){

        int resultado = numero1+numero2;

        return resultado;

    }

    public int multiplicaion(int numero1, int numero2){

        int resultado = numero1*numero2;

        return resultado;

    }

}