import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        int rosqutotal;
        int cajaroaqu = 24;
        int contendrosqu = 75;
        int nesesitacaja,nesesariocont;
        int rosqusobrantes;
        int cajasobrante;


        System.out.println("ingrese la cantidad de rosquilla");
        rosqutotal = lector.nextInt();
 
        
        nesesitacaja = rosqutotal/cajaroaqu;
        nesesariocont = nesesitacaja/contendrosqu;

        rosqusobrantes = rosqutotal * cajaroaqu;
        cajasobrante = nesesitacaja * contendrosqu;

        System.out.println("cantidad nesesaria de cajas: " + nesesitacaja );
        System.out.println("cantidadde contenedores nesesarios: " + nesesariocont);
        System.out.println("cantidada de rosquilla faltante: " + rosqusobrantes);
        System.out.println("cantidad de cajas sobrante; " + cajasobrante);
        lector.close();

    }
}
