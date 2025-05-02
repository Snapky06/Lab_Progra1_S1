/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana2;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author saidn
 */
public class Napky_Said4_Fecha {
    public static void main(String[]args){
    
        Scanner leer = new Scanner(System.in);
                
        System.out.println("---Calculador De Fechas---");
           System.out.println("Ingrese La Fecha (DIA/MES/ANYO): ");

 String fecha = leer.nextLine();
 
 int slash1 = fecha.indexOf("/");
 int slash2 = fecha.indexOf(("/"),slash1 + 1);
 
 String dia_string = fecha.substring(0,slash1).trim().toLowerCase();
 int dia1 = Integer.parseInt(dia_string);
  
 String mes_string = fecha.substring(slash1 + 1, slash2).trim();
 int mes1 = Integer.parseInt(mes_string);
 
 
 String AÑO_string = fecha.substring(slash2 + 1).trim();
 int AÑO = Integer.parseInt(AÑO_string);
 
           System.out.println("Ingrese La Segunda Fecha (DIA/MES/ANYO): ");

 String fecha2 = leer.nextLine();
 
 
 String dia2_string = fecha2.substring(0,slash1).trim().toLowerCase();
 int dia2 = Integer.parseInt(dia2_string);
  
 String mes2_string = fecha2.substring(slash1 + 1, slash2).trim();
 int mes2 = Integer.parseInt(mes2_string);
 
 
 String AÑO2_string = fecha2.substring(slash2 + 1).trim();
 int AÑO2 = Integer.parseInt(AÑO2_string);
 
 int totaldedias = ((AÑO * 360) + (mes1*30) + dia1);
 int totaldedias2 = ((AÑO2 * 360) + (mes2*30) + dia2);
 
 int diferencia = Math.abs(totaldedias - totaldedias2);

        System.out.println("La Diferencia Entre Las Dos Fechas Es De : " + diferencia );
                System.out.println("---Fin De La Calculadora---");
    }
}
