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
public class Napky_Said1_Clases {

    public static void main(String[]args){


        Scanner leer = new Scanner(System.in);

           System.out.println("Bienvenido A la Institucion De Ingles");
           System.out.println("Ingrese La Fecha (DIA/DD/MM): ");

 String fecha = leer.nextLine();
 
 int slash1 = fecha.indexOf("/");
 int slash2 = fecha.indexOf(("/"),slash1 + 1);
 
 String dia_semana = fecha.substring(0,slash1).trim().toLowerCase();
         
 String dia_del_mes = fecha.substring(slash1 + 1, slash2).trim();
 int dia = Integer.parseInt(dia_del_mes);
 
 
 String mes1 = fecha.substring(slash2 + 1).trim();
 int mes = Integer.parseInt(mes1);
 
 boolean dias_permitidos = dia_semana == ("lunes") || dia_semana == ("martes") ||
 dia_semana == ("miercoles") || dia_semana == ("jueves") || dia_semana == ("viernes");

 

if(dia < 1 && dia > 31 && mes < 1 && mes > 12){
    System.out.println("Se Produjo Un Error En El Programa");
}

    if(dia_semana.equals("lunes")){
        System.out.println("Hubo examenes? (si/no) : ");
        String examen = leer.nextLine().toLowerCase();
        if(examen.equals("si")){
            System.out.println("Cuantos Aprobaron : ");
            int si_aprobo = leer.nextInt();
            System.out.println("Cuantos No Aprobaron : ");
           int no_aprobo = leer.nextInt();
           int total = si_aprobo + no_aprobo;
           double promedio = (si_aprobo * 100)/total;
            System.out.print("Promediado De Aprobados : " + promedio + "%");
        }
        
                }
    if(dia_semana.equals("martes")){
        System.out.print("Hubo examenes? (si/no) : ");
        String examen = leer.nextLine().toLowerCase();
        if(examen.equals("si")){
            System.out.print("Cuantos Aprobaron : ");
            int si_aprobo = leer.nextInt();
            System.out.print("Cuantos No Aprobaron : ");
           int no_aprobo = leer.nextInt();
           int total = si_aprobo + no_aprobo;
           double promedio = (si_aprobo * 100)/total;
            System.out.print("Promediado De Aprobados : " + promedio + "%");
        }else {
            System.out.println("No Hubo Examenes");
        }
        
                }
    if(dia_semana.equals("miercoles")){
        System.out.print("Hubo examenes? (si/no) : ");
        String examen = leer.nextLine().toLowerCase();
        if(examen.equals("si")){
            System.out.print("Cuantos Aprobaron : ");
            int si_aprobo = leer.nextInt();
            System.out.print("Cuantos No Aprobaron : ");
           int no_aprobo = leer.nextInt();
           int total = si_aprobo + no_aprobo;
           double promedio = (si_aprobo * 100)/total;
            System.out.print("Promediado De Aprobados : " + promedio + "%");
        }
        
                }
    if(dia_semana.equals("jueves")){
        System.out.print(" Asistencias : ");
        int asistencia = leer.nextInt();
        if (asistencia > 50){
            System.out.println("Asistio La Mayoria");
        }
        if(asistencia<50){
            System.out.println("No Asistio La Mayoria");}
    }
        
                
    if(dia_semana.equals("viernes")){

        
                if (dia == 1 && mes == 7) {
            System.out.println("Comienzo De Nuevo Ciclo");
            System.out.print("Cantidad De Alumnos : ");
            int alumnos = leer.nextInt();
            System.out.println("Precio Por Alumnos ($): ");
            double precio = leer.nextDouble();
            double ingresos = alumnos * precio;
            System.out.println("Ingreso Total Del Ciclo $" + ingresos);
        } else {
        
            System.out.println("Clase Para Los Viajeros");
        }
                
        if (dia == 1 && mes == 1) {
            System.out.println("Comienzo De Nuevo Ciclo");
            System.out.print("Cantidad De Alumnos : ");
            int alumnos = leer.nextInt();
            System.out.print("Precio Por Alumnos ($): ");
            double precio = leer.nextDouble();
            double ingresos = alumnos * precio;
            System.out.print("Ingreso Total Del Ciclo $" + ingresos);
        } else {
        
            System.out.println("Clase Para Los Viajeros");
        }
                }
    
}
    }

