public class App {
    public static void main(String[] args) throws Exception {
        ong inicio = System.currentTimeMillis();
        int contador = 1;
        
        while (contador <= 300000000) {
            if (contador % 1000000 == 0) {
                System.out.println(contador);
            }
            contador++;
        }
        
        long fin = System.currentTimeMillis();
        long tiempoTotal = fin - inicio;
        System.out.println("Tiempo total: " + tiempoTotal + " milisegundos");
    }
}

        
    }
}
