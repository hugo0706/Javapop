
package Interfaz;

import LogicaJavaPop.Cliente;
import LogicaJavaPop.DatosPrograma;
import LogicaJavaPop.Producto;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 * 
 * Esta Clase permite instanciar un objeto de la clase producto y añadirlo
 * a los arraylists de productos generales y particulares del cliente
 * 
 * @author Javier Carrizosa Bermejo
 * @author Hugo García Calvo
 *
 */
public class CrearProducto extends javax.swing.JFrame {
    private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de imagen (*.jpg, *.jpeg, *.png, *.gif)", "jpg", "png", "jpeg", "gif");
    private String imageAddress;
    
    /**
        Este método recoje los datos de los JLabel correspondientes a
    los atributos de un Producto, crea uno y lo retorna.
    * @return objeto clase producto
    */
    public  Producto creacion() {
                
                String titulo=Titulo.getText();
		String categoria=(String)Categoria.getSelectedItem();
		String estado=(String)Estado.getSelectedItem();
		String descripcion=Descripcion.getText();
                String precioLetra=Precio1.getText()+"."+Precio2.getText();
                double precio=Double.parseDouble(precioLetra);
                Producto producto = new Producto(titulo,categoria,estado,descripcion,precio,LoginRegister.cliente,imageAddress);
        
               
		return producto;
                
	}
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
                
		if(LoginRegister.cliente.getProductosCliente()==null) {
                      
			LoginRegister.cliente.getProductosCliente().add(producto);
			DatosPrograma.añadirProducto(producto);
		}else {
			if(!LoginRegister.cliente.getProductosCliente().contains(producto)) {
				
				LoginRegister.cliente.getProductosCliente().add(producto);
				/**
				 * Añade producto a la lista general de productos
				 */
				DatosPrograma.añadirProducto(producto);
				
			}else {System.out.println("Este producto ya se encuentra en su lista.");
		}
		}
                
	}
                
    /**
     * Creates new form CrearProducto
     */
    public CrearProducto() {
        initComponents();
        setLocationRelativeTo(null);
        imageAddress="";
        errorImagen.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Registro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Titulo = new javax.swing.JTextField();
        Crear = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        Estado = new javax.swing.JComboBox<>();
        Descripcion = new javax.swing.JTextField();
        Categoria = new javax.swing.JComboBox<>();
        Precio1 = new javax.swing.JTextField();
        Precio2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CargarImagen = new javax.swing.JButton();
        Preview = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        errorImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 170, 149));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));

        Registro.setFont(new java.awt.Font("Mistral", 1, 55)); // NOI18N
        Registro.setForeground(new java.awt.Color(220, 220, 220));
        Registro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Registro.setText("NUEVO PRODUCTO");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Título");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Categoria");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Estado");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Descripción");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Precio");

        Titulo.setBackground(new java.awt.Color(0, 210, 190));

        Crear.setText("Crear");
        Crear.setBorder(null);
        Crear.setBorderPainted(false);
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        Estado.setBackground(new java.awt.Color(0, 210, 190));
        Estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NUEVO", "COMO NUEVO", "BUENO", "ACEPTABLE", "REGULAR" }));
        Estado.setBorder(null);

        Descripcion.setBackground(new java.awt.Color(0, 210, 190));
        Descripcion.setToolTipText("");
        Descripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        Categoria.setBackground(new java.awt.Color(0, 210, 190));
        Categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Moda y accesorios", "TV, audio y foto", "Móviles y telefonía", "Informática y electrónica", "Consolas y videojuegos", "Deporte y ocio" }));
        Categoria.setBorder(null);

        Precio1.setBackground(new java.awt.Color(0, 210, 190));

        Precio2.setBackground(new java.awt.Color(0, 210, 190));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(0, 210, 190));
        jTextField3.setText(",");

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(0, 210, 190));
        jTextField4.setText("€");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Imagen");

        CargarImagen.setText("...");
        CargarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarImagenActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Preview");

        errorImagen.setBackground(new java.awt.Color(255, 0, 0));
        errorImagen.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        errorImagen.setForeground(new java.awt.Color(255, 0, 0));
        errorImagen.setText("Sube una imagen!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Registro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(errorImagen, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(8, 8, 8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Categoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Titulo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CargarImagen)
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(Preview, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Precio1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Precio2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 69, Short.MAX_VALUE))
                    .addComponent(Estado, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Descripcion))
                .addGap(16, 16, 16)
                .addComponent(Volver)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(Registro)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Precio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(110, 110, 110)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(errorImagen)
                            .addComponent(Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(50, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Preview, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(Volver)
                        .addGap(63, 63, 63))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CargarImagen)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Cuando este boton es pulsado se crea el producto por medio del método de creacion,
     * si falta algun dato sale un error.
     * 
     * @param evt 
     */
    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
        
        if(Titulo.getText().isEmpty()||Descripcion.getText().isEmpty()||Precio1.getText().isEmpty()){   
            JOptionPane.showMessageDialog(this, "Revisa tus datos");

        }
        else{
            if(!imageAddress.equals("")){
                añadirProducto(creacion());
                OpcionesProductos opciones=new OpcionesProductos();
                this.dispose();
                opciones.setVisible(true);
            }else{errorImagen.setVisible(true);}
        }
        
    }//GEN-LAST:event_CrearActionPerformed
    /*
    Instancia y muestra un objeto de la clase OpcionesProductos
    */
    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        OpcionesProductos opciones=new OpcionesProductos();
        this.dispose();
        opciones.setVisible(true);
    }//GEN-LAST:event_VolverActionPerformed
    /*
    Permite seleccionar una imagen para el producto desde el ordenador y la muestra en 
    Un JLabel de preview
    */
    private void CargarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarImagenActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(filter);
        fileChooser.setAcceptAllFileFilterUsed(false);

        int i = fileChooser.showOpenDialog(this);
        if (i == JFileChooser.APPROVE_OPTION) {
            imageAddress = fileChooser.getSelectedFile().getPath();

            ImageIcon icon = new ImageIcon(this.imageAddress);
            Image resizedImage = icon.getImage().getScaledInstance(Preview.getWidth(), Preview.getHeight(), java.awt.Image.SCALE_DEFAULT);
            this.Preview.setIcon(new ImageIcon(resizedImage));
            
        }
    }//GEN-LAST:event_CargarImagenActionPerformed
    /*
    actualiza ficheros al cerrar ventana
    */
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        DatosPrograma.actualizarClientes(DatosPrograma.clientes);
        DatosPrograma.actualizarProductos(DatosPrograma.productos);
        DatosPrograma.actualizarVentas(DatosPrograma.ventas);
    }//GEN-LAST:event_formWindowClosed
    /*
    actualiza ficheros al cerrar ventana
    */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        DatosPrograma.actualizarClientes(DatosPrograma.clientes);
        DatosPrograma.actualizarProductos(DatosPrograma.productos);
        DatosPrograma.actualizarVentas(DatosPrograma.ventas);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrearProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CargarImagen;
    private javax.swing.JComboBox<String> Categoria;
    private javax.swing.JButton Crear;
    private javax.swing.JTextField Descripcion;
    private javax.swing.JComboBox<String> Estado;
    private javax.swing.JTextField Precio1;
    private javax.swing.JTextField Precio2;
    private javax.swing.JLabel Preview;
    private javax.swing.JLabel Registro;
    private javax.swing.JTextField Titulo;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel errorImagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
