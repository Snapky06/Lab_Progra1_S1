/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana_3;

import java.util.Scanner;

/**
 *
 * @author saidn
 */
public class Napky_Said_Estructura {

    public static void main(String[] args) {

        //Variables
        int cantidad = 0, largo = 0, numero = 0, sumaDivisores = 0, divisor_primo = 0;
        int codigo=0,voto_total=0;
        String palabra = "", invertida = "", palabra2 = "",palabramax="";
        boolean esPerfecto = false, esPrimo = false;
       int cantidad_azul = 0, cantidad_amarillo = 0, cantidad_rojo = 0, cantidad_negro = 0, cantidad_nulo = 0;
        int opcion1=0, opcion2=0 , opcion3=0, opcion4=0,palabra4=0;
        
        
        //Repeticion
        do {
                System.out.println("1- Palabra Alreves");
                System.out.println("2-Numero Perfecto");
                System.out.println("3- Primos");
                System.out.println("4- Votaciones");
                System.out.println("5-Salir");
                System.out.print("Seleccione (1,2,3,4 O 5) : ");

        Scanner leer = new Scanner(System.in);
        
        codigo = leer.nextInt();
            switch (codigo) {
                //PRIMER CODIGO
            case 1:
                opcion1++;
                System.out.println("Ingrese La Cantidad De Palabras");
                cantidad = leer.nextInt();

                for (int repeticiones = 0; repeticiones < cantidad; repeticiones++) {

                    System.out.print("Ingrese Una Palabra : ");

                    palabra = leer.next();

                    largo = palabra.length();
                    
                    if(largo>palabra4){
                    palabra4 = largo;
                    palabramax = palabra;
                    }

                    for (int i = largo - 1; i >= 0; i--) {
                        invertida += palabra.charAt(i);
                    }

                    System.out.println("Palabra Invertida : " + invertida);

                    palabra2 = invertida;

                    if (palabra.equals(palabra2)) {
                        System.out.println("Es Palindromo");
                    }
                    invertida="";

                }
                    System.out.println("La Palabra Mas Grande Es : " + palabramax);
                break;

            case 2:
                //SEGUNDO CODIGO
                opcion2++;
                System.out.println("Ingrese Un Numero : ");

                numero = leer.nextInt();

                for (int divisor = 1; divisor < numero; divisor++) {
                    if (numero % divisor == 0) {
                        sumaDivisores += divisor;
                    }
                }

                if (sumaDivisores == numero) {
                    System.out.println("Es Perfecto");
                } else {
                    System.out.println("No Es Perfecto");
                }

                break;

            case 3:
                //TERCER CODIGO
opcion3++;
                int Numero_Random = (int) (Math.random() * 100) + 1;
                esPrimo = true;

                for (int divisor = 2; divisor < Numero_Random; divisor++) { 
                    if (Numero_Random % divisor == 0) {
                        esPrimo = false; 
                    } 
                }

                if (esPrimo == false) {
                    System.out.println("Este Numero No Es Primo : " + Numero_Random);
                }

                if (esPrimo) {
                    System.out.println("Primo " + Numero_Random + " Porque Solo Tiene Dos Divisores");
                    System.out.println("Divisores De " + Numero_Random + " Son : 1 y " + Numero_Random);
                }

                break;

            case 4:
                //CUARTO CODIGO
                opcion4++;
                System.out.println("Cuantos Votantes Hay En El Pais : ");
                int cantidad_votantes = leer.nextInt();
                
                for(int repeticiones_votos = 0;repeticiones_votos<cantidad_votantes;repeticiones_votos++){
                    System.out.print("Por Quien Votara Azul,Rojo,Negro o Amarillo: ");
                    
                    String voto = leer.next();
                    
                    switch(voto){
                        case "Azul" :
                            cantidad_azul++;
                            break;
                            
                            case "Rojo" :
                            
                                cantidad_rojo ++;
                                
                            break;
                            
                            case "Negro" :
                            
                                cantidad_negro ++;
                                
                            break;
                            
                            case "Amarillo" :
                            
                            cantidad_amarillo ++;
                                
                            break;
                            
                            default : 
                                cantidad_nulo++;    
                                    break;
                    }
                    }
                
                    //Calculos
                    voto_total = cantidad_azul + cantidad_rojo + cantidad_negro + cantidad_amarillo ;
                    
                    if(voto_total/cantidad_votantes >= 0.60){
                        
                    if(cantidad_azul > cantidad_rojo &&  cantidad_azul > cantidad_negro && cantidad_azul > cantidad_amarillo ){
                        System.out.println("Gano El Azul ");
                    } else if(cantidad_rojo > cantidad_azul && cantidad_rojo > cantidad_negro && cantidad_rojo > cantidad_amarillo ){
                        System.out.println("Gano El Rojo");
                    }else if(cantidad_amarillo > cantidad_azul && cantidad_amarillo > cantidad_negro && cantidad_amarillo > cantidad_rojo ){
                        System.out.println("Gano El Amarillo");
                    }else if(cantidad_negro > cantidad_azul && cantidad_negro > cantidad_rojo && cantidad_negro > cantidad_amarillo ){
                        System.out.println("Gano El Negro");
                    }else{
                        System.out.println("No Hay Claro Ganador");
                    }
                    
                    
                    }else{
                        System.out.println("Insuficiente Participacion");
                    }
                
        }
            //Final del do
        }while(codigo!=5);
        
        //IMPRESION DE ENTRADAS
        System.out.println("Entro " + opcion1 + " A la Primera Opcion");
        System.out.println("Entro " + opcion2 + " A la Segunda Opcion");
        System.out.println("Entro " + opcion3 + " A la Tercera Opcion");
        System.out.println("Entro " + opcion4 + " A la Cuarta Opcion");
    }
}
