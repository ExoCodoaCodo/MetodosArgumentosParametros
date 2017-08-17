/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conargumentos;

import java.util.Scanner;


/**
 *
 * @author jose.zapatagom
 */
public class Calculador2 {
    
      int numero1;
    int numero2;
    int sumar;
    int restar;
    
        
    public void sumar(int a, int b){
    
    sumar= a + b;
    
    
    }
    
    public void mostrardatos(){
    
        System.out.println("El total de la suma es: "+sumar);
    
    
    
    }
    
    
    public static void main(String []args){
    
    Calculador2 calculo1 = new Calculador2();
        
        Scanner objetoscanner = new Scanner(System.in);// se crea un objeto de la clase Scanner para usar el metodo de ingreso por telclado
    
        System.out.print("Ingrese el primer numero: ");
    calculo1.numero1= objetoscanner.nextInt();//metodo para ingreso de teclado en esta ocacion lo guarda en la variable global numero1
    System.out.print("Ingrese el Segundo numero: ");
    calculo1.numero2= objetoscanner.nextInt();
    
    
    
    
    
        calculo1.sumar(calculo1.numero1,calculo1.numero2);
        calculo1.mostrardatos();
    
    
    
    
    }
    
    
    
    
}
