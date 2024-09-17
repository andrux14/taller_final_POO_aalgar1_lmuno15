package submenus;
import java.util.Scanner;

public class MenuIfElseIf {

    public static void CondicionalIfElse(Scanner scannerIfElse) {
        int opcion;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                         IF, ELSE IF Y ELSE                               |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                      1. Explicación de IF                                |");
            System.out.println("|                      2. Explicación de ELSE IF                           |");
            System.out.println("|                      3. Explicación de ELSE                              |");
            System.out.println("|                      4. PROGRAMA DE IF, else if /Else                    |");
            System.out.println("|                      5. Volver a MENU PRINCIPAL                          |");
            System.out.println("----------------------------------------------------------------------------");

            opcion = scannerIfElse.nextInt();
            scannerIfElse.nextLine();  // Consume the newline character

            switch (opcion) {
                case 1:
                    Explicacion_if(scannerIfElse);
                    break;
                case 2:
                    Explicacion_else_if(scannerIfElse);
                    break;
                case 3:
                    Explicacion_else(scannerIfElse);
                    break;
                case 4:
                    programas.ProgramaIfElseIf.Programa_if_else(scannerIfElse);
                case 5:
                    System.out.println("Retornando al menu anterior...");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }
        } while (opcion != 5);
    }

    private static void Explicacion_if(Scanner scannerExplicacionIf) {
        int opcion;
        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                          EXPLICACION IF                                  |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("| Es una construcción del lenguaje que controla el orden de las            |");
            System.out.println("| instrucciones. Se le pasa una expresión lógica entre paréntesis y luego  |");
            System.out.println("| se describe un bloque de código entre llaves. Este bloque de código      |");
            System.out.println("| se ejecutará solo si la condición se cumple. Si la condición no se       |");
            System.out.println("| cumple, se omitirá el bloque de código.                                  |");
            System.out.println("| if (condición){}                                                         |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '2' para volver al menú CONDICIONAL IF ELSE: ");
            opcion = scannerExplicacionIf.nextInt();
            scannerExplicacionIf.nextLine();  // Consume the newline character
            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú CONDICIONAL IF ELSE...                          ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese la opcion valida.");
            }
        } while (opcion != 2);
    }
    private static void Explicacion_else_if(Scanner scannerExplicacionElseIf) {
        int opcion;
        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                         EXPLICACION ELSE IF                              |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("| Se utiliza en Java para tomar decisiones sobre un valor preexistente     |");
            System.out.println("| Es decir, si una condición basada en ese valor se cumple (si esa         |");
            System.out.println("| condición es verdadera), el programa tomará un camino. Si no el          |");
            System.out.println("| programa tomará otro. A esa condición se la llama condición booleana,    |");
            System.out.println("| ya que solo puede tomar como valor verdadero o falso.                    |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '2' para volver al menú CONDICIONAL IF ELSE: ");
            opcion = scannerExplicacionElseIf.nextInt();
            scannerExplicacionElseIf.nextLine();  // Consume the newline character
            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú CONDICIONAL IF ELSE...                          ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese la opcion valida.");
            }
        } while (opcion != 2);
    }
    private static void Explicacion_else(Scanner scannerExplicacionElse) {
        int opcion;
        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                         EXPLICACION ELSE                                 |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("| Se utiliza como parte de una estructura de control condicional junto     |");
            System.out.println("| con if. El bloque else especifica una sección de código que se           |");
            System.out.println("| si la condición evaluada en el bloque if es falsa.                       |");
            System.out.println("| if (condicion){                                                          |");
            System.out.println("| } else{}                                                                 |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '2' para volver al menú CONDICIONAL IF ELSE: ");
            opcion = scannerExplicacionElse.nextInt();
            scannerExplicacionElse.nextLine();  // Consume the newline character
            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú CONDICIONAL IF ELSE...                          ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese la opcion valida.");
            }
        } while (opcion != 2);
    }
}
