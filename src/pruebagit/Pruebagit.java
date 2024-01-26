/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebagit;

import java.util.Scanner;

public class Pruebagit {

    
    public static void main(String[] args) {
        
        int a,b,suma;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer valor:");
        a = sc.nextInt();
        System.out.println("Introduce el segundo valor:");
        b = sc.nextInt();
        suma=a+b;
        System.out.println("El numero es: " + suma);
    }
    
}
