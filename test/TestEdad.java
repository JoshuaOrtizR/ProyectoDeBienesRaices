/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import controllers.RegistrarCliente;
import controllers.ValidadoresCliente;
import productos.Casa;
import productos.Terreno;
/**
 *
 * @author A71A5
 */                  
//                    heredar andperson
public class TestEdad {
    
    
    public static void main(String[] args) {
     //crear objetos Registrar cliente y validadores del cliente
     //no es Strin, Int,Boolean,Float,Date
     //Tiene los datos del cliente
     
//tipo obj nombre   nuevo obj de tipo casa  
//Casa casita = new Casa("soyapango", 4, 0, true, 0, "bonita casa", 0);


     
     
     //valida al cliente extiende de registrar cliente
     //por tanto puedo tomar los datos del cliente registrado
     //desde la clase validadoresCliente
     ValidadoresCliente vc = new ValidadoresCliente();
     
       int edad_c = vc.getEdad();
       int deuda_c = vc.getDeuda();
       int pcb_c = vc.getPrecalifacionBancaria();
       
     //pedira datos para registrar cliente extendiendo de clase RegistrarCliente
     vc.RegistrandoCliente();
     //validando la edad del cliente      
        if ( vc.validar_edad(edad_c) == true) {
            //si es cierto pasamos a validar las deudas
            if (vc.validar_deudas(deuda_c) == true) {
                //si es cierto pasamos a validar la precalificacion bancaria
                if (vc.validar_PrecalificacionBancaria(pcb_c) == true) {
                     System.out.println("\nNuestras Casas son mas economicas.\n");
                     System.out.println("\nMire el catalago y escoja entre nuestras opciones.\n");
                }else if (vc.validar_PrecalificacionBancaria(pcb_c) == false){
                    System.out.println("No puede comprar una de nuestras casa hasta ser un cliente validado");
                }
            }else if(vc.validar_deudas(deuda_c) == false){
                System.out.println("No puede comprar una de nuestras casa hasta ser un cliente validado");
            }
            
        }else if(vc.validar_edad(edad_c) == false){
            System.out.println("No puede comprar una de nuestras casa hasta ser un cliente validado");
        }
     
       
     
     
    }
    
    

}
