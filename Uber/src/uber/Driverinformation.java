/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uber;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Xenos
 */
public class Driverinformation extends javax.swing.JFrame {

    /**
     * Creates new form Driverinformation
     */
    Connection conn = null;
    Statement s=null;
    int id,areaid;
    String area;
    public Driverinformation() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Back = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        AddDriver = new javax.swing.JButton();
        DeleteDriver = new javax.swing.JButton();
        MoveDriver = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        AreaComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Back.setBackground(new java.awt.Color(204, 51, 0));
        Back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Back.setText("Back ");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 51, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Driver Management");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 240, 30));

        AddDriver.setBackground(new java.awt.Color(204, 0, 0));
        AddDriver.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddDriver.setText("Add new Driver");
        AddDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDriverActionPerformed(evt);
            }
        });
        jPanel1.add(AddDriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 200, 30));

        DeleteDriver.setBackground(new java.awt.Color(204, 0, 0));
        DeleteDriver.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DeleteDriver.setText("Delete Selected Driver");
        DeleteDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteDriverActionPerformed(evt);
            }
        });
        jPanel1.add(DeleteDriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 200, 30));

        MoveDriver.setBackground(new java.awt.Color(204, 0, 0));
        MoveDriver.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MoveDriver.setText("Move Selected Driver");
        MoveDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoveDriverActionPerformed(evt);
            }
        });
        jPanel1.add(MoveDriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 200, 30));

        Refresh.setBackground(new java.awt.Color(204, 0, 0));
        Refresh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        jPanel1.add(Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, 170, 30));

        AreaComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AreaComboBox.setForeground(new java.awt.Color(204, 0, 0));
        AreaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mirpur", "Mohammadpur", "Dhanmondi", "Motijheel", "Tejgaon", "Mohakhali", "Khilgaon", "Gulshan" }));
        jPanel1.add(AreaComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 140, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Driver ID", "Driver Name", "Driver Password", "Driver Contact", "Driver Area", "Area ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 770, 210));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("To");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uber/red-gradient-minimalistic-waves-black-abstract-wallpaper-desktop-wallpapers-images-minimalist.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
        //This clears the driver table
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        //Then fills it with data from drivers database table
        try {
            
            conn = connectdb();
            String query = "select * from drivers";
            s = conn.createStatement();
            ResultSet r=s.executeQuery(query);
            while(r.next()){
                int driverid=r.getInt(1),areaid=r.getInt(6);
                String drivername=r.getString(2),drivercontact=r.getString(4),driverpassword=r.getString(3),area=r.getString(5);
                model=(DefaultTableModel)jTable1.getModel();
                model.addRow(new Object[]{driverid,drivername,driverpassword,drivercontact,area,areaid});
            }
            conn.close();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_RefreshActionPerformed

    private void MoveDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoveDriverActionPerformed
        // TODO add your handling code here:
        //Moves the selected driver to new area specified by dropbox.
        if(jTable1.getSelectedRow()!=-1){
            int column = 0;
            int row = jTable1.getSelectedRow();
            id = (Integer)jTable1.getModel().getValueAt(row, column);
            column=5;
            areaid=(Integer)jTable1.getModel().getValueAt(row, column);
            try {

                conn = connectdb();
                area=AreaComboBox.getSelectedItem().toString();
                areaid=AreaComboBox.getSelectedIndex();
                String query2 = "update drivers set areaid="+areaid+", area='"+ area+"' where driverid="+id+"";
                s = conn.createStatement();
                s.executeUpdate(query2);
                conn.close();

            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_MoveDriverActionPerformed

    private void AddDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDriverActionPerformed
        // TODO add your handling code here:
        //Opens newdriver form to add new driver data.
        Newdriver d=new Newdriver();
        d.setVisible(true);
        
    }//GEN-LAST:event_AddDriverActionPerformed

    private void DeleteDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteDriverActionPerformed
        // TODO add your handling code here:
        //deleted the selected driver by matching his id with the table driver id
        try {
            int row=jTable1.getSelectedRow();
            int column=0;
            int temp=(Integer)jTable1.getModel().getValueAt(row, column);
            conn = connectdb();
            String query = "delete from drivers where driverid="+""+temp+"";
            
            s = conn.createStatement();
            s.executeUpdate(query);
            
            conn.close();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_DeleteDriverActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        //goes back to Admin panel
        Admin a=new Admin();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed
    static Connection connectdb() {
        //Function to establish connection to database and load client driver
        Connection conn = null;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Uber", "uber", "384142");

            return conn;

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
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
            java.util.logging.Logger.getLogger(Driverinformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Driverinformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Driverinformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Driverinformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Driverinformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDriver;
    private javax.swing.JComboBox<String> AreaComboBox;
    private javax.swing.JButton Back;
    private javax.swing.JButton DeleteDriver;
    private javax.swing.JButton MoveDriver;
    private javax.swing.JButton Refresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}