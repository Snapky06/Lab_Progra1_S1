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
public class Napky_Said3_Pagos {
    public static void main(String[]args){
                
                Scanner leer = new Scanner(System.in);
                
        System.out.println("---Bienvenido A Las Oficinas---\n");
        System.out.println("---Calculador De Pagos---");
                System.out.print("Ingrese Su Nombre : ");
                String nombre = leer.next();
                         System.out.print("Ingrese Su Apellido : ");
                String apellido = leer.next();
                                System.out.print("Ingrese Su Codigo : ");
                String codigo = leer.next();
        System.out.print("A Que Categoria Forma Parte(1/2/3/4) : ");
        
        int categoria = leer.nextInt();
        System.out.print("Cuantas Horas A Trabajado : ");
                int horas_trabajadas = leer.nextInt();
                int horas_normales = horas_trabajadas-15 ;
                int horas_extra_sin_pagar = 0;
                int horas_extra = horas_trabajadas - 40;
                double pago_por_hora = 0;
                double pago_por_hora_extra = 0;
                double total = 0;
                
if(categoria >= 1 && categoria <= 4){

    if(horas_trabajadas > 40 && horas_trabajadas < 55){
          pago_por_hora = horas_normales * 35.99;
        switch(categoria) {
           case 1: 
               pago_por_hora_extra = horas_extra * 40;
                              total = pago_por_hora_extra + pago_por_hora;
               break;
                          case 2: 
               pago_por_hora_extra = horas_extra * 50;
                              total = pago_por_hora_extra + pago_por_hora;
               break;
                          case 3: 
               pago_por_hora_extra = horas_extra * 85;
                              total = pago_por_hora_extra + pago_por_hora;
               break;
                          case 4: 
               pago_por_hora_extra = horas_extra * 0;
                              total = pago_por_hora_extra + pago_por_hora;
               break;
            }
    }else {
    pago_por_hora = horas_trabajadas * 35.99;
    }

            if(horas_trabajadas > 55){
                horas_extra = 15;
            pago_por_hora = horas_normales * 35.99;
            
switch(categoria){
    case 1: 
               pago_por_hora_extra = horas_extra * 40;
                              total = pago_por_hora_extra + pago_por_hora;
               break;
                          case 2: 
               pago_por_hora_extra = horas_extra * 50;
                              total = pago_por_hora_extra + pago_por_hora;
               break;
                          case 3: 
               pago_por_hora_extra = horas_extra * 85;
                              total = pago_por_hora_extra + pago_por_hora;
               break;
                          case 4: 
               pago_por_hora_extra = horas_extra * 0;
                              total = pago_por_hora_extra + pago_por_hora;
               break;
               

            }
            }
    System.out.println("---Recibo De Oficina---");
    System.out.println("Hola"+nombre + apellido);
    System.out.println("Usted Trabajo : "+horas_trabajadas+" Horas");
    System.out.println("Tuvo Un Total de : "+horas_extra+" Horas Extra");
    System.out.println("Su Paga Total Es : " + total + "Lps.");
}else{
    System.out.println("Introdujo Una Categoria Inexistente");
}
        }
        

       
        
    }

