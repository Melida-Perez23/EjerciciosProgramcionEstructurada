import java.util.Scanner;

public class App {
   
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        int num1,num2;
        int sumaimpar,sumapar, numactual; 
        int sumacuadraimpares;
        
        

        System.out.print("ingrese el primer numero: ");
        num1 = lector.nextInt();

        System.out.print("ingrese el segundo numero: ");
        num2 = lector.nextInt();

        if (num1 >= num2) {
            System.out.println("el numero debe ser menor que el primer numero");
            return;
            
        }

        System.out.println("numero impar son: " + num1 + " y " + num2 + ":");
        sumaimpar = 0;
        numactual = num1;
        while (numactual <= num2) {
            if (numactual % 2 != 0) {
                System.out.println(numactual);
            }
            numactual++;
        }

        System.out.println("numeros pares entre: " + num1 + " y " + num2 + ":");
        sumapar = 0;
        numactual = num1;
        while (numactual <= num2) {
            if (numactual % 2 == 0) {
                System.out.println(numactual);
                sumapar+= numactual;
            }
            numactual++;
        }

        System.out.println("numeros impares entre: " + num1 + " y "  + num2 + ":");
        numactual = num1;
        while (numactual <= num2) {
            System.out.println(numactual + " " + numactual * numactual);
            numactual++;
        }

        System.out.println("Suma de cuadrado de nuneros impares" + num1 + " y " + num2 + ":");
        sumacuadraimpares = 0;
        numactual = num1;
        while (numactual <= num2) { 
            if (numactual % 2 != 0) {
                sumacuadraimpares += numactual * numactual;
            }
            numactual++;
        }
        System.out.println(sumacuadraimpares);

        System.out.println("numeros perfectos entre: " + num1 + " y " + num2 + ":");
        numactual = num1;
        while (numactual <= num2) {
            if (isPerfect(numactual)) {
                System.out.println(numactual);
            }
            numactual++;
        }

        System.out.println("numeros primos entre" + num1 + " y " + num2 + ":");
        numactual = num1;
        while (numactual <= num2) {
            if (isPrime(numactual)) {
                System.out.println(numactual);
            }
            numactual++;
        }
     }

     private static boolean isPerfect(int n) {
         int suma = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                suma += i;
            }
        }
        return suma == n;
     }

     private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
        lector.close();
    }
 
 
}

