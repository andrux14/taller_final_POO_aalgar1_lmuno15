package programas;

import java.util.Scanner;

public class ProgramaSwitch {
    public static void Programa_switch(Scanner scannerProgramaSwitch) {
        int opcion;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                 Ingrese '1' para ver el ejemplo                          |");
            System.out.println("|             ingrese '2' para volver al menú SWITCH                       |");
            System.out.println("----------------------------------------------------------------------------");
            opcion = scannerProgramaSwitch.nextInt();
            scannerProgramaSwitch.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("\nIngrese una calificación (1 a 10): ");
                    int calificacion = scannerProgramaSwitch.nextInt();

                    switch (calificacion) {
                        case 1:
                        case 2:
                            System.out.println("Su calificación es: F");
                            break;
                        case 3:
                        case 4:
                            System.out.println("Su calificación es: D");
                            break;
                        case 5:
                        case 6:
                            System.out.println("Su calificación es: C");
                            break;
                        case 7:
                        case 8:
                            System.out.println("Su calificación es: B");
                            break;
                        case 9:
                        case 10:
                            System.out.println("Su calificación es: A");
                            break;
                        default:
                            System.out.println("Número no válido, por favor verifique");
                            break;
                    }
                    break;
                // Consume the newline character
                case 2:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú CONDICIONAL SWITCH...                           ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
                    break;
            }

        } while (opcion != 2);

    }
}