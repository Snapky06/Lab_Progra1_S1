package Napky_Rajo1;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saidn
 */

public class Napky_Rajo1 {
    
    public static void main(String[]args){
double HTM ;
        double TPH ;
        double SS;
      String NdE;
      
   
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre del Empleado");
        NdE = scanner.next();
        System.out.println("Hora de Trabajo Mensual: ");
        HTM = scanner.nextDouble();
        System.out.println("Tarifa por Hora: Lps ");
        TPH = scanner.nextDouble();
        SS = (HTM/4)*TPH;
        
                   System.out.println("****Boleta de Pago****");
            System.out.println("Nombre del Empleado " + NdE);
              System.out.println("Hora de Trabajo Mensual: " + HTM );
                    System.out.println("Tarifa por Hora: " + TPH );
        System.out.println("Salario del Empleado Semanal: Lps " + SS );

    }

}
