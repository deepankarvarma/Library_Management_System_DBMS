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
public class Search_members extends javax.swing.JFrame {

    /**
     * Creates new form Search_members
     */
    public Search_members() {
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

        lbl_pincode = new javax.swing.JLabel();
        txt_firstn = new javax.swing.JTextField();
        txt_lastn = new javax.swing.JTextField();
        btn_view = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        lbl_firstn = new javax.swing.JLabel();
        lbl_lastn = new javax.swing.JLabel();
        txt_house = new javax.swing.JTextField();
        lbl_phone = new javax.swing.JLabel();
        txt_locality = new javax.swing.JTextField();
        txt_phone = new javax.swing.JTextField();
        txt_city = new javax.swing.JTextField();
        txt_state = new javax.swing.JTextField();
        txt_pincode = new javax.swing.JTextField();
        lbl_mem_start = new javax.swing.JLabel();
        lbl_mem_end = new javax.swing.JLabel();
        lbl_house = new javax.swing.JLabel();
        lbl_locality = new javax.swing.JLabel();
        lbl_city = new javax.swing.JLabel();
        lbl_state = new javax.swing.JLabel();
        txt_mem_start = new javax.swing.JTextField();
        txt_mem_end = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management System (Ansh,Deepankar)");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_pincode.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        lbl_pincode.setForeground(new java.awt.Color(255, 255, 255));
        lbl_pincode.setText("Pincode");
        getContentPane().add(lbl_pincode, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 328, -1, -1));

        txt_firstn.setEditable(false);
        txt_firstn.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        getContentPane().add(txt_firstn, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 30, 153, -1));

        txt_lastn.setEditable(false);
        txt_lastn.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        getContentPane().add(txt_lastn, new org.netbeans.lib.awtextra.AbsoluteConstraints(848, 30, 153, -1));

        btn_view.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        btn_view.setText("VIEW");
        btn_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewActionPerformed(evt);
            }
        });
        getContentPane().add(btn_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 383, -1, -1));

        jList1.setModel(new DefaultListModel());
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 40, 124, 301));

        lbl_firstn.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        lbl_firstn.setForeground(new java.awt.Color(255, 255, 255));
        lbl_firstn.setText("First Name");
        getContentPane().add(lbl_firstn, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 33, -1, -1));

        lbl_lastn.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        lbl_lastn.setForeground(new java.awt.Color(255, 255, 255));
        lbl_lastn.setText("Last Name");
        getContentPane().add(lbl_lastn, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 33, -1, -1));

        txt_house.setEditable(false);
        txt_house.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        getContentPane().add(txt_house, new org.netbeans.lib.awtextra.AbsoluteConstraints(848, 105, 153, -1));

        lbl_phone.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        lbl_phone.setForeground(new java.awt.Color(255, 255, 255));
        lbl_phone.setText("Phone No.");
        getContentPane().add(lbl_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 108, -1, -1));

        txt_locality.setEditable(false);
        txt_locality.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        getContentPane().add(txt_locality, new org.netbeans.lib.awtextra.AbsoluteConstraints(848, 173, 153, -1));

        txt_phone.setEditable(false);
        txt_phone.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        getContentPane().add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 105, 153, -1));

        txt_city.setEditable(false);
        txt_city.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        getContentPane().add(txt_city, new org.netbeans.lib.awtextra.AbsoluteConstraints(848, 252, 153, -1));

        txt_state.setEditable(false);
        txt_state.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        getContentPane().add(txt_state, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 325, 153, -1));

        txt_pincode.setEditable(false);
        txt_pincode.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        getContentPane().add(txt_pincode, new org.netbeans.lib.awtextra.AbsoluteConstraints(848, 325, 153, -1));

        lbl_mem_start.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        lbl_mem_start.setForeground(new java.awt.Color(255, 255, 255));
        lbl_mem_start.setText("Membership Starting Date");
        getContentPane().add(lbl_mem_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 176, -1, -1));

        lbl_mem_end.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        lbl_mem_end.setForeground(new java.awt.Color(255, 255, 255));
        lbl_mem_end.setText("Membership Expiry Date");
        getContentPane().add(lbl_mem_end, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 255, -1, -1));

        lbl_house.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        lbl_house.setForeground(new java.awt.Color(255, 255, 255));
        lbl_house.setText("House No.");
        getContentPane().add(lbl_house, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 108, -1, -1));

        lbl_locality.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        lbl_locality.setForeground(new java.awt.Color(255, 255, 255));
        lbl_locality.setText("Locality");
        getContentPane().add(lbl_locality, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 176, -1, -1));

        lbl_city.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        lbl_city.setForeground(new java.awt.Color(255, 255, 255));
        lbl_city.setText("City");
        getContentPane().add(lbl_city, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 255, -1, -1));

        lbl_state.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        lbl_state.setForeground(new java.awt.Color(255, 255, 255));
        lbl_state.setText("State");
        getContentPane().add(lbl_state, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 328, -1, -1));

        txt_mem_start.setEditable(false);
        txt_mem_start.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        getContentPane().add(txt_mem_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 173, 153, -1));

        txt_mem_end.setEditable(false);
        txt_mem_end.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        getContentPane().add(txt_mem_end, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 252, 153, -1));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 383, -1, -1));

        jButton2.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(927, 383, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 440));

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
            String sql="Select Member_Id from Member;";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                model.addElement(rs.getString("Member_Id"));
            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btn_viewActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        String sql = "Select * from member";
        try
        {
            Class.forName("java.sql.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost/lms","root","");
            Statement stmt = con.createStatement();
            String Mem_Id = (String)jList1.getSelectedValue();
            String sql1="Select * from Member where Member_Id ='"+(Mem_Id)+"';";
            ResultSet rs = stmt.executeQuery(sql1);
            while(rs.next())
            {
                txt_city.setText(rs.getString("City"));
                txt_locality.setText(rs.getString("Locality"));
                txt_state.setText(rs.getString("State"));
                txt_firstn.setText(rs.getString("First_Name"));
                txt_lastn.setText(rs.getString("Last_Name"));
                
                txt_mem_end.setText(rs.getString("Expiry"));
                txt_mem_start.setText(rs.getString("Membership_Date"));
                txt_phone.setText(rs.getString("Phone_No"));
                txt_pincode.setText(rs.getString("Pincode"));
                txt_house.setText(rs.getString("House_No"));

            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Search_members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search_members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search_members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search_members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search_members().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_view;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_city;
    private javax.swing.JLabel lbl_firstn;
    private javax.swing.JLabel lbl_house;
    private javax.swing.JLabel lbl_lastn;
    private javax.swing.JLabel lbl_locality;
    private javax.swing.JLabel lbl_mem_end;
    private javax.swing.JLabel lbl_mem_start;
    private javax.swing.JLabel lbl_phone;
    private javax.swing.JLabel lbl_pincode;
    private javax.swing.JLabel lbl_state;
    private javax.swing.JTextField txt_city;
    private javax.swing.JTextField txt_firstn;
    private javax.swing.JTextField txt_house;
    private javax.swing.JTextField txt_lastn;
    private javax.swing.JTextField txt_locality;
    private javax.swing.JTextField txt_mem_end;
    private javax.swing.JTextField txt_mem_start;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_pincode;
    private javax.swing.JTextField txt_state;
    // End of variables declaration//GEN-END:variables
}