package Ventanas;


import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Hilda
 */
public class Facturación  extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Facturación() {
        initComponents();
        panel_transparent.setBackground(new Color (212,176,155,200));
        panel_Transparent1.setBackground(new Color (255,255,255,200));
        panel_Transparent2.setBackground(new Color (255,255,255,200));
        panel_Transparent3.setBackground(new Color (255,255,255,200));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_transparent = new javax.swing.JPanel();
        label_Nombre = new javax.swing.JLabel();
        panel_Transparent1 = new javax.swing.JPanel();
        label_titulo1 = new javax.swing.JLabel();
        HOME_ICON = new javax.swing.JLabel();
        TextField_Nombre = new javax.swing.JTextField();
        Label_No_Contacto = new javax.swing.JLabel();
        Panel_Tab = new javax.swing.JPanel();
        Label_Lista_clientes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_Buscar = new javax.swing.JLabel();
        panel_Transparent2 = new javax.swing.JPanel();
        panel_Transparent3 = new javax.swing.JPanel();
        label_titulo_Facturacion = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        bgImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 50));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_transparent.setBackground(new java.awt.Color(212, 176, 155));
        panel_transparent.setEnabled(false);
        panel_transparent.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panel_transparentMouseDragged(evt);
            }
        });
        panel_transparent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_transparentMousePressed(evt);
            }
        });
        panel_transparent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_Nombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label_Nombre.setText("NOMBRE:");
        panel_transparent.add(label_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 70, -1));

        panel_Transparent1.setBackground(new java.awt.Color(255, 255, 255));

        label_titulo1.setBackground(new java.awt.Color(105, 87, 86));
        label_titulo1.setFont(new java.awt.Font("Poor Richard", 1, 36)); // NOI18N
        label_titulo1.setForeground(new java.awt.Color(105, 87, 86));
        label_titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_titulo1.setText("BEAUTY SALON & SPA");
        label_titulo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        HOME_ICON.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HOME_ICON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/HOME_ICON.png"))); // NOI18N
        HOME_ICON.setFocusable(false);
        HOME_ICON.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        HOME_ICON.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HOME_ICONMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HOME_ICONMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HOME_ICONMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_Transparent1Layout = new javax.swing.GroupLayout(panel_Transparent1);
        panel_Transparent1.setLayout(panel_Transparent1Layout);
        panel_Transparent1Layout.setHorizontalGroup(
            panel_Transparent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_Transparent1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HOME_ICON, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 282, Short.MAX_VALUE)
                .addComponent(label_titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(269, 269, 269))
        );
        panel_Transparent1Layout.setVerticalGroup(
            panel_Transparent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Transparent1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_Transparent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_titulo1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(HOME_ICON, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_transparent.add(panel_Transparent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 60));

        TextField_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_NombreActionPerformed(evt);
            }
        });
        panel_transparent.add(TextField_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 300, 40));

        Label_No_Contacto.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Label_No_Contacto.setText("NO. CONTACTO:");
        panel_transparent.add(Label_No_Contacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 100, -1));

        Panel_Tab.setBackground(new java.awt.Color(128, 76, 46));

        Label_Lista_clientes.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Label_Lista_clientes.setForeground(new java.awt.Color(255, 255, 255));
        Label_Lista_clientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Lista_clientes.setText("Lista de Clientes ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Cliente_Nombre", "Numero_Tel", "Servicios", "Compras de productos", "Total", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout Panel_TabLayout = new javax.swing.GroupLayout(Panel_Tab);
        Panel_Tab.setLayout(Panel_TabLayout);
        Panel_TabLayout.setHorizontalGroup(
            Panel_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_TabLayout.createSequentialGroup()
                .addContainerGap(368, Short.MAX_VALUE)
                .addComponent(Label_Lista_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(317, 317, 317))
        );
        Panel_TabLayout.setVerticalGroup(
            Panel_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_TabLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(Label_Lista_clientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_transparent.add(Panel_Tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 297, 920, -1));

        btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Buscar_White.png"))); // NOI18N
        btn_Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_BuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_BuscarMouseExited(evt);
            }
        });
        panel_transparent.add(btn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 220, 220, 40));

        panel_Transparent2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_Transparent2Layout = new javax.swing.GroupLayout(panel_Transparent2);
        panel_Transparent2.setLayout(panel_Transparent2Layout);
        panel_Transparent2Layout.setHorizontalGroup(
            panel_Transparent2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1130, Short.MAX_VALUE)
        );
        panel_Transparent2Layout.setVerticalGroup(
            panel_Transparent2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );

        panel_transparent.add(panel_Transparent2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 1130, -1));

        panel_Transparent3.setBackground(new java.awt.Color(255, 255, 255));

        label_titulo_Facturacion.setBackground(new java.awt.Color(105, 87, 86));
        label_titulo_Facturacion.setFont(new java.awt.Font("Palatino Linotype", 1, 36)); // NOI18N
        label_titulo_Facturacion.setForeground(new java.awt.Color(105, 87, 86));
        label_titulo_Facturacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_titulo_Facturacion.setText("Facturación");
        label_titulo_Facturacion.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        label_titulo_Facturacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_titulo_Facturacion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout panel_Transparent3Layout = new javax.swing.GroupLayout(panel_Transparent3);
        panel_Transparent3.setLayout(panel_Transparent3Layout);
        panel_Transparent3Layout.setHorizontalGroup(
            panel_Transparent3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Transparent3Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(label_titulo_Facturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        panel_Transparent3Layout.setVerticalGroup(
            panel_Transparent3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Transparent3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_titulo_Facturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_transparent.add(panel_Transparent3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 89, 400, 50));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        panel_transparent.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 222, 180, 40));

        getContentPane().add(panel_transparent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 720));

        bgImage.setBackground(new java.awt.Color(212, 176, 155));
        bgImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg_Registros.jpg"))); // NOI18N
        bgImage.setText("jLabel1");
        bgImage.setMaximumSize(new java.awt.Dimension(1000, 2000));
        bgImage.setMinimumSize(new java.awt.Dimension(1000, 2000));
        bgImage.setPreferredSize(new java.awt.Dimension(500, 600));
        getContentPane().add(bgImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
   
    private void panel_transparentMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_transparentMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();

	int y = evt.getYOnScreen();

	Facturación.this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_panel_transparentMouseDragged

    private void panel_transparentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_transparentMousePressed
        // TODO add your handling code here:\
        xx = evt.getX();
        xy = evt.getY();  
    }//GEN-LAST:event_panel_transparentMousePressed

    private void TextField_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_NombreActionPerformed

    private void btn_BuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BuscarMouseEntered
        // TODO add your handling code here:
        btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Buscar_Brown.png")));
    }//GEN-LAST:event_btn_BuscarMouseEntered

    private void btn_BuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BuscarMouseExited
        // TODO add your handling code here:
        btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Buscar_White.png")));
    }//GEN-LAST:event_btn_BuscarMouseExited

    private void HOME_ICONMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOME_ICONMouseEntered
        // TODO add your handling code here:
        HOME_ICON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/HOME_ICON_LIGHTBROWN.png")));
    }//GEN-LAST:event_HOME_ICONMouseEntered

    private void HOME_ICONMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOME_ICONMouseExited
        // TODO add your handling code here:
        HOME_ICON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/HOME_ICON.png")));
    }//GEN-LAST:event_HOME_ICONMouseExited

    private void HOME_ICONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOME_ICONMouseClicked
        // TODO add your handling code here:
        Home_Windows cw = new Home_Windows();
        cw.setVisible(true);
        dispose();
    }//GEN-LAST:event_HOME_ICONMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Contabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contabilidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HOME_ICON;
    private javax.swing.JLabel Label_Lista_clientes;
    private javax.swing.JLabel Label_No_Contacto;
    private javax.swing.JPanel Panel_Tab;
    private javax.swing.JTextField TextField_Nombre;
    private javax.swing.JLabel bgImage;
    private javax.swing.JLabel btn_Buscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel label_Nombre;
    private javax.swing.JLabel label_titulo1;
    private javax.swing.JLabel label_titulo_Facturacion;
    private javax.swing.JPanel panel_Transparent1;
    private javax.swing.JPanel panel_Transparent2;
    private javax.swing.JPanel panel_Transparent3;
    private javax.swing.JPanel panel_transparent;
    // End of variables declaration//GEN-END:variables
    private int xx, xy;
}
