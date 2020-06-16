
package Interfaz;

import LogicaJavaPop.Cliente;
import LogicaJavaPop.DatosPrograma;
import LogicaJavaPop.Producto;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * 
 * Esta Clase Muestra los datos de un producto y permite solicitar la compra
 * 
 * @author Javier Carrizosa Bermejo
 * @author Hugo García Calvo
 *
 */
public class Compra extends javax.swing.JFrame {
    private Producto producto;
  
    public Compra(Producto p) {
        this.producto=p;
        initComponents();
        titulo.setText(p.getTitulo());
        precio.setText(Double.toString(p.getPrecio()));
        estado.setText(p.getEstado());
        descripcion.setText(p.getDescripcion());
        ImageIcon icon=new ImageIcon(p.getImagen());
        Image resizedImage= icon.getImage().getScaledInstance(foto.getWidth(),foto.getHeight(),java.awt.Image.SCALE_DEFAULT);
        this.foto.setIcon(new ImageIcon(resizedImage));
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Volver = new javax.swing.JButton();
        foto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextPane();
        estado = new javax.swing.JTextField();
        titulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        Comprar = new javax.swing.JButton();

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
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        jLabel1.setText("Estado");

        jLabel2.setText("Titulo");

        jLabel3.setText("Descripcion");

        descripcion.setEditable(false);
        jScrollPane1.setViewportView(descripcion);

        estado.setEditable(false);

        titulo.setEditable(false);

        jLabel4.setText("Precio");

        precio.setEditable(false);

        Comprar.setText("Comprar");
        Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(28, 28, 28)))
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(estado, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(precio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulo)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addComponent(Comprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 409, Short.MAX_VALUE)
                        .addComponent(Volver)))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(Volver)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        BusquedaProductos opciones=new BusquedaProductos();
        this.dispose();
        opciones.setVisible(true);
    }//GEN-LAST:event_VolverActionPerformed
    /**
     * Cuando es pulsado se solicita la compra del producto seleccionado 
     * cambiado su booleano de venta a true
     * @param evt 
     */
    private void ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarActionPerformed
        JOptionPane.showMessageDialog(this, "Ha solicitado la compra\n Deberá ser aceptada por el vendedor");
            
            BusquedaProductos opciones=new BusquedaProductos();
            this.dispose();
            opciones.setVisible(true);
            String titulo= producto.getTitulo();
            String dni=producto.getDueño().getDni();
            for(Cliente c:DatosPrograma.clientes){
              
                if(c.getDni().equals(dni)){
                   
                    for(Producto p:c.getProductosCliente()){
                   
                        if(p.getTitulo().equals(titulo)){
                       
                            p.setComprador(LoginRegister.cliente);
                            p.setVenta(true);
                            
                        }
                    }
                }
           
                
            }
            
    
        
        
        
        
    }//GEN-LAST:event_ComprarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        DatosPrograma.actualizarClientes(DatosPrograma.clientes);
        DatosPrograma.actualizarProductos(DatosPrograma.productos);
        DatosPrograma.actualizarVentas(DatosPrograma.ventas);
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        DatosPrograma.actualizarClientes(DatosPrograma.clientes);
        DatosPrograma.actualizarProductos(DatosPrograma.productos);
        DatosPrograma.actualizarVentas(DatosPrograma.ventas);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Comprar;
    private javax.swing.JButton Volver;
    private javax.swing.JTextPane descripcion;
    private javax.swing.JTextField estado;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField precio;
    private javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables
}
