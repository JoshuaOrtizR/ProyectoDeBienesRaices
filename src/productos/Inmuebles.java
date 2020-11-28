/*
    Clase para instaciar los productos vienes raices en venta
 */
package productos;

/**
 *
 * @author A71A5
 */
public class Inmuebles {
    private Casa casas;
    private Terreno terrenos;
    private Lote lotes;
    private String Descripcion;//debe llenarse con la descripcion de cada obj
    private float precio;// debe llenarse con el precio de cada objeto

    public Inmuebles(Casa casas, Terreno terrenos, Lote lotes, String Descripcion, float precio) {
        this.casas = casas;
        this.terrenos = terrenos;
        this.lotes = lotes;
        this.Descripcion = Descripcion;
        this.precio = precio;
    }

    public Casa getCasas() {
        return casas;
    }

    public void setCasas(Casa casas) {
        this.casas = casas;
    }

    public Terreno getTerrenos() {
        return terrenos;
    }

    public void setTerrenos(Terreno terrenos) {
        this.terrenos = terrenos;
    }

    public Lote getLotes() {
        return lotes;
    }

    public void setLotes(Lote lotes) {
        this.lotes = lotes;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    
}
