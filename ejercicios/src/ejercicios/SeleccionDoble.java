/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;
import paquetedos.*;
/**
 *
 * @author juayanza11
 */
public class SeleccionDoble {
   
 public static void main (String[] args){
    // documentación
   
     Scanner entrada = new Scanner (System.in);
    
    int calificacion=85;
    String mimensaje= Operacion.mensaje;
    String mimensaje2=Operacion.mensaje2;
   
    // CONDICIONAL
    
    if (calificacion>=85){
        
    System.out.printf("%s %d\n",mimensaje,calificacion);
    
        }else{
    System.out.printf("%s %d\n",mimensaje2,calificacion);
    }
    
    int calificacion_2=45;
    
    if (calificacion_2>=85){
        System.out.printf("Usted está aprobado con: %d",calificacion_2);
        System.out.printf("%s %d\n" ,mimensaje, calificacion_2);
        }else{
        System.out.printf("Usted está reprobado con: %d",calificacion_2);
        System.out.printf("%s %d\n",mimensaje2,calificacion_2);
        }
    }
}
