
package Interfaz;

import LogicaJavaPop.Cliente;
import LogicaJavaPop.DatosPrograma;
import LogicaJavaPop.Producto;
import LogicaJavaPop.Venta;
import java.util.ArrayList;

/**
 * 
 * Esta clase carga los ficheros de datos del programa e instancia
 * un objeto de clase LoginRegister y lo muestra, dando comienzo al programa.
 * 
 * @author Javier Carrizosa Bermejo
 * @author Hugo García Calvo
 *
 */


public class JavaPOP {
    /**
 * Este metodo Intenta cargar el array de clientes desde fichero, en caso de no existir crea uno vacio y lo retorna.
 * 
 */
    public static ArrayList<Cliente> cargarClientes(){ 
    	try {
    		return DatosPrograma.leerFicheroC(); 
    	}catch(Exception e) {
    		System.out.println("Error al cargar clientes");
    		return new ArrayList<Cliente>();
    		
    	}
    
    }
    /**
     * Este metodo Intenta cargar el array de productos desde fichero, en caso de no existir crea uno vacio y lo retorna.
     * 
     */
    public static ArrayList<Producto> cargarProductos(){ 
    	try {
    		return DatosPrograma.leerFicheroP(); 
    	}catch(Exception e) {
    		return new ArrayList<Producto>();
    	}
    
    }
    /**
     * Este metodo Intenta cargar el array de ventas	 desde fichero, en caso de no existir crea uno vacio y lo retorna.
     * 
     */
    public static ArrayList<Venta> cargarVentas(){ 
    	try {
    		return DatosPrograma.leerFicheroV(); 
    	}catch(Exception e) {
    		return new ArrayList<Venta>();
    	}
    
    }
     

    public static void main(String args[]) {
        /* 
        Carga de ficheros
        */
        DatosPrograma.clientes=cargarClientes();
        DatosPrograma.productos=cargarProductos();
        DatosPrograma.ventas=cargarVentas();
        System.out.print(DatosPrograma.ventas);
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Creacion de login */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginRegister().setVisible(true);
            }
        });
        
        
    }
    
}
