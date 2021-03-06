package Interfaz;
import LogicaJavaPop.Profesional;
import Interfaz.LoginRegister;
import LogicaJavaPop.DatosPrograma;
import LogicaJavaPop.Producto;
import java.awt.Color;


/**
 * 
 * Esta Clase muestra las opciones de usuario y permite acceder a ellas.
 * 
 * @author Javier Carrizosa Bermejo
 * @author Hugo García Calvo
 *
 */
public class OpcionesUsuario extends javax.swing.JFrame {

    /**
     * Creates new form OpcionesUsuario
     */
    public OpcionesUsuario() {
        initComponents();
        setLocationRelativeTo(null);
        if(LoginRegister.cliente instanceof Profesional){
        Profesional.setVisible(false);
        }
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        OPCIONES = new javax.swing.JLabel();
        MisProductos = new javax.swing.JButton();
        Busqueda = new javax.swing.JButton();
        Notificaciones = new javax.swing.JButton();
        CerrarSesion = new javax.swing.JButton();
        Profesional = new javax.swing.JLabel();

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

        OPCIONES.setFont(new java.awt.Font("Mistral", 1, 70)); // NOI18N
        OPCIONES.setForeground(new java.awt.Color(220, 220, 220));
        OPCIONES.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OPCIONES.setText("OPCIONES");

        MisProductos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MisProductos.setText("Mis productos");
        MisProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MisProductosActionPerformed(evt);
            }
        });

        Busqueda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Busqueda.setText("Búsqueda de productos");
        Busqueda.setToolTipText("");
        Busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaActionPerformed(evt);
            }
        });

        Notificaciones.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Notificaciones.setText("Notificaciones");
        Notificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotificacionesActionPerformed(evt);
            }
        });

        CerrarSesion.setText("Cerrar sesión");
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });

        Profesional.setBackground(new java.awt.Color(40, 40, 40));
        Profesional.setFont(new java.awt.Font("Segoe UI Symbol", 0, 13)); // NOI18N
        Profesional.setForeground(new java.awt.Color(255, 20, 0));
        Profesional.setText("¡Hazte profesional!");
        Profesional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProfesionalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ProfesionalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ProfesionalMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OPCIONES, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Notificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MisProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Profesional)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CerrarSesion)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(OPCIONES)
                .addGap(60, 60, 60)
                .addComponent(Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MisProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Notificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CerrarSesion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Profesional, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(35, 35, 35))
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
    /*
    Cuando el boton es pulsado, se actualiza la informacion de los ficheros
    y se crea y abre una instancia de la clase LoginRegister
    */
    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        DatosPrograma.actualizarClientes(DatosPrograma.clientes);
        DatosPrograma.actualizarProductos(DatosPrograma.productos);
        DatosPrograma.actualizarVentas(DatosPrograma.ventas);
        LoginRegister login=new LoginRegister();
        this.dispose();
        LoginRegister.cliente=null;
        login.setVisible(true);

    }//GEN-LAST:event_CerrarSesionActionPerformed
    /*
    Crea y muestra una instancia de OpcionesProductos
    */
    private void MisProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MisProductosActionPerformed
        OpcionesProductos opciones =new OpcionesProductos();
        this.dispose();
        opciones.setVisible(true);
    }//GEN-LAST:event_MisProductosActionPerformed
    /*
    Cambia el color del texto al entrar el mouse
    */
    private void ProfesionalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfesionalMouseEntered
        Profesional.setForeground(Color.blue);
    }//GEN-LAST:event_ProfesionalMouseEntered
    /*
    Cambia el color del texto al salir el mouse
    */
    private void ProfesionalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfesionalMouseExited
        Profesional.setForeground(Color.red);
    }//GEN-LAST:event_ProfesionalMouseExited
    /*
    Crea y muestra una instancia de Profesional
    */
    private void ProfesionalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfesionalMouseClicked
        HacerProfesional profesional=new HacerProfesional();
        this.dispose();
        profesional.setVisible(true);
    }//GEN-LAST:event_ProfesionalMouseClicked
    /*
    Crea y muestra una instancia de Notificaciones
    */
    private void NotificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotificacionesActionPerformed
        Notificaciones notificaciones=new Notificaciones();
        this.dispose();
        notificaciones.setVisible(true);
    }//GEN-LAST:event_NotificacionesActionPerformed
    /*
    Crea y muestra una instancia de BusquedaProductos
    */
    private void BusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaActionPerformed
        BusquedaProductos busqueda=new BusquedaProductos();
        this.dispose();
        busqueda.setVisible(true);
    }//GEN-LAST:event_BusquedaActionPerformed
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
            java.util.logging.Logger.getLogger(OpcionesUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpcionesUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpcionesUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpcionesUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpcionesUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Busqueda;
    private javax.swing.JButton CerrarSesion;
    private javax.swing.JButton MisProductos;
    private javax.swing.JButton Notificaciones;
    private javax.swing.JLabel OPCIONES;
    private javax.swing.JLabel Profesional;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
