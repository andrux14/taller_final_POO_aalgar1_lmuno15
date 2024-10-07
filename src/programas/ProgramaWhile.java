package programas;
import java.util.Scanner;

public class ProgramaWhile {
    public static void Programa_while(Scanner scannerProgramaWhile) {

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("|                     PROGRAMA WHILE- Sumatoria                            |");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Ingrese un número entero:  ");
        int numeroE = scannerProgramaWhile.nextInt();
        int sumatoria = 0;
        int contador = 1;
        while (contador <= numeroE){
            sumatoria += contador;
            contador++;
        }
        System.out.println(" La sumatoria de los números del 1 al " + numeroE + " es: " + sumatoria);
        int opcion;
        do {
            System.out.println(" Ingrese '2' para volver al menú BUCLE WHILE");
            opcion = scannerProgramaWhile.nextInt();
            scannerProgramaWhile.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú BUCLE WHILE...                                  ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
                    break;
            }
        } while (opcion != 2);
    }
}
