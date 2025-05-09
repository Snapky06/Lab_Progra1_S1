/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana_3;

import java.util.Scanner;

/**
 *
 * @author saidn
 */
public class Napky_Said_Estructura {

    public static void main(String[] args) {
        System.out.println("1- Palabra Alreves");
        System.out.println("2-Numero Perfecto");
        System.out.println("3- Primos");
        System.out.println("4- Votaciones");
        System.out.print("Seleccione (1 O 2 O 3 O 4) : ");

        Scanner leer = new Scanner(System.in);
        int cantidad = 0, largo = 0, numero = 0, sumaDivisores = 0, divisor_primo = 0;
        int codigo = leer.nextInt(), cuentaDivisores = 0;
        String palabra = "", invertida = "", palabra2 = "";
        boolean esPerfecto = false, esPrimo = false;
        switch (codigo) {
            case 1:
                System.out.println("Ingrese La Cantidad De Palabras");
                cantidad = leer.nextInt();

                for (int repeticiones = 0; repeticiones < cantidad; repeticiones++) {

                    System.out.print("Ingrese Una Palabra : ");

                    palabra = leer.next();

                    largo = palabra.length();

                    for (int i = largo - 1; i >= 0; i--) {
                        invertida += palabra.charAt(i);
                    }

                    System.out.println("Palabra Invertida : " + invertida);

                    palabra2 = invertida;

                    if (palabra.equals(palabra2)) {
                        System.out.print("Es Palindromo");
                    }

                }

                break;

            case 2:
                System.out.println("Ingrese Un Numero : ");

                numero = leer.nextInt();

                for (int divisor = 1; divisor < numero; divisor++) {
                    if (numero % divisor == 0) {
                        sumaDivisores += divisor;
                    }
                }

                if (sumaDivisores == numero) {
                    System.out.println("Es Perfecto");
                } else {
                    System.out.println("No Es Perfecto");
                }

                break;

            case 3:

                int Numero_Random = (int) (Math.random() * 100) + 1;
                esPrimo = true;

                for (int divisor = 2; divisor < Numero_Random; divisor++) { 
                    if (Numero_Random % divisor == 0) {
                        esPrimo = false; 
                    } 
                }

                if (esPrimo == false) {
                    System.out.println("Este Numero No Es Primo : " + Numero_Random);
                }

                if (esPrimo) {
                    System.out.println("Primo " + Numero_Random + " Porque Solo Tiene Dos Divisores");
                    System.out.println("Divisores De " + Numero_Random + " Son : 1 y " + Numero_Random);
                }

                break;

        }
    }
}
