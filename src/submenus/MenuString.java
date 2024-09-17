package submenus;
import java.util.Scanner;

public class MenuString {
    public static void  menuString(Scanner scannerExplicacionString){

        int opcion;
        do {

            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                                STRING                                    |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|    En Java, un String es una clase que representa una secuencia de       |");
            System.out.println("|    caracteres. A diferencia de otros lenguajes de programación donde     |");
            System.out.println("|    las cadenas de texto pueden ser simplemente arrays de caracteres,     |");
            System.out.println("|    en Java, String es un objeto que proporciona métodos para             |");
            System.out.println("|    manipular y operar sobre textos de manera más conveniente.            |");
            System.out.println("|                                                                          |");
            System.out.println("|               Ejemplo: String mensaje = ''Feliz navidad!'';              |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '1' para volver al menú DATOS PRIMITIVOS: ");
            opcion = scannerExplicacionString.nextInt();
            scannerExplicacionString.nextLine();  // Consume the newline character

            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al MENU PRINCIPAL...                                    ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }
        } while (opcion != 1);

    }

}
