/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author satwi
 */
import java.sql.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
public class Search_publishers extends javax.swing.JFrame {

    /**
     * Creates new form Search_publishers
     */
    public Search_publishers() {
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

        txt_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_locality = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_shop_no = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_city = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_state = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_pincode = new javax.swing.JTextField();
        btn_view = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        txt_book_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_pub_id = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management System (Ansh,Deepankar)");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_name.setEditable(false);
        txt_name.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        getContentPane().add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 40, 143, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel4.setText("Phone");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 119, 60, -1));

        txt_phone.setEditable(false);
        txt_phone.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        getContentPane().add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 116, 143, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel5.setText("Locality");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, -1, -1));

        txt_locality.setEditable(false);
        txt_locality.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        getContentPane().add(txt_locality, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 192, 143, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel6.setText("Shop No");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 195, -1, -1));

        txt_shop_no.setEditable(false);
        txt_shop_no.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        getContentPane().add(txt_shop_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 192, 143, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel7.setText("City");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 267, -1, -1));

        txt_city.setEditable(false);
        txt_city.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        getContentPane().add(txt_city, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 264, 143, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel8.setText("State");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 267, -1, -1));

        txt_state.setEditable(false);
        txt_state.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        getContentPane().add(txt_state, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 264, 143, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel9.setText("Pincode");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 119, -1, -1));

        txt_pincode.setEditable(false);
        txt_pincode.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        getContentPane().add(txt_pincode, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 116, 143, -1));

        btn_view.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        btn_view.setText("CLICK TO VIEW");
        btn_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewActionPerformed(evt);
            }
        });
        getContentPane().add(btn_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 332, -1, -1));

        jList1.setModel(new DefaultListModel());
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 147, 121, 208));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel2.setText("Book Id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 43, -1, -1));

        txt_book_id.setEditable(false);
        txt_book_id.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        getContentPane().add(txt_book_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 40, 143, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 43, -1, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel1.setText("Publisher Id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 43, 123, -1));

        txt_pub_id.setEditable(false);
        txt_pub_id.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        getContentPane().add(txt_pub_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 84, 121, -1));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 332, -1, -1));

        jButton2.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(791, 332, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Kleinmond_public_library_interior_1530081460.JPG"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewActionPerformed
        DefaultListModel model=(DefaultListModel)jList1.getModel();
        int rows = model.getSize();
        if(rows>0)
        {
            for(int i=0;i<rows;i++)
            {
                model.removeAllElements();
            }
        }
        try
        {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/lms","root","");
            Statement stmt = con.createStatement();
            String sql="Select PUBLISHER_ID from PUBLISHER;";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                model.addElement(rs.getString("PUBLISHER_ID"));
            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btn_viewActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        try
        {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/lms","root","");
            Statement stmt=con.createStatement();
            String Pub_Id=(String)jList1.getSelectedValue();
            String Query="Select * from Publisher where Publisher_Id='"+(Pub_Id)+"';";
            ResultSet rs=stmt.executeQuery(Query);
            while(rs.next())
            {
                txt_book_id.setText(rs.getString("Book_Id"));
                txt_city.setText(rs.getString("City"));
                txt_locality.setText(rs.getString("Locality"));
                txt_name.setText(rs.getString("Name"));
                txt_phone.setText(rs.getString("Phone_No"));
                txt_pincode.setText(rs.getString("Pincode"));
                txt_pub_id.setText(rs.getString("Publisher_Id"));
                txt_shop_no.setText(rs.getString("Shop_No"));
                txt_state.setText(rs.getString("State"));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Welcome().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Search_publishers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search_publishers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search_publishers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search_publishers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search_publishers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_view;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_book_id;
    private javax.swing.JTextField txt_city;
    private javax.swing.JTextField txt_locality;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_pincode;
    private javax.swing.JTextField txt_pub_id;
    private javax.swing.JTextField txt_shop_no;
    private javax.swing.JTextField txt_state;
    // End of variables declaration//GEN-END:variables
}
