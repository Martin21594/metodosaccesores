/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author Español
 */
public class Principal {
    
    
        public static void main(String [] args){
    
            Acceso1 objeto1 = new Acceso1();//crea el ojeto
            objeto1.setEdad(15);//da el valor al set creado en Acceso1
            System.out.println("su edad es: "+objeto1.getEdad());//informa desde Acceso1
             
    objeto1.setpeso(65);//da el valor al set creado en Acceso1
            System.out.println("su peso es: "+objeto1.getpeso());//informa desde Acceso1
          
          objeto1.setaltura(1.70);//da el valor al set creado en Acceso1
            System.out.println("su altura es: "+objeto1.getaltura());//informa desde Acceso1
            
            objeto1.setnombre("pepito");//da el valor al set creado en Acceso1
            System.out.println("su nombre es: "+objeto1.getnombre());//informa desde Acceso1
         
            
    }
       
}
