import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        int numcuenta;
        char tipocuenta;
        double saldomin;
        double saldoactual;
        double cargoservicio;
        double tazainteres;
        double interesganado;
        

        System.out.print("ingrese numero de cuenta: ");
        numcuenta = lector.nextInt();

        System.out.print("ingrese tipo de cuenta (c para ahorro, s para cuenta corriente): ");
        tipocuenta = lector.next().charAt(0);

        System.out.print("ingrese el saldo minimo: ");
        saldomin = lector.nextDouble();

        System.out.print("ingrese el saldo actual: ");
        saldoactual = lector.nextDouble();

        cargoservicio = 0;
        if (saldoactual < saldomin) {
            if (tipocuenta == 's' || tipocuenta == 'S') {
                cargoservicio = 10;
            } else if (tipocuenta == 'c' || tipocuenta == 'C') {
                cargoservicio = 25;
            }
            saldoactual -= cargoservicio;
        }
        if (tipocuenta == 's' || tipocuenta == 'S') {
            tazainteres = 0.04;
        } else if (saldoactual <= saldomin+ 5000) {
            tazainteres = 0.03;
        } else {
            tazainteres = 0.05;
        }

        interesganado = saldoactual * tazainteres;
        saldoactual += interesganado;

        System.out.println("el numero de cuenta es: " + numcuenta);
        System.out.println("el tipo de cuenta es: " + tipocuenta);
        System.out.println("mi saldo actual es: U$" + saldoactual);
        if (cargoservicio > 0) {
            System.out.println("el cargo de servicio es: U$" + cargoservicio);
        }
        System.out.println("saldo nuevo es: U$" + saldoactual);
        lector.close();
    }
}
