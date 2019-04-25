/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostracion;
import java.util.Scanner;
/**
 *
 * @author juanyanza11
 */
public class Principal {
   
    public static void main (String[] args){
    
        double valor;
        double add;
        double cadd;
        int nmen; 
        valor = 3;
        double piva;
        double ptotal;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese el número de mensajes enviados");
        nmen= entrada.nextInt();
       
        if (nmen==40){
            valor = valor*0.12 +valor;
            System.out.printf("Su valor a pagar es: %.3f\n",valor);}else{
            if (nmen>40 && nmen<=200){
                add =nmen-40;
                cadd=add*0.05;
                
                piva= (3+cadd)*0.12;
                ptotal=(3+cadd)+piva;
                
                // muestra de datos en pantalla
                System.out.printf("Su valor a pagar es: %.3f\n",ptotal);
                }else{
                if (nmen>200){
                // calculos con iva
                    add=nmen-200;
                    cadd=add*0.10;
                
                piva= (3+cadd)*0.12;
                ptotal=(3+cadd)+piva;
                
                System.out.printf("Su valor a pagar es: %.3f\n", ptotal);
                    }
                }
            }
        }
    
    }
            
           
            
    
     