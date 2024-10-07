package submenus;
import programas.ProgramaFor;

import java.util.Scanner;
public class MenuBucleFor {
    public static void BucleFor(Scanner scannerBucleFor) {
        int opcion;
        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                           BUCLE FOR                                      |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                   1. Explicacion For                                     |");
            System.out.println("|                   2. Programa de For - Sumatoria de números              |");
            System.out.println("|                   3. Volver a MENU PRINCIPAL                             |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese la opcion: ");
            opcion = scannerBucleFor.nextInt();
            scannerBucleFor.nextLine();// Consume the newline character
            switch (opcion) {
                case 1:
                    Explicacion_For(scannerBucleFor);
                    break;
                case 2:
                    ProgramaFor.Programa_For(scannerBucleFor);
                    break;
                case 3:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo a MENÚ PRINCIPAL...                                     ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
            }
        } while (opcion != 3);
    }

    private static void Explicacion_For(Scanner scannerExplicacionFor) {
        int opcion;
        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                           EXPLICACION FOR                                |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|  Es una estructura de control cíclica, nos permiten ejecutar una o       |");
            System.out.println("|  varias líneas de código de forma iterativa (o repetitiva), pero         |");
            System.out.println("|  teniendo cierto control y conocimiento sobre las iteraciones. En el     |");
            System.out.println("|  ciclo for, es necesario tener un valor inicial y un valor final, y      |");
            System.out.println("|  opcionalmente podemos hacer uso del tamaño del paso entre cada giro     |");
            System.out.println("|  o iteración del ciclo.                                                  |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '2' para volver al menú BUCLE FOR: ");
            opcion = scannerExplicacionFor.nextInt();
            scannerExplicacionFor.nextLine();  // Consume the newline character
            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú BUCLE FOR...                                    ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese la opción valida.");
            }
        } while (opcion != 2);

    }

}
