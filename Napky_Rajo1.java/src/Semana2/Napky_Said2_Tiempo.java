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
        double segundos = leer.nextDouble();
        
        if (segundos <= 0){
            System.out.println("Se Produjo Un Error, Segundos Invalidos");
        }
        
        if(segundos > 0){
        double horas = segundos / 3600;
        double demas = segundos % 3600;
        double minutos = demas / 60;
        double final_segundo = demas % 60;
        
        String resultado = "Horas :" + horas + "Minutos :" + minutos +"Segundos" + final_segundo;
        
            System.out.println(resultado);
        }
        
    }
}
