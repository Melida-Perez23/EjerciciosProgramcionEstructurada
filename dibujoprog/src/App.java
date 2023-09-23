import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner lector = new Scanner(System.in);
        
        System.out.println("Seleccione la figura geométrica que desea dibujar:");
        System.out.println("1. Triángulo rectángulo");
        System.out.println("2. Triángulo equilátero");
        System.out.println("3. Cuadrado");
        System.out.println("4. Rectángulo");
        System.out.println("5. Paralelogramo");
        System.out.println("6. Rombo");
        System.out.println("7. Círculo");
        System.out.println("8. Trapecio");
        System.out.println("9. Pentágono");
        System.out.println("10. Elipse");
        System.out.println("11. salir");
        
        int opcion = lector.nextInt();
        switch (opcion) {
            case 1:
                dibujarTrianguloRectangulo();
                break;
            case 2:
                dibujarTrianguloequilatero();
                break;
            case 3:
                dibujarcuadrado();
                break;
            case 4:
                dibujarRectangulo();
                break;
            case 5:
                dibujarparalelogramo();
                break;
            case 6:
                dibujarRombo();
                break;
            case 7:
                dibujarcirculo();
                break;
            case 8:
                dibujartrapecio();
                break;
            case 9:
                dibujarpentagono();
                break;
             case 10:
                dibujarElipse();
                break;
            case 11:
                dibujarSalir();
                break;
            default: 
              System.out.println("la opocion no es valida")
              System.out.println("salir de la app");
              break;
          lector.close();         
        }        
        
       
            
    }
}
