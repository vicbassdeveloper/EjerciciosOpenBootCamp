public class App {

    /*

     * Crea una clase Persona con las siguientes variables:
        * La edad
        * El nombre
        * El teléfono
        
      * Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.

      * Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

      * Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.
    
      */

    public static void main(String[] args) throws Exception {
        Cliente persona1 = new Cliente();

        persona1.setEdad(28);
        persona1.setNombre("Alexis");
        persona1.setTelefono(80987654);
        persona1.setCredito(10000.0);

        System.out.println("El cliente " + persona1.getNombre() + " con edad de " + persona1.getEdad() + " años, tiene un credito de " + "$" + persona1.getCredito() + " contactarlo al numero " + persona1.getTelefono() + "." );
        
        Trabajador persona2 = new Trabajador();

        persona2.setEdad(33);
        persona2.setNombre("Armando");
        persona2.setTelefono(464628862);
        persona2.setSalario(3912.0);

        System.out.println("El trabajador " + persona2.getNombre() + " con edad de " + persona2.getEdad() + " años, gana un salario de " + "$" + persona2.getSalario() + " su numero de contacto es " + persona2.getTelefono() + ".");
        
    }

    static class Persona {
        private int edad;
        private String nombre;
        private int telefono;

        public int getEdad() {
             return edad; 
        }
        public void setEdad(int edad) {
            this.edad = edad;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public int getTelefono() {
            return telefono;
        }
        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }

    }

    static class Cliente extends Persona {
        private double credito;

        public void setCredito(double credito) {
            this.credito = credito;
        }

        public double getCredito() {
            return credito;
        }
    }

    static class Trabajador extends Persona   {
        private double salario;

        public void setSalario(double salario)  {
            this.salario = salario;
        }

        public double getSalario()  {
            return salario;
        }
    }
}
