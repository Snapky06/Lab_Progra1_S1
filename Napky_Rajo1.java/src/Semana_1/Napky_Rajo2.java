/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana_1;

import java.util.Scanner;

/**
 *
 * @author saidn
 */
public class Napky_Rajo2 {
    public static void main(String[] args) {
        double P, IS, CM, TP,TIP;
        double I ;
        double C;
        double CP;
        double CC;
        double PS; 
        
        Scanner scanner = new Scanner(System.in);
        
         System.out.println("----Bienvenido al Calculador Monetario----");
        System.out.println("Ingrese el Monto del Prestamo: ");
        P = scanner.nextDouble() ;
        
                System.out.println("Ingrese la Tasa de Interes: ");
        I = scanner.nextDouble()/100 ;
        
                System.out.println("Ingrese el Plazo de meses:");
        C = scanner.nextDouble() ;
        
                System.out.println("Ingrese la Comision por Cuota:  ");
        CC = scanner.nextDouble() ;
        
                System.out.println("Ingrese el Porcentaje del Seguro Mensual");
        PS = scanner.nextDouble() /100 ;
     
        
          IS = (P*I*C);
          TIP = (P+IS);
        CM = (TIP+CC)*PS/C;
        TP = (CM*C);
       
                        System.out.println("----Cuotas Mensuales----");
                        
                                        System.out.println("Cuota del Pago Mensual: HNL "+ CM);
                                                        System.out.println("Total a Pagar: HNL " + TP);
                                                                        
                        
   
      
        
        
        
    }
}
