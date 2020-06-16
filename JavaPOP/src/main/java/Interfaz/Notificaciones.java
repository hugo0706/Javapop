/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import LogicaJavaPop.DatosPrograma;
import LogicaJavaPop.Producto;
import LogicaJavaPop.Venta;
import java.awt.Image;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.ListModel;

/**
 *
 * @author hugog
 */
public class Notificaciones extends javax.swing.JFrame {
    public boolean notificaciones;
 
    public Notificaciones() {
        initComponents();
        setLocationRelativeTo(null);
        mostrarVentas();
    }

    public void mostrarVentas(){
        DefaultListModel<String> ventas =new DefaultListModel();
        ArrayList<Producto> productosCliente=LoginRegister.cliente.getProductosCliente();
        notificaciones=false;
        
        for(Producto p:productosCliente){
          
            if(p.isVenta()) {
                notificaciones=true;
                ventas.addElement(p.getTitulo()+" Precio: "+p.getPrecio());
            }
        }
        if(!notificaciones){
            ventas.addElement("No hay notificaciones");
           
        }
       
        ListaVentas.setModel((ListModel<String>)ventas);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        OPCIONES1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaVentas = new javax.swing.JList<>();
        OPCIONES2 = new javax.swing.JLabel();
        Vender = new javax.swing.JButton();
        OPCIONES3 = new javax.swing.JLabel();
        Preview = new javax.swing.JLabel();
        VentaSeleccionada = new javax.swing.JTextField();
        Volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 170, 149));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 500));

        OPCIONES1.setFont(new java.awt.Font("Mistral", 1, 55)); // NOI18N
        OPCIONES1.setForeground(new java.awt.Color(220, 220, 220));
        OPCIONES1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OPCIONES1.setText("NOTIFICACIONES");

        ListaVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaVentasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListaVentas);

        OPCIONES2.setFont(new java.awt.Font("Mistral", 1, 19)); // NOI18N
        OPCIONES2.setForeground(new java.awt.Color(220, 220, 220));
        OPCIONES2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OPCIONES2.setText("VENTA SELECCIONADA");

        Vender.setText("Vender");
        Vender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VenderActionPerformed(evt);
            }
        });

        OPCIONES3.setFont(new java.awt.Font("Mistral", 1, 25)); // NOI18N
        OPCIONES3.setForeground(new java.awt.Color(220, 220, 220));
        OPCIONES3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OPCIONES3.setText("SOLICITUDES DE COMPRA");

        VentaSeleccionada.setEditable(false);

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Preview, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(VentaSeleccionada)
                            .addComponent(OPCIONES2))
                        .addGap(64, 64, 64))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OPCIONES3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Vender)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Volver)
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(85, Short.MAX_VALUE)
                    .addComponent(OPCIONES1)
                    .addGap(76, 76, 76)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(OPCIONES3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(OPCIONES2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Preview, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(VentaSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(Vender)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(Volver)
                .addGap(23, 23, 23))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(OPCIONES1)
                    .addContainerGap(405, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListaVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaVentasMouseClicked
        if(notificaciones){
        Producto productoSeleccionado=LoginRegister.cliente.getProductosCliente().get(ListaVentas.getSelectedIndex());
        String titulo= productoSeleccionado.getTitulo();
        VentaSeleccionada.setText(titulo);
        ImageIcon icon = new ImageIcon(LoginRegister.cliente.getProductosCliente().get(ListaVentas.getSelectedIndex()).getImagen());
        Image resizedImage = icon.getImage().getScaledInstance(Preview.getWidth(), Preview.getHeight(), java.awt.Image.SCALE_DEFAULT);
        this.Preview.setIcon(new ImageIcon(resizedImage));
        }
    }//GEN-LAST:event_ListaVentasMouseClicked

    private void VenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VenderActionPerformed
        try{  
            OpcionesUsuario opciones= new OpcionesUsuario();
            this.dispose();
            opciones.setVisible(true);
            String titulo= VentaSeleccionada.getText();
            for(Producto p:LoginRegister.cliente.getProductosCliente()){
                if(p.getTitulo().equals(titulo)){
                  
                    LoginRegister.cliente.retirarProducto(p);
                    Venta v =new Venta(p.getfechaPublicacion(),p.getCategoria(),p.getEstado(),p.getDescripcion(),p.getTitulo(),
                    p.getPrecio(),p.getCp(),LocalDateTime.now(),LoginRegister.cliente,p.getComprador());

                    DatosPrograma.ventas.add(v);
   
                }
            }
            
        }catch(ConcurrentModificationException e){}
    }//GEN-LAST:event_VenderActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        OpcionesUsuario opciones=new OpcionesUsuario();
        this.dispose();
        opciones.setVisible(true);
    }//GEN-LAST:event_VolverActionPerformed

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
            java.util.logging.Logger.getLogger(Notificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notificaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListaVentas;
    private javax.swing.JLabel OPCIONES1;
    private javax.swing.JLabel OPCIONES2;
    private javax.swing.JLabel OPCIONES3;
    private javax.swing.JLabel Preview;
    private javax.swing.JButton Vender;
    private javax.swing.JTextField VentaSeleccionada;
    private javax.swing.JButton Volver;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
