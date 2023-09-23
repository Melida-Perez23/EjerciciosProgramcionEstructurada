public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa la longitud de la fotografía en pulgadas: ");
        double longitud = scanner.nextDouble();
        
        System.out.print("Ingresa el ancho de la fotografía en pulgadas: ");
        double ancho = scanner.nextDouble();
        
        System.out.print("Ingresa el tipo de marco (regular/lujoso): ");
        String tipoMarco = scanner.next();
        
        System.out.print("Ingresa el color del marco: ");
        String colorMarco = scanner.next();
        
        System.out.print("¿Deseas agregar coronas en las esquinas? (si/no): ");
        String agregarCoronas = scanner.next();
        
        int numCoronas = 0;
        
        if (agregarCoronas.equalsIgnoreCase("si")) {
            System.out.print("Ingresa el número de coronas: ");
            numCoronas = scanner.nextInt();
        }
        
        double costoMarco = 0
    }
}
