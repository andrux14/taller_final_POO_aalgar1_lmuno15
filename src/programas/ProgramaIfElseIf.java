package programas;

import java.util.Scanner;

public class ProgramaIfElseIf {
    public static void Programa_if_else(Scanner scannerProgramaIfElse) {

        int opcion;
        do {
            {
                Scanner scanner = new Scanner(System.in);
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("|                                                                          |");
                System.out.println("|                   Ingrese el carro que desea cotizar                     |");
                System.out.println("|                                                                          |");
                System.out.println("|                         1. Logan                                         |");
                System.out.println("|                         2. KIA Rio                                       |");
                System.out.println("|                         3. Volkswagen Gol                                |");
                System.out.println("|                         4. Chevrolet Spark                               |");
                System.out.println("|                                                                          |");
                System.out.println("----------------------------------------------------------------------------");



                int calificacion =scanner.nextInt();
                if (calificacion < 1 || calificacion > 4){
                    System.out.println("Ingrese una opcion valida");
                }
                else
                    switch (calificacion){
                        case 1:
                            System.out.println(" Logan : $65.500.000 pesos");
                            break;
                        case 2:
                            System.out.println(" KIA Rio : $71.250.000 pesos");
                            break;
                        case 3:
                            System.out.println(" Volkswagen Gol : $55.680.000 pesos");
                            break;
                        case 4:
                            System.out.println(" Chevrolet Spark : $61.862.000 pesos");
                            break;
                    }
            }

            System.out.print("Ingrese '2' para volver al menú CONDICIONAL IF ELSE: ");
            opcion = scannerProgramaIfElse.nextInt();
            scannerProgramaIfElse.nextLine();  // Consume the newline character
            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú     IF, ELSE IF Y ELSE                          ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese la opcion valida.");
            }
        } while (opcion != 2);
    }
}
