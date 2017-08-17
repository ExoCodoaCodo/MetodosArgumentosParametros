/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinargumentos;
import java.util.Scanner;
/**
 *
 * @author jose.zapatagom
 */
public class Calculador {
    
    int numero1;
    int numero2;
    int sumar;
    int restar;
    
    
    public void pedirdatos(){
    
    Scanner objetoscanner = new Scanner(System.in);// se crea un objeto de la clase Scanner para usar el metodo de ingreso por telclado
    
        System.out.print("Ingrese el primer numero: ");
    numero1= objetoscanner.nextInt();//metodo para ingreso de teclado en esta ocacion lo guarda en la variable global numero1
    System.out.print("Ingrese el Segundo numero: ");
    numero2= objetoscanner.nextInt();
    
    
    
    }
        
    public void sumar(){
    
    sumar= numero1 + numero2;
    
    
    }
    
    public void mostrardatos(){
    
        System.out.println("El total de la suma es: "+sumar);
    
    
    
    }
    
    
    public static void main(String []args){
    
    Calculador calculo1 = new Calculador();
        
        calculo1.pedirdatos();
        calculo1.sumar();
        calculo1.mostrardatos();
    
    
    
    
    }
    
}
