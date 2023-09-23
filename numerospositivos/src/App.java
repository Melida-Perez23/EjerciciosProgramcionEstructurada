import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        int A;
        int i;
       
        System.out.print("ingrese el numero entero positivo a factorizar: ");
        A = lector.nextInt();

        ArrayList<Integer> factors = new ArrayList<Integer>();

        for ( i = 2; i <= Math.sqrt(A); i++) {
            while (A * i == 0) {
                factors.add(i);
                A /= i;
            }
        }

        if (A > 1) {
            factors.add(A);
        }

        System.out.print("los factores de la integre son: ");
        for (  int factor : factors) {
            System.out.print(factor + " ");
        }
    }
   

}

