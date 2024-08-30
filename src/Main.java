import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    /*Taller: Crear un menú con los temas de clase*/
    public static void main(String[] args) {
        //Declaración de variables

        Scanner scannera = new Scanner(System.in);
        Scanner scannerb = new Scanner(System.in);
        Scanner scannermenuprincipal = new Scanner(System.in);
        Scanner scannermenu2 = new Scanner(System.in);

        String menuprincipal;
        String menu2;
        int a;
        int b;

        //bucle que me controla el menu principal
        do {
            System.out.println("----------------------------------------" +
                    "\n-     MENU CAPITULO DE PROGRAMACIÓN    -" +
                    "\n-       ARNOLD REYES (AREYES2)         -" +
                    "\n-        MAYID PABÓN (MPABON5)         -" +
                    "\n----------------------------------------" +
                    "\n-1.           Datos primitivos.        -"          +
                    "\n-2.               String.              -" +
                    "\n-3.             Constantes.            -" +
                    "\n-4.         Tipo de operadores.        -" +
                    "\n-5.    Condicional IF, ELSE IF ELSE.   -" +
                    "\n-6.         Condicional SWITCH.        -" +
                    "\n-7.         Condicional ternario.      -" +
                    "\n-8.            Bucle DO WHILE.         -" +
                    "\n-9.             Bucle WHILE.           -" +
                    "\n-10.             Bucle FOR.            -" +
                    "\n-0.                 Salir              -" +
                    "\n----------------------------------------" +
                    "\nDigite una opción:");
            a= scannera.nextInt();

            // Bucle que controla que la condición ingresada en el menu principal sea valida
            while (a < 0 || a > 10) {
                System.out.println("ingrese numero valido");
                a = scannera.nextInt();
            }
            switch (a) {
                case 1:
                    //do permite que pueda volver al menu datos primitivos
                    do {
                        System.out.println("----------------------------------------" +
                                "\n             Datos primitivos" +
                                "\n----------------------------------------" +
                                "\n-1.          Explicación byte.         -" +
                                "\n-2.          Explicación short.        -" +
                                "\n-3.          Explicación int.          -" +
                                "\n-4.          Explicación long.         -" +
                                "\n-5.          Explicación float.        -" +
                                "\n-6.          Explicación double.       -" +
                                "\n-7.          Explicación char.         -" +
                                "\n-8.          Explicación boolean.      -" +
                                "\n-0.          Salir                     -" +
                                "\nDigite una opción:");
                        b = scannerb.nextInt();
                        //IF controla la opción salir del menu de datos primitivos
                        if (b == 0){
                            System.out.println("Eligio salir del menu datos primitivos, digite Enter para salir ");
                            break;
                        }
                        //Bucle que controla que la condición ingresada en el menu datos primitivos sea valida
                        do {
                            if (b == 1) {
                                System.out.println("----------------------------------------" +
                                        "\n             Explicación Byte           " +
                                        "\n----------------------------------------" +
                                        "\nRepresenta un tipo de dato de 8 bits" +
                                        "\ncon signo. De tal manera que puede" +
                                        "\nalmacenar los valores numéricose -128" +
                                        "\na 127 (ambos inclusive)." +
                                        "\n----------------------------------------");
                                System.out.println("Digita Enter para regresar al menu datos primitivos");
                                break;
                            } else if (b == 2) {
                                System.out.println("----------------------------------------" +
                                        "\n             Explicación short           " +
                                        "\n----------------------------------------" +
                                        "\nRepresenta un tipo de dato de 16 bits" +
                                        "\ncon signo. De esta manera almacena valores" +
                                        "\nnuméricos de -32.768 a 32.767" +
                                        "\n----------------------------------------");
                                System.out.println("Digita Enter para regresar al menu datos primitivos");
                                break;
                            } else if (b == 3) {
                                System.out.println("----------------------------------------" +
                                        "\n             Explicación int           " +
                                        "\n----------------------------------------" +
                                        "\nEs un tipo de dato de 32 bits" +
                                        "\ncon signo para almacenar valores numéricos" +
                                        "\nCuyo valor mínimo es -231 y el valor máximo 231-1." +
                                        "\n----------------------------------------");
                                System.out.println("Digita Enter para regresar al menu datos primitivos");
                                break;
                            } else if (b == 4) {
                                System.out.println("----------------------------------------" +
                                        "\n             Explicación long           " +
                                        "\n----------------------------------------" +
                                        "\nEs un tipo de dato de 64 bits" +
                                        "\ncon signo que almacena valores numéricos" +
                                        "\nentre -263 a 263-1" +
                                        "\n---------------------------------------");
                                System.out.println("Digita Enter para regresar al menu datos primitivos");
                                break;
                            } else if (b == 5) {
                                System.out.println("----------------------------------------" +
                                        "\n             Explicación float           " +
                                        "\n----------------------------------------" +
                                        "\nEs un tipo dato para almacenar números" +
                                        "\nen coma flotante con precisión simple de" +
                                        "\n32 bits." +
                                        "\n---------------------------------------");
                                System.out.println("Digita Enter para regresar al menu datos primitivos");
                                break;
                            } else if (b == 6) {
                                System.out.println("----------------------------------------" +
                                        "\n             Explicación double           " +
                                        "\n----------------------------------------" +
                                        "\nEs un tipo dato para almacenar números" +
                                        "\nen coma flotante con doble precisión de" +
                                        "\n64 bits." +
                                        "\n---------------------------------------");
                                System.out.println("Digita Enter para regresar al menu datos primitivos");
                                break;
                            } else if (b == 7) {
                                System.out.println("----------------------------------------" +
                                        "\n             Explicación char           " +
                                        "\n----------------------------------------" +
                                        "\nEs un tipo de datos que representa" +
                                        "\na un carácter Unicode sencillo de 16 bits." +
                                        "\n---------------------------------------");
                                System.out.println("Digita Enter para regresar al menu datos primitivos");
                                break;
                            } else if (b == 8) {
                                System.out.println("----------------------------------------" +
                                        "\n             Explicación boolean           " +
                                        "\n----------------------------------------" +
                                        "\nSirve para definir tipos de datos booleanos." +
                                        "\nEs decir, aquellos que tienen un valor " +
                                        "\nde true o false. Ocupa 1 bit de información." +
                                        "\n---------------------------------------");
                                System.out.println("Digita Enter para regresar al menu datos primitivos");
                                break;
                            }else {
                                //mensaje para controla que se elija una opción correcta en datos primitivos
                                while (b < 0 || b > 8) {
                                    System.out.println("Por favor digite opciones del submenu datos primitivos");
                                    b = scannerb.nextInt();
                                }
                            }
                        } while (b >= 1 || b <= 8);
                        menu2 = scannermenu2.nextLine();
                    } while (menu2.isEmpty());
                    break;
                case 2:
                    System.out.println("----------------------------------------" +
                            "\n                  String" +
                            "\n Un objeto String representa una cadena" +
                            "\n alfanumérica de un valor constante que" +
                            "\n no puede ser cambiada después de haber" +
                            "\n sido creada.Un objeto StringBuffer" +
                            "\n representa una cadena cuyo tamaño " +
                            "\n puede variar. Los Strings son objetos." +
                            "\n constantes y por lo tanto muy baratos " +
                            "\n para el sistema" +
                            "\n----------------------------------------");
                    System.out.println("Digita Enter para regresar al menu principal");
                    break;
                case 3:
                    System.out.println("----------------------------------------" +
                            "\n                Constantes" +
                            "\n----------------------------------------" +
                            "\n Una constante es un valor fijo dado" +
                            "\n que no debe cambiar. Este es un valor" +
                            "\n constante que se conoce antes de que" +
                            "\n la aplicación comience a ejecutarse y" +
                            "\n se establece en el código una vez." +
                            "\n----------------------------------------");
                    System.out.println("Digita Enter para regresar al menu principal");
                    break;
                case 4:
                    //do permite que pueda volver al menu tipo de operadores
                    do {
                        System.out.println("---------------------------------------" +
                                "\n           Tipos de operadores" +
                                "\n----------------------------------------" +
                                "\n-1.            Aritmeticos" +
                                "\n-2.            Relacionales" +
                                "\n-3.            Logicos" +
                                "\n-4.            Asignación" +
                                "\n-5.       Incremente/Decremento" +
                                "\n-0.               Salir" +
                                "\n---------------------------------------" +
                                "\n Digite una opción:");
                        b = scannerb.nextInt();
                        //IF controla la opción salir del menu tipo de operadores
                        if (b == 0){
                            System.out.println("Eligio salir del menu Tipos de operadores, digite Enter para salir ");
                            break;
                        }
                        //Bucle que controla que la condición ingresada en el menu tipo de operadores sea valida
                        do {
                            if (b == 1) {
                                System.out.println("----------------------------------------" +
                                        "\n             Aritmeticos          " +
                                        "\n----------------------------------------" +
                                        "\nLos operadores aritmeticos son simbolos" +
                                        "\nespeciales que se utilizan para realizar" +
                                        "\noperaciones matematicas en variables" +
                                        "\nnumericas. Los operadores son:" +
                                        "\nSuma: +, Resta: -, Multiplicación: *" +
                                        "\nDivisión: /, Modulo: %, Incremento: ++" +
                                        "\nDecremento: --" +
                                        "\n----------------------------------------");
                                System.out.println("Digita Enter para regresar al menu Tipo de operadores");
                                break;
                            } else if (b == 2){
                                System.out.println("----------------------------------------" +
                                        "\n            Relacionales" +
                                        "\n----------------------------------------" +
                                        "\nLos operadores relacionales son los" +
                                        "\nsiguientes:" +
                                        "\nIgual a: ==, Diferente de: !=" +
                                        "\nMayor que: >, Menor que: <" +
                                        "\nMayor o igual que: >=," +
                                        "\nMenor o igual que: <=" +
                                        "\n----------------------------------------");
                                System.out.println("Digita Enter para regresar al menu Tipo de operadores");
                                break;
                            } else if (b == 3){
                                System.out.println("----------------------------------------" +
                                        "\n              Logicos" +
                                        "\n----------------------------------------" +
                                        "\nLos operadores logicos son los siguientes:" +
                                        "\nAnd: &&, OR: ||" +
                                        "\n----------------------------------------");
                                System.out.println("Digita Enter para regresar al menu Tipo de operadores");
                                break;
                            } else if (b == 4){
                                System.out.println("----------------------------------------" +
                                        "\n             Asignación" +
                                        "\n----------------------------------------" +
                                        "\nLos operadores de asignación permiten" +
                                        "\nasignar valores variables. A través de" +
                                        "\nestos operadores, se puede almacenar" +
                                        "\ninformación en variables para su" +
                                        "\nposterior uso en el programa. Los" +
                                        "\noperadores utilizados son:" +
                                        "\n+=, -=, *=, /=, entre otros." +
                                        "\n----------------------------------------");
                                System.out.println("Digita Enter para regresar al menu Tipo de operadores");
                                break;
                            } else if (b == 5){
                                System.out.println("----------------------------------------" +
                                        "\n        Incremento/Decremento" +
                                        "\n----------------------------------------" +
                                        "\nLos operadores de Increment y Decremento" +
                                        "\nson utiles para modificar el valor de una" +
                                        "\nvariable en una unidad. El operadore de" +
                                        "\nincremento aumenta el valor de la " +
                                        "\nvariable en 1, mientras que el operador" +
                                        "\nde decremento lo disminuye en 1. Los" +
                                        "\noperadores son: Increment: ++," +
                                        "\nDecremento: --.");
                                System.out.println("Digita Enter para regresar al menu Tipo de operadores");
                                break;
                            }else {
                                //mensaje para controla que se elija una opción correcta en Tipo de operadores
                                while (b < 0 || b > 5) {
                                    System.out.println("Por favor digite opciones del submenu Tipo de operadores");
                                    b = scannerb.nextInt();
                                }
                            }
                        } while (b >= 1 || b <= 5);
                        menu2 = scannermenu2.nextLine();
                    } while (menu2.isEmpty());
                    break;
                case 5 :
                    System.out.println("----------------------------------------" +
                            "\n       Condicional IF, ELSE IF ELSE" +
                            "\n----------------------------------------" +
                            "\n-1.         Explicación de IF" +
                            "\n-2.        Explicación de ELSE IF" +
                            "\n-3.        Explicación del ELSE" +
                            "\n-4.     Programa de IF, ELSE IF/ELSE" +
                            "\n-0.                 Salir" +
                            "n---------------------------------------");
                    System.out.println("Digite una opción:");
                    b = scannerb.nextInt();
            }
            menuprincipal = scannermenuprincipal.nextLine();
        }while(menuprincipal.isEmpty());
    }
}