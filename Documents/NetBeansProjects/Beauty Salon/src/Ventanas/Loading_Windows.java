package Ventanas;


import com.sun.source.tree.TryTree;
import java.awt.Color;
import java.awt.SplashScreen;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Hilda
 */
public class Loading_Windows extends javax.swing.JFrame {

    private static SplashScreen SplashScreen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Creates new form NewJFrame
     */
    public Loading_Windows() {
        
        initComponents();
        panel_login.setBackground(new Color (212,176,155,170));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_login = new javax.swing.JPanel();
        label_Nombre_Salon = new javax.swing.JLabel();
        Loadinbg_Icon = new javax.swing.JLabel();
        Label_ProgressBar_Value = new javax.swing.JLabel();
        LoadingBar = new javax.swing.JProgressBar();
        Label_Loading = new javax.swing.JLabel();
        bgImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 50));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_login.setBackground(new java.awt.Color(212, 176, 155));
        panel_login.setEnabled(false);
        panel_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_Nombre_Salon.setBackground(new java.awt.Color(0, 0, 0));
        label_Nombre_Salon.setFont(new java.awt.Font("Poor Richard", 0, 120)); // NOI18N
        label_Nombre_Salon.setForeground(new java.awt.Color(0, 0, 0));
        label_Nombre_Salon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Nombre_Salon.setText("<html><p>Beauty Salon </p><p>&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;& Spa</p></html>");
        label_Nombre_Salon.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        panel_login.add(label_Nombre_Salon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 690, 310));

        Loadinbg_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Loading_Icon.png"))); // NOI18N
        panel_login.add(Loadinbg_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, -1, 110));

        getContentPane().add(panel_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 450));

        Label_ProgressBar_Value.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Label_ProgressBar_Value.setForeground(new java.awt.Color(255, 255, 255));
        Label_ProgressBar_Value.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Label_ProgressBar_Value.setText("0%");
        Label_ProgressBar_Value.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Label_ProgressBar_Value, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, 40, 20));

        LoadingBar.setBackground(new java.awt.Color(0, 0, 0));
        LoadingBar.setForeground(new java.awt.Color(212, 176, 155));
        getContentPane().add(LoadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 690, 20));

        Label_Loading.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Label_Loading.setForeground(new java.awt.Color(255, 255, 255));
        Label_Loading.setText("Loading...");
        Label_Loading.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Label_Loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 210, 20));

        bgImage.setBackground(new java.awt.Color(212, 176, 155));
        bgImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Loading_bg.jpg"))); // NOI18N
        bgImage.setText("jLabel1");
        bgImage.setMaximumSize(new java.awt.Dimension(1000, 2000));
        bgImage.setMinimumSize(new java.awt.Dimension(1000, 2000));
        bgImage.setPreferredSize(new java.awt.Dimension(500, 600));
        bgImage.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bgImageMouseDragged(evt);
            }
        });
        bgImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bgImageMousePressed(evt);
            }
        });
        getContentPane().add(bgImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bgImageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgImageMousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_bgImageMousePressed
    
    private void bgImageMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgImageMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();

	int y = evt.getYOnScreen();

	Loading_Windows.this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_bgImageMouseDragged
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new Loading_Windows().setVisible(false);
            //Loading_Windows();
        });
        
        Loading_Windows sp = new Loading_Windows();
         sp.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(100);
                sp.LoadingBar.setValue(i);
                sp.Label_ProgressBar_Value.setText(i+"%");
                if (i == 10) {
                    sp.Label_Loading.setText("Turning on Modules...");
                }
                if (i == 20) {
                    sp.Label_Loading.setText("Loading Modules...");
                }
                if (i == 50) {
                    sp.Label_Loading.setText("Connecting to database...");
                }
                if (i == 70) {
                    sp.Label_Loading.setText("Connection Succesfull !");
                }
                if (i == 80) {
                    sp.Label_Loading.setText("Launching Application...");
                }
            }
            sp.dispose();
            Log_in_window log_in =new Log_in_window();
            log_in.setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
            
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_Loading;
    private javax.swing.JLabel Label_ProgressBar_Value;
    private javax.swing.JLabel Loadinbg_Icon;
    private javax.swing.JProgressBar LoadingBar;
    private javax.swing.JLabel bgImage;
    private javax.swing.JLabel label_Nombre_Salon;
    private javax.swing.JPanel panel_login;
    // End of variables declaration//GEN-END:variables
    private int xx, xy;
    private SplashScreen sp;
}
