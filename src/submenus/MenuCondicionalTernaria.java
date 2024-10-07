package submenus;
import programas.ProgramaTernaria;

import java.util.Scanner;
public class MenuCondicionalTernaria {
    public static void CondicionalTernaria(Scanner scannerCondicionalTernaria) {
        int opcion;
        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                    CONDICIONAL TERNARIA                                  |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|          1. Explicacion de ternaria                                      |");
            System.out.println("|          2. Programa ternaria - determine si un número es par o impar    |");
            System.out.println("|             Digite la opcion:                                            |");
            System.out.println("|          3. Volver a MENU PRINCIPAL                                      |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese la opcion: ");
            opcion = scannerCondicionalTernaria.nextInt();
            scannerCondicionalTernaria.nextLine();// Consume the newline character
            switch (opcion) {
                case 1:
                    Explicacion_ternaria(scannerCondicionalTernaria);
                    break;
                case 2:
                    ProgramaTernaria.Programa_ternaria(scannerCondicionalTernaria);
                    break;
                case 3:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo a MENÚ DATOS PRIMITIVOS...                                     ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
            }
        } while (opcion != 3);
    }

    private static void Explicacion_ternaria(Scanner scannerExplicacionTernaria) {
        int opcion;
        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                        EXPLICACION TERNARIA                              |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|  Es una construcción que permite tomar decisiones basadas en una         |");
            System.out.println("|  condición booleana de manera concisa en una sola línea de código.       |");
            System.out.println("|  Es una forma abreviada de expresar una estructura condicional(if-else)  |");
            System.out.println("|  Este operador se compone de tres partes:                                |");
            System.out.println("|  - La condición a evaluar (condición booleana)                           |");
            System.out.println("|  - El valor si la condición es verdadera (valor verdadero)               |");
            System.out.println("|  - El valor si la condición es falsa (valor falso)                       |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '2' para volver al menú CONDICIONAL TERNARIA: ");
            opcion = scannerExplicacionTernaria.nextInt();
            scannerExplicacionTernaria.nextLine();  // Consume the newline character
            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú CONDICIONAL TERNARIA...                         ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese la opcion valida.");
            }
        } while (opcion != 2);

    }
}
