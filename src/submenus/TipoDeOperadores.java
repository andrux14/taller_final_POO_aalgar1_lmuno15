package submenus;
import java.util.Scanner;

public class TipoDeOperadores {
    public static void tipoDeOperadores(Scanner scannerTipoDeOperadores) {
        int opcion;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                          TIPO DE OPERADORES                              |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                        1. Aritmeticos                                    |");
            System.out.println("|                        2. Relacionales                                   |");
            System.out.println("|                        3. Logicos                                        |");
            System.out.println("|                        4. Asignacion                                     |");
            System.out.println("|                        5. Incremento / Decremento                        |");
            System.out.println("|                        6. Volver a MENU PRINCIPAL                        |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese la opcion: ");
            opcion = scannerTipoDeOperadores.nextInt();
            scannerTipoDeOperadores.nextLine();  // Consume the newline character

            switch (opcion) {
                case 1:
                    Operadores_Aritmeticos(scannerTipoDeOperadores);
                    break;
                case 2:
                    Operadores_Relacionales(scannerTipoDeOperadores);
                    break;
                case 3:
                    Operadores_Logicos(scannerTipoDeOperadores);
                    break;
                case 4:
                    Operadores_Asignacion(scannerTipoDeOperadores);
                    break;
                case 5:
                    Operadores_Incremento_Decremento(scannerTipoDeOperadores);
                    break;
                case 6:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo a MENÚ PRINCIPAL...                                     ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        } while (opcion != 6);
    }

    private static void Operadores_Aritmeticos(Scanner scannerOperadoresAritmeticos) {
        int opcion;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                         OPERADORES ARITMETICOS                           |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|    Estos operadores se utilizan para realizar operaciones matemáticas.   |");
            System.out.println("|                                                                          |");
            System.out.println("|    + : Suma                                                              |");
            System.out.println("|    - : Resta                                                             |");
            System.out.println("|    * : Multiplicación                                                    |");
            System.out.println("|    / : División                                                          |");
            System.out.println("|    % : Módulo (residuo de la división)                                   |");
            System.out.println("|                                                                          |");
            System.out.println("|     Ejemplo:                                                             |");
            System.out.println("|                                                                          |");
            System.out.println("|     int a = 6                                                            |");
            System.out.println("|     int b = 3                                                            |");
            System.out.println("|     int suma = a+b;                                                      |");
            System.out.println("|     int resta = a-b;                                                     |");
            System.out.println("|     int multiplicacion = a*b;                                            |");
            System.out.println("|     int division =  a/b;                                                 |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '1' para volver al menú OPERADORES ARITMETICOS: ");
            opcion = scannerOperadoresAritmeticos.nextInt();
            scannerOperadoresAritmeticos.nextLine();  // Consume the newline character

            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú DATOS PRIMITIVOS...                             ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }
        } while (opcion != 1);

    }

    private static void Operadores_Relacionales(Scanner scannerOperadoresRelaciones) {
        int opcion;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                         OPERADORES RELACIONALES                          |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|     Estos operadores se utilizan para comparar dos valores.              |");
            System.out.println("|                                                                          |");
            System.out.println("|     == : Igual a                                                         |");
            System.out.println("|     != : Diferente de                                                    |");
            System.out.println("|     > : Mayor que                                                        |");
            System.out.println("|     < : Menor que                                                        |");
            System.out.println("|     >= : Mayor o igual que                                               |");
            System.out.println("|     <= : Menor o igual que                                               |");
            System.out.println("|                                                                          |");
            System.out.println("|     Ejemplo:                                                             |");
            System.out.println("|                                                                          |");
            System.out.println("|     int a = 10;                                                          |");
            System.out.println("|     int b = 5;                                                           |");
            System.out.println("|     boolean esIgual = (a == b); // esIgual = false                       |");
            System.out.println("|     boolean esMayor = (a > b);  // esMayor = true                        |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '1' para volver al menú OPERADORES ARITMETICOS: ");
            opcion = scannerOperadoresRelaciones.nextInt();
            scannerOperadoresRelaciones.nextLine();  // Consume the newline character

            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú DATOS PRIMITIVOS...                             ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }
        } while (opcion != 1);

    }

    private static void Operadores_Logicos(Scanner scannerOperadoresLogicos) {
        int opcion;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                          OPERADORES LOGICOS                              |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|    Los operadores lógicos están relacionados con el álgebra de           |");
            System.out.println("|    Boole. Evalúan una expresión en la que están implicados uno o dos     |");
            System.out.println("|    operandos con valor de tipo boolean. Retornan como resultando un      |");
            System.out.println("|    valor lógico, que será true si la evaluación de la expresión es       |");
            System.out.println("|    cierta o false en caso contrario.                                     |");
            System.out.println("|                                                                          |");
            System.out.println("|     && : Y lógico (AND)                                                  |");
            System.out.println("|     || : O lógico (OR)                                                   |");
            System.out.println("|     ! : No lógico (NOT)                                                  |");
            System.out.println("|                                                                          |");
            System.out.println("|     Ejemplo:                                                             |");
            System.out.println("|                                                                          |");
            System.out.println("|     boolean a = true;                                                    |");
            System.out.println("|     boolean b = false;                                                   |");
            System.out.println("|     boolean resultado = a && b; // resultado = false                     |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '1' para volver al menú OPERADORES ARITMETICOS: ");
            opcion = scannerOperadoresLogicos.nextInt();
            scannerOperadoresLogicos.nextLine();  // Consume the newline character

            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú DATOS PRIMITIVOS...                             ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }
        } while (opcion != 1);

    }

    private static void Operadores_Asignacion(Scanner scannerOperadoresDeAsignacion) {
        int opcion;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                       OPERADORES DE ASIGNACION                           |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|     Los operadores de asignación son fundamentales en Java ya que        |");
            System.out.println("|     permiten asignar valores a variables. A través de estos              |");
            System.out.println("|     operadores, se puede almacenar información en variables para su      |");
            System.out.println("|     posterior uso en el programa.                                        |");
            System.out.println("|                                                                          |");
            System.out.println("|     = : Asignación simple                                                |");
            System.out.println("|     += : Asignación con suma                                             |");
            System.out.println("|     -= : Asignación con resta                                            |");
            System.out.println("|     *= : Asignación con multiplicación                                   |");
            System.out.println("|     /= : Asignación con división                                         |");
            System.out.println("|     %= : Asignación con módulo                                           |");
            System.out.println("|                                                                          |");
            System.out.println("|     Ejemplo:                                                             |");
            System.out.println("|                                                                          |");
            System.out.println("|    int x = 10;                                                           |");
            System.out.println("|    x += 5;  // Equivalente a x = x + 5; x = 15                           |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '1' para volver al menú OPERADORES ARITMETICOS: ");
            opcion = scannerOperadoresDeAsignacion.nextInt();
            scannerOperadoresDeAsignacion.nextLine();  // Consume the newline character

            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú DATOS PRIMITIVOS...                             ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }
        } while (opcion != 1);

    }

    private static void Operadores_Incremento_Decremento(Scanner scannerOperadoresIncreDecre) {
        int opcion;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                   OPERADORES INCREMENTO / DECREMENTO                     |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|    Java tiene dos operaciones opuestas llamadas incremento (++) y        |");
            System.out.println("|    decremento (--), que aumentan o disminuyen el valor de una            |");
            System.out.println("|    variable en uno .                                                     |");
            System.out.println("|                                                                          |");
            System.out.println("|    Ejemplo:                                                              |");
            System.out.println("|                                                                          |");
            System.out.println("|    int c = 10;                                                           |");
            System.out.println("|    c++; // c = 11                                                        |");
            System.out.println("|    --c; // c = 10                                                        |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '1' para volver al menú OPERADORES ARITMETICOS: ");
            opcion = scannerOperadoresIncreDecre.nextInt();
            scannerOperadoresIncreDecre.nextLine();  // Consume the newline character

            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú DATOS PRIMITIVOS...                             ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }
        } while (opcion != 1);

    }
}
