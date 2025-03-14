
package pacaldo;

import admin.AdminDasboardpage;
import db.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Mark Uinel
 */
public class Loginform extends javax.swing.JFrame {

    /**
     * Creates new form Loginform
     */
    public Loginform() {
        initComponents();
    }

    
public static boolean loginAcc(String username, String password){
        dbConnector connector = new dbConnector();
      try{
            String query = "SELECTED *FROM tbl_users WHEER u_username = " +username + "AND u_password = "+ password+"";
                
            ResultSet resultSet = connector.getData(query);
            return resultSet.next();
            
        }catch (SQLException ex){
            
        }
        return false;
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        un = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jshowpassword = new javax.swing.JCheckBox();
        rn = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 90, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, 30));
        jPanel1.add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 230, 30));
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 230, 30));

        login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        login.setText("LOGIN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, -1));

        exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exit.setText("QUIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 80, -1));

        jshowpassword.setBackground(new java.awt.Color(51, 51, 51));
        jshowpassword.setForeground(new java.awt.Color(255, 255, 255));
        jshowpassword.setText("View Password");
        jshowpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jshowpasswordActionPerformed(evt);
            }
        });
        jPanel1.add(jshowpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        rn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rn.setForeground(new java.awt.Color(255, 255, 255));
        rn.setText("Register new!");
        rn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rnMouseEntered(evt);
            }
        });
        jPanel1.add(rn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ONLINE BUS TICKETING");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 580, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        
        if(un.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Please fill out username!");
        }
        else if(pass.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Please fill out password!");
        }
        else if(pass.getText().contains("test")&&pass.getText().contains(""))
            JOptionPane.showMessageDialog(null, "Login Successfuly");
        else{
            JOptionPane.showMessageDialog(null, "Wrong username or password!", "message",JOptionPane.ERROR_MESSAGE);
        }
        if(loginAcc(un.getText(),pass.getText())){
          JOptionPane.showMessageDialog(null,"Login SUCCESFULLY!");
        
    
        
    }//GEN-LAST:event_loginActionPerformed
       }
    private void jshowpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jshowpasswordActionPerformed
        // TODO add your handling code here:
        if(jshowpassword.isSelected()){
           pass.setEchoChar((char)0);
           
        }
        else{
            pass.setEchoChar('*');
        }
    }//GEN-LAST:event_jshowpasswordActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void rnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rnMouseEntered
        // TODO add your handling code here:
        
 
    }//GEN-LAST:event_rnMouseEntered

    private void rnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rnMouseClicked
       
       Registerform rgf= new Registerform();
       rgf.setVisible(true);
       this.dispose();
        
     
    }//GEN-LAST:event_rnMouseClicked

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
            java.util.logging.Logger.getLogger(Loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loginform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox jshowpassword;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel rn;
    private javax.swing.JTextField un;
    // End of variables declaration//GEN-END:variables
}
