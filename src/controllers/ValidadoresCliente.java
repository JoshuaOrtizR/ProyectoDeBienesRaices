/*
 Clase que valida al cliente en base a su edad, a sus deudas y 
 en base a su precalificacion bancaria
 */
package controllers;

/** clase 1
 * clase 2/extiende de clase 1
 * clase 3/extiende de clase 2
 * clase 4/extiende de clase 1
 *
 * @author A71A5
 */  
 //          |clase hijo  sub     |  clase padre       super     |
public class ValidadoresCliente extends RegistrarCliente {
    
    //variables publicas globales de esta clase
    public int edad_minima = 18;
    public int edad_maxima = 67;

    //validador de la edad del cliente, pide la edad para hacer validacion
    public boolean validar_edad(int edad_del_cliente) {
        
        if (edad >= edad_minima && edad <= edad_maxima) {
            System.out.println("|* Señor " + this.nombre + " ,califica por edad, pasemos a las deudas *|.\n");
            return true;
        } else {
            System.out.println("|* Señor " + this.nombre + " ,usted no califica como cliente *|.\n");
            return false;
        }

    }

    //validador de las deudas del cliente, pide la deuda como parametro para validarla
    public boolean validar_deudas(int deuda_del_cliente) {
        if (deuda == 1) {
            System.out.println("Señor " + this.nombre + " Lo sentimos no aplica para comprar una casa\n");
            System.out.println("Por favor comuníquese con su Banco\n");
            return false;
        } else {
            System.out.println(this.nombre + " Califica por falta de deudas, pasemos a la precalificaion bancaria\n");
            return true;
        }
    }

    //validador de precalificacion bancaria
    public boolean validar_PrecalificacionBancaria(int precalificacionbancaria) {
        if (PreCalificacionBancaria == 1) {
            System.out.println(this.nombre + " Usted es APTO para comprar una casa");
            return true;
        } else {
            precalificacionbancaria = PreCalificacionBancaria;
            System.out.println(this.nombre + " No aplica para comprar una casa");
            return false;

        }
    }

}
