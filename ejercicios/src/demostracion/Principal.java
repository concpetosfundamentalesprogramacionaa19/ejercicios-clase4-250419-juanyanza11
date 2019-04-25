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
    
        int tarifa;
        double valor;
        double add;
        double cadd;
        int nmen; 
        valor = 3;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese el número de mensajes enviados");
        nmen= entrada.nextInt();
       
        if (nmen==40){
            System.out.printf("Su valor a pagar es: %.3f",valor);}else{
            if (nmen>40 && nmen==200){
                add =nmen-40;
                cadd=add*0.05;
                valor= 3+cadd;
                System.out.printf("Su valor a pagar es: %.3f",valor);
                }else{
                if (nmen>200){
                add=nmen-40;
                cadd=add*0.1;
                valor=3+cadd;
                System.out.printf("Su valor a pagar es: %.3f", valor);
                    }
                }
            }
        }
    
    }
            
           
            
    
     