package ejecucion;

import menus.MenuPrincipal;
import programas.*;
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
    private static final Scanner scannerProgramaSwitch = new Scanner(System.in);
    private static final Scanner scannerProgramaTernaria = new Scanner(System.in);
    private static final Scanner scannerProgramaDoWhile = new Scanner(System.in);
    private static final Scanner scannerProgramaWhile = new Scanner(System.in);
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
    private static void CondicionalSwitch(){MenuCondicionalSwitch.CondicionalSwitch(scannerProgramaSwitch);}

    private static void Programa_switch (){
        ProgramaSwitch.Programa_switch(scannerProgramaSwitch);}

    private static void CondicionalTernaria (){MenuCondicionalTernaria.CondicionalTernaria(scannerProgramaTernaria);}
    private static void Programa_ternaria (){
        ProgramaTernaria.Programa_ternaria(scannerProgramaTernaria);}
    private static void BucleDoWhile (){MenuBucleDoWhile.BucleDoWhile(scannerProgramaDoWhile);}
    private static void Programa_do_while(){
        ProgramaDoWhile.Programa_do_while(scannerProgramaDoWhile);}
    private static void BucleWhile  (){MenuBucleWhile.BucleWhile(scannerProgramaWhile);}
    private static void Programa_While (){
        ProgramaWhile.Programa_while(scannerProgramaWhile);}
    private static void BucleFor (){MenuBucleFor.BucleFor(scannerProgramaFor);}

    private static void Programa_For (){ProgramaFor.Programa_For(scannerProgramaFor);}


    }






