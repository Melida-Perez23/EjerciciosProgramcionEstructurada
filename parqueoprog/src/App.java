public class App {
    public static void main(String[] args) throws Exception {
              Scanner scanner = new Scanner(System.in);

        double totalReceipts = 0;
        int i;
        double horasparquiada;
        double carga;

        for (i = 1; i <= 3; i++) {
            System.out.println("Cliente " + i);
            System.out.print("ingrese el numero de horas estacionado: ");
            horasparquiada = scanner.nextDouble();

            if (horasparquiada <= 3) {
                carga = 2;
            } else if (horasparquida <= 24) {
                carga = 2 + 0.5 * Math.ceil(horasparquiada - 3);
                if (carga > 10) {
                    carga = 10;
                }
            } else {
                carga = 10;
            }

            System.out.println("Momto: C$" + Monto);
            totalReceipts += Monto;
        }

        System.out.println("Total receipts: C$" + totalReceipts);
    }
}
    }
}
