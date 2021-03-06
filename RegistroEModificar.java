package Ventanas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class RegistroEModificar extends javax.swing.JFrame {
SimpleDateFormat fecha = new SimpleDateFormat("yyyy-MM-dd");
    public RegistroEModificar() {
        initComponents();
        this.setLocationRelativeTo(null); 
    }
    private void limpiarcajas() {
        TxtTipoEquipo.setText(null);
        TxtMarca.setText(null);
        TxtModelo.setText(null);
        TxtNserie.setText(null);
        CbxRam.setSelectedIndex(0);
        CbxDisco.setSelectedIndex(0);
        JdcFecha.getDateEditor();
    }  
   public class tablas {
        try{
        DefaultTableModel modelo = new DefaultTableModel();
        PreparedStatement ps = null;
        ResultSet rs = null;
        ConexionBd conn = new ConexionBd();
        Connection con = conn.getConnection();
        jTableEq.setModel(modelo);
        String agregar = "select Tipo_Equipo,Marca,Modelo,N_Serie,Ram,Disco_Duro,Fecha_Ingreso from RegistroE";
            try {
                ps = con.prepareStatement(agregar);
                rs=ps.executeQuery();
                 ResultSetMetaData resultadoT= rs.getMetaData();
                 int cantidadColumnas= resultadoT.getColumnCount();
               while(rs.next()){
            Object[] filas = new Object [cantidadColumnas];
            for(int i=0; i<cantidadColumnas;i++){
                filas[i]=rs.getObject(i+1);
            }
            modelo.addRow(filas);
        }
            } catch (SQLException ex) {
                Logger.getLogger(RegistroEModificar.class.getName()).log(Level.SEVERE, null, ex);
            }
   }catch(Exception e){
            System.err.println(e);
    }
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtTipoEquipo = new javax.swing.JTextField();
        TxtMarca = new javax.swing.JTextField();
        CbxDisco = new javax.swing.JComboBox<String>();
        CbxRam = new javax.swing.JComboBox<String>();
        jLabel7 = new javax.swing.JLabel();
        TxtModelo = new javax.swing.JTextField();
        TxtNserie = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        BtnGuardarE = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        JdcFecha = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEq = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo A.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 255, 51));
        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cambios en los Equipos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("Tipo de Equipo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setText("Disco duro");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 110, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setText("Tamaño de Ram");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setText("Marca");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        TxtTipoEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTipoEquipoActionPerformed(evt);
            }
        });
        getContentPane().add(TxtTipoEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 180, 30));

        TxtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtMarcaActionPerformed(evt);
            }
        });
        getContentPane().add(TxtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 180, 30));

        CbxDisco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "120GB", "240GB", "480GB", "500GB", "1TB" }));
        CbxDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxDiscoActionPerformed(evt);
            }
        });
        getContentPane().add(CbxDisco, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 100, 30));

        CbxRam.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "2GB", "4GB", "6GB", "8GB", "12GB", "16GB" }));
        CbxRam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxRamActionPerformed(evt);
            }
        });
        getContentPane().add(CbxRam, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 100, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 255));
        jLabel7.setText("Modelo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, -1, -1));

        TxtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtModeloActionPerformed(evt);
            }
        });
        getContentPane().add(TxtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 110, 30));

        TxtNserie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNserieActionPerformed(evt);
            }
        });
        getContentPane().add(TxtNserie, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 60, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 255));
        jLabel8.setText("N° Serie");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        BtnGuardarE.setText("Guardar");
        BtnGuardarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarEActionPerformed(evt);
            }
        });
        getContentPane().add(BtnGuardarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, 90, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 255, 255));
        jLabel9.setText("Fecha de Registro");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));

        JdcFecha.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(JdcFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 160, 30));

        jTableEq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Tipo Equipo", "Marca", "Modelo", "Nº Serie", "Ram", "Disco Duro", "Fecha Ingreso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableEq.setMaximumSize(new java.awt.Dimension(60, 60));
        jScrollPane1.setViewportView(jTableEq);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 530, 140));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Columa Superior.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, -110, 860, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CbxDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxDiscoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbxDiscoActionPerformed

    private void CbxRamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxRamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbxRamActionPerformed

    private void TxtTipoEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTipoEquipoActionPerformed

    }//GEN-LAST:event_TxtTipoEquipoActionPerformed

    private void TxtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtMarcaActionPerformed

    private void TxtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtModeloActionPerformed

    private void TxtNserieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNserieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNserieActionPerformed

    private void BtnGuardarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarEActionPerformed
        this.setVisible(false);
        Menu obj = new Menu();
        obj.setVisible(true);
        Date date=JdcFecha.getDate();
        long d=date.getTime();
        java.sql.Date Fecha = new java.sql.Date(d);
        try {
            PreparedStatement ps=null;
            ResultSet rs= null;
            ConexionBd conn = new ConexionBd();
            Connection con= conn.getConnection();
            ps = con.prepareStatement("insert into RegistroE(Tipo_Equipo,Marca,Modelo,N_Serie,Ram,Disco_Duro,Fecha_Ingreso)values(?,?,?,?,?,?,?)");
            ps.setString(1, TxtTipoEquipo.getText());
            ps.setString(2, TxtMarca.getText());
            ps.setString(3, TxtModelo.getText());// combo box
            ps.setString(4, TxtNserie.getText());
            ps.setString(7, Fecha.toString());
            ps.setString(5, CbxRam.getSelectedItem().toString());
            ps.setString(6, CbxDisco.getSelectedItem().toString());

            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Datos Guardados");
                limpiarcajas();
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar los datos");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_BtnGuardarEActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroEModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroEModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroEModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroEModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegistroEModificar().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardarE;
    public javax.swing.JComboBox<String> CbxDisco;
    public javax.swing.JComboBox<String> CbxRam;
    private com.toedter.calendar.JDateChooser JdcFecha;
    public javax.swing.JTextField TxtMarca;
    public javax.swing.JTextField TxtModelo;
    public javax.swing.JTextField TxtNserie;
    public javax.swing.JTextField TxtTipoEquipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEq;
    // End of variables declaration//GEN-END:variables
}
