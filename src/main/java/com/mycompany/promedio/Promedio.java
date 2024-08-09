package com.mycompany.promedio;
import java.util.Scanner;
/*Esta es la libreria para poder utilizar el metodo Scannes 
/**
 * 
 * @author coguox
 */
public class Promedio {

    public static void main(String[] args) {
         Scanner Scanner = new Scanner(System.in);
        /*Se crea la variable Scannes*/ 
        int prome, suma, a, b, c, d;
        /*Se declaran las variables*/
        System.out.println("Ingrese las notas");
        System.out.println("Ingrese la primera nota");
        a = Scanner.nextInt();
        System.out.println("Ingrese la segunda nota");
        b = Scanner.nextInt();
        System.out.println("Ingrese la tercera nota");
        c = Scanner.nextInt();
        System.out.println("Ingrese la cuarta nota");
        d = Scanner.nextInt();
        suma = a+b+c+d;
        prome = suma / 4;
        /*Se realizan las operaciones para dar el promedio*/
        System.out.println("El promedio de las notas es de: "+ prome);
        /*Se muestra el resultado*/
    }
}
