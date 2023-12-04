/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.jesus.view.new_vehicle_count;

import com.jesus.model.SingletonIntersectionDAO;
import com.jesus.utils.SingletonJDBCUtil;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * @author Juan `Aether` Martínez <jotamartinezd at gmail.com>
 */
public class NewVehicleFormPageOne extends javax.swing.JFrame {

	/**
	 * Creates new form NewVehicleForm
	 */
	public NewVehicleFormPageOne() {
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
    txtProvince = new javax.swing.JTextField();
    txtIntersectionName = new javax.swing.JTextField();
    txtStreet = new javax.swing.JTextField();
    btnCancel = new javax.swing.JButton();
    lblProvincia = new javax.swing.JLabel();
    lblIntersectionData1 = new javax.swing.JLabel();
    lblIntersectionName = new javax.swing.JLabel();
    lblCalle = new javax.swing.JLabel();
    lblInTransitText = new javax.swing.JLabel();
    lblInTransitT = new javax.swing.JLabel();
    btnNext1 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    txtProvince.setForeground(new java.awt.Color(1, 16, 1));
    jPanel1.add(txtProvince, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 350, 30));

    txtIntersectionName.setForeground(new java.awt.Color(1, 16, 1));
    jPanel1.add(txtIntersectionName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 350, 30));

    txtStreet.setForeground(new java.awt.Color(1, 16, 1));
    jPanel1.add(txtStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 350, 30));

    btnCancel.setBackground(new java.awt.Color(20, 175, 113));
    btnCancel.setFont(new java.awt.Font("Carlito", 0, 18)); // NOI18N
    btnCancel.setForeground(new java.awt.Color(255, 255, 255));
    btnCancel.setText("Cancelar");
    btnCancel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCancelActionPerformed(evt);
      }
    });
    jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 110, 30));

    lblProvincia.setFont(new java.awt.Font("Carlito", 0, 14)); // NOI18N
    lblProvincia.setForeground(new java.awt.Color(0, 0, 0));
    lblProvincia.setText("Provincia");
    jPanel1.add(lblProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

    lblIntersectionData1.setFont(new java.awt.Font("Carlito", 0, 24)); // NOI18N
    lblIntersectionData1.setForeground(new java.awt.Color(0, 0, 0));
    lblIntersectionData1.setText("Datos de la intersección");
    jPanel1.add(lblIntersectionData1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

    lblIntersectionName.setFont(new java.awt.Font("Carlito", 0, 14)); // NOI18N
    lblIntersectionName.setForeground(new java.awt.Color(0, 0, 0));
    lblIntersectionName.setText("Nombre de la intersección");
    jPanel1.add(lblIntersectionName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

    lblCalle.setFont(new java.awt.Font("Carlito", 0, 14)); // NOI18N
    lblCalle.setForeground(new java.awt.Color(0, 0, 0));
    lblCalle.setText("Calle");
    jPanel1.add(lblCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

    lblInTransitText.setBackground(new java.awt.Color(255, 255, 255));
    lblInTransitText.setFont(new java.awt.Font("Carlito", 0, 36)); // NOI18N
    lblInTransitText.setForeground(new java.awt.Color(0, 140, 87));
    lblInTransitText.setText("In  ransit");
    lblInTransitText.setToolTipText("");
    jPanel1.add(lblInTransitText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 30));

    lblInTransitT.setFont(new java.awt.Font("Caladea", 1, 54)); // NOI18N
    lblInTransitT.setForeground(new java.awt.Color(0, 140, 87));
    lblInTransitT.setText("T");
    jPanel1.add(lblInTransitT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 40, -1));

    btnNext1.setBackground(new java.awt.Color(20, 175, 113));
    btnNext1.setFont(new java.awt.Font("Carlito", 0, 18)); // NOI18N
    btnNext1.setForeground(new java.awt.Color(255, 255, 255));
    btnNext1.setText("Siguiente");
    btnNext1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnNext1ActionPerformed(evt);
      }
    });
    jPanel1.add(btnNext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 110, 30));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
    // TODO add your handling code here:
		this.dispose();
  }//GEN-LAST:event_btnCancelActionPerformed

  private void btnNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext1ActionPerformed
    // TODO add your handling code here:
		NewVehicleFormPageTwo newVehicleForm = new NewVehicleFormPageTwo();

		SingletonJDBCUtil jdbcUtil = SingletonJDBCUtil.getInstance("vca_app", "localhost", "aether", "12345");

		Connection connection = jdbcUtil.getConnection();
		SingletonIntersectionDAO intersectionDAO = SingletonIntersectionDAO.getInstance(connection);

		String intersectionName = txtIntersectionName.getText();
		String street = txtStreet.getText();
		String province = txtProvince.getText();

		try
		{
			intersectionDAO.insert(intersectionName, street, province);

			connection.commit();

			JOptionPane.showMessageDialog(rootPane, "INTERSECCION AGREGADA CORRECTAMENTE");

			NewVehicleFormPageTwo nvtwo = new NewVehicleFormPageTwo();
			nvtwo.setVisible(true);
			this.dispose();
		} catch (SQLException e)
		{
			JOptionPane.showMessageDialog(rootPane, "ERROR AL AGREGAR INTERSECCION: " + e);
		}
  }//GEN-LAST:event_btnNext1ActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try
		{
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
			{
				if ("Nimbus".equals(info.getName()))
				{
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex)
		{
			java.util.logging.Logger.getLogger(NewVehicleFormPageOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex)
		{
			java.util.logging.Logger.getLogger(NewVehicleFormPageOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex)
		{
			java.util.logging.Logger.getLogger(NewVehicleFormPageOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex)
		{
			java.util.logging.Logger.getLogger(NewVehicleFormPageOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new NewVehicleFormPageOne().setVisible(true);
			}
		});
	}

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCancel;
  private javax.swing.JButton btnNext1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JLabel lblCalle;
  private javax.swing.JLabel lblInTransitT;
  private javax.swing.JLabel lblInTransitText;
  private javax.swing.JLabel lblIntersectionData1;
  private javax.swing.JLabel lblIntersectionName;
  private javax.swing.JLabel lblProvincia;
  private javax.swing.JTextField txtIntersectionName;
  private javax.swing.JTextField txtProvince;
  private javax.swing.JTextField txtStreet;
  // End of variables declaration//GEN-END:variables
}
