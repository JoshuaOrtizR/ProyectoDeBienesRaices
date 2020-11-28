
import java.util.Scanner;
import productos.Casa;

/*
 Clase de prueba para hacer el llamado a la clase casa
llenar sus atributos y ocupar sus comportamiento
 */

public class Tests_llamar_casa {
    public static void main(String[] args) {
        
         Scanner i = new Scanner (System.in);
         Scanner p = new Scanner (System.in);
         Scanner leer = new Scanner(System.in);
         
         boolean logintrue = true;
         
     String ubicacion;
     float precio_casa;
     float plusvalia;
     boolean estado;
     float perimetro;
     String descripcion;
     float precio_taxes;
    
     
        System.out.println("Cual es la ubicacion de la casa?\n");
        ubicacion = i.nextLine();
        System.out.println("Cual es el precio de la casa?\n");
        precio_casa = p.nextFloat();
        System.out.println("Cual es el precio de la plusvalia?\n");
        plusvalia = p.nextFloat();
        System.out.println("Cual es el estado de la casa?\n");
        estado = p.nextBoolean();//1 o 0
        System.out.println("Cual es el perimetro de la casa?");
        perimetro = p.nextFloat();
        System.out.println("Ingrese descripcion de la casa?");
        descripcion = i.nextLine();
        System.out.println("Ingrese precio de los taxes");
        precio_taxes = p.nextFloat();
        
     //Creacion del objeto     
         Casa casita = new Casa();
        
         
    casita.setUbicacion(ubicacion);                
    System.out.println("La ubicacion de la casa es:"+ubicacion);
    
    casita.setPrecio_casa(precio_casa);
    System.out.println("El precio de la casa es: "+
            casita.getPrecio_casa() + logintrue);
        
      
    }
}
