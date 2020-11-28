/*
  Clase para producto el producto casa
 */
package productos;

/**
 *
 * @author ANGEL
 */
public class Casa {
    
    private String ubicacion ;
    private float precio_casa;
    private float plusvalia;
    private boolean estado;
    private float perimetro;
    private String descripcion;
    private float precio;
    
    //un metodo constructor es aquel que lleva el nombre de la clase
    //argumentos que pide constructor para ser utilizado
    //pide float,boolean,String
    public Casa() {
        this.ubicacion = ubicacion;
        this.precio_casa = precio_casa;
        this.plusvalia = plusvalia;
        this.estado = estado;
        this.perimetro = perimetro;
        this.descripcion = descripcion;
        this.precio = precio;
        
    }
    
    //comportamiento obtenerUbicacion
    // corazon/organo, sentimiento(amor), apodo
    //nombre de un metodo debe ser verboso 
    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public float getPrecio_casa() {
        return precio_casa;
    }

    public void setPrecio_casa(float precio_casa) {
        this.precio_casa = precio_casa;
    }

    public float getPlusvalia() {
        return plusvalia;
    }

    public void setPlusvalia(float plusvalia) {
        this.plusvalia = plusvalia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    //concatena en un String los datos del muestreo de la casa
   
    
    
}
