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
public class Update_publishers extends javax.swing.JFrame {

    /**
     * Creates new form Update_members
     */
    public Update_publishers() {
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
        jLabel1 = new javax.swing.JLabel();
        txt_pub_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_book_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_update = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management System (Ansh,Deepankar)");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_name.setEditable(false);
        txt_name.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        getContentPane().add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 61, 104, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Phone");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 138, -1, -1));

        txt_phone.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        txt_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_phoneKeyTyped(evt);
            }
        });
        getContentPane().add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 135, 104, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Locality");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, -1));

        txt_locality.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        getContentPane().add(txt_locality, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 135, 104, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Shop No");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 217, -1, -1));

        txt_shop_no.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        getContentPane().add(txt_shop_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 214, 104, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("City");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, -1));

        txt_city.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        getContentPane().add(txt_city, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 214, 104, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("State");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 288, -1, -1));

        txt_state.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        getContentPane().add(txt_state, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 285, 104, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Pincode");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, -1));

        txt_pincode.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        txt_pincode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_pincodeKeyTyped(evt);
            }
        });
        getContentPane().add(txt_pincode, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 285, 104, -1));

        btn_view.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        btn_view.setText("VIEW");
        btn_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewActionPerformed(evt);
            }
        });
        getContentPane().add(btn_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

        jList1.setModel(new DefaultListModel());
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 138, 104, 217));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Publisher Id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 110, -1));

        txt_pub_id.setEditable(false);
        txt_pub_id.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        getContentPane().add(txt_pub_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 78, 104, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Book Id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 64, -1, -1));

        txt_book_id.setEditable(false);
        txt_book_id.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        getContentPane().add(txt_book_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 61, 104, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, -1, -1));

        btn_update.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, -1));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, -1, -1));

        jButton2.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/passage-library-bookcases_23-2147845927.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 410));

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
            String sql="Select PUBLISHER_ID from PUBLISHER order by publisher_id asc;";
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

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
    if(txt_book_id.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Please Enter Details");
        }
     else
        {       try
      {
          Class.forName("java.sql.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost/lms","root","");
          Statement stmt=con.createStatement();
          String Pub_Id=jList1.getSelectedValue();
          int ans=JOptionPane.showConfirmDialog(this,"Do you really want to update the record");
          if(ans==JOptionPane.YES_OPTION)
          { 
             
             long Phone=Long.parseLong(txt_phone.getText());
             String Locality=txt_locality.getText();
             String Shop_No=txt_shop_no.getText();
             String City=txt_city.getText();
             String State=txt_state.getText();
             int Pincode=Integer.parseInt(txt_pincode.getText());
            
             String q1="update PUBLISHER set Phone_No='"+(Phone)+"',Shop_No ='"+(Shop_No)+"',Locality='"+(Locality)+"',City='"+(City)+"',State='"+(State)+"',Pincode='"+(Pincode)+"' where PUBLISHER_ID='"+(Pub_Id)+"';";
               txt_city.setText("");
               txt_locality.setText("");
               txt_book_id.setText("");
               txt_phone.setText("");
               txt_pincode.setText("");
               txt_state.setText("");
               txt_pub_id.setText("");
               txt_name.setText("");
               txt_shop_no.setText("");
              stmt.executeUpdate(q1);
          JOptionPane.showMessageDialog(this, "Record Updated Successfully");
          }                           
      }
      catch(Exception e)
      {
          JOptionPane.showMessageDialog(this,e.getMessage());
      } 
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void txt_phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phoneKeyTyped
        char kc = evt.getKeyChar();
          if (!(((kc >= '0') && (kc <= '9')) )) {
             evt.consume();
          }  
    }//GEN-LAST:event_txt_phoneKeyTyped

    private void txt_pincodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pincodeKeyTyped
         char kc = evt.getKeyChar();
          if (!(((kc >= '0') && (kc <= '9')) )) {
             evt.consume();
          }  
    }//GEN-LAST:event_txt_pincodeKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Welcome().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Update_publishers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_publishers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_publishers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_publishers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_publishers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_update;
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