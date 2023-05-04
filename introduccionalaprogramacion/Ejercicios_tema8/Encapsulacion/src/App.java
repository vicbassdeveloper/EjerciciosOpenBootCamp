public class App {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
       
        persona1.setEdad(29);
        persona1.setNombre("Victor");
        persona1.setTelefono(55123456);
    
    
        System.out.println(persona1.getEdad());
        System.out.println(persona1.getName());
        System.out.println(persona1.getTelefono());

    
    }

    static class Persona  {

        private int edad;
        private String nombre;
        private int telefono;
       

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public int getEdad() {
            return edad;
        }


        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getName() {
            return nombre;
        }


        public void setTelefono(int telefono)   {
            this.telefono = telefono;
        }

        public int getTelefono()    {
            return telefono;
        }
    }
    
}
