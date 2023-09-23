import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner lector = new Scanner(System.in);

        int tirmpoextra;
        int tipoResidencia;
        int categoriaHora;

        System.out.println("Ingrese su tipo de residencia :D :");
        System.out.println("1. Apartamento");
        System.out.println("2. Casa");
        System.out.println("3. Dormitorio");
        tipoResidencia = lector.nextInt();

        
       
        while (true) {
            System.out.println("Ingrese la cantidad promedia de horas que pasa en casa :) :");
            tirmpoextra = lector.nextInt();
            if (tirmpoextra >= 1 && tirmpoextra <= 24) {
                break; 
            } else {
                System.out.println("ingrese una hora correcta que este entre 1 a 24.");
             System.out.println("Seleccione una categoria de horas que pase en la casa:");
             System.out.println("1.0 a 5 horas ");
             System.out.println("2. 6 a mas horas");
             System.out.println("3. 8 a 9 horas");
             System.out.println("4. 10 a 17 horas ");
             System.out.println("5.18 a mas horas ");
             categoriaHora = lector.nextInt();
        
        String recomendacion = recomendarMascota(tipoResidencia, tirmpoextra, categoriaHora);
        }
        }
        }

    public static String recomendarMascota(int tipoResidencia , int tiempoextra, int categoriaHora) {
        if (tipoResidencia == 1) { 
            if (tiempoextra >= 10) {
                return "Gato";
            } else {
                return "Hamster";
            }
        } else if (tipoResidencia == 2) { 
            if (tiempoextra >= 18) {
                return "Cerdo barrigón";
            } else if (tiempoextra >= 10 && tiempoextra <= 17) {
                return "Perro";
            } else {
                return "Serpiente";
            }
        } else if (tipoResidencia == 3) { 
            if (tiempoextra >= 6) {
                return "Pez";
            } else {
                return "Granja de hormigas";
            }
        } else {
            return "No puedo hacerte una recomendacion porque la informacion que me brindaste no me sirve para busacarte una mascota ideal vuelve a intentarlo :( .";
        }
    }
}


