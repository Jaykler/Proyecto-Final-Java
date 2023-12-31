package Ventanas;


import Clases.Citas;
import Clases.Intangible;
import Clases.Utilidades;
import java.awt.Color;
import java.awt.JobAttributes;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Hilda
 */
public class Servicios_Window extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    String[] columnas = {"ID", "Producto", "Precio"};
    int id_cliente;
    String nombre;
    String telefono;
    String correo;
    int id_cita;
    
    public Servicios_Window(String[] set) {
        initComponents();
        panel_Main.setBackground(new Color (212,176,155,200));
        panel_Transparent1.setBackground(new Color (255,255,255,200));
        panel_Transparent2.setBackground(new Color (255,255,255,200));
        panel_Transparent3.setBackground(new Color (255,255,255,200));
        Tgeneral.setModel(new DefaultTableModel(Utilidades.Filtrarservicios(1, Intangible.intangibles), columnas));
        Tcejas.setModel(new DefaultTableModel(Utilidades.Filtrarservicios(2, Intangible.intangibles), columnas));
        Tcortes.setModel(new DefaultTableModel(Utilidades.Filtrarservicios(3, Intangible.intangibles), columnas));
        Tmaquillaje.setModel(new DefaultTableModel(Utilidades.Filtrarservicios(4, Intangible.intangibles), columnas));
        Tdepilacion.setModel(new DefaultTableModel(Utilidades.Filtrarservicios(5, Intangible.intangibles), columnas));
        
        this.id_cliente = Integer.parseInt(set[0]);
        this.nombre = set[1];
        this.telefono = set[2];
        this.correo = set[3];
        this.id_cita = Integer.parseInt(set[4]);
        
        TFnom.setText(nombre);
        TFtel.setText(telefono);
        
        String[] horas = new String[25];
        int h = 8;
        for(int i = 0; i < horas.length; i++){
            if(i%2 == 0){
                horas[i] = h + ":00";
            }else{
                horas[i] = h + ":30";
                h++;
            }
        }
        
        CBhoras.setModel(new DefaultComboBoxModel(horas));
        CBhoras.setSelectedIndex(-1);
        Date hoy = new Date();
        DCfecha.setMinSelectableDate(hoy);
        
        Citas cita = new Citas();
        for(int i = 0; i < Citas.citas.size(); i++){
            if(Citas.citas.get(i).getId() == id_cita){
                cita = Citas.citas.get(i);
                break;
            }
        }
        
        String[][] modelo = new String[cita.getLista_servicios().size()][2];
        for(int i = 0; i < cita.getLista_servicios().size(); i++){
            modelo[i][0] = cita.getLista_servicios().get(i).getNombre();
            modelo[i][1] = String.valueOf(cita.getLista_servicios().get(i).getPrecio());
        }
        
        Tresumen.setModel(new DefaultTableModel(modelo, new String[] {"Servicio", "Precio"}));
        
        int total = 0;
        
        for(int i = 0; i < Tresumen.getRowCount() - 1; i++){
            total += Integer.parseInt(Tresumen.getValueAt(i, 1).toString());
        }
            
        TFtotal.setText(String.valueOf(total));
        DateFormat df = new SimpleDateFormat("y,MMMM,d");
        Date mod = new Date();
        
        String fecha = cita.getFecha().split(" ")[0];
        String[] comps = fecha.split("-");
        
        String year = comps[0];
        
        int moth = Integer.parseInt(comps[1]);
        
        String month = "";
        month = switch(moth){
            case 1 -> "enero";
            case 2 -> "febrero";
            case 3 -> "marzo";
            case 4 -> "abril";
            case 5 -> "mayo";
            case 6 -> "junio";
            case 7 -> "julio";
            case 8 -> "agosto";
            case 9 -> "septiembre";
            case 10 -> "octubre";
            case 11 -> "noviembre";
            case 12 -> "diciembre";
            default -> "Xs";
        };
        
        String day = comps[2];
        
        fecha = year + "," + month + "," + day;
        
        try {
            mod = df.parse(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(Servicios_Window.class.getName()).log(Level.SEVERE, null, ex);
        }
        DCfecha.setDate(mod);
        
        String hora = cita.getFecha().split(" ")[1];
        
        hora = hora.substring(0, 5);
        
        CBhoras.setSelectedItem(hora);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        panel_Main = new javax.swing.JPanel();
        panel_Transparent1 = new javax.swing.JPanel();
        label_titulo1 = new javax.swing.JLabel();
        HOME_ICON = new javax.swing.JLabel();
        label_Nombre = new javax.swing.JLabel();
        TFnom = new javax.swing.JTextField();
        label_No_contacto = new javax.swing.JLabel();
        TFtel = new javax.swing.JTextField();
        Label_Fecha = new javax.swing.JLabel();
        DCfecha = new com.toedter.calendar.JDateChooser();
        Label_Hora = new javax.swing.JLabel();
        CBhoras = new javax.swing.JComboBox<>();
        label_Bordered = new javax.swing.JLabel();
        tbtn_Depilacion = new javax.swing.JToggleButton();
        tbtn_Cortes = new javax.swing.JToggleButton();
        tbtn_Servicios_generales = new javax.swing.JToggleButton();
        tbtn_Limpieza_Cejas = new javax.swing.JToggleButton();
        tbtn_Maquillaje = new javax.swing.JToggleButton();
        Panel_Servicios = new javax.swing.JPanel();
        panel_ServiciosGen = new javax.swing.JPanel();
        label_ServiceGen = new javax.swing.JLabel();
        scrollpanel_1 = new javax.swing.JScrollPane();
        Tgeneral = new javax.swing.JTable();
        panel_LimpiezaCeja = new javax.swing.JPanel();
        label_LimpiezaCejas = new javax.swing.JLabel();
        scrollpanel_2 = new javax.swing.JScrollPane();
        Tcejas = new javax.swing.JTable();
        panel_Cortes = new javax.swing.JPanel();
        label_Cortes = new javax.swing.JLabel();
        scrollpanel_3 = new javax.swing.JScrollPane();
        Tcortes = new javax.swing.JTable();
        panel_Maquillaje = new javax.swing.JPanel();
        label_Maquillaje = new javax.swing.JLabel();
        scrollpanel_4 = new javax.swing.JScrollPane();
        Tmaquillaje = new javax.swing.JTable();
        panel_Depilacion = new javax.swing.JPanel();
        label_Depilacion = new javax.swing.JLabel();
        scrollpanel_5 = new javax.swing.JScrollPane();
        Tdepilacion = new javax.swing.JTable();
        panel_ResumenServ = new javax.swing.JPanel();
        label_Titlulo = new javax.swing.JLabel();
        scrollpanel_Resumen = new javax.swing.JScrollPane();
        Tresumen = new javax.swing.JTable();
        TFtotal = new javax.swing.JTextField();
        label_total = new javax.swing.JLabel();
        panel_Transparent3 = new javax.swing.JPanel();
        label_titulo = new javax.swing.JLabel();
        panel_Transparent2 = new javax.swing.JPanel();
        btn_Cancelar_Cita = new javax.swing.JLabel();
        btn_Modificar_Cita1 = new javax.swing.JLabel();
        bgImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 50));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Main.setBackground(new java.awt.Color(212, 176, 155));
        panel_Main.setEnabled(false);
        panel_Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        panel_Main.add(panel_Transparent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 60));

        label_Nombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label_Nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Nombre.setText("NOMBRE:");
        label_Nombre.setFocusable(false);
        label_Nombre.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        panel_Main.add(label_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 80, -1));

        TFnom.setEditable(false);
        TFnom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TFnom.setBorder(null);
        TFnom.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        panel_Main.add(TFnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 760, 40));

        label_No_contacto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label_No_contacto.setText("NO. CONTACTO:");
        panel_Main.add(label_No_contacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 120, -1));

        TFtel.setEditable(false);
        TFtel.setBackground(new java.awt.Color(255, 255, 255));
        panel_Main.add(TFtel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 300, 40));

        Label_Fecha.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Label_Fecha.setText("FECHA:");
        panel_Main.add(Label_Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 60, -1));

        DCfecha.setBackground(new java.awt.Color(255, 255, 255));
        DCfecha.setDateFormatString("y,MMMM,d");
        DCfecha.setMaxSelectableDate(new java.util.Date(1717218081000L));
        DCfecha.setMinSelectableDate(new java.util.Date(1672549281000L));
        panel_Main.add(DCfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 170, 40));

        Label_Hora.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Label_Hora.setText("HORA:");
        panel_Main.add(Label_Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 240, 60, -1));

        CBhoras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM" }));
        CBhoras.setSelectedIndex(-1);
        CBhoras.setActionCommand("comboBoxTime");
        panel_Main.add(CBhoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 220, 120, 40));

        label_Bordered.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label_Bordered.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Palatino Linotype", 0, 12))); // NOI18N
        panel_Main.add(label_Bordered, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 1020, 130));

        buttonGroup.add(tbtn_Depilacion);
        tbtn_Depilacion.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        tbtn_Depilacion.setForeground(new java.awt.Color(128, 76, 46));
        tbtn_Depilacion.setText("Depilación");
        tbtn_Depilacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbtn_DepilacionMouseClicked(evt);
            }
        });
        panel_Main.add(tbtn_Depilacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 300, 180, 40));

        buttonGroup.add(tbtn_Cortes);
        tbtn_Cortes.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        tbtn_Cortes.setForeground(new java.awt.Color(128, 76, 46));
        tbtn_Cortes.setText("Cortes");
        tbtn_Cortes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbtn_CortesMouseClicked(evt);
            }
        });
        panel_Main.add(tbtn_Cortes, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 180, 40));

        buttonGroup.add(tbtn_Servicios_generales);
        tbtn_Servicios_generales.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        tbtn_Servicios_generales.setForeground(new java.awt.Color(128, 76, 46));
        tbtn_Servicios_generales.setText("Servicios generales");
        tbtn_Servicios_generales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbtn_Servicios_generalesMouseClicked(evt);
            }
        });
        panel_Main.add(tbtn_Servicios_generales, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 180, 40));

        buttonGroup.add(tbtn_Limpieza_Cejas);
        tbtn_Limpieza_Cejas.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        tbtn_Limpieza_Cejas.setForeground(new java.awt.Color(128, 76, 46));
        tbtn_Limpieza_Cejas.setText("Limpieza de Cejas");
        tbtn_Limpieza_Cejas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbtn_Limpieza_CejasMouseClicked(evt);
            }
        });
        panel_Main.add(tbtn_Limpieza_Cejas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 180, 40));

        buttonGroup.add(tbtn_Maquillaje);
        tbtn_Maquillaje.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        tbtn_Maquillaje.setForeground(new java.awt.Color(128, 76, 46));
        tbtn_Maquillaje.setText("Maquillaje");
        tbtn_Maquillaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbtn_MaquillajeMouseClicked(evt);
            }
        });
        panel_Main.add(tbtn_Maquillaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, 180, 40));

        Panel_Servicios.setBackground(new java.awt.Color(128, 76, 46));
        Panel_Servicios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_ServiciosGen.setBackground(new java.awt.Color(128, 76, 46));
        panel_ServiciosGen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_ServiceGen.setBackground(new java.awt.Color(255, 255, 255));
        label_ServiceGen.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        label_ServiceGen.setForeground(new java.awt.Color(255, 255, 255));
        label_ServiceGen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_ServiceGen.setText("Servicios Generales");
        panel_ServiciosGen.add(label_ServiceGen, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 160, 30));

        Tgeneral.setModel(new javax.swing.table.DefaultTableModel(
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
        Tgeneral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TgeneralMouseClicked(evt);
            }
        });
        scrollpanel_1.setViewportView(Tgeneral);

        panel_ServiciosGen.add(scrollpanel_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 490, 196));

        Panel_Servicios.add(panel_ServiciosGen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, -1, 240));

        panel_LimpiezaCeja.setBackground(new java.awt.Color(128, 76, 46));
        panel_LimpiezaCeja.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_LimpiezaCejas.setBackground(new java.awt.Color(255, 255, 255));
        label_LimpiezaCejas.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        label_LimpiezaCejas.setForeground(new java.awt.Color(255, 255, 255));
        label_LimpiezaCejas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_LimpiezaCejas.setText("Limpieza de Cejas");
        panel_LimpiezaCeja.add(label_LimpiezaCejas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 160, 30));

        Tcejas.setModel(new javax.swing.table.DefaultTableModel(
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
        Tcejas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TcejasMouseClicked(evt);
            }
        });
        scrollpanel_2.setViewportView(Tcejas);
        if (Tcejas.getColumnModel().getColumnCount() > 0) {
            Tcejas.getColumnModel().getColumn(0).setMinWidth(25);
            Tcejas.getColumnModel().getColumn(0).setMaxWidth(20);
            Tcejas.getColumnModel().getColumn(2).setMinWidth(55);
            Tcejas.getColumnModel().getColumn(2).setMaxWidth(60);
            Tcejas.getColumnModel().getColumn(3).setMinWidth(55);
            Tcejas.getColumnModel().getColumn(3).setMaxWidth(50);
        }

        panel_LimpiezaCeja.add(scrollpanel_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 490, 196));

        Panel_Servicios.add(panel_LimpiezaCeja, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, -1, 240));

        panel_Cortes.setBackground(new java.awt.Color(128, 76, 46));
        panel_Cortes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_Cortes.setBackground(new java.awt.Color(255, 255, 255));
        label_Cortes.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        label_Cortes.setForeground(new java.awt.Color(255, 255, 255));
        label_Cortes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Cortes.setText("Cortes");
        panel_Cortes.add(label_Cortes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 160, 30));

        Tcortes.setModel(new javax.swing.table.DefaultTableModel(
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
        Tcortes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TcortesMouseClicked(evt);
            }
        });
        scrollpanel_3.setViewportView(Tcortes);

        panel_Cortes.add(scrollpanel_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 490, 196));

        Panel_Servicios.add(panel_Cortes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, -1, 240));

        panel_Maquillaje.setBackground(new java.awt.Color(128, 76, 46));
        panel_Maquillaje.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_Maquillaje.setBackground(new java.awt.Color(255, 255, 255));
        label_Maquillaje.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        label_Maquillaje.setForeground(new java.awt.Color(255, 255, 255));
        label_Maquillaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Maquillaje.setText("Maquillaje");
        panel_Maquillaje.add(label_Maquillaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 160, 30));

        Tmaquillaje.setModel(new javax.swing.table.DefaultTableModel(
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
        Tmaquillaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TmaquillajeMouseClicked(evt);
            }
        });
        scrollpanel_4.setViewportView(Tmaquillaje);

        panel_Maquillaje.add(scrollpanel_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 490, 196));

        Panel_Servicios.add(panel_Maquillaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, -1, 240));

        panel_Depilacion.setBackground(new java.awt.Color(128, 76, 46));
        panel_Depilacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_Depilacion.setBackground(new java.awt.Color(255, 255, 255));
        label_Depilacion.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        label_Depilacion.setForeground(new java.awt.Color(255, 255, 255));
        label_Depilacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Depilacion.setText("Depilación");
        panel_Depilacion.add(label_Depilacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 160, 30));

        Tdepilacion.setModel(new javax.swing.table.DefaultTableModel(
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
        Tdepilacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TdepilacionMouseClicked(evt);
            }
        });
        scrollpanel_5.setViewportView(Tdepilacion);

        panel_Depilacion.add(scrollpanel_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 490, 196));

        Panel_Servicios.add(panel_Depilacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, -1, 240));

        panel_Main.add(Panel_Servicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 490, 250));

        panel_ResumenServ.setBackground(new java.awt.Color(255, 255, 255));
        panel_ResumenServ.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        panel_ResumenServ.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_Titlulo.setBackground(new java.awt.Color(255, 255, 255));
        label_Titlulo.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        label_Titlulo.setForeground(new java.awt.Color(128, 76, 46));
        label_Titlulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Titlulo.setText("Resumen de Servicios");
        panel_ResumenServ.add(label_Titlulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 430, 30));

        scrollpanel_Resumen.setBackground(new java.awt.Color(128, 76, 46));

        Tresumen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
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
        if (Tresumen.getColumnModel().getColumnCount() > 0) {
            Tresumen.getColumnModel().getColumn(1).setMinWidth(50);
            Tresumen.getColumnModel().getColumn(1).setMaxWidth(60);
        }

        panel_ResumenServ.add(scrollpanel_Resumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 470, 180));

        TFtotal.setEditable(false);
        TFtotal.setBackground(new java.awt.Color(255, 255, 255));
        TFtotal.setToolTipText("");
        panel_ResumenServ.add(TFtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 80, 30));

        label_total.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label_total.setText("TOTAL:");
        panel_ResumenServ.add(label_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 60, 20));

        panel_Main.add(panel_ResumenServ, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 490, 250));

        panel_Transparent3.setBackground(new java.awt.Color(255, 255, 255));

        label_titulo.setBackground(new java.awt.Color(105, 87, 86));
        label_titulo.setFont(new java.awt.Font("Palatino Linotype", 1, 36)); // NOI18N
        label_titulo.setForeground(new java.awt.Color(105, 87, 86));
        label_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_titulo.setText("Reservación");
        label_titulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        label_titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_titulo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout panel_Transparent3Layout = new javax.swing.GroupLayout(panel_Transparent3);
        panel_Transparent3.setLayout(panel_Transparent3Layout);
        panel_Transparent3Layout.setHorizontalGroup(
            panel_Transparent3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_Transparent3Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        panel_Transparent3Layout.setVerticalGroup(
            panel_Transparent3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Transparent3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_Main.add(panel_Transparent3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 370, 50));

        panel_Transparent2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_Transparent2Layout = new javax.swing.GroupLayout(panel_Transparent2);
        panel_Transparent2.setLayout(panel_Transparent2Layout);
        panel_Transparent2Layout.setHorizontalGroup(
            panel_Transparent2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1130, Short.MAX_VALUE)
        );
        panel_Transparent2Layout.setVerticalGroup(
            panel_Transparent2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panel_Main.add(panel_Transparent2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 679, 1130, 40));

        btn_Cancelar_Cita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Cancelar_Cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Cancelar_White.png"))); // NOI18N
        btn_Cancelar_Cita.setMaximumSize(new java.awt.Dimension(204, 36));
        btn_Cancelar_Cita.setMinimumSize(new java.awt.Dimension(200, 36));
        btn_Cancelar_Cita.setPreferredSize(new java.awt.Dimension(204, 36));
        btn_Cancelar_Cita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Cancelar_CitaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Cancelar_CitaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Cancelar_CitaMouseExited(evt);
            }
        });
        panel_Main.add(btn_Cancelar_Cita, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 630, 120, -1));

        btn_Modificar_Cita1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Modificar_Cita1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Actualizar_White.png"))); // NOI18N
        btn_Modificar_Cita1.setMaximumSize(new java.awt.Dimension(204, 36));
        btn_Modificar_Cita1.setMinimumSize(new java.awt.Dimension(200, 36));
        btn_Modificar_Cita1.setPreferredSize(new java.awt.Dimension(204, 36));
        btn_Modificar_Cita1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Modificar_Cita1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Modificar_Cita1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Modificar_Cita1MouseExited(evt);
            }
        });
        panel_Main.add(btn_Modificar_Cita1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 620, 200, -1));

        getContentPane().add(panel_Main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 720));

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

   
    private void HOME_ICONMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOME_ICONMouseEntered
        // TODO add your handling code here:
        HOME_ICON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/HOME_ICON_LIGHTBROWN.png")));
    }//GEN-LAST:event_HOME_ICONMouseEntered

    private void HOME_ICONMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOME_ICONMouseExited
        // TODO add your handling code here:
        HOME_ICON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/HOME_ICON.png")));
    }//GEN-LAST:event_HOME_ICONMouseExited

    private void HOME_ICONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOME_ICONMouseClicked
        SQL.Guardar.guardar();
        new Home_Windows().setVisible(true);
        dispose();
    }//GEN-LAST:event_HOME_ICONMouseClicked

    private void tbtn_Servicios_generalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbtn_Servicios_generalesMouseClicked
        // TODO add your handling code here:
//        tbtn_Servicios_generales.setBackground(new java.awt.Color(128, 76, 46));
//        tbtn_Servicios_generales.setForeground(new java.awt.Color(255, 255, 255));
        panel_ServiciosGen.setVisible(true);
        panel_LimpiezaCeja.setVisible(false);
        panel_Cortes.setVisible(false);
        panel_Depilacion.setVisible(false);
        panel_Maquillaje.setVisible(false);
        
    }//GEN-LAST:event_tbtn_Servicios_generalesMouseClicked

    private void tbtn_Limpieza_CejasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbtn_Limpieza_CejasMouseClicked
        // TODO add your handling code here:
        panel_ServiciosGen.setVisible(false);
        panel_LimpiezaCeja.setVisible(true);
        panel_Cortes.setVisible(false);
        panel_Depilacion.setVisible(false);
        panel_Maquillaje.setVisible(false);
        
    }//GEN-LAST:event_tbtn_Limpieza_CejasMouseClicked

    private void tbtn_CortesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbtn_CortesMouseClicked
        // TODO add your handling code here:
        panel_ServiciosGen.setVisible(false);
        panel_LimpiezaCeja.setVisible(false);
        panel_Cortes.setVisible(true);
        panel_Depilacion.setVisible(false);
        panel_Maquillaje.setVisible(false);
    }//GEN-LAST:event_tbtn_CortesMouseClicked

    private void tbtn_MaquillajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbtn_MaquillajeMouseClicked
        // TODO add your handling code here:
        panel_ServiciosGen.setVisible(false);
        panel_LimpiezaCeja.setVisible(false);
        panel_Cortes.setVisible(false);
        panel_Depilacion.setVisible(false);
        panel_Maquillaje.setVisible(true);
    }//GEN-LAST:event_tbtn_MaquillajeMouseClicked

    private void tbtn_DepilacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbtn_DepilacionMouseClicked
        // TODO add your handling code here:
        panel_ServiciosGen.setVisible(false);
        panel_LimpiezaCeja.setVisible(false);
        panel_Cortes.setVisible(false);
        panel_Depilacion.setVisible(true);
        panel_Maquillaje.setVisible(false);
    }//GEN-LAST:event_tbtn_DepilacionMouseClicked

    private void btn_Cancelar_CitaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Cancelar_CitaMouseEntered
        // TODO add your handling code here:
        btn_Cancelar_Cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Cancelar_Brown.png"))); //
    }//GEN-LAST:event_btn_Cancelar_CitaMouseEntered

    private void btn_Cancelar_CitaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Cancelar_CitaMouseExited
        // TODO add your handling code here:
        btn_Cancelar_Cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Cancelar_White.png"))); //
    }//GEN-LAST:event_btn_Cancelar_CitaMouseExited

    private void btn_Cancelar_CitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Cancelar_CitaMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Este formulario se cancelara y volvera a la pantalla principal");
        cw.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_Cancelar_CitaMouseClicked
    
    private void TgeneralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TgeneralMouseClicked
        Utilidades.Agregar_a_resumen(Tgeneral, Tresumen, TFtotal);
    }//GEN-LAST:event_TgeneralMouseClicked

    private void TcejasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TcejasMouseClicked
        Utilidades.Agregar_a_resumen(Tcejas, Tresumen, TFtotal);
    }//GEN-LAST:event_TcejasMouseClicked

    private void TcortesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TcortesMouseClicked
        Utilidades.Agregar_a_resumen(Tcortes, Tresumen, TFtotal);
    }//GEN-LAST:event_TcortesMouseClicked

    private void TmaquillajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TmaquillajeMouseClicked
        Utilidades.Agregar_a_resumen(Tmaquillaje, Tresumen, TFtotal);
    }//GEN-LAST:event_TmaquillajeMouseClicked

    private void TdepilacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TdepilacionMouseClicked
        Utilidades.Agregar_a_resumen(Tdepilacion, Tresumen, TFtotal);
    }//GEN-LAST:event_TdepilacionMouseClicked

    private void TresumenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TresumenMouseClicked
        Utilidades.Eliminar_de_resumen(Tresumen, TFtotal);
    }//GEN-LAST:event_TresumenMouseClicked

    private void btn_Modificar_Cita1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Modificar_Cita1MouseEntered
        // TODO add your handling code here:
        btn_Modificar_Cita1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Actualizar_Brown.png")));
    }//GEN-LAST:event_btn_Modificar_Cita1MouseEntered

    private void btn_Modificar_Cita1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Modificar_Cita1MouseExited
        // TODO add your handling code here:
        btn_Modificar_Cita1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Actualizar_White.png")));
    }//GEN-LAST:event_btn_Modificar_Cita1MouseExited

    private void btn_Modificar_Cita1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Modificar_Cita1MouseClicked
        int o = JOptionPane.showConfirmDialog(null, "Modificar cita?");
        
        if(o == JOptionPane.YES_OPTION){
            int id = id_cita;
            String fecha = "";
            
            LocalDate com = DCfecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            
            int year = com.getYear();
            int month = com.getMonthValue();
            int day = com.getDayOfMonth();
            
            String hora = CBhoras.getSelectedItem().toString() + ":00";
            
            fecha += year +"-";
            
            if(month < 10){
                fecha += "0" + month + "-";
            }else{
                fecha += month + "-";
            }
            
            if(day < 10){
                fecha += "0" + day; 
            }else{
                fecha += day;
            }
            
            fecha += " " + hora;
            
            ArrayList<Intangible> set = new ArrayList<>();
            
            for(int i = 0; i < Tresumen.getRowCount(); i++){
                for(int y = 0; y < Intangible.intangibles.size(); y++){
                    if(Intangible.intangibles.get(y).getNombre().equals(Tresumen.getValueAt(i, 0).toString())){
                        Intangible dan = Intangible.intangibles.get(y);
                        set.add(new Intangible(dan.getId_producto(), dan.getNombre(), dan.getPrecio(), dan.getTipo_servicio()));
                        break;
                    }
                }
            }
            
            new Citas().modificar(new Object[] {id, fecha, TFtotal.getText()}, set);
        }
    }//GEN-LAST:event_btn_Modificar_Cita1MouseClicked

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
            java.util.logging.Logger.getLogger(Servicios_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Servicios_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Servicios_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Servicios_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        //</editor-foPanel_Tabla    /* Create and display the form */
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
        //</editor-foPanel_Tabla    /* Create and display the form */
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
        //</editor-foPanel_Tabla    /* Create and display the form */
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
        //</editor-foPanel_Tabla    /* Create and display the form */
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
        //</editor-foPanel_Tabla    /* Create and display the form */
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
        //</editor-foPanel_Tabla    /* Create and display the form */
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
        //</editor-foPanel_Tabla    /* Create and display the form */
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
        //</editor-foPanel_Tabla    /* Create and display the form */
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
        //</editor-foPanel_Tabla    /* Create and display the form */
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
        //</editor-foPanel_Tabla    /* Create and display the form */
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
        //</editor-foPanel_Tabla    /* Create and display the form */
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
        //</editor-foPanel_Tabla    /* Create and display the form */
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
        //</editor-foPanel_Tabla    /* Create and display the form */
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
        //</editor-foPanel_Tabla    /* Create and display the form */
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
        //</editor-foPanel_Tabla    /* Create and display the form */
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
        //</editor-foPanel_Tabla    /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Servicios_Window(null).setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBhoras;
    private com.toedter.calendar.JDateChooser DCfecha;
    private javax.swing.JLabel HOME_ICON;
    private javax.swing.JLabel Label_Fecha;
    private javax.swing.JLabel Label_Hora;
    private javax.swing.JPanel Panel_Servicios;
    private javax.swing.JTextField TFnom;
    private javax.swing.JTextField TFtel;
    private javax.swing.JTextField TFtotal;
    private javax.swing.JTable Tcejas;
    private javax.swing.JTable Tcortes;
    private javax.swing.JTable Tdepilacion;
    private javax.swing.JTable Tgeneral;
    private javax.swing.JTable Tmaquillaje;
    private javax.swing.JTable Tresumen;
    private javax.swing.JLabel bgImage;
    private javax.swing.JLabel btn_Cancelar_Cita;
    private javax.swing.JLabel btn_Modificar_Cita1;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel label_Bordered;
    private javax.swing.JLabel label_Cortes;
    private javax.swing.JLabel label_Depilacion;
    private javax.swing.JLabel label_LimpiezaCejas;
    private javax.swing.JLabel label_Maquillaje;
    private javax.swing.JLabel label_No_contacto;
    private javax.swing.JLabel label_Nombre;
    private javax.swing.JLabel label_ServiceGen;
    private javax.swing.JLabel label_Titlulo;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JLabel label_titulo1;
    private javax.swing.JLabel label_total;
    private javax.swing.JPanel panel_Cortes;
    private javax.swing.JPanel panel_Depilacion;
    private javax.swing.JPanel panel_LimpiezaCeja;
    private javax.swing.JPanel panel_Main;
    private javax.swing.JPanel panel_Maquillaje;
    private javax.swing.JPanel panel_ResumenServ;
    private javax.swing.JPanel panel_ServiciosGen;
    private javax.swing.JPanel panel_Transparent1;
    private javax.swing.JPanel panel_Transparent2;
    private javax.swing.JPanel panel_Transparent3;
    private javax.swing.JScrollPane scrollpanel_1;
    private javax.swing.JScrollPane scrollpanel_2;
    private javax.swing.JScrollPane scrollpanel_3;
    private javax.swing.JScrollPane scrollpanel_4;
    private javax.swing.JScrollPane scrollpanel_5;
    private javax.swing.JScrollPane scrollpanel_Resumen;
    private javax.swing.JToggleButton tbtn_Cortes;
    private javax.swing.JToggleButton tbtn_Depilacion;
    private javax.swing.JToggleButton tbtn_Limpieza_Cejas;
    private javax.swing.JToggleButton tbtn_Maquillaje;
    private javax.swing.JToggleButton tbtn_Servicios_generales;
    // End of variables declaration//GEN-END:variables
    private Home_Windows cw = new Home_Windows();
}
