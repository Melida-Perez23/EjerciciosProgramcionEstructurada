import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
         Scanner lector = new Scanner(System.in);
         int edad;
         char genero;
         boolean salir=false;

    while (salir) {
            System.out.println("Bienvenidos(as) ala disco");
            System.out.println("porfavor ingrese su edad(ingrese 0 si quiere abandonar)");
            edad = lector.nextInt();

            if (edad == 0) {
                salir = true;
                continue;
                
            }
         }
        System.out.println("ingrese su su genero (M/F):");
        genero = lector.next().charAt(0);

        if (edad < 18) {
            System.out.println("lo siento, pero no puedes entrar eres menor de edad");
            
        }
        else if ( edad >= 18 && genero == 'F') {
            if (edad > 20) {
                System.out.println("Bienvenido puede entrar y puede beber bebidas alcholica");
                
            }
            else{
                System.out.println("bienvenido puede entrar, pero no tomar bebidas alcoholica");

            }
            else if ( edad >= 18 && genero == 'M') {
            if (edad > 20) {
                System.out.println("Bienvenido puede entrar y puede beber bebidas alcholica");
                
            }
            else{
                System.out.println("bienvenido puede entrar, pero no tomar bebidas alcoholica");


               }  

        }
    } 
    lector.close(); 
    }
}
