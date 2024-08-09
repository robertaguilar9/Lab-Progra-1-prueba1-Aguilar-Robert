/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aguilar_robert_prueba1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Selvin Aguilar
 */
public class Aguilar_Robert_Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea=new Scanner(System.in);
        Random random=new Random();
        
        //Usamos while para crear el menu y que se repita
        while (true){
            //Creamos el bloque de texto para el Menu
            System.out.println("-----Bienvenido a la Prueba#1 del Lab de Progra_1-----"+
                    "\n1. Palabras al Reves"+
                    "\n2. Numero Perfecto"+
                    "\n3. Primos"+
                    "\n4. Votaciones"+
                    "\n5. Salida"+
                    "\n-Selecciona una opcion:");
            int menu=lea.nextInt();

            if (menu==1){

                //Creamos las Variables
                String palabra_reves=" ";
                System.out.println("Ingresa una palabra: ");
                String palabra=lea.next();

                //Usamos For para tener la palabra al reves
                for(int i=palabra.length() -1;i>=0;i--){
                    palabra_reves+=palabra.charAt(i);
                }

                //Imprimimos la palabra al reves
                System.out.println("La palabra al reves es: "+palabra_reves);
                System.out.println("                                 ");
                }

            else if(menu==2){

                //Pedimos el ingreso del numero que se desea saber si es perfecto
                System.out.println("Ingresar numero entero: ");
                int num=lea.nextInt();

                //Saber la suma de los divisores del numero
                int suma_divisores=0;
                for (int i=1;i<num;i++){
                    if (num % i==0){
                        suma_divisores+=i;
                    }
                }
                //Definimos si es numero perfecto o no
                if (suma_divisores==num){
                    System.out.println(num+" es un numero perfecto !!!");
                    System.out.println("                  ");
                } else {
                    System.out.println(num+" no es un numero perfecto :(");
                    System.out.println("                  ");
                }
            
            }
            
            else if(menu==3){
                
                //Usamos random para que elija un numero al azar
                int num_random=random.nextInt(100)+1;
                
                //Crear variables de los divisores
                int divisores=0;
                String lista_divisores="";
                
                //Verificamos cuantos divisores tiene el numero
                int i=1;
                
                while (i<=num_random){
                    if (num_random % i == 0){
                        divisores++;
                        if (lista_divisores.equals("")){
                            lista_divisores=Integer.toString(i);
                        } else{
                            lista_divisores += " y "+i;
                        }
                    }
                    i++;
                }
                
                //Verificamos si es un numero primo
                if (divisores==2){
                    System.out.println("Primo " + num_random + " porque solo tiene dos divisores");
                } else{
                    System.out.println("El numero "+ num_random + " no es primo");
                }
                
                //Usamos print para mostrar los divisores
                System.out.println("Divisores de "+ num_random + " son: " + lista_divisores);
                System.out.println("                  ");
  
            }else if (menu==4){
                
                //Pedimos el numero de Habitantes
                System.out.println("Ingrese la cantidad de votantes del Pais: ");
                int cant_hab=lea.nextInt();
                
                //Crear variables
                int rojo=0,azul=0,negro=0,amarillo=0,nulo=0,inicio=0,ganador=0;
                
                //Usar while para que el conteo no se detenga hasta llegar a la cantidad de habitantes
                while (cant_hab>=inicio){
                    inicio+=1;
                    System.out.println("Ingrese el siguiente voto: ");
                    String voto=lea.next().toLowerCase();
                    if (voto=="Rojo"){
                        rojo=rojo+1;
                    } else if(voto=="Azul"){
                        azul+=1;
                    } else if(voto=="Amarillo"){
                        amarillo+=1;
                    } else if(voto=="Negro"){
                        negro+=1;
                    } else {
                        nulo+=1;
                    }
                }
                
                //Definir el candidato ganador
                if (rojo>azul && rojo>amarillo && rojo>negro){
                  ganador=rojo;  
                } else if (azul>rojo && azul>amarillo && azul>negro){
                  ganador=azul;
                } else if (amarillo>rojo && amarillo>azul && amarillo>negro){
                  ganador=amarillo;
                } else if (negro>rojo && negro>amarillo && negro>azul){
                  ganador=negro;
                }
                
                //Comprobar la cantidad de los votos y sacar el ganador si tiene 60% o mas
                int votos_acertados=rojo+azul+amarillo+negro;
                double validar_ganador=votos_acertados*0.6;
                
                if (votos_acertados>validar_ganador){
                    System.out.println("El Candidato ganador es: "+ganador);
                    System.out.println("                   ");
                } else{
                    System.out.println("La votacion fue fallida.");
                    System.out.println("                   ");
                }
            
            } else{
                break;
            }
        }
    }
}

        
    
    

