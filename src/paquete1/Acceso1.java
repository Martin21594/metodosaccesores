
package paquete1;


public class Acceso1 {
    
     private int edad;
     private double altura=35;
     private String nombre;
     private double peso;
     
                public void setEdad(int e){  
                edad=e;
                 }//asigna el valor al atributo para llamarlo desde otra clase.
                
                 public int getEdad(){
                 return edad;
                 }//devuelve el valor del atributo cuando llamas de otra clase.
      
                
                public void setnombre(String e){
                nombre=e;
                 }//asigna el valor al atributo para llamarlo desde otra clase.
     
                public String getnombre(){
                return nombre;
                 }//devuelve el valor del atributo cuando llamas de otra clase.
                
                
                public void setaltura(double e){
                    altura=e;
                }
                public double getaltura(){
                    return altura;
                }
                
                
                public void setpeso(double e){
                    peso=e;
                }
                public double getpeso(){
                    return peso;
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
