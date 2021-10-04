/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asmbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AL AMIN
 */
public class allProfileList extends javax.swing.JFrame {

    /**
     * Creates new form allProfileList
     */
    public allProfileList() {
        initComponents();
    }
    //userList() method :
    
    public ArrayList<User2> userList(){
        ArrayList<User2> usersList = new ArrayList<>();//usersList variable :
       try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=asmBank;integratedSecurity=true;";
            Connection con = DriverManager.getConnection(url);
            String Sql1="select * from detailsOfNominee1";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Sql1);
            User2 user; //Class er object user :
            while(rs.next()){
                user =new User2(rs.getString("nameOfAccount"),rs.getString("accountNumber"),rs.getString("accountType"),rs.getString("nameOfNominee"),rs.getString("nameOfFathers"),rs.getString("nameOfMothers"),rs.getString("nameOfSpouse"),rs.getString("dateOfBirth"),rs.getString("gender"),rs.getString("pnameOfvillage"),rs.getString("pnameOfThana"),rs.getString("pnameOfDistrict"),rs.getString("ppostCode"),rs.getString("nameOfvillage"),rs.getString("nameOfThana"),rs.getString("nameOfDistrict"),rs.getString("postCode"),rs.getString("occuption"),rs.getString("idOfNumber"),rs.getString("startingDate"),rs.getString("email"),rs.getString("mobileNo"),rs.getString("nationalty"),rs.getString("amount"));
                usersList.add(user);
            }         
       }
       
       
       catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
       return usersList;
    }
     public void showUser(){
        DefaultTableModel model =( DefaultTableModel ) detailOfAccount.getModel();
        ArrayList<User2> list = userList();
        
        Object[] row = new Object[24];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getA();
            row[1]=list.get(i).getB();
            row[2]=list.get(i).getC();
            row[3]=list.get(i).getD();
            row[4]=list.get(i).getE();
            row[5]=list.get(i).getF();
            row[6]=list.get(i).getG();
            row[7]=list.get(i).getH();
            row[8]=list.get(i).getI();
            row[9]=list.get(i).getJ();
            row[10]=list.get(i).getK();
            row[11]=list.get(i).getL();
            row[12]=list.get(i).getM();
            row[13]=list.get(i).getN();
            row[14]=list.get(i).getO();
            row[15]=list.get(i).getP();
            row[16]=list.get(i).getQ();
            row[17]=list.get(i).getR();
            row[18]=list.get(i).getS();
            row[19]=list.get(i).getT();
            row[20]=list.get(i).getU();
            row[21]=list.get(i).getV();
            row[22]=list.get(i).getW();
            row[23]=list.get(i).getX(); 
            
            
            model.addRow(row);
        }
    }
    
      public ArrayList<User2> userList1(){
        ArrayList<User2> usersList1 = new ArrayList<>();
       try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=asmBank;integratedSecurity=true;";
            Connection con = DriverManager.getConnection(url);
            String m=jXDatePicker1.getDate().toString();
            String Sql1="select * from detailsOfNominee1 where startingDate='"+m+"'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Sql1);
            User2 user;
            while(rs.next()){
                user =new User2(rs.getString("nameOfAccount"),rs.getString("accountNumber"),rs.getString("accountType"),rs.getString("nameOfNominee"),rs.getString("nameOfFathers"),rs.getString("nameOfMothers"),rs.getString("nameOfSpouse"),rs.getString("dateOfBirth"),rs.getString("gender"),rs.getString("pnameOfvillage"),rs.getString("pnameOfThana"),rs.getString("pnameOfDistrict"),rs.getString("ppostCode"),rs.getString("nameOfvillage"),rs.getString("nameOfThana"),rs.getString("nameOfDistrict"),rs.getString("postCode"),rs.getString("occuption"),rs.getString("idOfNumber"),rs.getString("startingDate"),rs.getString("email"),rs.getString("mobileNo"),rs.getString("nationalty"),rs.getString("amount"));
                usersList1.add(user);
            }         
       }
       
       
       catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
       return usersList1;
    }
      public void showUser1(){
       DefaultTableModel model =( DefaultTableModel ) detailOfAccount.getModel();
        ArrayList<User2> list = userList1();
        
        Object[] row = new Object[24];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getA();
            row[1]=list.get(i).getB();
            row[2]=list.get(i).getC();
            row[3]=list.get(i).getD();
            row[4]=list.get(i).getE();
            row[5]=list.get(i).getF();
            row[6]=list.get(i).getG();
            row[7]=list.get(i).getH();
            row[8]=list.get(i).getI();
            row[9]=list.get(i).getJ();
            row[10]=list.get(i).getK();
            row[11]=list.get(i).getL();
            row[12]=list.get(i).getM();
            row[13]=list.get(i).getN();
            row[14]=list.get(i).getO();
            row[15]=list.get(i).getP();
            row[16]=list.get(i).getQ();
            row[17]=list.get(i).getR();
            row[18]=list.get(i).getS();
            row[19]=list.get(i).getT();
            row[20]=list.get(i).getU();
            row[21]=list.get(i).getV();
            row[22]=list.get(i).getW();
             row[23]=list.get(i).getX(); 
            
      model.addRow(row);
        }
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
        detailOfAccount = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        View = new javax.swing.JButton();
        search = new javax.swing.JButton();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        detailOfAccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nameOfAccount", "accountNumber", "accountType", "nameOfNominee", "nameOfFathers", "nameOfMothers", "nameOfSpouse", "dateOfBirth", "gender", "pnameOfvillage", "pnameOfThana", "pnameOfDistrict", "ppostCode", "nameOfvillage", "nameOfThana", "nameOfDistrict", "postCode", "occuption", "idOfNumber", "startingDate", "email", "mobileNo", "nationalty", "amount"
            }
        ));
        jScrollPane1.setViewportView(detailOfAccount);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Detail Of Accounts");

        Back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        View.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        View.setForeground(new java.awt.Color(0, 204, 204));
        View.setText("View Data");
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });

        search.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        search.setForeground(new java.awt.Color(102, 102, 255));
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Date :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(View)
                                .addGap(47, 47, 47)
                                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 659, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(search)
                                .addGap(32, 32, 32)))
                        .addGap(436, 436, 436))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Back)
                        .addComponent(View))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(search)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
   
         try{
            mainPage ob=new mainPage();
            ob.setVisible(true);
            this.setVisible(false);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_BackActionPerformed

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
       
        detailOfAccount.setModel(new DefaultTableModel(null,new String[]{"nameOfAccount","accountNumber","accountType","nameOfNominee","nameOfFathers","nameOfMothers","nameOfSpouse","dateOfBirth","gender","pnameOfvillage","pnameOfThana","pnameOfDistrict","ppostCode","nameOfvillage","nameOfThana","nameOfDistrict","postCode","occuption","idOfNumber","startingDate","email","mobileNo","nationalty","amount"}));
        showUser();
    }//GEN-LAST:event_ViewActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
    
         detailOfAccount.setModel(new DefaultTableModel(null,new String[]{"nameOfAccount","accountNumber","accountType","nameOfNominee","nameOfFathers","nameOfMothers","nameOfSpouse","dateOfBirth","gender","pnameOfvillage","pnameOfThana","pnameOfDistrict","ppostCode","nameOfvillage","nameOfThana","nameOfDistrict","postCode","occuption","idOfNumber","startingDate","email","mobileNo","nationalty","amount"}));
        showUser1();
    }//GEN-LAST:event_searchActionPerformed

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
            java.util.logging.Logger.getLogger(allProfileList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(allProfileList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(allProfileList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(allProfileList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new allProfileList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton View;
    private javax.swing.JTable detailOfAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
