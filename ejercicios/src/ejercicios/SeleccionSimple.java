package ejercicios;


import java.util.Scanner;
import paquetedos.*;
/**
 *
 * @author juanyanza11
 */
public class SeleccionSimple {
   
 
    
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
    
    int califacion_2=45;
    
    if (calificacion>=85){
        System.out.printf("%s %d\n" ,mimensaje, calificacion);
        }
    }
}
