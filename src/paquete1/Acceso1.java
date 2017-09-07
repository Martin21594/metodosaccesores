
package paquete1;


public class Acceso1 {
    
     private int edad;
     private double altura=35;
     static String nombre;
     private double peso;
     
                public void setEdad(int e){  
                edad=e;
                 }
     
                public int getEdad(){
                return edad;
                 }
      
    
            public static void main(String [] args){
    
            Acceso1 obj1 = new Acceso1();
           
    
            obj1.edad=15;
            obj1.nombre="juan";
            obj1.altura=1.5;
            obj1.peso=65;
        
            Acceso1 obj2= new Acceso1();
            obj2.edad=22;
            obj2.nombre="pepito";
            obj2.altura=1.7;
            obj2.peso=75;
        
                System.out.println(obj1.nombre.toUpperCase());
                System.out.println(obj2.nombre.toUpperCase());
                
                
                
    }
    
}
