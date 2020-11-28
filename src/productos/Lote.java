/*
Clase para producto lote
 */
package productos;

/**
 *
 * @author A71A5
 */
public class Lote {
    
    private String ubicacion;
    private float precioc;
    private float plusvalia;
    private boolean estado;
    private float perimetro;
    private String descripcion;
    private float precio;

    public Lote(String ubicacion, float precioc, float plusvalia, boolean estado, float perimetro, String descripcion, float precio) {
        this.ubicacion = ubicacion;
        this.precioc = precioc;
        this.plusvalia = plusvalia;
        this.estado = estado;
        this.perimetro = perimetro;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public float getPrecioc() {
        return precioc;
    }

    public void setPrecioc(float precioc) {
        this.precioc = precioc;
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

     public String MuestreoDeLote(){
       String DatosLote;
       DatosLote = this.getUbicacion() + "\n" + 
               this.getPrecio() + "\n" +
               this.getPlusvalia() + "\n" +
               this.isEstado() + "\n" +
               this.getPerimetro();
              
    return DatosLote;   
    }
    
    
}
