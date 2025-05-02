/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana2;

import java.util.Scanner;

/**
 *
 * @author saidn
 */
public class Napky_Said2_Tiempo {
    public static void main (String[]args){
    
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingresa Un Numero De Segundos : ");
        int segundos = leer.nextInt();
        
        if (segundos <= 0){
            System.out.println("Se Produjo Un Error, Segundos Invalidos");
        }
        
        if(segundos > 0){
        int horas = segundos / 3600;
        int demas = segundos % 3600;
        int  minutos = demas / 60;
        int final_segundo = demas % 60;
        
        String resultado = " Horas :" + horas + " Minutos :" + minutos +" Segundos" + final_segundo;
        
            System.out.println(resultado);
        }
        
    }
}
