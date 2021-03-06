
package LogicaJavaPop;

import java.io.Serializable;
import java.util.ArrayList;
import java.time.LocalDate;  
    /**
    * Esta Clase pretende construir un producto y recoge los metodos usados por este.
    * 
    * @author Javier Carrizosa Bermejo
    * @author Hugo García Calvo
    *
    */ 
public class Producto implements Serializable {
    private LocalDate fechaPublicacion;    
    private String categoria;     
    private String estado;     //Nuevo, seminuevo, decente.....
    private String descripcion;   
    private String titulo;   //Resumen del producto con palabras clave
    private double precio;       
    private boolean venta;    //Booleano que indica si el producto ha sido vendido o no
    private boolean urgente;	//Booleano que indica si es urgente
    private Cliente dueño;
    private String cp;
    private LocalDate fechaUrgente;
    private String imagen;
    public Cliente comprador;
    
   
    
    
    /**
     * Cuando un producto se haga urgente se llamará a esta funciçon para a notar la fecha
     */
    public void estableceFechaUrgente(){
        LocalDate fecha = LocalDate.now().plusDays(7);
        this.fechaUrgente = fecha;

    }
	
    
    public Producto(String titulo, String categoria, String estado, String descripcion, double precio,Cliente cliente,String imagen) {
    	this.cp=cliente.cp;
    	this.categoria = categoria;
        this.estado = estado;
        this.descripcion = descripcion;
        this.titulo = titulo;
        this.precio = precio;
        this.venta = false;     //Siempre se inicia como falso
        this.urgente=false;  //Se inicia como falso
        this.fechaPublicacion = LocalDate.now();        //Fecha de publicacion = momento en el que se crea el producto
        this.dueño=cliente;
        this.imagen=imagen;
    }
    
    
    
    public boolean isVenta() {
        return venta;
    }
    
    public void setVenta(boolean valor){
        this.venta = valor;
                
    }

    

    public Cliente getDueño() {
		return dueño;
	}


	public void setDueño(Cliente dueño) {
		this.dueño = dueño;
	}


	public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getImagen(){
        return imagen;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCp() {
        return cp;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
    public LocalDate getfechaPublicacion(){
        return fechaPublicacion;
    }

	public boolean isUrgente() {
		return urgente;
	}


	public void setUrgente(boolean urgente) {
		this.urgente = urgente;
	}





	public void setComprador(Cliente cliente) {
		this.comprador=cliente;
	}
	public Cliente getComprador(){
		return this.comprador;
	}
   

    
	@Override
	public String toString() {
		return "Producto [fechaPublicacion=" + fechaPublicacion + ", categoria=" + categoria + ", estado=" + estado
				+ ", descripcion=" + descripcion + ", titulo=" + titulo + ", precio=" + precio + ", venta=" + venta
				+" Urgente"+urgente+ "comprador= "+comprador+ "]"+"\n";
	}

    
} 

