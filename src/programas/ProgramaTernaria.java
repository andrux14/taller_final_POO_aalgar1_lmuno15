package programas;

import java.util.Scanner;

public class ProgramaTernaria {
    public static void Programa_ternaria(Scanner scannerProgramaTernaria) {

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("|            PROGRAMA TERNARIA - Determine si un número es par o impar         |");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Ingrese un numero entero: ");
        int numero = scannerProgramaTernaria.nextInt();
        String resultado = (numero % 2 == 0) ? "par" : "impar";
        System.out.println("El número " + numero + " es " + resultado);
        int opcion;
        do {
            System.out.println(" Ingrese '2' para volver al menú TERNARIA");
            opcion = scannerProgramaTernaria.nextInt();
            scannerProgramaTernaria.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú CONDICIONAL TERNARIA...                         ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
                    break;
            }
        } while (opcion != 2);

    }
}
