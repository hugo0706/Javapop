
package LogicaJavaPop;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * Esta Clase pretende construir un cliente y recoge los metodos usados por este.
 * 
 * @author Javier Carrizosa Bermejo
 * @author Hugo García Calvo
 *
 */
public class Cliente implements Serializable {
	public String dni;
	public String nombre;
	public String correo;
	public String clave;
	public String cp;
	public String ciudad;
	public String credito;
	private ArrayList<Producto> productosCliente;
	
	/**
	 * Este método añade un objeto de clase Producto a un array general con todos
	 * los productos de la aplicacion, y a un array con los productos de un cliente
	 * específico.
	 * 
	 * @param producto objeto de clase Producto
	 */
	public void añadirProducto(Producto producto) {
		/**
		 * Si el producto no se encuentra en la lista personal del cliente, se añade.
		 */
		if(this.productosCliente==null) {
		
			this.productosCliente.add(producto);
			DatosPrograma.añadirProducto(producto);
		}else {
			if(!this.productosCliente.contains(producto)) {
				
				this.productosCliente.add(producto);
				/**
				 * Añade producto a la lista general de productos
				 */
				DatosPrograma.añadirProducto(producto);
				
			}else {System.out.println("Este producto ya se encuentra en su lista.");
		}
		}
	}
	
	/**
	 * Este metodo retira un objeto de clase Producto del array general de productos
	 * y del array personal de productos del cliente
	 * 
	 * @param producto objeto de clase Producto
	 */
	public  void retirarProducto(Producto producto) { 
		/**
		 * Si el producto se encuentra en la lista personal del cliente, se retira.
		 */
                
		for(Producto p:this.productosCliente){
                  if(p.getTitulo().equals(producto.getTitulo())){
                 
			this.productosCliente.remove(producto);
                     
			/**
			 * Retira producto de la lista general de productos
			 */
			DatosPrograma.retirarProducto(producto);
                    
                        break;
		}
	}
        }
	/**
	 * Este método recibe un String con el nombre de un producto y cambia el boleeano
         * urgente del producto a estado true, fijando tambien la fecha de paso a urgente
         * debido a que tras 7 dias, urgente pasará a ser false
         * @param String nombre de producto
	 */
	public void hacerUrgente(String nombre) {
            for(Producto i:productosCliente) {
                if(nombre.equals(i.getTitulo()) && !i.isUrgente()) {

                    i.estableceFechaUrgente();
                    i.setUrgente(true);
                                for (Producto d: DatosPrograma.productos){
                                    if (d.getTitulo().equals(i.getTitulo()) && d.getDueño().getDni().equals(i.getDueño().dni)){
                                        d.setUrgente(true);
                                        d.estableceFechaUrgente();
                                    }
                                }
                }
            }
	}
    /**
     * 
     * Método que ordena una lista de productos comparando producto a producto con el código postal del cliente
     * @param codigo String del codigo postal, debe contener como minimos 3 caracteres
     * @param productos Lista de productos a ordenar
     * @return lista de productos inicial ordenada mediante la semejanza del código postal
     */
	public static ArrayList<Producto> ordenaCoPostal(String codigo, ArrayList<Producto> productos){
        char caracter0 = codigo.charAt(0);
        char caracter1 = codigo.charAt(1);
        char caracter2 = codigo.charAt(2);
        char comparable0; 
        char comparable1; 
        char comparable2; 
        ArrayList<Producto> muyProximo = new ArrayList<Producto>();
        ArrayList<Producto> proximo = new ArrayList<Producto>();
        ArrayList<Producto> indiferente = new ArrayList<Producto>();
        ArrayList<Producto> listaFinal = new ArrayList<Producto>();
        
        for (Producto variable : productos){
            comparable0 = (variable.getCp()).charAt(0);
            comparable1 = (variable.getCp()).charAt(1);
            comparable2 = (variable.getCp()).charAt(2);
            if (comparable0 == caracter0 && comparable1 == caracter1 && comparable2 == caracter2){
                muyProximo.add(variable);
            }
            else if (comparable0 == caracter0 && comparable1 == caracter1){
                proximo.add(variable);
                
            }
            else{
                indiferente.add(variable);
            }
            
            
        }
        for (Producto enLista:proximo){
            muyProximo.add(enLista);
        }
        for (Producto enLista:indiferente){
            muyProximo.add(enLista);
        }
            
    return muyProximo;   
    }
    
	/**
     * Divide la lista en listas más pequeñas según la semejanza entre las palabras claves y el título de cada producto
     * @param palabrasClave String introducido por el usuario
     * @param productos Lista de productos
     * @param codigo codigo postal que corresponderá con el codigo postal del usuario utilizando la aplicación
     * @return retorna una lista ordenada tanto por código postal como por semejanza con las palabras claves
     */
	
    public static ArrayList<Producto> buscaOrdena(String palabrasClave, ArrayList<Producto> productos, String codigo){
        ArrayList<Producto> urgentes = new ArrayList<Producto>();
        ArrayList<Producto> iguales = new ArrayList<Producto>();
        ArrayList<Producto> parecidos = new ArrayList<Producto>();
        ArrayList<Producto> restantes = new ArrayList<Producto>();
        
        for (Producto p: productos){
            if (p.isUrgente()){
                urgentes.add(p);
            }
            else {
                if (palabrasClave.equals(p.getTitulo())){
                iguales.add(p);
                }
                else if(p.getTitulo().contains(palabrasClave)){
                parecidos.add(p);
                }
                else{
                restantes.add(p);
                }
            }
            
        }
        urgentes = ordenaCoPostal(codigo, urgentes);
        iguales = ordenaCoPostal(codigo, iguales);
        parecidos = ordenaCoPostal(codigo, parecidos);
        restantes = ordenaCoPostal(codigo, restantes);
        
        for (Producto p:iguales){
            urgentes.add(p);
            
        }
        for (Producto p:parecidos){
            urgentes.add(p);
            
        }
    
        for (Producto p:restantes){
            urgentes.add(p);
            
        }
        
        return urgentes;        
    }
    
    /**
     * Este metodo hace uso del metodo buscaOrdena para acceder a un array con 
     * los productos que aparecen en la busqueda, y permite realizar la solicitud
     * de compra de cualquiera de estos.
     * 
     * @param palabrasClave String con palabras clave sobre producto a buscar,
     * puede ser un string vacio en caso de no usar palabras clave
     */
    public ArrayList<Producto> comprarProducto(String palabrasClave,String categoria) {
        ArrayList<Producto> productosDisponibles = new ArrayList<Producto>();
        for (Producto p:DatosPrograma.productos){
            if (categoria.equals(p.getCategoria())){
                if (!p.getDueño().getDni().equals(this.getDni())){
                    productosDisponibles.add(p);
            }
        }

        }
        productosDisponibles = buscaOrdena(palabrasClave,productosDisponibles,this.cp);
        if(productosDisponibles.isEmpty()) {
            
            return new ArrayList<Producto>();
        }else {
            return productosDisponibles;
        }

    }
	/**
	 * Este metodo crea un Profesional a partir de los datos de un cliente anterior el cual
         * es eliminado, y parametros que deben ser introducidos. Este Profesional se añade al array
         * general de clientes.
         * 
         * @param apertura 
         * @param cierre
         * @param descripcion
         * @param telefono
         * @param web
	 * 
	 */
	
	public Profesional hacerProfesional(String apertura, String cierre, String descripcion, String telefono, String web) {
                   
                Profesional profesional =new Profesional(this.dni,this.nombre,this.correo,this.clave,this.cp,this.ciudad,this.credito, descripcion, apertura, cierre, telefono, web);
                DatosPrograma.retirarCliente(this);
                DatosPrograma.añadirCliente(profesional);
                
                return profesional;
    }
	
	public Cliente() {
		super();
	}
	/**
	 * Este constructor permite instanciar objetos de la clase Cliente.
	 */
	public Cliente(String dni, String nombre, String correo, String clave, String cp, String ciudad, String credito) {
                this.dni = dni;
		this.nombre = nombre;
		this.correo = correo;
		this.clave = clave;
		this.cp = cp;
		this.ciudad = ciudad;
		this.credito = credito;
		this.productosCliente =new ArrayList<Producto>(); //Crea Arraylist vacio cada vez que se crea un cliente 
	}
	
	
	public ArrayList<Producto> getProductosCliente(){ 
		return productosCliente;
	}
	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public String getClave() {
		return clave;
	}

	public String getCp() {
		return cp;
	}

	public String getCredito() {
		return credito;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;	
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public void setCredito(String credito) {
		this.credito = credito;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	
	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", correo=" + correo + ", clave=" + clave + ", cp=" + cp
				+ ", ciudad=" + ciudad + ", credito=" + credito + "Productos"+productosCliente+"]";
	}
	
	
}