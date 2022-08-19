public class App {
    public static void main(String[] args) throws Exception {

        var estacion = "primabera";
       
        switch (estacion) {
            case "invierno":
            System.out.println("Es Invierno");
            break;
            case "verano":
            System.out.println("Es Verano");
            break;
            case "otoño":
            System.out.println("Es Otoño");
            break;
            case "primavera":
            System.out.println("Es Primavera");
            break;
            default: System.out.println("Esto no es una estacion o esta mal escrita, escribe una estacion...");
            break;
        } 

    }
}
