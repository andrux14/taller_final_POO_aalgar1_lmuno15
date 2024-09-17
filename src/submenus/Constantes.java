package submenus;
import java.util.Scanner;

public class Constantes {

    public static void menuConstantes(Scanner scannerExplicacionConstantes) {
        int opcion;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                              CONSTANTES                                  |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|     En Java, las constantes son valores que, una vez establecidos,       |");
            System.out.println("|     no pueden ser modificados durante la ejecución del programa. En      |");
            System.out.println("|     términos de programación, una constante es una variable cuyo         |");
            System.out.println("|     valor es fijo y no cambia después de su inicialización. En Java,     |");
            System.out.println("|     las constantes se definen utilizando la palabra clave final.         |");
            System.out.println("|                                                                          |");
            System.out.println("|                     Cómo Definir Constantes en Java                      |");
            System.out.println("|                                                                          |");
            System.out.println("|     Para definir una constante en Java, debes usar la palabra clave      |");
            System.out.println("|     final al declarar una variable. Además, es una convención común      |");
            System.out.println("|     en Java escribir los nombres de las constantes en mayúsculas         |");
            System.out.println("|     para diferenciarlas de las variables regulares.                      |");
            System.out.println("|                                                                          |");
            System.out.println("|            Ejemplo: public static final int EDAD_MINIMA = 18;            |");
            System.out.println("|                     public static final double PI = 3.14159;             |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '1' para volver al MENÚ PRINCIPAL:  ");
            opcion = scannerExplicacionConstantes.nextInt();
            scannerExplicacionConstantes.nextLine();  // Consume the newline character

            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al MENÚ PRINCIPAL...                                    ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }
        } while (opcion != 1);

    }
}

