import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        boolean continueProgram = true;
        int numeroequipo;
        int cantidad;
        double totalCost;
        String respuesta;


        while (continueProgram) {
            System.out.println("biemvenidos a McDonald sea recibido en nuestro sistema!");
            System.out.println("porfavor realise su compra:");

            
            System.out.println("hamburgesa:");
            System.out.println("1. Big Mac - C$215.65");
            System.out.println("2. hamnurgesa con una cuarta de queso - C$233.64");
            System.out.println("3. hamburgesa con doble de queso - C$306.45");
            System.out.println("helados:");
            System.out.println("4. French Fries (pequeña) - C$71.65");
            System.out.println("5. French Fries (Mediana) - C$107.65");
            System.out.println("6. French Fries (grande) - C$205.35");
            System.out.println("7. Chicken McNuggets (6 piezas) - C$179.64");
            System.out.println("bebidas:");
            System.out.println("8. Coca-Cola (grande) - C$107.64");
            System.out.println("9. Sprite (pequeña) - C$71.65");
            System.out.println("10. Fanta (grande) - C$107.65");

            
            System.out.print("ingrese el numero de su orden: ");
            numeroequipo = lector.nextInt();
            System.out.print("ingrese la cantidad a pedir: ");
            cantidad = lector.nextInt();

            
            totalCost = 0.0;
            switch (numeroequipo) {
                case 1:
                    totalCost = 215.65 * cantidad;
                    break;
                case 2:
                    totalCost = 233.64 * cantidad;
                    break;
                case 3:
                    totalCost = 306.45 * cantidad;
                    break;
                case 4:
                    totalCost = 71.65 * cantidad;
                    break;
                case 5:
                    totalCost = 107.65* cantidad;
                    break;
                case 6:
                    totalCost = 205.35 * cantidad;
                    break;
                case 7:
                    totalCost = 179.64 * cantidad;
                    break;
                
                case 8:
                    totalCost = 107.64 * cantidad;
                    break;
                case 9:
                    totalCost = 71.65 * cantidad;
                    break;
                case 10:
                    totalCost =  107.65 * cantidad;
                    break;
                default:
                    System.out.println("numero no valido");
                    break;
            }


            System.out.println("Order details:");
            System.out.println("orden: " + numeroequipo);
            System.out.println("cantidad: " + cantidad);
            System.out.println("Total costo: C$" + totalCost);

            System.out.print("desea realizar otro pedido? (S/N) ");
            respuesta = lector.next();
            if (respuesta.equalsIgnoreCase("N")) {
                continueProgram = false;
            }
            lector.close();
        }
    }

    }

