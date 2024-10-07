package programas;

import java.util.Random;
import java.util.Scanner;


public class ProgramaDoWhile {
    public static void Programa_do_while(Scanner scannerProgramaDoWhile) {

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("|            PROGRAMA DO WHILE- Adivina el número                          |");
        System.out.println("----------------------------------------------------------------------------");

        Random random = new Random();
        int numeroAleatorio = random.nextInt(10) + 1;
        int adivinanza;
        do {
            System.out.println("Adivina un numero entre 1 y 10: ");
            System.out.println("Ingrese el numero ");
            adivinanza = scannerProgramaDoWhile.nextInt();
            if (adivinanza < numeroAleatorio) {
                System.out.println("El número es mayor. Intente de nuevo.");
            } else if (adivinanza > numeroAleatorio) {
                System.out.println("El número es menor. Intente de nuevo.");
            } else {
                System.out.println(" Adivinaste el número.");
            }
        } while (adivinanza != numeroAleatorio);//continua hasta que la adivinanza sea correcta

    }
}
