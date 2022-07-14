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

public class Delete_transaction extends javax.swing.JFrame {

    /**
     * Creates new form Deleting_The_Transaction
     */
    public Delete_transaction() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btn_view = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_trans_id = new javax.swing.JTextField();
        txt_books_id = new javax.swing.JTextField();
        txt_mem_id = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        DT_TRANS = new javax.swing.JTextField();
        DT_RETURN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management System (Ansh,Deepankar)");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList1.setModel(new DefaultListModel());
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 79, 119, 249));

        btn_view.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        btn_view.setText("VIEW");
        btn_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewActionPerformed(evt);
            }
        });
        getContentPane().add(btn_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 297, -1, -1));

        btn_delete.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 297, -1, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Transaction Id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 36, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Book Id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 36, -1, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Member Id");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 104, -1, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Transaction Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 164, -1, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Return Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 236, -1, -1));

        txt_trans_id.setEditable(false);
        txt_trans_id.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        getContentPane().add(txt_trans_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 33, 101, -1));

        txt_books_id.setEditable(false);
        txt_books_id.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        getContentPane().add(txt_books_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 33, 113, -1));

        txt_mem_id.setEditable(false);
        txt_mem_id.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        getContentPane().add(txt_mem_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 101, 152, -1));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 297, -1, -1));

        jButton2.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 297, -1, -1));

        DT_TRANS.setEditable(false);
        DT_TRANS.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        getContentPane().add(DT_TRANS, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 161, 152, -1));

        DT_RETURN.setEditable(false);
        DT_RETURN.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        getContentPane().add(DT_RETURN, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 233, 152, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/branch-card.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 550, 350));

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
            String sql="Select TRANS_ID from transaction order by trans_id asc;";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                model.addElement(rs.getString("TRANS_ID"));
            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btn_viewActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        if(txt_books_id.getText().equals(""))
    {
        JOptionPane.showMessageDialog(this,"Please Enter Details"); 
    }
    else
    {
        DefaultListModel model = (DefaultListModel)jList1.getModel();
        String Trans_Id= (String)jList1.getSelectedValue();
        try
        {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/lms","root","");
            Statement stmt = con.createStatement();
            int ans = JOptionPane.showConfirmDialog(this,"Do you really want to delete !");
            if(ans==JOptionPane.YES_OPTION)
            {
                String q1="Delete from transaction where Trans_Id = '"+(Trans_Id)+"';";
                txt_books_id.setText("");
                txt_mem_id.setText("");
                txt_trans_id.setText("");
                DT_RETURN.setText("");
                DT_TRANS.setText("");
                stmt.executeUpdate(q1);
                JOptionPane.showMessageDialog(this,"Record Deleted Successfully");
                model.removeAllElements();
                String q2="Select Trans_Id from transaction;";
                ResultSet rs = stmt.executeQuery(q2);

                while(rs.next())
                {
                    model.addElement(rs.getString(1));
                }
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
       String sql = "Select * from transaction";
      try
      {
          Class.forName("java.sql.Driver");
          Connection con =DriverManager.getConnection("jdbc:mysql://localhost/lms","root","");
          Statement stmt = con.createStatement();
          String Trans_Id = (String)jList1.getSelectedValue();
          String sql1="Select * from transaction where Trans_Id ='"+(Trans_Id)+"';";
          ResultSet rs = stmt.executeQuery(sql1);
          while(rs.next())
          {
                txt_books_id.setText(rs.getString("Book_Id"));
                txt_mem_id.setText(rs.getString("Mem_Id"));
                txt_trans_id.setText(rs.getString("Trans_Id"));
               DT_RETURN.setText(rs.getString("Return_Date"));
                DT_TRANS.setText(rs.getString("Transaction_date"));
                              
          }
      }
      catch(Exception e)
      {
          JOptionPane.showMessageDialog(this, e.getMessage());
      }
    }//GEN-LAST:event_jList1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       new Welcome().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
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
            java.util.logging.Logger.getLogger(Delete_transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete_transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete_transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete_transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete_transaction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DT_RETURN;
    private javax.swing.JTextField DT_TRANS;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_view;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_books_id;
    private javax.swing.JTextField txt_mem_id;
    private javax.swing.JTextField txt_trans_id;
    // End of variables declaration//GEN-END:variables
}
