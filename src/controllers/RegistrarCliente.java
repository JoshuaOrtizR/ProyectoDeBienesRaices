/*
 Clase para registrar todos los datos pertinentes al cliente y devolver edad
 para ser validada luego.
 */
package controllers;

import java.util.Scanner;

/**
 *
 * @author A71A5
 */
public class RegistrarCliente {
    
     //Creacion del objeto  
 Scanner i=new Scanner (System.in);
 Scanner p=new Scanner (System.in);
 Scanner leer = new Scanner(System.in);
 
 
  //definicion de variables
  protected String nombre; 
  protected String direccion; 
  protected String fecha;
  protected String n_dui;
  protected String profesion;
  protected String LugardeTrabajo; 
  protected String tel;
  protected int edad;
  protected int deuda;
  protected int PreCalificacionBancaria; 
  protected double salario; 
  
  public String msg = "Bienvenido a HomePlace.com\n"
          + "Nuestra compañía le ofrece las mejores casas, lotes, terrenos "
          + "\n a precios comodos; que ningun otro le puede ofrecer.\n "
          + "Porfavor llenar el siguiente formulario.\n";
  //registrando cliente
  public int RegistrandoCliente(){
  
      System.out.println(msg);
      
      System.out.println("ingrese su Nombre completo:\n");
      nombre = i.nextLine();
      
      System.out.println("Ingrese su Edad:\n");
      edad = p.nextInt();
      
      System.out.println("Ingrese su fecha de nacimiento:\n");
      fecha = i.nextLine();
      
      System.out.println("Ingrese su numero de DUI:\n");
      n_dui = i.nextLine();
      
      System.out.println("Ingrese su Direccion:\n");
      direccion = i.nextLine();
      
      System.out.println("Ingrese su numero de telefono:\n");
      tel = i.nextLine();
      
      System.out.println("Profesión u oficio:\n");
      profesion = i.nextLine();
      
      System.out.println("Lugar de trabajo:\n");
      LugardeTrabajo = i.nextLine();
      
      System.out.println("Ingrese su salario devengado en dolares americanos $: \n");
      salario = p.nextDouble();
      
      System.out.println("¿Posee deudas bancarias?\n Escriba 1 para SI y 2 para NO\n");
      deuda = leer.nextInt();
      
      System.out.println("¿Tine precalificación Bancanria?, Escriba 1 para SI y 2 para NO\n");
      PreCalificacionBancaria = leer.nextInt(); 
      
      //muestra datos ingresados por el usuario
      System.out.println("Datos guardados con exito\n Nombre del cliente: " + this.nombre 
              + "\nEdad: " + this.edad + "\nDireccion: " + this.direccion + "\nProfresion: "+ this.profesion
              + "\nLugar de trabajo: " + this.LugardeTrabajo + "\nSalario: " + this.salario + "$");
      return edad;//retornamos edad para tomarla y pasarla como parametro para validarla en clase calidadores
  }//cierre de metodo Registrodelcliente

  //Get para poder traer datos desde otras clases
    public int getEdad() {
        return edad;
    }
    public int getDeuda(){
        return deuda;
    }
    public int getPrecalifacionBancaria(){
        return PreCalificacionBancaria;
    }
}
