import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
public class products extends javax.swing.JFrame {

    /**
     * Creates new form products
     */
    public products() {
        initComponents();
          selectcandidates();
          
    }
Connection con=null;
   Statement st=null;
   ResultSet rs=null;
   public void selectcandidates(){
       try{
         con=DriverManager.getConnection("jdbc:mysql://localhost/  supermarket","root","seneka510");
         st=con.createStatement();rs=st.executeQuery("select * from  supermarket.productsss");
         prdtb.setModel((DbUtils.resultSetToTableModel(rs)));
       } catch(Exception e){
           System.out.println(e);
       }
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        prdid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        prdqty = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        prdprice = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        prdtb = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        prdname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("MANAGE  PRODUCTS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 255));
        jLabel2.setText("PRODID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));
        jPanel1.add(prdid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 110, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("QUANTITY");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));
        jPanel1.add(prdqty, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 110, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("PRICE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, -1, -1));
        jPanel1.add(prdprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 172, 110, 40));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 153));
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 0, 153));
        jButton2.setText("EDIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 0, 153));
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, -1, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(153, 0, 153));
        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("PRODUCT  LIST");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, -1));

        prdtb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "CATEGORIES", "QUANTITY", "PRICE"
            }
        ));
        prdtb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prdtbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(prdtb);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 570, 160));

        jButton5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton5.setText("BACK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 490, -1, -1));
        jPanel1.add(prdname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 110, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Seneka\\Downloads\\Are-Fresh-Fruits-and-Vegetables-More-Nutritious-than-Processed-Ones.jpg")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 530));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String a=prdid.getText();
        System.out.println(a);
String b=prdname.getText();
        System.out.println(b);
String c=prdqty.getText();
        System.out.println(c);

String d=prdprice.getText();
        System.out.println(d);

        PreparedStatement ps;
        
        String query ="INSERT INTO `productsss`(`id`,`cat`,`qty`,`price`)values(?,?,?,?)";
        try{
            ps= myconnection.getConnection().prepareStatement(query);
            ps.setString(1, a);
             ps.setString(2, b);
              ps.setString(3, c);
               ps.setString(4, d);
               
                 if(ps.executeUpdate()>0);
                 {
                     JOptionPane.showMessageDialog(null, "new user add");
                 }
                 selectcandidates();
        } 
        catch(Exception ex){
            System.out.println(ex);
        
        }  
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String a= prdid.getText();
        String b=prdname.getText();
        String c=prdqty.getText();
        String d=prdprice.getText();

        PreparedStatement ps;
        String query="UPDATE supermarket.productsss SET `cat`=?,`qty`=?, `price`=? WHERE `id`=?";
        try{
            ps=myconnection.getConnection().prepareStatement(query);

            //ps.setString(1, txtid.getText());

            ps.setString(1,b );
            ps.setString(2,c);
            ps.setString(3,d);
            ps.setString(4,a);

            if(ps.executeUpdate()>0) {
                JOptionPane.showMessageDialog(null, "updated");

            }
            else{
                JOptionPane.showMessageDialog(null, "id do not exist");
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String id=prdid.getText();
        int a = JOptionPane.showConfirmDialog(null, "do you want to delete","select",JOptionPane.YES_NO_OPTION);
        PreparedStatement ps;
        if(a==0){
            String query="DELETE FROM `productsss` WHERE `id`=?";
            try{
                ps= myconnection .getConnection().prepareStatement(query);
                ps.setString(1, id);
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null, "sucessfully deleted");
                }
                else{
                    JOptionPane.showMessageDialog(null, "id do not exist");
                }
            } catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        prdid.setText("");
prdname.setText("");
        prdprice.setText("");
        prdqty.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void prdtbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prdtbMouseClicked
        DefaultTableModel model=(DefaultTableModel)prdtb.getModel();
int Myindex = prdtb.getSelectedRow();
prdid.setText(model.getValueAt(Myindex, 0).toString());
prdname.setText(model.getValueAt(Myindex, 1).toString());
prdqty.setText(model.getValueAt(Myindex, 2).toString());  
prdprice.setText(model.getValueAt(Myindex, 3).toString());    // TODO add your handling code here:
    }//GEN-LAST:event_prdtbMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
frontpage t=new frontpage();
        t.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField prdid;
    private javax.swing.JTextField prdname;
    private javax.swing.JTextField prdprice;
    private javax.swing.JTextField prdqty;
    private javax.swing.JTable prdtb;
    // End of variables declaration//GEN-END:variables
}
