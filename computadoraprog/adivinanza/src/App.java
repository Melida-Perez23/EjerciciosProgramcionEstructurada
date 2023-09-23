
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random random = new Random();

        boolean iniciojuego = true;
        int numeroaadivinar;
        int numsupocicion;
        boolean adivinadocorrecto;

        while (iniciojuego) {
            numeroaadivinar = random.nextInt(100) + 1;
            numsupocicion = 0;
            adivinadocorrecto= false;

            System.out.println("adivina un numero entre 1 a 100.");

            while (numsupocicion < 3 && !adivinadocorrecto) {
                int guess = lector.nextInt();
                numsupocicion++;

                if (guess == numeroaadivinar) {
                    System.out.println("¡¡felicidades ha adivinado¡¡.");
                    adivinadocorrecto = true;
                } else if (guess < numeroaadivinar) {
                    System.out.println("demasiado bajo intente de nuevo.");
                } else {
                    System.out.println("demasiado añto. imtentelo de nuevo.");
                }
            }

            if (!adivinadocorrecto) {
                System.out.println("lo siento no adivimaste el numero" + numeroaadivinar + ".");
            }

            System.out.println("quiere intentar de nuevo? (s/n)");
            String iniciojuegostr = lector.next();
            iniciojuego * iniciojuegostr.equalsIgnoreCase("y");
        }
        lector.close();
    } 
    }
