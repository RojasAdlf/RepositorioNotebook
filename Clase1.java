public class Clase1{

    public static void main(String[] args) {

        Clase1 miOperacion = new Clase1();

        System.out.println("El resultado de la multiplicacion es :" +  miOperacion.multiplicacion(55, 125); 

        System.out.println("El resultado de la suma es :" +  miOperacion.suma(55,  125); 

        System.out.println("Esto lo editamos en gitHUB");

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
