package lab3p1_ayleenescobar;

import java.util.Scanner;

public class Lab3P1_AyleenEscobar {

    public static void main(String[] args) {
        
        boolean respuesta = true;
        
        Scanner sc = new Scanner(System.in);
        
        while (respuesta){
           System.out.println("Menu");
        System.out.println("1.Ejercicio 1");
        System.out.println("2.Ejercicio 2");
        System.out.println("3.Ejercicio 3");
        System.out.println("4.SALIR");
        System.out.println("Ingrese su opcion: "); 
        
        int opcion = 0;
        opcion = sc.nextInt();
        
        switch (opcion){
            case 1 : {
               System.out.print("Puntos a ingresar: ");
               int puntos = sc.nextInt();
               double calculo= 0;
               double distancia= 0;
               double X= 0;
               double Y= 0;
               double suma=0;
                for (int numx=1; numx<=puntos; numx++){
                    System.out.print("X: ");
                    X= sc.nextInt();
                    System.out.print("Y: ");
                    Y= sc.nextInt();
                    calculo = Math.pow((X-Y),2);
                    suma += calculo ;
                }
                distancia = Math.sqrt(suma);
                System.out.println("La distancia euclidiana es: "+ distancia);
            }
            break;
            
            case 2: {
                System.out.print("Ingrese N: ");
                int N = 0;
                N = sc.nextInt();
                while (N <= 0){
                    System.out.println("NUMERO NO VALIDO.(Debe ser mayor que cero.)");
                    System.out.print("Ingrese N: ");
                    N = sc.nextInt();
                }
                for(int fila = 1; fila<=N;fila++){
                    for(int columna =1; columna<=(N*2)-1;columna++){
                        if(fila==1 || fila ==N || columna ==1 || columna== (N*2)-1){
                           System.out.print("*");
                        }else if (fila==(N/2)+1){
                            System.out.print("#");
                            }else if (fila ==(N/2)-1){
                                }else if (fila ==((N/2)-1)/3 && columna ==(N*2)/3){
                                    System.out.print("#");
                                    }else{System.out.print(" ");
                        }
                    }
                    System.out.println("");
                }
            }
            break;
            
            case 3 :{
                System.out.print("Ingrese su año de nacimiento: ");
                int nacimiento = 0;
                nacimiento = sc.nextInt();
                if (nacimiento>=2013 && nacimiento<=2025){
                    System.out.println("¡Felicidades usted es de la Generación Alpha!");
                    }else if (nacimiento>=1990 && nacimiento<=2012){
                            System.out.println("¡Felicidades usted es de la Generación Z!");
                            }else if (nacimiento>=1980 && nacimiento<=1994){
                                    System.out.println("¡Felicidades usted es de la Generación Millenials!");
                                    }else if (nacimiento>=1975 && nacimiento<=1985){
                                            System.out.println("¡Felicidades usted es de la Generación Xennials!");
                                            }else if (nacimiento>=1960 && nacimiento<=1979){
                                                    System.out.println("¡Felicidades usted es de la Generación X!");
                                                    }else if (nacimiento>=1946 && nacimiento<=1964){
                                                            System.out.println("¡Felicidades usted es de la Generación Baby Boomer!");
                                                            }else{
                                                                System.out.println("DATOS NO VALIDOS");
                                                            }
                                                    }
                                            
            break;
            
            case 4:{
               respuesta = false; 
            }
            break;
            
            default:
                System.out.println("NUMERO NO VALIDO.");
                break;
        }
        }
   
        
    }
    
}
