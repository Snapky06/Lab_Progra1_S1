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

public class Ejercicio1 {
    
    public static void main(String[]args){
int HTM = 80;
        int TPH = 300;
        double SS;
        SS = 6000;
      
        System.out.println("****Boleta de Pago****");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre del Empleado");
        String inputString = scanner.nextLine();
        System.out.println("Hora de Trabajo Mensual:" + HTM);
        System.out.println("Tarifa por Hora:"+ TPH);
        System.out.println("Salario del Empleado Semanal:" + SS);
      
    }

}
