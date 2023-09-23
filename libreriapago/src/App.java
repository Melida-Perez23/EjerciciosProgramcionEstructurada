import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numart;
        double ventasnetas;
        double valorart;
        double comision;
        double ingresos;
        int i;
        
        System.out.print("Ingrese el número de artículos vendidos: ");
        numart = lector.nextInt();
        
        ventasnetas = 0.0;
        
        
        for (i = 1; i <= numart; i++) {
            System.out.print("Ingrese el valor del artículo " + i + " en C$: ");
            valorart = lector.nextdouble();
            ventasnetas += valorart;
        }
        
        
        comision = ventasnetas * 0.09;
        ingresos = 200.0 + comision;
        
        
        System.out.println("Ingresos del vendedor: C$" + ingresos);
        
        lector.close();
    }
}
