/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana_1;

/**
 *
 * @author saidn
 */
public class Napky_Rajo3 {
    public static void main(String[]args){
    
        double CC6 = 0.30, CC10 = 0.25, CC2 = 0.80;
        double CT6 = 30, CT10 = 25, CT2 = 80;
        double TISV, ISV, PROM, CTF;
        
        PROM = (CC6*CT6)+(CC10*CT10)+(CC2*CT2)/180;
        CTF = (CC6*CT6)+(CC10*CT10)+(CC2*CT2);
        ISV = (CTF * 0.16);
                TISV = (CTF + ISV);
                
                System.out.println("Su promedio es de : " +String.format("%.2f",PROM));
                System.out.println("Su Impuesto es de : " + ISV);
                System.out.println("Su Impuesto Total es de : " +String.format("%.2f",TISV));
    }
}
