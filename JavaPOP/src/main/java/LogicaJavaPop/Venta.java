/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaJavaPop;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * Esta clase permite la creacion de objetos tipo Venta, los cuales 
 * guardan la informacion de una venta.
 * 
 * @author Javier Carrizosa Bermejo
 * @author Hugo García Calvo
 *
 */
public class Venta implements Serializable {
		private LocalDate fechaPublicacion;    
	    private String categoria;     
	    private String estado;     
	    private String descripcion;   
	    private String titulo;   
	    private double precio;       
	    public String cp; 
	    private LocalDateTime fechaVenta;
	    private Cliente vendedor;
	    private Cliente comprador;
	    private	String dniV;
	
		public Venta(LocalDate fechaPublicacion, String categoria, String estado, String descripcion, String titulo,
				double precio, String cp, LocalDateTime fechaVenta,Cliente vendedor,Cliente comprador) {
			super();
			this.fechaPublicacion = fechaPublicacion;
			this.categoria = categoria;
			this.estado = estado;
			this.descripcion = descripcion;
			this.titulo = titulo;
			this.precio = precio;
			this.cp = cp;
			this.fechaVenta = fechaVenta;
			this.vendedor = vendedor;
			this.comprador = comprador;
			this.dniV = dniV;
			
		}
		public LocalDate getFechaPublicacion() {
			return fechaPublicacion;
		}
		public String getCategoria() {
			return categoria;
		}
		public String getEstado() {
			return estado;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public String getTitulo() {
			return titulo;
		}
		public double getPrecio() {
			return precio;
		}
		public String getCp() {
			return cp;
		}
		public LocalDateTime getFechaVenta() {
			return fechaVenta;
		}
		public Cliente getVendedor() {
			return vendedor;
		}
		public Cliente getComprador() {
			return comprador;
		}
		public String getDniV() {
			return dniV;
		}
		
		public void setFechaPublicacion(LocalDate fechaPublicacion) {
			this.fechaPublicacion = fechaPublicacion;
		}
		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}
		public void setEstado(String estado) {
			this.estado = estado;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public void setPrecio(double precio) {
			this.precio = precio;
		}
		public void setCp(String cp) {
			this.cp = cp;
		}
		public void setFechaVenta(LocalDateTime fechaVenta) {
			this.fechaVenta = fechaVenta;
		}
		public void setVendedor(Cliente vendedor) {
			this.vendedor = vendedor;
		}
		public void setComprador(Cliente comprador) {
			this.comprador = comprador;
		}
		public void setDniV(String dniV) {
			this.dniV = dniV;
		}
	
		@Override
		public String toString() {
			return "Venta: categoria=" + categoria + "  estado=" + estado
					+ " descripcion=" + descripcion + "\n titulo=" + titulo + " precio=" + precio + " cp=" + cp
					+ "\n fechaVenta=" + fechaVenta + "\n vendedor=" + vendedor + ", comprador=" + comprador+
					   "]";
		}
	    
	    
}
