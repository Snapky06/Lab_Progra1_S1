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
public class Napky_Rajo4 {
    public static void main(String[]args){
        
        //a
        System.out.println("Bienvenido al Solucionador de Equaciones");
        int a1 = 3;
                int a2 = 2;
                        int a3 = 4;
                                int a4 = 3;
                                
                                System.out.println("Ejercicio A " + a1/a2 + a3/a4);
                                
                                double valora,valorb,valorc,valord,valore,valorm,valorn,valorp,valorr,valors,valorq,valorh,valorx,valorj,valory,valorf,valorg  ;
                                double respuestaa,respuestab,respuestac,respuestad,respuestae,respuestaf,respuestag,respuestah,respuestai,respuestaj,respuestak ; 
                                Scanner sr = new Scanner(System.in);
                                
                                //b
                                
                                System.out.println("Ingrese los valores de x, y:");
                                 valorx = sr.nextDouble();
                                 valory = sr.nextDouble();
                                respuestaa = (1 / (valorx-5)) - (3*valorx*valory) / 4;
                                 
                                   System.out.println("Ejercicio B " + respuestaa);
                                   
                                  respuestab = (1 / 2 + 7);
                                
                                     System.out.println("Ejercicio C " + respuestab);
                                     
                                     respuestac = (7 + 1/2);
                                     
                                      System.out.println("Ingrese los valores de a, b, c, d, e, f, g, h, j:");
                                 valora = sr.nextDouble();
                                 valorb = sr.nextDouble();
                                 valorc = sr.nextDouble();
                                 valord = sr.nextDouble();
                                 valore = sr.nextDouble();
                                 valorf = sr.nextDouble();
                                 valorg = sr.nextDouble();
                                 valorh = sr.nextDouble();
                                 valorj = sr.nextDouble();
                                
                                 respuestad = (valora*valora / (valorb-valorc) + (valord-valore) / valorf - (valorg*valorh) / valorj);
                                 
                     System.out.println("Ejercicio E: " + respuestad);
                     
                     System.out.println("Ingrese los valores de m,n,p:");
                                 valorm = sr.nextDouble();
                                 valorn = sr.nextDouble();
                                 valorp = sr.nextDouble();
                     
                                 respuestae = (valorm / valorn + valorp);
                                 System.out.println("Ejercicio F: " + respuestae);
                                 
                                 System.out.println("Ingrese el valor de q");
                                 valorq = sr.nextDouble();
                                 
                                 respuestaf = (valorm + valorn / (valorp-valorq));
                                 
                                     System.out.println("Ejercicio G: " + respuestaf);
                     
                                     respuestag= ((valora*valora) / (valorb*valorb) + (valorc*valorc) / (valord*valord));
                                
                                     
                              System.out.println("Ejercicio H: " + respuestag );   
                              
                                        System.out.println("Ingrese el valor de n,r,s");
                                
                                  valorr= sr.nextDouble();
                                  valors= sr.nextDouble();
                                  
                                  respuestah = ((valorm + valorn)/ valorp / valorq - valorr/ valors );
                                  
                                     System.out.println("Ejercicio I " + respuestah );  
                                  
                                     respuestai = ((3*valora + valorb) / valorc - (valord + 5*valore) / valorf + valorg / 2*valorh);
                                             
                                      System.out.println("Ejercicio I: " + respuestai );  
                                      
                                      respuestaj = (valora*valora + 2*valora*valorb + valorb*valorb / 1/valorx*valorx + 2);
                                      System.out.println("Ejercicio K: " + respuestaj );  
                                      
                                      System.out.println(Finalizado);
                                      
                                      
                                     
                                  
                                  
                                  
                     
                                
                                
    }
}
