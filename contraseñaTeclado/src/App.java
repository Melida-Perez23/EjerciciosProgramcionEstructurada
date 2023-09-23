public class App {
    public static void main(String[] args) throws Exception {
            Console console = System.console();
        if (console == null) {
            System.out.println("No console: non-interact");
            System.exit(0);
        }

        char[] password;
        while (true) {
            password = console.readPassword("ingrese contraseña: ");
            if (isValidPassword(password)) {
                break;
            } else {
                System.out.println("la contraseña no cumple los requisitos. intente de nuevo.");
            }
        }

        while (true) {
            char[] password2 = console.readPassword("vuelva a ingresar contraseña: ");
            if (Arrays.equals(password, password2)) {
                break;
            } else {
                System.out.println("la contraseña no conside intentelo de nuevo.");
            }
        }

        System.out.println("contraseña aceptada.");
    }

    private static boolean isValidPassword(char[] password) {
        if (password.length < 6 || password.length > 10) {
            return false;
        }

        boolean hasLetter = false;
        boolean hasDigit = false;
        for (char c : password) {
            if (Character.isLetter(c)) {
                hasLetter = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }

        return hasLetter && hasDigit;
    }

        
    }

