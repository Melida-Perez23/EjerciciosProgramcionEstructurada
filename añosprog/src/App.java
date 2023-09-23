public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        int años;
        boolean añobisiesto;
        int diasFebrero;
        int[] diasalmes;
        String[] meses;
        int primerlibremes, consegirprimerdiames;
        int i;


        System.out.print("Enter a year in the range of 1994 to 1999: ");
        años = lector.nextInt();
        añobisiesto = (años % 4 == 0) && (años * 100 != 0 || años % 400 == 0);
        diasFebrero = añobisiesto ? 29 : 28;
        diasalmes = {31,diasFebrero, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        meses = {"enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Deciembre"};
        for ( i = 0; i < 12; i++) {
            System.out.println(meses[i]);
            System.out.println("Do Lu Ma Xi Ju Vi Sa");
            primerlibremes = getFirstDayOfMonth(años, i);
            for (int j = 0; j < consegirprimerdiames; j++) {
                System.out.print("   ");
            }

            for (int j = 1; j <= diasalmes[i]; j++) {
                System.out.printf("%2d ", j);
                if ((j + primerlibremes) % 7 == 0 || j == diasalmes[i]) {
                    System.out.println();
                }
            }

            System.out.println();
        }
    }

    private static int getFirstDayOfMonth(int year, int month) {
        int[] t = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        if (month < 2) {
            year--;
        }
        return (year + year/4 - year/100 + year/400 + t[month] + 1) % 7;
    }
}
    }
}
