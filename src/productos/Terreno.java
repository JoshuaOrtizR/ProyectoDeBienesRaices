/*
clase para producto terreno
 */
package productos;

/**
 *
 * @author A71A5
 */
public class Terreno {
    
    private String ubicacion;
    private float preciot;
    private float plusvalia;
    private boolean estado;
    private float perimetro;
    private String descripcion;
    private float precio;

    public Terreno(String ubicacion, float preciot, float plusvalia, boolean estado, float perimetro, String descripcion, float precio) {
        this.ubicacion = ubicacion;
        this.preciot = preciot;
        this.plusvalia = plusvalia;
        this.estado = estado;
        this.perimetro = perimetro;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Terreno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public float getPreciot() {
        return preciot;
    }

    public void setPreciot(float preciot) {
        this.preciot = preciot;
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

    public boolean getEstado() {
        return estado;
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
       String DatosTerreno;
       DatosTerreno = this.getUbicacion() + "\n" + 
               this.getPrecio() + "\n" +
               this.getPlusvalia() + "\n" +
               this.getEstado() + "\n" +
               this.getPerimetro();
              
    return DatosTerreno;   
    }
}
