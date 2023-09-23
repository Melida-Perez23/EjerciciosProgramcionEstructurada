import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner lector = new Scanner(System.in);
         int totalKlmts = 0;
         int totalLts = 0;
         int lts, klmts;
         double klmtslt;
         double kilometrosPorLitroTotal;

        
        while (true) {
            System.out.print("Ingresa los kilómetros conducidos: ");
            klmts = lector.nextInt();
            
            if (klmts == -1) {
                break;
            }
            
            System.out.print("Ingresa los litros usados: ");
            lts = lector.nextInt();
            
            klmtslt = klmts / lts;
            
            System.out.println("Kilómetros por litro en este viaje: " + klmtslt);
            
            totalKlmts += klmts;
            totalLts += lts;
            
            kilometrosPorLitroTotal = (double) totalKlmts / totalLts;
            
            System.out.println("Kilómetros por litro usados:" + kilometrosPorLitroTotal);
            lector.close();
    }   }
        
}

