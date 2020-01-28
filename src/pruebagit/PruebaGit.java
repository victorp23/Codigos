
package pruebagit;

import java.util.Scanner;

/**
 *
 * @author Victor Andres
 */
public class PruebaGit {

    public static void main(String[] args) {
        //Progrma que sume 2 numeros enteros
        int num1, num2,suma;
        System.out.println("Ingrese el num1:");
        Scanner ingreso=new Scanner(System.in);
        num1=ingreso.nextInt();
        System.out.println("Ingrese el numero 2:");
        num2=ingreso.nextInt();
        suma=num1+num2;
        System.out.println("La suma es:"+suma);
    }
    
}
