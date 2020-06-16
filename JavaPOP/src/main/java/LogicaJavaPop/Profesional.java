
package LogicaJavaPop;
import java.io.Serializable;
/**
 * 
 * Esta Clase pretende construir un Profesional 
 * 
 * @author Javier Carrizosa Bermejo
 * @author Hugo García Calvo
 *
 */
public class Profesional extends Cliente implements Serializable {
    private String descripcion;
    private String apertura;
    private String cierre;
    private String telefono;
    private String web;

    public Profesional(String dni, String nombre, String correo, String clave, String cp, String ciudad, String credito,
                        String descripcion, String apertura, String cierre, String telefono, String web) {
        super(dni, nombre, correo, clave, cp, ciudad, credito);
        this.descripcion = descripcion;
        this.apertura = apertura;
        this.cierre = cierre;
        this.telefono = telefono;
        this.web = web;
    }
    @Override

    public String toString() {
        return "Profesional{" +super.toString()+ "descripcion=" + descripcion + ", apertura=" + apertura + ", cierre=" + cierre + ", telefono=" + telefono + ", web=" + web + '}';
    }
}