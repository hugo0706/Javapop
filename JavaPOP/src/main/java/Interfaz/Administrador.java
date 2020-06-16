package Interfaz;

import LogicaJavaPop.DatosPrograma;

/**
 * 
 * Esta Clase Muestra las opciones de administrador y permite acceder a ellas
 * 
 * @author Javier Carrizosa Bermejo
 * @author Hugo García Calvo
 *
 */
public class Administrador extends javax.swing.JFrame {

    /**
     * Creates new form Administrador
     */
    public Administrador() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ADMINISTRADOR = new javax.swing.JLabel();
        consultaClientes = new javax.swing.JButton();
        consultaVentas = new javax.swing.JButton();
        consultaProductos = new javax.swing.JButton();
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

        jPanel1.setBackground(new java.awt.Color(0, 170, 149));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));

        ADMINISTRADOR.setFont(new java.awt.Font("Mistral", 1, 60)); // NOI18N
        ADMINISTRADOR.setForeground(new java.awt.Color(220, 220, 220));
        ADMINISTRADOR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ADMINISTRADOR.setText("ADMINISTRADOR");

        consultaClientes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        consultaClientes.setText("Clientes");
        consultaClientes.setToolTipText("");
        consultaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaClientesActionPerformed(evt);
            }
        });

        consultaVentas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        consultaVentas.setText("Ventas");
        consultaVentas.setToolTipText("");
        consultaVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaVentasActionPerformed(evt);
            }
        });

        consultaProductos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        consultaProductos.setText("Productos");
        consultaProductos.setToolTipText("");
        consultaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaProductosActionPerformed(evt);
            }
        });

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ADMINISTRADOR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(consultaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(consultaVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(consultaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Volver)
                        .addGap(26, 26, 26))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(ADMINISTRADOR)
                .addGap(73, 73, 73)
                .addComponent(consultaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(consultaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(consultaVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(Volver)
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
     * Instancia y muestra un objeto de la clase EliminarClienteAdmin
     * @param evt 
     */
    private void consultaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaClientesActionPerformed
        EliminarClienteAdmin opciones=new EliminarClienteAdmin();
        this.dispose();
        opciones.setVisible(true);
    }//GEN-LAST:event_consultaClientesActionPerformed
    /**
     * Instancia y muestra un objeto de la clase VentasAdmin
     * @param evt 
     */
    private void consultaVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaVentasActionPerformed
        // TODO add your handling code here:
        VentasAdmin opciones=new VentasAdmin();
        this.dispose();
        opciones.setVisible(true);
    }//GEN-LAST:event_consultaVentasActionPerformed
    /**
     * Instancia y muestra un objeto de la clase EliminarProductosAdmin
     * @param evt 
     */
    private void consultaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaProductosActionPerformed
        // TODO add your handling code here:
        EliminarProductosAdmin opciones=new EliminarProductosAdmin();
        this.dispose();
        opciones.setVisible(true);
    }//GEN-LAST:event_consultaProductosActionPerformed
    /**
     * Instancia y muestra un objeto de la clase LoginRegister
     * @param evt 
     */
    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        // TODO add your handling code here:
        LoginRegister opciones=new LoginRegister();
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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ADMINISTRADOR;
    private javax.swing.JButton Volver;
    private javax.swing.JButton consultaClientes;
    private javax.swing.JButton consultaProductos;
    private javax.swing.JButton consultaVentas;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
