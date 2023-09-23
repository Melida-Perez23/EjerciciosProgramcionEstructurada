import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        int numeroAleatorio1 = generarNumeroAleatorio();
        int numeroAleatorio2 = generarNumeroAleatorio();
        int numeroAleatorio3 = generarNumeroAleatorio();
        int premio = 0;

        
        Scanner lector = new Scanner(System.in);
        System.out.println("Bienvenido al juego de lotería. Adivina tres números entre 0 y 9.");
        int suposicion1 = obtenerSuposicion(lector);
        int suposicion2 = obtenerSuposicion(lector);
        int suposicion3 = obtenerSuposicion(lector);

       
        if (suposicion1 == numeroAleatorio1 || suposicion1 == numeroAleatorio2 || suposicion1 == numeroAleatorio3) {
            premio += 100;
        }

        if (suposicion2 == numeroAleatorio1 || suposicion2 == numeroAleatorio2 || suposicion2 == numeroAleatorio3) {
            premio += 100;
        }

        if (suposicion3 == numeroAleatorio1 || suposicion3 == numeroAleatorio2 || suposicion3 == numeroAleatorio3) {
            premio += 100;
        }

        if ((suposicion1 == numeroAleatorio1 || suposicion1 == numeroAleatorio2 || suposicion1 == numeroAleatorio3) &&
                (suposicion2 == numeroAleatorio1 || suposicion2 == numeroAleatorio2 || suposicion2 == numeroAleatorio3)
                &&
                (suposicion3 != numeroAleatorio1 && suposicion3 != numeroAleatorio2
                        && suposicion3 != numeroAleatorio3)) {
            premio += 1000;
        }

       
        if ((suposicion1 == numeroAleatorio1 || suposicion1 == numeroAleatorio2 || suposicion1 == numeroAleatorio3) &&
                (suposicion2 == numeroAleatorio1 || suposicion2 == numeroAleatorio2 || suposicion2 == numeroAleatorio3)
                &&
                (suposicion3 == numeroAleatorio1 || suposicion3 == numeroAleatorio2
                        || suposicion3 == numeroAleatorio3)) {
            premio += 10000;
        }

   
        if (suposicion1 == numeroAleatorio1 && suposicion2 == numeroAleatorio2 && suposicion3 == numeroAleatorio3) {
            premio += 1000000;
        }

        System.out.println(
                "Los números aleatorios eran: " + numeroAleatorio1 + ", " + numeroAleatorio2 + ", " + numeroAleatorio3);
        System.out.println("Tus suposiciones fueron: " + suposicion1 + ", " + suposicion2 + ", " + suposicion3);
        System.out.println("Ganaste C$" + premio);

        lector.close();
    }

    private static int obtenerSuposicion(Scanner lector) {
        return 0;
    }

    private static int generarNumeroAleatorio() {
        Random random = new Random();
        return random.nextInt(10); 
    }

    private static int obtenerSuposicion(lector scanner) {
        int suposicion;
        do {
            System.out.print("Ingresa un número entre 0 y 9: ");
            suposicion = ((RandomGenerator) scanner).nextInt();
        } while (suposicion < 0 || suposicion > 9);
        return suposicion;
    }

    }

