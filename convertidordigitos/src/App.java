import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        int numero, suma;
        String numStr;
        
        System.out.print("Ingresa un número entero: ");
        numero = lector.nextInt();

        if (numero < 0) {
            numero = Math.abs(numero);
        }
        numStr = String.valueOf(numero);
        System.out.print("Los dígitos de cada uno son: ");
        suma = 0;
        for (int i = 0; i < numStr.length(); i++) {
            int digito = Character.getNumericValue(numStr.charAt(i));
            System.out.print(digito + " ");
            suma += digito;
        }
        System.out.println("\nLa suma de los dígitos es: " + suma);
    
     lector.close();
        
    }
}
