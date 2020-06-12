/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaJavaPop;
import java.io.Serializable;
/**
 *
 * @author hugog
 */
public class Profesional extends Cliente implements Serializable {
    private String descripcion;
    private int apertura;
    private int cierre;
    private String telefono;
    private String web;

    public Profesional(String dni, String nombre, String correo, String clave, String cp, String ciudad, String credito,
                        String descripcion, int apertura, int cierre, String telefono, String web) {
        super(dni, nombre, correo, clave, cp, ciudad, credito);
        this.descripcion = descripcion;
        this.apertura = apertura;
        this.cierre = cierre;
        this.telefono = telefono;
        this.web = web;
    }
    @Override
    
    public String toString() {
        return "Profesional{" + "descripcion=" + descripcion + ", apertura=" + apertura + ", cierre=" + cierre + ", telefono=" + telefono + ", web=" + web + '}';
    }

   
    
}
