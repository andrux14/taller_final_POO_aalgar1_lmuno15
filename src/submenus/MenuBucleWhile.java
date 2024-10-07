package submenus;

import programas.ProgramaWhile;

import java.util.Scanner;

public class MenuBucleWhile {
    public static void BucleWhile(Scanner scannerBucleWhile) {
        int opcion;
        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                          BUCLE WHILE                                     |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                   1. Explicacion While                                   |");
            System.out.println("|                   2. Programa de While - Sumatoria de numeros            |");
            System.out.println("|                   3. Volver a MENU PRINCIPAL                             |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese la opcion: ");
            opcion = scannerBucleWhile.nextInt();
            scannerBucleWhile.nextLine();// Consume the newline character
            switch (opcion) {
                case 1:
                    Explicacion_while(scannerBucleWhile);
                    break;
                case 2:
                    ProgramaWhile.Programa_while(scannerBucleWhile);
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

    private static void Explicacion_while(Scanner scannerExplicacionWhile) {
        int opcion;
        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                          EXPLICACION WHILE                               |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|   Es una estructura cíclica, que nos permite ejecutar una o varias       |");
            System.out.println("|   líneas de código de manera repetitiva sin tener un valor inicial       |");
            System.out.println("|   e incluso a veces sin conocer cuando se va a dar el valor final        |");
            System.out.println("|   esperado,los cliclos while, no dependen de valores numéricos,          |");
            System.out.println("|   sino de valores booleanos, su ejecución depende del valor de           |");
            System.out.println("|   verdad de una condición dada,verdadera o falso.                        |");
            System.out.println("|   son mucho más efectivos para condiciones indeterminadas.               |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '2' para volver al menú BUCLE WHILE: ");
            opcion = scannerExplicacionWhile.nextInt();
            scannerExplicacionWhile.nextLine();  // Consume the newline character
            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú BUCLE WHILE...                                  ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese la opción valida.");
            }
        } while (opcion != 2);

    }
}
