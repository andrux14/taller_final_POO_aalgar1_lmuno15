package submenus;

import java.util.Scanner;

public class MenuCondicionalSwitch {
    public static void CondicionalSwitch(Scanner scannerCondicionalSwitch) {

        int opcion;
        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                        CONDICIONAL SWITCH                                |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                        1. Explicacion Switch                             |");
            System.out.println("|                        2. Programa de Switch - Valide su calificación    |");
            System.out.println("|                           Digite la opcion:                              |");
            System.out.println("|                        3. Volver a MENU PRINCIPAL                        |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese la opcion: ");
            opcion = scannerCondicionalSwitch.nextInt();
            scannerCondicionalSwitch.nextLine();// Consume the newline character
            switch (opcion) {
                case 1:
                    Explicacion_switch(scannerCondicionalSwitch);
                    break;
                case 2:
                    programas.ProgramaSwitch.Programa_switch(scannerCondicionalSwitch);
                    break;
                case 3:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo a MENÚ DATOS PRIMITIVOS...                              ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
            }
        } while (opcion != 3);

    }

    private static void Explicacion_switch(Scanner scannerExplicacionSwitch) {
        int opcion;
        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                          EXPLICACION SWITCH                              |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|    Es una estructura que evalúa más de un caso y se caracteriza          |");
            System.out.println("|    por: Selección de una opción entre varias.                            |");
            System.out.println("|                                                                          |");
            System.out.println("|    Switch recibe un “caso” y lo evalúa hasta encontrar el caso           |");
            System.out.println("|    que corresponda                                                       |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '3' para volver al menú CONDICIONAL SWITCH: ");
            opcion = scannerExplicacionSwitch.nextInt();
            scannerExplicacionSwitch.nextLine();  // Consume the newline character
            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú CONDICIONAL SWITCH...                           ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese la opcion valida.");
            }
        } while (opcion != 3);

    }

}