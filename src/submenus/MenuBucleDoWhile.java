package submenus;

import programas.ProgramaDoWhile;

import java.util.Scanner;

public class MenuBucleDoWhile {
    public static void BucleDoWhile(Scanner scannerBucleDoWhile) {
        int opcion;
        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                         BUCLE DO WHILE                                   |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|             1. Explicacion de DO WHILE                                   |");
            System.out.println("|             2. Programa DO WHILE - adivina el numero                     |");
            System.out.println("|                Digite la opcion:                                         |");
            System.out.println("|             3. Volver a MENU PRINCIPAL                                   |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese la opcion: ");
            opcion = scannerBucleDoWhile.nextInt();
            scannerBucleDoWhile.nextLine();// Consume the newline character
            switch (opcion) {
                case 1:
                    Explicacion_do_while(scannerBucleDoWhile);
                    break;
                case 2:
                    ProgramaDoWhile.Programa_do_while(scannerBucleDoWhile);
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

    private static void Explicacion_do_while(Scanner scannerExplicacionDoWhile) {
        int opcion;
        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                          EXPLICACION  DO WHILE                           |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("| La estructura repetitiva es aquella en que el cuerpo del bucle se        |");
            System.out.println("| repite mientras que se cumple una determinada condición.                 |");
            System.out.println("| En esta estructura, la condición del ciclo se evalúa al final, por lo    |");
            System.out.println("| que siempre se ejecutarán las instrucciones del ciclo por lo menos       |");
            System.out.println("| una vez. Si la condición se evalúa verdadera, se ejecuta nuevamente      |");
            System.out.println("| el cuerpo del bucle; si la condición es falsa, entonces sale y se sigue  |");
            System.out.println("| con el flujo normal del algoritmo. Este proceso se repite una y otra     |");
            System.out.println("| vez hasta que la condición sea falsa.                                    |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '2' para volver al menú BUCLE DO WHILE: ");
            opcion = scannerExplicacionDoWhile.nextInt();
            scannerExplicacionDoWhile.nextLine();  // Consume the newline character
            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú BUCLE DO WHILE...                               ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese la opcion valida.");
            }
        } while (opcion != 2);

    }
}
