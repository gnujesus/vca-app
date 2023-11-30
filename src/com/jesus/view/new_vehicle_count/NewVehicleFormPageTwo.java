/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.jesus.view.new_vehicle_count;

/**
 *
 * @author Juan `Aether` Martínez <jotamartinezd at gmail.com>
 */
public class NewVehicleFormPageTwo extends javax.swing.JFrame {

	/**
	 * Creates new form NewVehicleForm
	 */
	public NewVehicleFormPageTwo() {
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
    txtCountInterval = new javax.swing.JTextField();
    txtCountCode = new javax.swing.JTextField();
    txtCountStartingTime = new javax.swing.JTextField();
    btnCreate = new javax.swing.JButton();
    lblCountInterval = new javax.swing.JLabel();
    lblIntersectionData1 = new javax.swing.JLabel();
    lblCountCode = new javax.swing.JLabel();
    lblCountStartingTime = new javax.swing.JLabel();
    lblCountFinishingTime = new javax.swing.JLabel();
    txtCountFinishingTime = new javax.swing.JTextField();
    lblCountName = new javax.swing.JLabel();
    txtCountName = new javax.swing.JTextField();
    lblCountDate = new javax.swing.JLabel();
    txtCountDate = new com.toedter.calendar.JDateChooser();
    lblInTransitText = new javax.swing.JLabel();
    lblInTransitT = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    txtCountInterval.setForeground(new java.awt.Color(1, 16, 1));
    jPanel1.add(txtCountInterval, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 220, 30));

    txtCountCode.setForeground(new java.awt.Color(1, 16, 1));
    jPanel1.add(txtCountCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 220, 30));

    txtCountStartingTime.setForeground(new java.awt.Color(1, 16, 1));
    jPanel1.add(txtCountStartingTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 220, 30));

    btnCreate.setBackground(new java.awt.Color(20, 175, 113));
    btnCreate.setFont(new java.awt.Font("Carlito", 0, 18)); // NOI18N
    btnCreate.setForeground(new java.awt.Color(255, 255, 255));
    btnCreate.setText("Crear");
    btnCreate.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCreateActionPerformed(evt);
      }
    });
    jPanel1.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 110, 30));

    lblCountInterval.setFont(new java.awt.Font("Carlito", 0, 14)); // NOI18N
    lblCountInterval.setForeground(new java.awt.Color(0, 0, 0));
    lblCountInterval.setText("Intérvalo de la Cuenta");
    jPanel1.add(lblCountInterval, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

    lblIntersectionData1.setFont(new java.awt.Font("Carlito", 0, 24)); // NOI18N
    lblIntersectionData1.setForeground(new java.awt.Color(0, 0, 0));
    lblIntersectionData1.setText("Datos del Aforo");
    lblIntersectionData1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jPanel1.add(lblIntersectionData1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 160, -1));

    lblCountCode.setFont(new java.awt.Font("Carlito", 0, 14)); // NOI18N
    lblCountCode.setForeground(new java.awt.Color(0, 0, 0));
    lblCountCode.setText("Código del Aforo");
    jPanel1.add(lblCountCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

    lblCountStartingTime.setFont(new java.awt.Font("Carlito", 0, 14)); // NOI18N
    lblCountStartingTime.setForeground(new java.awt.Color(0, 0, 0));
    lblCountStartingTime.setText("Hora de Inicio (Formato 24h)");
    jPanel1.add(lblCountStartingTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

    lblCountFinishingTime.setFont(new java.awt.Font("Carlito", 0, 14)); // NOI18N
    lblCountFinishingTime.setForeground(new java.awt.Color(0, 0, 0));
    lblCountFinishingTime.setText("Hora de Finalización");
    jPanel1.add(lblCountFinishingTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

    txtCountFinishingTime.setForeground(new java.awt.Color(1, 16, 1));
    jPanel1.add(txtCountFinishingTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 220, 30));

    lblCountName.setFont(new java.awt.Font("Carlito", 0, 14)); // NOI18N
    lblCountName.setForeground(new java.awt.Color(0, 0, 0));
    lblCountName.setText("Nombre del Aforo");
    jPanel1.add(lblCountName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

    txtCountName.setForeground(new java.awt.Color(1, 16, 1));
    jPanel1.add(txtCountName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 220, 30));

    lblCountDate.setFont(new java.awt.Font("Carlito", 0, 14)); // NOI18N
    lblCountDate.setForeground(new java.awt.Color(0, 0, 0));
    lblCountDate.setText("Fecha del Aforo");
    jPanel1.add(lblCountDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

    txtCountDate.setForeground(new java.awt.Color(1, 16, 1));
    jPanel1.add(txtCountDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 220, 30));

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

  private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
    // TODO add your handling code here:
		this.setVisible(false);
  }//GEN-LAST:event_btnCreateActionPerformed

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
			java.util.logging.Logger.getLogger(NewVehicleFormPageTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex)
		{
			java.util.logging.Logger.getLogger(NewVehicleFormPageTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex)
		{
			java.util.logging.Logger.getLogger(NewVehicleFormPageTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex)
		{
			java.util.logging.Logger.getLogger(NewVehicleFormPageTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new NewVehicleFormPageTwo().setVisible(true);
			}
		});
	}

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCreate;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JLabel lblCountCode;
  private javax.swing.JLabel lblCountDate;
  private javax.swing.JLabel lblCountFinishingTime;
  private javax.swing.JLabel lblCountInterval;
  private javax.swing.JLabel lblCountName;
  private javax.swing.JLabel lblCountStartingTime;
  private javax.swing.JLabel lblInTransitT;
  private javax.swing.JLabel lblInTransitText;
  private javax.swing.JLabel lblIntersectionData1;
  private javax.swing.JTextField txtCountCode;
  private com.toedter.calendar.JDateChooser txtCountDate;
  private javax.swing.JTextField txtCountFinishingTime;
  private javax.swing.JTextField txtCountInterval;
  private javax.swing.JTextField txtCountName;
  private javax.swing.JTextField txtCountStartingTime;
  // End of variables declaration//GEN-END:variables
}
