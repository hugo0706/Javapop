
package Interfaz;

import LogicaJavaPop.DatosPrograma;
import javax.swing.JOptionPane;
/**
 * 
 * Esta Clase permite convertirse en profesional instanciando un objeto de la clase
 * profesional con los datos del cliente registrado incluidos y guardandolo en el
 * arraylist de clientes. Además borra el objeto cliente anterior, ya que es sustituido.
 * 
 * @author Javier Carrizosa Bermejo
 * @author Hugo García Calvo
 *
 */
public class HacerProfesional extends javax.swing.JFrame {

    /**
     * Creates new form HacerProfesional
     */
    public HacerProfesional() {
        initComponents();
        setLocationRelativeTo(null);
        faltanDatos.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        OPCIONES = new javax.swing.JLabel();
        OPCIONES1 = new javax.swing.JLabel();
        Unete = new javax.swing.JButton();
        apertura = new javax.swing.JFormattedTextField();
        cierre = new javax.swing.JFormattedTextField();
        descripcion = new javax.swing.JTextField();
        telefono = new javax.swing.JFormattedTextField();
        web = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Volver1 = new javax.swing.JButton();
        faltanDatos = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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

        OPCIONES.setFont(new java.awt.Font("Mistral", 1, 45)); // NOI18N
        OPCIONES.setForeground(new java.awt.Color(220, 220, 220));
        OPCIONES.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OPCIONES.setText("VENTAJAS PRO");

        OPCIONES1.setFont(new java.awt.Font("Mistral", 1, 45)); // NOI18N
        OPCIONES1.setForeground(new java.awt.Color(220, 220, 220));
        OPCIONES1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OPCIONES1.setText("ÚNETE Y DISFRUTA DE");

        Unete.setText("UNETE!");
        Unete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UneteActionPerformed(evt);
            }
        });

        apertura.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));

        cierre.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));

        descripcion.setToolTipText("");
        descripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        telefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#########"))));

        web.setEditable(false);
        web.setText("Web");

        jLabel1.setText("Apertura ( hh :mm)");

        jLabel2.setText("Cierre ( hh : mm)");

        jLabel3.setText("Teléfono (solo admite números)");

        Volver1.setText("Volver");
        Volver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver1ActionPerformed(evt);
            }
        });

        faltanDatos.setForeground(new java.awt.Color(255, 0, 0));
        faltanDatos.setText("Faltan Datos !!");

        jLabel4.setText("Esta operación conlleva un pago de 30 euros en su tarjeta de crédito");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(OPCIONES, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(web, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cierre, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(faltanDatos))
                                .addComponent(apertura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 109, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(Volver1)
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(Unete, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(OPCIONES1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(OPCIONES)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(faltanDatos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(apertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(web, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Unete)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(Volver1)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(OPCIONES1)
                    .addContainerGap(407, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
     * Cuando es presionado, se crea el cliente profesional con los datos de las casillas y muestra un mensaje
     * @param evt 
     */
    private void UneteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UneteActionPerformed
        if (apertura.getText().isEmpty() || cierre.getText().isEmpty() || 
                telefono.getText().isEmpty() || web.getText().isEmpty()
                || descripcion.getText().isEmpty()){
                faltanDatos.setVisible(true);
        } else {
            LoginRegister.cliente=LoginRegister.cliente.hacerProfesional(apertura.getText(), cierre.getText(), telefono.getText(), web.getText(), descripcion.getText());
        
        OpcionesUsuario opciones=new OpcionesUsuario();
        this.dispose();
        opciones.setVisible(true);
        JOptionPane.showMessageDialog(this, "Se han cobrado 30 euros de la tarjeta :" + LoginRegister.cliente.getCredito());
            
        }
        
    }//GEN-LAST:event_UneteActionPerformed
    /**
     * Instancia y muestra un objeto de la clase OpcionesUsuario
     * @param evt 
     */
    private void Volver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver1ActionPerformed
        OpcionesUsuario opciones=new OpcionesUsuario();
        this.dispose();
        opciones.setVisible(true);
    }//GEN-LAST:event_Volver1ActionPerformed
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
            java.util.logging.Logger.getLogger(HacerProfesional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HacerProfesional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HacerProfesional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HacerProfesional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HacerProfesional().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel OPCIONES;
    private javax.swing.JLabel OPCIONES1;
    private javax.swing.JButton Unete;
    private javax.swing.JButton Volver1;
    private javax.swing.JFormattedTextField apertura;
    private javax.swing.JFormattedTextField cierre;
    private javax.swing.JTextField descripcion;
    private javax.swing.JLabel faltanDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField telefono;
    private javax.swing.JTextField web;
    // End of variables declaration//GEN-END:variables
}
