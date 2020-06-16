/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaJavaPop;

import java.io.*;
import java.util.*;
import javax.swing.JFrame;
/**
 * Esta clase pretende albergar los metodos que tienen relacion con la
 * transferencia y lectura de datos, arrays generales del programa y creacion
 * de clientes.
 * 
 * @author Javier Carrizosa Bermejo
 * @author Hugo García Calvo
 *
 */
public  class DatosPrograma implements Serializable {
	public static ArrayList<Cliente>clientes=new ArrayList<Cliente>();
	public static ArrayList<Producto>productos=new ArrayList<Producto>();
	public static ArrayList<Venta>ventas=new ArrayList<Venta>();
        
			
	
	
	/**
	 * Este metodo retira un producto del arraylist general de productos
	 * @param producto objeto de clase Producto
	 */
	public static void retirarProducto(Producto producto) { 
		for(Producto p:productos){
                    if(p.getTitulo().equals(producto.getTitulo()) && p.getDueño().getDni().equals(producto.getDueño().getDni())){
                        productos.remove(p);
                        System.out.println("retirar p");
                        break;
                    }
                }
                    
	}
	
	/**
	 * Este metodo permite añadir un producto al arraylist general de productos
	 * @param producto objeto de clase Producto
	 */
	public static void añadirProducto(Producto producto) {
		if(!productos.contains(producto)) {
			productos.add(producto);
			
		}else {System.out.println("Este producto ya se encuentra en su lista.");
	}
	}
	/**
	 * Este metodo permite retirar un cliente al arraylist general de clientes
	 * @param producto objeto de clase Cliente
	 */
	public static void retirarCliente(Cliente cliente) {
		if(clientes.contains(cliente)) {
			clientes.remove(cliente);
		}else {System.out.println("Este cliente no se encuentra en su lista.");
		}
	}
	/**
	 * Este metodo permite añadir un cliente al arraylist general de clientes
	 * @param producto objeto de clase Cliente
	 */
	public static void añadirCliente(Cliente cliente) { 
		if(!clientes.contains(cliente)) {
			clientes.add(cliente);
		}else {System.out.println("Este cliente se encuentra en su lista.");
		}
}
	
	/**
	 * Este método permite actualizar los datos del fichero de clientes con 
	 * el arraylist general de los clientes.
	 * 
	 */
	public static void actualizarClientes(ArrayList<Cliente> clientes) {
		try {
			FileOutputStream fos=new FileOutputStream("clientes.dat");
			ObjectOutputStream ficheroClientes=new ObjectOutputStream(fos);
			ficheroClientes.writeObject(clientes);
			ficheroClientes.close();
			fos.close();
		}catch(Exception e){
			System.out.println("Error al transferir a fichero clientes"+e.toString());
			
			
		}
	}
	/**
	 * Este método permite actualizar los datos del fichero de productos con 
	 * el arraylist general de los productos.
	 * 
	 */
	public static void actualizarProductos(ArrayList<Producto>productos) {
		try {
			ObjectOutputStream ficheroProductos=new ObjectOutputStream(new FileOutputStream("productos.txt"));
	
				ficheroProductos.writeObject(productos);
			
			ficheroProductos.close();
		}catch(Exception e){
			System.out.println("Error al transferir a fichero productos");
			
		}
	
		
	}
	/**
	 * Este método permite actualizar los datos del fichero de ventas con 
	 * el arraylist general de las ventas.
	 * 
	 */
	public static void actualizarVentas(ArrayList<Venta>ventas) {
		try {
			ObjectOutputStream ficheroVentas=new ObjectOutputStream(new FileOutputStream("ventas.txt"));
			ficheroVentas.writeObject(ventas);
		
			ficheroVentas.close();
		}catch(Exception e){
			System.out.println("Error al transferir a fichero ventas");
			
		}
	}
        
	/**
	 * Este método permite leer los datos del fichero de clientes y los retorna 
	 * en forma de arrayList.
	 * 
	 */
	public static ArrayList<Cliente> leerFicheroC() {
		ArrayList<Cliente> clientesGuardados=new ArrayList<Cliente>();
		try {
		FileInputStream fis=new FileInputStream("clientes.dat");
		ObjectInputStream ficheroClientes=new ObjectInputStream(fis);
		clientesGuardados=(ArrayList<Cliente>) ficheroClientes.readObject();
		
		ficheroClientes.close();
		fis.close();
	
		}catch(Exception e) {
			System.out.println("Errror al leer fichero clientes");
		}
		return clientesGuardados;
	}
	/**
	 * Este método permite leer los datos del fichero de productos y los retorna 
	 * en forma de arrayList.
	 * 
	 */
	public static ArrayList<Producto> leerFicheroP() {
		ArrayList<Producto> productosGuardados=new ArrayList<Producto>();
		try {
		FileInputStream fis=new FileInputStream("productos.txt");
		ObjectInputStream ficheroProductos=new ObjectInputStream(fis);
		productosGuardados=(ArrayList<Producto>) ficheroProductos.readObject();
		ficheroProductos.close();
		fis.close();
		}catch(Exception e) {
			System.out.println("Errror al leer fichero Productos");
		}
		return productosGuardados;
	}
	/**
	 * Este método permite leer los datos del fichero de ventas y los retorna 
	 * en forma de arrayList.
	 * 
	 */
	public static ArrayList<Venta> leerFicheroV() {
		ArrayList<Venta> ventasGuardadas=new ArrayList<Venta>();
		try {
		ObjectInputStream ficheroVentas=new ObjectInputStream(new FileInputStream("ventas.txt"));
		ventasGuardadas=(ArrayList<Venta>) ficheroVentas.readObject();
		ficheroVentas.close();
		}catch(Exception e) {
			System.out.println("Errror al leer fichero ventas");
		}
		return ventasGuardadas;
	}
        public static void eliminarProductoAdmin(Producto opcion){
         for(Cliente c: DatosPrograma.clientes) {
             if(c.getDni().equals(opcion.getDueño().getDni())) {
                 
                 for(Producto pCliente: c.getProductosCliente()) {
                     
                     if(pCliente.getTitulo().equals(opcion.getTitulo())) {
                         
                            retirarProducto(opcion);
                            c.retirarProducto(pCliente);
                            
                            break;
                        }
                 }
             }
         }
        }
        public static void eliminarClientesAdmin(Cliente c){
            for(int i=0;i< productos.size();i++) {
                Producto p= productos.get(i);
                 if(p.getDueño().equals(c)) {
                     productos.remove(p);
                         i=i-1;
                 }
            }
            DatosPrograma.retirarCliente(c);
        }
       
}
