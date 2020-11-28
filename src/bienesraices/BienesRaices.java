package bienesraices;

import controllers.RegistrarCliente;
import controllers.ValidadoresCliente;

/**
 *
 * @author A71A5
 */
public class BienesRaices {

    public static void main(String[] args) {
        RegistrarCliente rc = new RegistrarCliente();
        
        //objeto validacion
        ValidadoresCliente validador = new ValidadoresCliente();
        validador.RegistrandoCliente();
        validador.validar_edad(rc.getEdad());
        System.out.println(rc.getEdad());
        
        //Registrar al cliente
        
        // validar los datos del cliente
        
        //Informar al cliente sus opciones de compra de ser validado
    }
    
}
