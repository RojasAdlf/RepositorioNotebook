public class ClaseSegundaRama {
    public static void main(String[] args) {
    
        System.out.println("En esta clase programará el programador 2");
        
        auto miAuto = new auto();

        miAuto.devolverValores();

        


    }

    
}

 class auto{

    byte ruedas = 4;
    byte puertas = 2;
    String color = "rojo";
    String clase = "SUV";

    public String devolverValores(){

        return "El auto es un " + clase + ", tiene " + puertas + " puertas y es "
        + "de color " + color;

      }
}