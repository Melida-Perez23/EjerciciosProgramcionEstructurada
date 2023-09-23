import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Ingrese el número total de rosquillas: ");
        int totalRosquillas = lector.nextInt();
        
        int cajasPorContenedor = 75;
        int rosquillasPorCaja = 24;
        
        int cajasNecesarias = totalRosquillas / rosquillasPorCaja;
        int contenedoresNecesarios = cajasNecesarias / cajasPorContenedor;
        
        int rosquillasSobrantes = totalRosquillas % rosquillasPorCaja;
        int cajasSobrantes = cajasNecesarias % cajasPorContenedor;
        
        System.out.println("Número de cajas necesarias: " + cajasNecesarias);
        System.out.println("Número de contenedores necesarios: " + contenedoresNecesarios);
        System.out.println("Número de rosquillas sobrantes: " + rosquillasSobrantes);
        System.out.println("Número de cajas sobrantes: " + cajasSobrantes);

        lector.close();
    }
  
}      
                
            
        