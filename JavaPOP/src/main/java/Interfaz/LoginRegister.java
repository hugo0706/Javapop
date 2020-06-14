package Interfaz;


import LogicaJavaPop.Cliente;
import LogicaJavaPop.Producto;
import LogicaJavaPop.Venta;
import LogicaJavaPop.DatosPrograma;

import java.util.ArrayList;



/**
 *
 * @author hugog
 */


public class LoginRegister extends javax.swing.JFrame {
    public static Cliente cliente;
       
    /**
     * Creates new form LoginRegister
     */
        
     /** 
      * FUNCIONES DE LA CLASE LOGINREGISTER
      */   
    /**
     * Compara usuarios, comprueba si el usuario y contraseña escritos por cliente son correctos
     * @param correo String introducido por usuario
     * @param lista ArrayList de objetos cliente
     * @param contraseña String introducido por usuario
     * @return true/false
     */
    
    public static boolean comparaUsuario(String correo, ArrayList<Cliente> lista, String contraseña){
        boolean dentro = false;
         for (Cliente k: lista){
            String correoComparado = k.getCorreo();
            dentro = correo.equals(correoComparado);
            if (dentro){
                if (!k.getClave().equals(contraseña)){
                    dentro = false;
                }
                
                
                break;
            }
        }
        if (dentro == false){
            System.out.println("Correo o contraseña incorrecta");
        }
        return dentro;
    }        
        
    /**
     * Obtiene el cliente al que pertenece dicho correo
     * @param correo String introducido por usuario
     * @param lista	ArrayList de objetos cliente
     * @return	Objeto CLiente
     */
    public static Cliente checkCliente(String correo, ArrayList<Cliente> lista){
        boolean coincide = false;
        Cliente elem = new Cliente();
        for (Cliente k: lista){
            String correoComparado = k.getCorreo();
            coincide = correo.equals(correoComparado);
            if (coincide){
                elem = k;
                return elem;
            }
            
        }
        return elem;
        
    }
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

    public LoginRegister() {
        initComponents();
        setLocationRelativeTo(null);
        Error.setVisible(false);
    }


    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        JAVAPOP = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        Register = new javax.swing.JButton();
        Correo = new javax.swing.JTextField();
        Error = new javax.swing.JLabel();
        Contraseña = new javax.swing.JPasswordField();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 170, 149));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));

        JAVAPOP.setFont(new java.awt.Font("Mistral", 1, 70)); // NOI18N
        JAVAPOP.setForeground(new java.awt.Color(220, 220, 220));
        JAVAPOP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JAVAPOP.setText("JAVAPOP");

        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        Register.setText("Register");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });

        Correo.setText("Correo");
        Correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CorreoMouseClicked(evt);
            }
        });

        Error.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        Error.setForeground(new java.awt.Color(255, 0, 0));
        Error.setText("Correo o contraseña incorrectos");

        Contraseña.setText("Contraseña");
        Contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContraseñaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JAVAPOP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Correo, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(Error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Contraseña))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(JAVAPOP)
                .addGap(48, 48, 48)
                .addComponent(Error)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        Registro registro =new Registro();
        this.dispose();
        registro.setVisible(true);
    }//GEN-LAST:event_RegisterActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        
        
        String usuario= Correo.getText();
        String contraseña= Contraseña.getText();
        if(comparaUsuario(usuario,DatosPrograma.clientes,contraseña)){
            this.cliente=checkCliente(usuario,DatosPrograma.clientes);
            OpcionesUsuario opciones=new OpcionesUsuario();
            this.setVisible(false);
            opciones.setVisible(true);
        }else if(usuario.equals("admin@javapop.com") && contraseña.equals("admin")){
            Administrador administrador=new Administrador();
            this.dispose();
            administrador.setVisible(true);
        }else{
            Error.setVisible(true);
        }
    }//GEN-LAST:event_LoginActionPerformed

    private void ContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContraseñaMouseClicked
        Contraseña.setText("");
    }//GEN-LAST:event_ContraseñaMouseClicked

    private void CorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CorreoMouseClicked
        Correo.setText("");    }//GEN-LAST:event_CorreoMouseClicked

 
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
            java.util.logging.Logger.getLogger(LoginRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginRegister().setVisible(true);
            }
        });
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JTextField Correo;
    private javax.swing.JLabel Error;
    private javax.swing.JLabel JAVAPOP;
    private javax.swing.JButton Login;
    private javax.swing.JButton Register;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
