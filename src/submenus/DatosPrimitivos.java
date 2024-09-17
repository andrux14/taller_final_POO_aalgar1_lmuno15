package submenus;
import java.util.Scanner;

public class DatosPrimitivos {
    public static void datosPrimitivos(Scanner scannerDatosPrimitivos) {

        int opcion;
        do {

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("|                          DATOS PRIMITIVOS                                |");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("|                        1. Explicacion byte                               |");
        System.out.println("|                        2. Explicacion short                              |");
        System.out.println("|                        3. Explicacion int                                |");
        System.out.println("|                        4. Explicacion long                               |");
        System.out.println("|                        5. Explicacion float                              |");
        System.out.println("|                        6. Explicacion double                             |");
        System.out.println("|                        7. Explicacion char                               |");
        System.out.println("|                        8. Explicacion boolean                            |");
        System.out.println("|                        9. Volver a MENU PRINCIPAL                        |");
        System.out.println("----------------------------------------------------------------------------");
        System.out.print("Ingrese la opcion: ");
        opcion = scannerDatosPrimitivos.nextInt();
        scannerDatosPrimitivos.nextLine();  // Consume the newline character

        switch (opcion) {
            case 1:
                Explicacion_byte(scannerDatosPrimitivos);
                break;
            case 2:
                Explicacion_Short(scannerDatosPrimitivos);
                break;
            case 3:
                Explicacion_int(scannerDatosPrimitivos);
                break;
            case 4:
                Explicacion_long(scannerDatosPrimitivos);
                break;
            case 5:
                Explicacion_float(scannerDatosPrimitivos);
                break;
            case 6:
                Explicacion_double(scannerDatosPrimitivos);
                break;
            case 7:
                Explicacion_char(scannerDatosPrimitivos);
                break;
            case 8:
                Explicacion_boolean(scannerDatosPrimitivos);
                break;
            case 9:
                System.out.println("                                                                    ");
                System.out.println("  Volviendo a MENÚ PRINCIPAL...                                     ");
                System.out.println("                                                                    ");
                break;
            default:
                System.out.println("Ingrese una opcion valida");
        }
    } while (opcion != 9);

    }

    public static void Explicacion_byte(Scanner scannerExplicacionByte) {

        int opcion;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                                 byte                                     |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|    La variable byte es un tipo de dato primitivo que se utiliza para     |");
            System.out.println("|    almacenar números enteros en un rango limitado.                       |");
            System.out.println("|                                                                          |");
            System.out.println("|    Un byte ocupa 1 byte (8 bits) de memoria y puede almacenar valores    |");
            System.out.println("|    enteros desde -128 hasta 127. Esto se debe a que un byte utiliza      |");
            System.out.println("|    un bit para el signo y los otros 7 bits para el valor.                |");
            System.out.println("|                                                                          |");
            System.out.println("|                         Ejemplo: byte edad = 42                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '1' para volver al menú DATOS PRIMITIVOS: ");

            opcion = scannerExplicacionByte.nextInt();
            scannerExplicacionByte.nextLine();  // Consume the newline character

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

    public static void Explicacion_Short(Scanner scannerExplicacionShort) {
        int opcion;

        do {

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("|                                                                          |");
        System.out.println("|                                  short                                   |");
        System.out.println("|                                                                          |");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("|     Este tipo de dato utiliza 16 bits con signo y puede almacenar        |");
        System.out.println("|     valores numéricos en el rango de -32,768 a 32,767. Se utiliza        |");
        System.out.println("|     cuando se necesita un rango más amplio que el proporcionado por      |");
        System.out.println("|     los bytes, pero aún se desea ahorrar memoria en comparación con      |");
        System.out.println("|     los tipos de dato más grandes.                                       |");
        System.out.println("|                                                                          |");
        System.out.println("|                      Ejemplo: short precio = 14500                       |");
        System.out.println("----------------------------------------------------------------------------");
        System.out.print("Ingrese '1' para volver al menú DATOS PRIMITIVOS: ");
        opcion = scannerExplicacionShort.nextInt();
        scannerExplicacionShort.nextLine();  // Consume the newline character

        switch (opcion) {
            case 1:
                System.out.println("                                                                    ");
                System.out.println("  Volviendo al menú DATOS PRIMITIVOS...                             ");
                System.out.println("                                                                    ");
                break;
            default:
                System.out.println("Ingrese una opcion valida.");
            }
        }while (opcion != 1);
    }

    public static void Explicacion_int(Scanner scannerExplicacionInt) {

        int opcion;
        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                                  int                                     |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|    Es un tipo de dato de 32 bits con signo utilizado para almacenar      |");
            System.out.println("|    valores numéricos. Su rango va desde -2,147,483,648 (-2^31) hasta     |");
            System.out.println("|    2,147,483,647 (2^31 - 1). Es el tipo de dato más comúnmente           |");
            System.out.println("|    utilizado para representar números enteros.                           |");
            System.out.println("|                                                                          |");
            System.out.println("|                     Ejemplo: int ahorro = 150000;                        |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '1' para volver al menú DATOS PRIMITIVOS: ");
            opcion = scannerExplicacionInt.nextInt();
            scannerExplicacionInt.nextLine();  // Consume the newline character

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

    public static void Explicacion_long(Scanner scannerExplicacionLong){
        int opcion;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                                   long                                   |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|    El tipo de dato long es un entero de 64 bits complemento a dos.       |");
            System.out.println("|    Su valor mínimo es -9,223,372,036,854,775,808 y el máximo             |");
            System.out.println("|    9,223,372,036,854,775,807 (inclusive). Utilice este tipo de dato      |");
            System.out.println("|    cuando necesite un rango de valores más amplio que el                 |");
            System.out.println("|    proporcionado por int.                                                |");
            System.out.println("|                                                                          |");
            System.out.println("|                    Ejemplo: long metros = 18586523l;                      |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '1' para volver al menú DATOS PRIMITIVOS: ");
            opcion = scannerExplicacionLong.nextInt();
            scannerExplicacionLong.nextLine();  // Consume the newline character

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

    public static void Explicacion_float(Scanner scannerExplicacionFloat){
        int opcion;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                                 float                                    |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|    En Java, una variable de tipo float es un tipo de dato que se         |");
            System.out.println("|    utiliza para representar números decimales, es decir, números que     |");
            System.out.println("|    tienen una parte fraccionaria. El tipo float es un tipo de dato       |");
            System.out.println("|    primitivo que sigue el estándar IEEE 754 para la representación de    |");
            System.out.println("|    números de punto flotante de precisión simple.                        |");
            System.out.println("|                                                                          |");
            System.out.println("|                     Ejemplo: float estatura = 1.75f;                     |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '1' para volver al menú DATOS PRIMITIVOS: ");
            opcion = scannerExplicacionFloat.nextInt();
            scannerExplicacionFloat.nextLine();  // Consume the newline character

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

    public static void Explicacion_double(Scanner scannerExplicacionDouble){

        int opcion;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                                 double                                   |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|    El tipo de dato double se usa para representar números de punto       |");
            System.out.println("|    flotante con doble precisión, lo que significa que tiene una mayor    |");
            System.out.println("|    precisión en comparación con float. Los valores de tipo double        |");
            System.out.println("|    tienen aproximadamente 15-16 dígitos decimales de precisión, lo       |");
            System.out.println("|    cual es útil para cálculos matemáticos que requieren una mayor        |");
            System.out.println("|    exactitud.                                                            |");
            System.out.println("|                                                                          |");
            System.out.println("|               Ejemplo: double numeropi = 3.14159265358979d               |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '1' para volver al menú DATOS PRIMITIVOS: ");
            opcion = scannerExplicacionDouble.nextInt();
            scannerExplicacionDouble.nextLine();  // Consume the newline character

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

    public static void Explicacion_char(Scanner scannerExplicacionChar){
        int opcion;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                                 char                                     |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|    El tipo de dato char se utiliza para almacenar un solo carácter       |");
            System.out.println("|    Unicode. Un char en Java ocupa 16 bits y puede representar            |");
            System.out.println("|    cualquier carácter del conjunto Unicode, que incluye caracteres de    |");
            System.out.println("|    diversos idiomas, símbolos y emojis.                                  |");
            System.out.println("|                                                                          |");
            System.out.println("|                   Ejemplo: char primerNombre = Juan                      |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '1' para volver al menú DATOS PRIMITIVOS: ");
            opcion = scannerExplicacionChar.nextInt();
            scannerExplicacionChar.nextLine();  // Consume the newline character

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

    public static void Explicacion_boolean(Scanner scannerExplicacionBoolean){

        int opcion;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                               boolean                                    |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|    En Java, una variable booleana es un tipo de variable que puede       |");
            System.out.println("|    almacenar uno de dos posibles valores: true (verdadero) o false       |");
            System.out.println("|    (falso). El tipo de dato que se utiliza para declarar una             |");
            System.out.println("|    variable booleana es boolean.                                         |");
            System.out.println("|                                                                          |");
            System.out.println("|                     Ejemplo: boolean haceFrio = true                     |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '1' para volver al menú DATOS PRIMITIVOS: ");
            opcion = scannerExplicacionBoolean.nextInt();
            scannerExplicacionBoolean.nextLine();  // Consume the newline character

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