package programas;

import java.util.Scanner;

public class ProgramaFor {
    public static void Programa_For(Scanner scannerProgramaFor) {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("|                      PROGRAMA FOR- Sumatoria                             |");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Ingrese un número entero:  ");
        int numeroF = scannerProgramaFor.nextInt();
        int sumaF = 0;
        for (int i = 1; i <= numeroF; i++){
            sumaF += i;
        }
        System.out.println("La sumatoria de los números entre 1 y " + numeroF + " es: " + sumaF);

    }
}
