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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
public class Insert_member extends javax.swing.JFrame {

    /**
     * Creates new form inserting_member
     */
    public Insert_member() {
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

        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollBar1 = new javax.swing.JScrollBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btn_view = new javax.swing.JButton();
        btn_details = new javax.swing.JButton();
        lbl_mem_id = new javax.swing.JLabel();
        lbl_firstn = new javax.swing.JLabel();
        lbl_lastn = new javax.swing.JLabel();
        lbl_phone = new javax.swing.JLabel();
        lbl_mem_start = new javax.swing.JLabel();
        lbl_mem_end = new javax.swing.JLabel();
        lbl_house = new javax.swing.JLabel();
        lbl_locality = new javax.swing.JLabel();
        lbl_city = new javax.swing.JLabel();
        lbl_state = new javax.swing.JLabel();
        lbl_pincode = new javax.swing.JLabel();
        txt_mem_id = new javax.swing.JTextField();
        txt_firstn = new javax.swing.JTextField();
        txt_lastn = new javax.swing.JTextField();
        txt_phone = new javax.swing.JTextField();
        txt_house = new javax.swing.JTextField();
        txt_locality = new javax.swing.JTextField();
        txt_city = new javax.swing.JTextField();
        txt_state = new javax.swing.JTextField();
        txt_pincode = new javax.swing.JTextField();
        btn_member_id = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txt_mem_start = new javax.swing.JTextField();
        txt_mem_end = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 131, 297));

        btn_view.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        btn_view.setText("VIEW");
        btn_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewActionPerformed(evt);
            }
        });
        getContentPane().add(btn_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, -1));

        btn_details.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        btn_details.setText("INSERT");
        btn_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_detailsActionPerformed(evt);
            }
        });
        getContentPane().add(btn_details, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, -1, -1));

        lbl_mem_id.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        lbl_mem_id.setForeground(new java.awt.Color(255, 255, 255));
        lbl_mem_id.setText("  Member Id");
        getContentPane().add(lbl_mem_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 41, 122, -1));

        lbl_firstn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        lbl_firstn.setForeground(new java.awt.Color(255, 255, 255));
        lbl_firstn.setText("First Name");
        getContentPane().add(lbl_firstn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        lbl_lastn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        lbl_lastn.setForeground(new java.awt.Color(255, 255, 255));
        lbl_lastn.setText("Last Name");
        getContentPane().add(lbl_lastn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, -1));

        lbl_phone.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        lbl_phone.setForeground(new java.awt.Color(255, 255, 255));
        lbl_phone.setText("Phone No.");
        getContentPane().add(lbl_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        lbl_mem_start.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        lbl_mem_start.setForeground(new java.awt.Color(255, 255, 255));
        lbl_mem_start.setText("Mem. Start");
        getContentPane().add(lbl_mem_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));

        lbl_mem_end.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        lbl_mem_end.setForeground(new java.awt.Color(255, 255, 255));
        lbl_mem_end.setText("Mem. Expiry");
        getContentPane().add(lbl_mem_end, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        lbl_house.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        lbl_house.setForeground(new java.awt.Color(255, 255, 255));
        lbl_house.setText("House No.");
        getContentPane().add(lbl_house, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));

        lbl_locality.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        lbl_locality.setForeground(new java.awt.Color(255, 255, 255));
        lbl_locality.setText("Locality");
        getContentPane().add(lbl_locality, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 225, -1, 30));

        lbl_city.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        lbl_city.setForeground(new java.awt.Color(255, 255, 255));
        lbl_city.setText("City");
        getContentPane().add(lbl_city, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        lbl_state.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        lbl_state.setForeground(new java.awt.Color(255, 255, 255));
        lbl_state.setText("State");
        getContentPane().add(lbl_state, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        lbl_pincode.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        lbl_pincode.setForeground(new java.awt.Color(255, 255, 255));
        lbl_pincode.setText("Pincode");
        getContentPane().add(lbl_pincode, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, -1, -1));
        getContentPane().add(txt_mem_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 85, 131, -1));
        getContentPane().add(txt_firstn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 104, -1));
        getContentPane().add(txt_lastn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 104, -1));

        txt_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_phoneKeyTyped(evt);
            }
        });
        getContentPane().add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 104, -1));
        getContentPane().add(txt_house, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 104, -1));
        getContentPane().add(txt_locality, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 104, -1));
        getContentPane().add(txt_city, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 104, -1));
        getContentPane().add(txt_state, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 100, -1));

        txt_pincode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_pincodeKeyTyped(evt);
            }
        });
        getContentPane().add(txt_pincode, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 100, -1));

        btn_member_id.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        btn_member_id.setText("NEW MEMBER");
        btn_member_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_member_idActionPerformed(evt);
            }
        });
        getContentPane().add(btn_member_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, -1, -1));

        jButton2.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, -1, -1));

        jButton3.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jButton3.setText("ADD DATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, -1, -1));

        txt_mem_start.setEditable(false);
        getContentPane().add(txt_mem_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 104, -1));

        txt_mem_end.setEditable(false);
        getContentPane().add(txt_mem_end, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 104, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library_img.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 470));

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
        
    }//GEN-LAST:event_jList1MouseClicked

    private void btn_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_detailsActionPerformed
     if(txt_city.getText().equals("") | txt_firstn.getText().equals("") | txt_house.getText().equals("") | txt_lastn.getText().equals("") | 
             txt_locality.getText().equals("") | txt_mem_end.getText().equals("") | txt_mem_id.getText().equals("") | txt_mem_start.getText().equals("")
             | txt_phone.getText().equals("") | txt_pincode.getText().equals("") | txt_state.getText().equals(""))
     {
         JOptionPane.showMessageDialog(this,"Please Enter Details");
                 
     }
      else
        {
       int Mem_Id=Integer.parseInt(txt_mem_id.getText());
       String Firstn=txt_firstn.getText();
       String Lastn=txt_lastn.getText();
       long Phone=Long.parseLong(txt_phone.getText());
       String mem_start=txt_mem_start.getText();
       String mem_end=txt_mem_end.getText();
       
       String House=txt_house.getText();
       String Locality=txt_locality.getText();
       String City=txt_city.getText();
       String State=txt_state.getText();
       int Pincode=Integer.parseInt(txt_pincode.getText());
       
       DefaultListModel model = (DefaultListModel)jList1.getModel();
     try
     {
        Class.forName("java.sql.Driver");
        Connection con =DriverManager.getConnection("jdbc:mysql://localhost/lms","root","");
        Statement stmt =con.createStatement();
         String query="Insert into Member(Member_Id,First_Name,Last_Name,Phone_No,Membership_Date,Expiry,House_No,Locality,City,State,Pincode) values('"+(Mem_Id)+"','"+(Firstn)+"','"+(Lastn)+"','"+(Phone)+"','"+(mem_start)+"','"+(mem_end)+"','"+(House)+"','"+(Locality)+"','"+(City)+"','"+(State)+"','"+(Pincode)+"');";
           txt_city.setText("");
           txt_firstn.setText("");
           txt_house.setText("");
           txt_lastn.setText("");
           txt_locality.setText("");
           txt_mem_end.setText("");
           txt_mem_start.setText("");
           txt_phone.setText("");
           txt_pincode.setText("");
           txt_state.setText("");
           txt_mem_id.setText("");
           
        stmt.executeUpdate(query);
        JOptionPane.showMessageDialog(this,"Record Inserted Successfullly");
        model.removeAllElements();
        String q2="Select Member_Id from Member;";
        ResultSet rs = stmt.executeQuery(q2);
        while(rs.next())
           {
               model.addElement(rs.getString(1));
           }
        }
     
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(this, e.getMessage());
         }
                }
    }//GEN-LAST:event_btn_detailsActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    txt_mem_end.setEditable(false);
    txt_mem_start.setEditable(false);
    }//GEN-LAST:event_formWindowOpened

    private void btn_member_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_member_idActionPerformed
     String sql="Select max(member_id)+1 from member";
       try
       {
        Class.forName("java.sql.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/lms","root","");
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
        int n=0;
        while(rs.next())
        {
            n=rs.getInt("max(member_id)+1");
            txt_mem_id.setText(""+n);
        }
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(this, e.getMessage());
       }
    }//GEN-LAST:event_btn_member_idActionPerformed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       new Welcome().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         java.util.Date date= new java.util.Date();
       SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
       txt_mem_start.setText(df.format(date));
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
       Calendar cal =Calendar.getInstance();
       cal.set(Calendar.HOUR_OF_DAY, 0);
       cal.set(Calendar.MINUTE, 0);
       cal.set(Calendar.SECOND, 0);
       cal.set(Calendar.MILLISECOND, 0);
       cal.add(Calendar.MONTH, 6);
       txt_mem_end.setText(""+sdf.format(cal.getTime()));
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Insert_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insert_member().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_details;
    private javax.swing.JButton btn_member_id;
    private javax.swing.JButton btn_view;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_city;
    private javax.swing.JLabel lbl_firstn;
    private javax.swing.JLabel lbl_house;
    private javax.swing.JLabel lbl_lastn;
    private javax.swing.JLabel lbl_locality;
    private javax.swing.JLabel lbl_mem_end;
    private javax.swing.JLabel lbl_mem_id;
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
    private javax.swing.JTextField txt_mem_id;
    private javax.swing.JTextField txt_mem_start;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_pincode;
    private javax.swing.JTextField txt_state;
    // End of variables declaration//GEN-END:variables
}