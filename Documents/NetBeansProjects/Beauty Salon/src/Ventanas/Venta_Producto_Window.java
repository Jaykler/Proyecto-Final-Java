package Ventanas;


import Clases.Intangible;
import Clases.Tangible;
import Clases.Utilidades;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Hilda
 */
public class Venta_Producto_Window extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    String[] columna = {"Id Cliente", "Nombre", "Telefono", "Correo"};
    String[] columna1 = {"Id Producto", "Nombre", "Precio", "Cantidad"};
    public Venta_Producto_Window() {
        initComponents();
        panel_transparent.setBackground(new Color (212,176,155,200));
        panel_Transparent1.setBackground(new Color (255,255,255,200));
        //panel_Transparent2.setBackground(new Color (255,255,255,200));
        Panel_Busqueda_Cliente.setBackground(new Color (212,176,155,200));
        Tclientes.setModel(new DefaultTableModel(Utilidades.FiltrarClientes(new int[] {0, 0, 0},new String[] {"", "", ""}, Clases.Clientes.clientes), columna));
        Tproductos.setModel(new DefaultTableModel(Utilidades.FiltrarProductos(Tangible.tangibles), columna1));
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
        panel_Transparent1 = new javax.swing.JPanel();
        HOME_ICON = new javax.swing.JLabel();
        label_titulo2 = new javax.swing.JLabel();
        Panel_Busqueda_Cliente = new javax.swing.JPanel();
        label_Nombre = new javax.swing.JLabel();
        label_No_contacto = new javax.swing.JLabel();
        TFnom = new javax.swing.JTextField();
        TFtel = new javax.swing.JTextField();
        Label_Email = new javax.swing.JLabel();
        TFcorreo = new javax.swing.JTextField();
        btn_Buscar = new javax.swing.JLabel();
        Panel_Tabla = new javax.swing.JPanel();
        Label_Lista_Clientes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tclientes = new javax.swing.JTable();
        panel_Productos = new javax.swing.JPanel();
        label_Productos = new javax.swing.JLabel();
        scrollpanel_6 = new javax.swing.JScrollPane();
        Tproductos = new javax.swing.JTable();
        panel_ResumenServ = new javax.swing.JPanel();
        label_Titlulo = new javax.swing.JLabel();
        scrollpanel_Resumen = new javax.swing.JScrollPane();
        Tresumen = new javax.swing.JTable();
        TFtotal = new javax.swing.JTextField();
        label_total = new javax.swing.JLabel();
        btn_Facturar = new javax.swing.JLabel();
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

        panel_Transparent1.setBackground(new java.awt.Color(255, 255, 255));
        panel_Transparent1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        panel_Transparent1.add(HOME_ICON, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 47, 50));

        label_titulo2.setBackground(new java.awt.Color(105, 87, 86));
        label_titulo2.setFont(new java.awt.Font("Palatino Linotype", 1, 40)); // NOI18N
        label_titulo2.setForeground(new java.awt.Color(105, 87, 86));
        label_titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_titulo2.setText("Productos ");
        label_titulo2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        label_titulo2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panel_Transparent1.add(label_titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 370, 32));

        panel_transparent.add(panel_Transparent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 60));

        Panel_Busqueda_Cliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        Panel_Busqueda_Cliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_Nombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label_Nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Nombre.setText("NOMBRE:");
        label_Nombre.setFocusable(false);
        label_Nombre.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Panel_Busqueda_Cliente.add(label_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 110, 40));

        label_No_contacto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label_No_contacto.setText("NO. CONTACTO:");
        Panel_Busqueda_Cliente.add(label_No_contacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 130, 40));

        TFnom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TFnom.setBorder(null);
        TFnom.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Panel_Busqueda_Cliente.add(TFnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 750, 40));

        TFtel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFtelActionPerformed(evt);
            }
        });
        Panel_Busqueda_Cliente.add(TFtel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 300, 40));

        Label_Email.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Label_Email.setText("CORREO ELECTRONICO:");
        Panel_Busqueda_Cliente.add(Label_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, 40));

        TFcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFcorreoActionPerformed(evt);
            }
        });
        Panel_Busqueda_Cliente.add(TFcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, 240, 40));

        btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Buscar_White.png"))); // NOI18N
        btn_Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_BuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_BuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_BuscarMouseExited(evt);
            }
        });
        Panel_Busqueda_Cliente.add(btn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 210, 40));

        Panel_Tabla.setBackground(new java.awt.Color(128, 76, 46));

        Label_Lista_Clientes.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Label_Lista_Clientes.setForeground(new java.awt.Color(255, 255, 255));
        Label_Lista_Clientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Lista_Clientes.setText("LISTA DE CLIENTES");

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));

        Tclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Cliente_Nombre", "Numero_tel", "Correo_electronico", "Direccion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tclientes);

        javax.swing.GroupLayout Panel_TablaLayout = new javax.swing.GroupLayout(Panel_Tabla);
        Panel_Tabla.setLayout(Panel_TablaLayout);
        Panel_TablaLayout.setHorizontalGroup(
            Panel_TablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_TablaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Label_Lista_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(278, 278, 278))
        );
        Panel_TablaLayout.setVerticalGroup(
            Panel_TablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_TablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_Lista_Clientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );

        Panel_Busqueda_Cliente.add(Panel_Tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 950, 140));

        panel_transparent.add(Panel_Busqueda_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 990, 330));

        panel_Productos.setBackground(new java.awt.Color(128, 76, 46));
        panel_Productos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_Productos.setBackground(new java.awt.Color(255, 255, 255));
        label_Productos.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        label_Productos.setForeground(new java.awt.Color(255, 255, 255));
        label_Productos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Productos.setText("Productos");
        panel_Productos.add(label_Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 160, 30));

        Tproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Producto", "Precio", "Agregar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tproductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TproductosMouseClicked(evt);
            }
        });
        scrollpanel_6.setViewportView(Tproductos);

        panel_Productos.add(scrollpanel_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 490, 196));

        panel_transparent.add(panel_Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 490, 240));

        panel_ResumenServ.setBackground(new java.awt.Color(255, 255, 255));
        panel_ResumenServ.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        panel_ResumenServ.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_Titlulo.setBackground(new java.awt.Color(255, 255, 255));
        label_Titlulo.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        label_Titlulo.setForeground(new java.awt.Color(128, 76, 46));
        label_Titlulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Titlulo.setText("Resumen de Compra");
        panel_ResumenServ.add(label_Titlulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 470, 30));

        scrollpanel_Resumen.setBackground(new java.awt.Color(128, 76, 46));

        Tresumen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Precio", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tresumen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TresumenMouseClicked(evt);
            }
        });
        scrollpanel_Resumen.setViewportView(Tresumen);

        panel_ResumenServ.add(scrollpanel_Resumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 450, 160));

        TFtotal.setEditable(false);
        TFtotal.setBackground(new java.awt.Color(255, 255, 255));
        panel_ResumenServ.add(TFtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 110, 30));

        label_total.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label_total.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_total.setText("TOTAL A PAGAR:");
        panel_ResumenServ.add(label_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 130, 20));

        panel_transparent.add(panel_ResumenServ, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 490, 240));

        btn_Facturar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Facturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Facturar_White_Facturacion.png"))); // NOI18N
        btn_Facturar.setMaximumSize(new java.awt.Dimension(204, 36));
        btn_Facturar.setMinimumSize(new java.awt.Dimension(200, 36));
        btn_Facturar.setPreferredSize(new java.awt.Dimension(204, 36));
        btn_Facturar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_FacturarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_FacturarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_FacturarMouseExited(evt);
            }
        });
        panel_transparent.add(btn_Facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 670, 200, -1));

        getContentPane().add(panel_transparent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 720));

        bgImage.setBackground(new java.awt.Color(212, 176, 155));
        bgImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds_Fondo/bg_Registros.jpg"))); // NOI18N
        bgImage.setText("jLabel1");
        bgImage.setMaximumSize(new java.awt.Dimension(1000, 2000));
        bgImage.setMinimumSize(new java.awt.Dimension(1000, 2000));
        bgImage.setPreferredSize(new java.awt.Dimension(500, 600));
        getContentPane().add(bgImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void panel_transparentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_transparentMousePressed
        // TODO add your handling code here:\
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_panel_transparentMousePressed

    private void panel_transparentMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_transparentMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();

        int y = evt.getYOnScreen();

        Venta_Producto_Window.this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_panel_transparentMouseDragged

    private void TFcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFcorreoActionPerformed

    private void TFtelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFtelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFtelActionPerformed

    private void HOME_ICONMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOME_ICONMouseExited
        // TODO add your handling code here:
        HOME_ICON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/HOME_ICON.png")));
    }//GEN-LAST:event_HOME_ICONMouseExited

    private void HOME_ICONMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOME_ICONMouseEntered
        // TODO add your handling code here:
        HOME_ICON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/HOME_ICON_LIGHTBROWN.png")));
    }//GEN-LAST:event_HOME_ICONMouseEntered

    private void HOME_ICONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOME_ICONMouseClicked
        // TODO add your handling code here:
        SQL.Guardar.guardar();
        new Home_Windows().setVisible(true);
        dispose();
    }//GEN-LAST:event_HOME_ICONMouseClicked

    private void btn_BuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BuscarMouseEntered
        // TODO add your handling code here:
        btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Buscar_Brown.png")));
    }//GEN-LAST:event_btn_BuscarMouseEntered

    private void btn_BuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BuscarMouseExited
        // TODO add your handling code here:
        btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Buscar_White.png")));
    }//GEN-LAST:event_btn_BuscarMouseExited

    private void btn_FacturarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_FacturarMouseEntered
        // TODO add your handling code here:
        btn_Facturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Facturar_Brown_Facturacion.png")));
    }//GEN-LAST:event_btn_FacturarMouseEntered

    private void btn_FacturarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_FacturarMouseExited
        // TODO add your handling code here:
        btn_Facturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Facturar_White_Facturacion.png")));
    }//GEN-LAST:event_btn_FacturarMouseExited

    private void btn_BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BuscarMouseClicked
        int f1 = TFnom.getText().equals("")? 0: 1;
        int f2 = TFtel.getText().equals("")? 0: 1;
        int f3 = TFcorreo.getText().equals("")? 0: 1;
        
        int[] filtros = {f1, f2, f3};
        
        String[] values = {TFnom.getText(), TFtel.getText(), TFcorreo.getText()};
        
        Tclientes.setModel(new DefaultTableModel(Clases.Utilidades.FiltrarClientes(filtros,values, Clases.Clientes.clientes), columna));
    }//GEN-LAST:event_btn_BuscarMouseClicked

    private void TproductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TproductosMouseClicked
        Utilidades.Agregar_a_resumen2(Tproductos, Tresumen, TFtotal);
    }//GEN-LAST:event_TproductosMouseClicked

    private void TresumenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TresumenMouseClicked
        Utilidades.Eliminar_de_resumen2(Tresumen, TFtotal);
    }//GEN-LAST:event_TresumenMouseClicked

    private void btn_FacturarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_FacturarMouseClicked
        
        if(Tclientes.getSelectedRow() != -1){
            int o = JOptionPane.showConfirmDialog(null, "Realizar compra?");
        
            if(o == JOptionPane.YES_OPTION){
            
                for(int i = 0; i < Tresumen.getRowCount(); i++){
                    for(int y = 0; y < Tangible.tangibles.size(); y++){
                        if(Tangible.tangibles.get(y).getNombre().equals(Tresumen.getValueAt(i, 0).toString())){
                            Tangible dan = Tangible.tangibles.get(y);
                            dan.modificar(new Object[] {dan.getId_producto(), Tresumen.getValueAt(i, 2)});
                            break;
                        }
                    }
                }
            
                JOptionPane.showMessageDialog(null, "Compra realizada");
                Tproductos.setModel(new DefaultTableModel(Utilidades.FiltrarProductos(Tangible.tangibles), columna1));
            }
        }else{
            JOptionPane.showMessageDialog(null, "Elija el cliente que realiza la compra");
        }
        
    }//GEN-LAST:event_btn_FacturarMouseClicked
    
   
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
            java.util.logging.Logger.getLogger(Venta_Producto_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venta_Producto_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venta_Producto_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venta_Producto_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Venta_Producto_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HOME_ICON;
    private javax.swing.JLabel Label_Email;
    private javax.swing.JLabel Label_Lista_Clientes;
    private javax.swing.JPanel Panel_Busqueda_Cliente;
    private javax.swing.JPanel Panel_Tabla;
    private javax.swing.JTextField TFcorreo;
    private javax.swing.JTextField TFnom;
    private javax.swing.JTextField TFtel;
    private javax.swing.JTextField TFtotal;
    private javax.swing.JTable Tclientes;
    private javax.swing.JTable Tproductos;
    private javax.swing.JTable Tresumen;
    private javax.swing.JLabel bgImage;
    private javax.swing.JLabel btn_Buscar;
    private javax.swing.JLabel btn_Facturar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_No_contacto;
    private javax.swing.JLabel label_Nombre;
    private javax.swing.JLabel label_Productos;
    private javax.swing.JLabel label_Titlulo;
    private javax.swing.JLabel label_titulo2;
    private javax.swing.JLabel label_total;
    private javax.swing.JPanel panel_Productos;
    private javax.swing.JPanel panel_ResumenServ;
    private javax.swing.JPanel panel_Transparent1;
    private javax.swing.JPanel panel_transparent;
    private javax.swing.JScrollPane scrollpanel_6;
    private javax.swing.JScrollPane scrollpanel_Resumen;
    // End of variables declaration//GEN-END:variables
    private int xx, xy;
}
