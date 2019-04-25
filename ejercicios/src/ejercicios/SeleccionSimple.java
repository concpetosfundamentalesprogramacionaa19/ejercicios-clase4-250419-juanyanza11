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
    System.out.printf("Usted está aprobado con: %d",calificacion);
    System.out.printf("%s %d\n",mimensaje,calificacion);}
    
    
    int calificacion_2=45;
    
    if (calificacion_2>=85){
        System.out.printf("Usted está aprobado con: %d",calificacion_2);
        System.out.printf("%s %d\n" ,mimensaje, calificacion_2);
        }
    }
}
