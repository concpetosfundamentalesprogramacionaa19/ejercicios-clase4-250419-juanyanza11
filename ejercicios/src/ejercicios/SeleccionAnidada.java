/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import paquetedos.*;
/**
 *
 * @author ADMIN-HP
 */
public class SeleccionAnidada {
    
    public static void main (String[] args){
    
    int calificacion = 50;
    String exc= Operacion2.excelente;
    String mb= Operacion2.muybuena;
    String reg= Operacion2.regular;
    String rep= Operacion2.reprobado;
        if (calificacion>=90){
        System.out.printf("Usted está aprobado (excelente) con %d\n",calificacion);
        System.out.printf("%s %d\n",exc,calificacion);
        
    }else{
            if(calificacion <90 && calificacion >=80){
                System.out.printf("Usted está aprobado (muy buena) con %d\n",calificacion);
                System.out.printf("%s %d\n",mb,calificacion);
            }else{
                if (calificacion<80 && calificacion >=50){
                    System.out.printf("Usted está aprobado (regular) con %d\n",calificacion);
                    System.out.printf("%s %d\n",reg,calificacion);
                }else{
                    System.out.printf("Usted está reprobado con %d\n",calificacion);
                    System.out.printf("%s %d\n",rep,calificacion);
                }
            }
        }
    }
}
