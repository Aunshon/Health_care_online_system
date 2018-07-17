/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package health_care;

import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Aunshon
 */
public class patient_galary extends javax.swing.JFrame {

    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    String call_pass;
    String call_user;
    String call_id;
    public patient_galary() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().createImage(getClass().getResource("hospital.png")));
        setTitle("Patient");
        conn=Health_Care_Database_Connection.ConnecrDb();
        
    }
    
    public patient_galary(String u,String p,String i){
        initComponents();
        username.setText(u);
        id.setText(i);
        call_pass=p;
        call_user=u;
        call_id=i;
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        table4 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        table3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        msg_box = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        cancle_btn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        r = new javax.swing.JButton();
        dp_id = new javax.swing.JLabel();
        dp_user = new javax.swing.JLabel();
        dp_dep = new javax.swing.JLabel();
        dp_day = new javax.swing.JLabel();
        dp_time = new javax.swing.JLabel();
        dp_date = new javax.swing.JLabel();
        serial = new javax.swing.JLabel();
        dr = new javax.swing.JLabel();
        pr = new javax.swing.JLabel();
        s = new javax.swing.JLabel();
        vdv = new javax.swing.JLabel();
        ctime = new javax.swing.JLabel();
        cdate = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        table5 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        msg = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbl_approved = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(102, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 540, 260));

        table4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table4MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table4);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 540, 200));

        table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table3);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 650, 200));

        msg_box.setColumns(20);
        msg_box.setRows(5);
        jScrollPane4.setViewportView(msg_box);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, 650, 100));

        jButton1.setText("Confirm Appointment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 610, 160, 30));

        cancle_btn.setText("Cancle Appointment");
        cancle_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancle_btnActionPerformed(evt);
            }
        });
        jPanel1.add(cancle_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 610, 160, 30));

        jButton4.setText("Take Appointment");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 610, 160, 30));

        jButton5.setText("Logout");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 660, 160, 40));

        jButton6.setText("Exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 710, 160, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("your Message");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 480, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Your Appointment List");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Doctors List");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 30));

        jLabel12.setText("Phone");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, -1, -1));

        jLabel13.setText("Username");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 110, -1));
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 250, -1));
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 250, -1));

        r.setText("Refresh");
        r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rActionPerformed(evt);
            }
        });
        jPanel1.add(r, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 610, 140, 30));

        dp_id.setForeground(new java.awt.Color(102, 102, 0));
        jPanel1.add(dp_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 20, 20));

        dp_user.setForeground(new java.awt.Color(102, 102, 0));
        jPanel1.add(dp_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 20, 20));

        dp_dep.setForeground(new java.awt.Color(102, 102, 0));
        jPanel1.add(dp_dep, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 20, 20));

        dp_day.setForeground(new java.awt.Color(102, 102, 0));
        jPanel1.add(dp_day, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 20, 20));

        dp_time.setForeground(new java.awt.Color(102, 102, 0));
        jPanel1.add(dp_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 20, 20));

        dp_date.setForeground(new java.awt.Color(102, 102, 0));
        jPanel1.add(dp_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 20, 20));

        serial.setForeground(new java.awt.Color(102, 102, 0));
        jPanel1.add(serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 20, 20));

        dr.setForeground(new java.awt.Color(102, 102, 0));
        jPanel1.add(dr, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, -1));

        pr.setForeground(new java.awt.Color(102, 102, 0));
        jPanel1.add(pr, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, -1));
        jPanel1.add(s, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));

        vdv.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        vdv.setForeground(new java.awt.Color(255, 255, 255));
        vdv.setText("Cancled Appointment");
        jPanel1.add(vdv, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, -1));

        ctime.setForeground(new java.awt.Color(102, 102, 0));
        ctime.setText("jLabel5");
        jPanel1.add(ctime, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, -1, -1));

        cdate.setForeground(new java.awt.Color(102, 102, 0));
        cdate.setText("jLabel5");
        jPanel1.add(cdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, -1, -1));

        jLabel9.setForeground(new java.awt.Color(102, 102, 0));
        jLabel9.setText("jLabel5");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, -1, -1));

        table5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table5MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(table5);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 540, 170));

        msg.setColumns(20);
        msg.setRows(5);
        jScrollPane6.setViewportView(msg);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 660, 380, 90));

        jButton3.setText("Seen");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 660, 90, 90));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Admin Message Detail");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 640, -1, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("List of messages from admin");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, -1, -1));

        tbl_approved.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbl_approved.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_approvedMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tbl_approved);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 650, 180));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Approved Apointment's");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 280, -1, -1));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new Home().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    public void msg(){
        try {
            try {
            String query="select * from tbl_admin_patient where phone='"+id.getText()+"' and username='"+username.getText()+"'";
            pst=conn.prepareStatement(query);
            rs=pst.executeQuery();
            table5.setModel(DbUtils.resultSetToTableModel(rs));
            pst.close();
            rs.close();
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }}
    
    private void rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rActionPerformed
        cancle_fun();
        doctor_list_refresh();
        req_list_ref();
        msg_box.setText("");
        msg();
        approved_tbl_refresh();
    }//GEN-LAST:event_rActionPerformed
public void doctor_list_refresh(){
    if(id.getText().toString().isEmpty() || username.getText().toString().isEmpty()){
            JOptionPane.showMessageDialog(null, "Check id or username text field \n You can not leave them empty");
            
        }
        else{
            try{
           String query = "select * from tbl_allapointment";
           pst = conn.prepareStatement(query);
	   rs = pst.executeQuery();
			
	   table1.setModel(DbUtils.resultSetToTableModel(rs));
	
           pst.execute();
           pst.close();
           
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
        }
}
    public void req_list_ref(){
        if(id.getText().toString().isEmpty() || username.getText().toString().isEmpty()){
            JOptionPane.showMessageDialog(null, "Check id or username text field \n You can not leave them empty");
            
        }
        else{
    try{
           String query = "select Serial,D_id,D_username,D_day,D_time,D_date,D_responce,P_responce from tbl_taken_app where P_id="+id.getText()+" and P_username='"+username.getText()+"' ";
           pst = conn.prepareStatement(query);
	   rs = pst.executeQuery();
			
	   table3.setModel(DbUtils.resultSetToTableModel(rs));
	
           pst.execute();
           pst.close();
           
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
        }
}
    public void approved_tbl_refresh(){
        if(id.getText().toString().isEmpty() || username.getText().toString().isEmpty()){
            JOptionPane.showMessageDialog(null, "Check id or username text field \n You can not leave them empty");
            
        }
        else{
    try{
           String query = "select Serial,D_id,D_username,D_day,D_time,D_date,D_responce,P_responce from tbl_approved where P_id="+id.getText()+" and P_username='"+username.getText()+"' ";
           pst = conn.prepareStatement(query);
	   rs = pst.executeQuery();
			
	   tbl_approved.setModel(DbUtils.resultSetToTableModel(rs));
	
           pst.execute();
           pst.close();
           
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
        }
}
    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        try{
					int row = table1.getSelectedRow();
					String Serial_=(table1.getModel().getValueAt(row, 0)).toString();
					
					String query = "select * from tbl_allapointment where Serial='"+Serial_+"'";
					PreparedStatement pst = conn.prepareStatement(query);
					
					ResultSet rs = pst.executeQuery();
					
					
					while(rs.next())
					{
                                                serial.setText(rs.getString("Serial"));
						dp_id.setText(rs.getString("D_id"));
						dp_user.setText(rs.getString("D_username"));
						dp_dep.setText(rs.getString("D_department"));
						dp_day.setText(rs.getString("D_day"));
						dp_time.setText(rs.getString("D_time"));
                                                dp_date.setText(rs.getString("D_date"));
                                                dr.setText("0");
                                                pr.setText("0");
					}
                                        //JOptionPane.showMessageDialog(null, "YES");
					pst.close();
				}	
	
				catch (Exception ef){
				JOptionPane.showMessageDialog(null, ef.getMessage());
				}
    }//GEN-LAST:event_table1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try
	{
					
					
	String query = " insert into tbl_taken_app (Serial,P_id,P_username,D_id,D_username,D_department,D_day,D_time,D_date,D_responce,P_responce) values (?,?,?,?,?,?,?,?,?,?,?)";
	PreparedStatement pst = conn.prepareStatement(query);
					
                                        
	pst.setString(1, serial.getText());				
	pst.setString(2,id.getText());
	pst.setString(3,username.getText());
	pst.setString(4,dp_id.getText());
	pst.setString(5,dp_user.getText());
        pst.setString(6,dp_dep.getText());
        pst.setString(7,dp_day.getText());
        pst.setString(8,dp_time.getText());
        pst.setString(9,dp_date.getText());
        pst.setString(10,dr.getText());
        pst.setString(11,pr.getText());
        
					
	pst.execute();
	pst.close();
					
	//JOptionPane.showMessageDialog(null, "Appointment Request Sent ");
					
					
	} catch (Exception es) {
		JOptionPane.showMessageDialog(null, es.getMessage());
	}
        msg_box.setText("");
        cancle_fun();
        doctor_list_refresh();
        req_list_ref();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(id.getText().toString().isEmpty() || username.getText().toString().isEmpty()){
            JOptionPane.showMessageDialog(null, "Check id or username text field \n You can not leave them empty");
            
        }
        else{
            try{
            String query = "Update tbl_approved set P_responce='Yes Coming' where Serial='"+s.getText()+"'";
            pst = conn.prepareStatement(query);
	    pst.execute();
	    //JOptionPane.showMessageDialog(null, "Information modified");
	    pst.close();
            approved_tbl_refresh();
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        }
        cancle_fun();
        doctor_list_refresh();
        req_list_ref();
        msg_box.setText("");
        msg();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void table3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table3MouseClicked
        try{
					int row = table3.getSelectedRow();
					String Serial_=(table3.getModel().getValueAt(row, 0)).toString();
					
					String query = "select * from tbl_taken_app where Serial='"+Serial_+"'";
					PreparedStatement pst = conn.prepareStatement(query);
					
					ResultSet rs = pst.executeQuery();
					
					
					while(rs.next())
					{
                                                s.setText(rs.getString("Serial"));
					}
                                        //JOptionPane.showMessageDialog(null, "Great");
					pst.close();
				}	
	
				catch (Exception ef){
				JOptionPane.showMessageDialog(null, ef.getMessage());
				}
        try{
					int row = table3.getSelectedRow();
					String Serial_=(table3.getModel().getValueAt(row, 0)).toString();
					
					String query = "select * from tbl_taken_app where Serial='"+Serial_+"'";
					PreparedStatement pst = conn.prepareStatement(query);
					
					ResultSet rs = pst.executeQuery();
					
					
					while(rs.next())
					{
                                                serial.setText(rs.getString("Serial"));
						dp_id.setText(rs.getString("D_id"));
						dp_user.setText(rs.getString("D_username"));
						dp_dep.setText(rs.getString("D_department"));
						dp_day.setText(rs.getString("D_day"));
						dp_time.setText(rs.getString("D_time"));
                                                dp_date.setText(rs.getString("D_date"));
                                                dr.setText("0");
                                                pr.setText("0");
					}
                                        //JOptionPane.showMessageDialog(null, "YES");
					pst.close();
				}	
	
				catch (Exception ef){
				JOptionPane.showMessageDialog(null, ef.getMessage());
				}
        
    }//GEN-LAST:event_table3MouseClicked

   public void cancle_fun(){
        if(id.getText().toString().isEmpty() || username.getText().toString().isEmpty()){
            JOptionPane.showMessageDialog(null, "Check id or username text field \n You can not leave them empty");
            
        }
        else{
            try{
           String query = "select Serial,D_id,D_username,D_date,D_time from tbl_cancle where P_id='"+id.getText()+"' and P_username='"+username.getText()+"'";
           pst = conn.prepareStatement(query);
	   rs = pst.executeQuery();
			
	   table4.setModel(DbUtils.resultSetToTableModel(rs));
	
           pst.execute();
           pst.close();
           
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
        }
    }
    
    private void cancle_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancle_btnActionPerformed
        if(msg_box.getText().toString().isEmpty()){
            JOptionPane.showMessageDialog(null, "you have to leave a meassage to cancle appointment leave the message in the message box");
        }
        else{
            try
	       {
					
					
		String query = " insert into tbl_cancle (Serial,D_id,D_username,P_id,P_username,D_date,D_time,D_message) values (?,?,?,?,?,?,?,?)";
		PreparedStatement pst = conn.prepareStatement(query);
		                      
		pst.setString(1, serial.getText());			
		pst.setString(2,dp_id.getText());
		pst.setString(3,dp_user.getText());
                pst.setString(4,id.getText());
                pst.setString(5,username.getText());
		pst.setString(6,dp_date.getText());
		pst.setString(7,dp_time.getText());
                pst.setString(8,msg_box.getText());
					
		pst.execute();
		pst.close();
					
		//JOptionPane.showMessageDialog(null, "Product Successfully added");
					
					
				} catch (Exception es) {
					JOptionPane.showMessageDialog(null, es.getMessage());
				}
            try{
                String query = " delete from tbl_approved where Serial='"+serial.getText()+"'";
		PreparedStatement pst = conn.prepareStatement(query);
                pst.execute();
		pst.close();
                approved_tbl_refresh();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        cancle_fun();
        doctor_list_refresh();
        req_list_ref();
        msg_box.setText("");
        msg();
        approved_tbl_refresh();
    }//GEN-LAST:event_cancle_btnActionPerformed

    private void table4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table4MouseClicked
        try{
					int row = table4.getSelectedRow();
					String Serial_=(table4.getModel().getValueAt(row, 0)).toString();
					
					String query = "select D_message from tbl_cancle where Serial='"+Serial_+"'";
					PreparedStatement pst = conn.prepareStatement(query);
					
					ResultSet rs = pst.executeQuery();
					
					
					while(rs.next())
					{
                                                msg_box.setText(rs.getString("D_message"));
					}
                                        //JOptionPane.showMessageDialog(null, "Great");
					pst.close();
				}	
	
				catch (Exception ef){
				JOptionPane.showMessageDialog(null, ef.getMessage());
				}
    }//GEN-LAST:event_table4MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(id.getText().toString().isEmpty() || username.getText().toString().isEmpty()){
            JOptionPane.showMessageDialog(null, "Check id or username text field \n You can not leave them empty");
            
        }
        else{
            try{
            String query = "Update tbl_admin_patient set responce='Seen' where phone='"+id.getText()+"'";
            pst = conn.prepareStatement(query);
	    pst.execute();
	    //JOptionPane.showMessageDialog(null, "Information modified");
	    pst.close();
msg();
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        }
        cancle_fun();
        doctor_list_refresh();
        req_list_ref();
        msg_box.setText("");
        msg();
        approved_tbl_refresh();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void table5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table5MouseClicked
        try{
					int row = table5.getSelectedRow();
					String Serial_=(table5.getModel().getValueAt(row, 0)).toString();
					
					String query = "select message from tbl_admin_patient where Serial='"+Serial_+"'";
					PreparedStatement pst = conn.prepareStatement(query);
					
					ResultSet rs = pst.executeQuery();
					
					
					while(rs.next())
					{
                                                msg.setText(rs.getString("message"));
					}
                                        //JOptionPane.showMessageDialog(null, "Great");
					pst.close();
				}	
	
				catch (Exception ef){
				JOptionPane.showMessageDialog(null, ef.getMessage());
				}
    }//GEN-LAST:event_table5MouseClicked

    private void tbl_approvedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_approvedMouseClicked
        try{
					int row = tbl_approved.getSelectedRow();
					String Serial_=(tbl_approved.getModel().getValueAt(row, 0)).toString();
					
					String query = "select * from tbl_approved where Serial='"+Serial_+"'";
					PreparedStatement pst = conn.prepareStatement(query);
					
					ResultSet rs = pst.executeQuery();
					
					
					while(rs.next())
					{
                                                s.setText(rs.getString("Serial"));
					}
                                        //JOptionPane.showMessageDialog(null, "Great");
					pst.close();
				}	
	
				catch (Exception ef){
				JOptionPane.showMessageDialog(null, ef.getMessage());
				}
        try{
					int row = tbl_approved.getSelectedRow();
					String Serial_=(tbl_approved.getModel().getValueAt(row, 0)).toString();
					
					String query = "select * from tbl_approved where Serial='"+Serial_+"'";
					PreparedStatement pst = conn.prepareStatement(query);
					
					ResultSet rs = pst.executeQuery();
					
					
					while(rs.next())
					{
                                                serial.setText(rs.getString("Serial"));
						dp_id.setText(rs.getString("D_id"));
						dp_user.setText(rs.getString("D_username"));
						dp_dep.setText(rs.getString("D_department"));
						dp_day.setText(rs.getString("D_day"));
						dp_time.setText(rs.getString("D_time"));
                                                dp_date.setText(rs.getString("D_date"));
                                                dr.setText("0");
                                                pr.setText("0");
					}
                                        //JOptionPane.showMessageDialog(null, "YES");
					pst.close();
				}	
	
				catch (Exception ef){
				JOptionPane.showMessageDialog(null, ef.getMessage());
				}
    }//GEN-LAST:event_tbl_approvedMouseClicked

   
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
            java.util.logging.Logger.getLogger(patient_galary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(patient_galary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(patient_galary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(patient_galary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new patient_galary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancle_btn;
    private javax.swing.JLabel cdate;
    private javax.swing.JLabel ctime;
    private javax.swing.JLabel dp_date;
    private javax.swing.JLabel dp_day;
    private javax.swing.JLabel dp_dep;
    private javax.swing.JLabel dp_id;
    private javax.swing.JLabel dp_time;
    private javax.swing.JLabel dp_user;
    private javax.swing.JLabel dr;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea msg;
    private javax.swing.JTextArea msg_box;
    private javax.swing.JLabel pr;
    private javax.swing.JButton r;
    private javax.swing.JLabel s;
    private javax.swing.JLabel serial;
    private javax.swing.JTable table1;
    private javax.swing.JTable table3;
    private javax.swing.JTable table4;
    private javax.swing.JTable table5;
    private javax.swing.JTable tbl_approved;
    private javax.swing.JTextField username;
    private javax.swing.JLabel vdv;
    // End of variables declaration//GEN-END:variables
}