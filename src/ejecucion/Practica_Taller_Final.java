package ejecucion;

import menus.MenuPrincipal;
import programas.ProgramaIfElseIf;
import submenus.*;

import java.util.Scanner;
import java.util.Random;

public class Practica_Taller_Final {

    private static final Scanner scannerMenuPrincipal = new Scanner(System.in);
    private static final Scanner scannerDatosPrimitivos = new Scanner(System.in);
    private static final Scanner scannerExplicacionString = new Scanner(System.in);
    private static final Scanner scannerExplicacionConstantes = new Scanner(System.in);
    private static final Scanner scannerTipoDeOperadores = new Scanner(System.in);
    private static final Scanner scannerProgramaIfElse = new Scanner(System.in);
    private static final Scanner scannerCondicionalSwith = new Scanner(System.in);
    private static final Scanner scannerExplicacionSwith = new Scanner(System.in);
    private static final Scanner scannerProgramaSwith = new Scanner(System.in);
    private static final Scanner scannerCondicionalTernaria = new Scanner(System.in);
    private static final Scanner scannerExplicacionTernaria = new Scanner(System.in);
    private static final Scanner scannerProgramaTernaria = new Scanner(System.in);
    private static final Scanner scannerDoWhile = new Scanner(System.in);
    private static final Scanner scannerExplicacionDoWhile = new Scanner(System.in);
    private static final Scanner scannerProgramaDoWhile = new Scanner(System.in);
    private static final Scanner scannerBucleWhile = new Scanner(System.in);
    private static final Scanner scannerExplicacionWhile = new Scanner(System.in);
    private static final Scanner scannerProgramaWhile = new Scanner(System.in);
    private static final Scanner scannerBucleFor = new Scanner(System.in);
    private static final Scanner scannerExplicacionFor = new Scanner(System.in);
    private static final Scanner scannerProgramaFor = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion = 0;

        do {
            MenuPrincipal.menuPrincipal();
            opcion = scannerMenuPrincipal.nextInt();

            switch (opcion) {
                case 1:
                    DatosPrimitivos();
                    break;
                case 2:
                    MenuString();
                    break;
                case 3:
                    Constantes();
                    break;
                case 4:
                    TipoDeOperadores();
                    break;
                case 5:
                    CondicionalIfElse();
                    break;
                case 6:
                    CondicionalSwitch();
                    break;
                case 7:
                    CondicionalTernaria();
                    break;
                case 8:
                    BucleDoWhile();
                    break;
                case 9:
                    BucleWhile();
                    break;
                case 10:
                    BucleFor();
                    break;
                case 11:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        } while (opcion != 11);
    }

    private static void DatosPrimitivos() {
        DatosPrimitivos.datosPrimitivos(scannerDatosPrimitivos);
    }

    private static void MenuString() {
        MenuString.menuString(scannerExplicacionString);
    }

    private static void Constantes() {
        Constantes.menuConstantes(scannerExplicacionConstantes);
    }

    private static void TipoDeOperadores() {
        TipoDeOperadores.tipoDeOperadores(scannerTipoDeOperadores);
    }

    private static void CondicionalIfElse() {
        MenuIfElseIf.CondicionalIfElse(scannerProgramaIfElse);
    }

    private static void Programa_if_else() {
        ProgramaIfElseIf.Programa_if_else(scannerProgramaIfElse);
    }




    private static void CondicionalSwitch() {
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
            opcion = scannerCondicionalSwith.nextInt();
            scannerCondicionalSwith.nextLine();// Consume the newline character
            switch (opcion) {
                case 1:
                    Explicacion_switch();
                    break;
                case 2:
                    Programa_de_switch();
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

    private static void Explicacion_switch() {
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
            opcion = scannerExplicacionSwith.nextInt();
            scannerExplicacionSwith.nextLine();  // Consume the newline character
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

    private static void Programa_de_switch() {
        int opcion;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                 Ingrese '1' para ver el ejemplo                          |");
            System.out.println("|             ingrese '2' para volver al menú SWITCH                       |");
            System.out.println("----------------------------------------------------------------------------");
            opcion = scannerProgramaSwith.nextInt();
            scannerProgramaSwith.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("\nIngrese una calificación (1 a 10): ");
                    int calificacion = scannerProgramaSwith.nextInt();

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

    private static void CondicionalTernaria() {
        int opcion;
        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                    CONDICIONAL TERNARIA                                  |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|          1. Explicacion de ternaria                                      |");
            System.out.println("|          2. Programa ternaria - determine si un número es par o impar    |");
            System.out.println("|             Digite la opcion:                                            |");
            System.out.println("|          3. Volver a MENU PRINCIPAL                                      |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese la opcion: ");
            opcion = scannerCondicionalTernaria.nextInt();
            scannerCondicionalTernaria.nextLine();// Consume the newline character
            switch (opcion) {
                case 1:
                    Explicacion_de_ternaria();
                    break;
                case 2:

                    Programa_ternaria();
                    break;
                case 3:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo a MENÚ DATOS PRIMITIVOS...                                     ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
            }
        } while (opcion != 3);
    }

    private static void Explicacion_de_ternaria() {
        int opcion;
        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                        EXPLICACION TERNARIA                              |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|  Es una construcción que permite tomar decisiones basadas en una         |");
            System.out.println("|  condición booleana de manera concisa en una sola línea de código.       |");
            System.out.println("|  Es una forma abreviada de expresar una estructura condicional(if-else)  |");
            System.out.println("|  Este operador se compone de tres partes:                                |");
            System.out.println("|  - La condición a evaluar (condición booleana)                           |");
            System.out.println("|  - El valor si la condición es verdadera (valor verdadero)               |");
            System.out.println("|  - El valor si la condición es falsa (valor falso)                       |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '2' para volver al menú CONDICIONAL TERNARIA: ");
            opcion = scannerExplicacionTernaria.nextInt();
            scannerExplicacionTernaria.nextLine();  // Consume the newline character
            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú CONDICIONAL TERNARIA...                         ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese la opcion valida.");
            }
        } while (opcion != 2);

    }

    private static void Programa_ternaria() {
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

    private static void BucleDoWhile() {
        int opcion;
        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                         BUCLE DO WHILE                                   |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|             1. Explicacion de DO WHILE                                   |");
            System.out.println("|             2. Programa DO WHILE - adivina el numero                     |");
            System.out.println("|                Digite la opcion:                                         |");
            System.out.println("|             3. Volver a MENU PRINCIPAL                                   |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese la opcion: ");
            opcion = scannerDoWhile.nextInt();
            scannerDoWhile.nextLine();// Consume the newline character
            switch (opcion) {
                case 1:
                    Explicacion_de_do_while();
                    break;
                case 2:
                    Programa_do_while();
                    break;
                case 3:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo a MENÚ PRINCIPAL...                                     ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
            }
        } while (opcion != 3);


    }

    private static void Explicacion_de_do_while() {
        int opcion;
        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                          EXPLICACION  DO WHILE                           |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("| La estructura repetitiva es aquella en que el cuerpo del bucle se        |");
            System.out.println("| repite mientras que se cumple una determinada condición.                 |");
            System.out.println("| En esta estructura, la condición del ciclo se evalúa al final, por lo    |");
            System.out.println("| que siempre se ejecutarán las instrucciones del ciclo por lo menos       |");
            System.out.println("| una vez. Si la condición se evalúa verdadera, se ejecuta nuevamente      |");
            System.out.println("| el cuerpo del bucle; si la condición es falsa, entonces sale y se sigue  |");
            System.out.println("| con el flujo normal del algoritmo. Este proceso se repite una y otra     |");
            System.out.println("| vez hasta que la condición sea falsa.                                    |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '2' para volver al menú BUCLE DO WHILE: ");
            opcion = scannerExplicacionDoWhile.nextInt();
            scannerExplicacionDoWhile.nextLine();  // Consume the newline character
            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú BUCLE DO WHILE...                               ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese la opcion valida.");
            }
        } while (opcion != 2);

    }

    private static void Programa_do_while() {

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
    private static void BucleWhile() {
        int opcion;
        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                          BUCLE WHILE                                     |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                   1. Explicacion While                                   |");
            System.out.println("|                   2. Programa de While - Sumatoria de numeros            |");
            System.out.println("|                   3. Volver a MENU PRINCIPAL                             |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese la opcion: ");
            opcion = scannerBucleWhile.nextInt();
            scannerBucleWhile.nextLine();// Consume the newline character
            switch (opcion) {
                case 1:
                    Explicacion_while();
                    break;
                case 2:
                    Programa_de_while();
                    break;
                case 3:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo a MENÚ PRINCIPAL...                                     ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
            }
        } while (opcion != 3);
    }

    private static void Explicacion_while() {
        int opcion;
        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                          EXPLICACION WHILE                               |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|   Es una estructura cíclica, que nos permite ejecutar una o varias       |");
            System.out.println("|   líneas de código de manera repetitiva sin tener un valor inicial       |");
            System.out.println("|   e incluso a veces sin conocer cuando se va a dar el valor final        |");
            System.out.println("|   esperado,los cliclos while, no dependen de valores numéricos,          |");
            System.out.println("|   sino de valores booleanos, su ejecución depende del valor de           |");
            System.out.println("|   verdad de una condición dada,verdadera o falso.                        |");
            System.out.println("|   son mucho más efectivos para condiciones indeterminadas.               |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '2' para volver al menú BUCLE WHILE: ");
            opcion = scannerExplicacionWhile.nextInt();
            scannerExplicacionWhile.nextLine();  // Consume the newline character
            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú BUCLE WHILE...                                  ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese la opción valida.");
            }
        } while (opcion != 2);

    }
    private static void Programa_de_while() {

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
    private static void BucleFor() {
        int opcion;
        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                           BUCLE FOR                                      |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                   1. Explicacion For                                     |");
            System.out.println("|                   2. Programa de For - Sumatoria de números              |");
            System.out.println("|                   3. Volver a MENU PRINCIPAL                             |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese la opcion: ");
            opcion = scannerBucleFor.nextInt();
            scannerBucleFor.nextLine();// Consume the newline character
            switch (opcion) {
                case 1:
                    Explicacion_for();
                    break;
                case 2:
                    Programa_de_for();
                    break;
                case 3:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo a MENÚ PRINCIPAL...                                     ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
            }
        } while (opcion != 3);
    }

    private static void Explicacion_for() {
        int opcion;
        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                           EXPLICACION FOR                                |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|  Es una estructura de control cíclica, nos permiten ejecutar una o       |");
            System.out.println("|  varias líneas de código de forma iterativa (o repetitiva), pero         |");
            System.out.println("|  teniendo cierto control y conocimiento sobre las iteraciones. En el     |");
            System.out.println("|  ciclo for, es necesario tener un valor inicial y un valor final, y      |");
            System.out.println("|  opcionalmente podemos hacer uso del tamaño del paso entre cada giro     |");
            System.out.println("|  o iteración del ciclo.                                                  |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '2' para volver al menú BUCLE FOR: ");
            opcion = scannerExplicacionFor.nextInt();
            scannerExplicacionFor.nextLine();  // Consume the newline character
            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú BUCLE FOR...                                    ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese la opción valida.");
            }
        } while (opcion != 2);

    }

    private static void Programa_de_for() {
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