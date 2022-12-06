
package taller.entidades;

/**
 *
 * @author canes
 */
public class Itemrepuesto {
    
    private Repuesto repuesto;
    private Reparacion reparacion;
    private int cantidad;
    private int id_itemrepuesto;

    public Itemrepuesto() {
    }

    public Itemrepuesto(Repuesto repuesto, Reparacion reparacion, int cantidad) {
        this.repuesto = repuesto;
        this.reparacion = reparacion;
        this.cantidad = cantidad;
    }

    public Itemrepuesto(Repuesto repuesto, Reparacion reparacion, int cantidad, int id_itemrepuesto) {
        this.repuesto = repuesto;
        this.reparacion = reparacion;
        this.cantidad = cantidad;
        this.id_itemrepuesto = id_itemrepuesto;
    }

    public Repuesto getRepuesto() {
        return repuesto;
    }

    public void setRepuesto(Repuesto repuesto) {
        this.repuesto = repuesto;
    }

    public Reparacion getReparacion() {
        return reparacion;
    }

    public void setReparacion(Reparacion reparacion) {
        this.reparacion = reparacion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId_itemrepuesto() {
        return id_itemrepuesto;
    }

    public void setId_itemrepuesto(int id_itemrepuesto) {
        this.id_itemrepuesto = id_itemrepuesto;
    }

    @Override
    public String toString() {
        return "Itemrepuesto{" + "repuesto=" + repuesto + ", reparacion=" + reparacion + ", cantidad=" + cantidad + '}';
    }
    
}
