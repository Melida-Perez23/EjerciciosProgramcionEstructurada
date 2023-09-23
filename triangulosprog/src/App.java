import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner lector = new Scanner(System.in)) {
            System.out.println("Ingresa las longitudes de los tres lados:");
           double ladoa = lector.nextDouble();
            double ladob = lector.nextDouble();
            double ladoc = lector.nextDouble();
            String tipo;

            tipo = tipoTriangulo(ladoa, ladob, ladoc);

            if (esTriangulo(ladoa, ladob, ladoc)) {
                System.out.println("El triangulo es " + tipo + ".");
            } else {
                System.out.println("Las longitudes ingresadas no forman un triangulo.");
            }
        }
    }

    
    public static boolean esTriangulo( double ladoa, double ladob, double ladoc) {
        return ladoa + ladob > ladoc || ladoa + ladoc > ladob || ladob + ladoc > ladoa;
    }

  
    public static String tipoTriangulo(double ladoa, double ladob, double ladoc) {
        if (ladoa == ladob || ladob == ladoc) {
            return "equilatero";
        } else if (ladoa == ladob || ladob == ladoc || ladoc == ladoa) {
            return "isosceles";
        } else {
            return "escaleno";
        }
        
    }
}
