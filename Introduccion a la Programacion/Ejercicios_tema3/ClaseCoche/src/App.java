public class App {
    public static void main(String[] args) {
    Coche miCoche = new Coche();
    miCoche.AgregarPuerta();
 

        System.out.println(miCoche.puertas);
    }


    static class Coche{
        public int puertas = 4;

        public void AgregarPuerta(){
            this.puertas++;
        }
    }
    }
    
