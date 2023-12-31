/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.jesus.view.register;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubIJTheme;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.jesus.model.SingletonUserDAO;
import com.jesus.utils.SingletonJDBCUtil;
import com.jesus.view.login.LoginForm;
import java.sql.Connection;
import java.awt.Button;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.sql.PreparedStatement;

/**
 *
 * @author Juan `Aether` Martínez <jotamartinezd at gmail.com>
 */
public class RegisterForm extends javax.swing.JFrame {

	/**
	 * Creates new form RegisterFrae
	 */
	public RegisterForm() {
		initComponents();
		LoginForm login = new LoginForm();

		UIManager.put( "Button.arc", 20);
		UIManager.put("TextComponent.arc", 10);
		UIManager.put("Label.arc", 10);
		UIManager.put( "Component.innerFocusWidth", 1 );
		UIManager.put("Component.focusWidth", 1);
		UIManager.put("Component.borderColor", new Color(71, 97, 75));
		UIManager.put("Component.selectionBackground", new Color(71, 97, 75));
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jpnMainPane = new javax.swing.JPanel();
    jpnWelcomePane = new javax.swing.JPanel();
    panelCover2 = new com.jesus.view.components.PanelCover();
    lblWelcome = new javax.swing.JLabel();
    btnHaveAnAccount = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jpnRegisterPane = new javax.swing.JPanel();
    lblFirstName = new javax.swing.JLabel();
    lblLastName = new javax.swing.JLabel();
    lblEmail = new javax.swing.JLabel();
    lblPhoneNumber = new javax.swing.JLabel();
    lblPassword = new javax.swing.JLabel();
    btnRegister = new javax.swing.JButton();
    txtFirstName = new javax.swing.JTextField();
    txtEmail = new javax.swing.JTextField();
    txtLastName = new javax.swing.JTextField();
    txtPhoneNumber = new javax.swing.JTextField();
    lblCreateAccount = new javax.swing.JLabel();
    txtPassword = new javax.swing.JPasswordField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jpnMainPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jpnWelcomePane.setBackground(new java.awt.Color(51, 204, 0));

    lblWelcome.setFont(new java.awt.Font("Carlito", 0, 36)); // NOI18N
    lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
    lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lblWelcome.setText("Welcome");

    btnHaveAnAccount.setBackground(new java.awt.Color(0, 100, 54));
    btnHaveAnAccount.setFont(new java.awt.Font("Carlito", 0, 18)); // NOI18N
    btnHaveAnAccount.setForeground(new java.awt.Color(255, 255, 255));
    btnHaveAnAccount.setText("I already have an account");
    btnHaveAnAccount.setBorderPainted(false);
    btnHaveAnAccount.setContentAreaFilled(false);
    btnHaveAnAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    btnHaveAnAccount.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnHaveAnAccountActionPerformed(evt);
      }
    });

    jLabel1.setFont(new java.awt.Font("Carlito", 0, 14)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    jLabel1.setText("Welcome to the Vehicle Counting Asistant.");

    jLabel2.setFont(new java.awt.Font("Carlito", 0, 14)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(255, 255, 255));
    jLabel2.setText("Register yourself and start monitoring");

    jLabel3.setFont(new java.awt.Font("Carlito", 0, 14)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
    jLabel3.setText("your data with us.");

    javax.swing.GroupLayout panelCover2Layout = new javax.swing.GroupLayout(panelCover2);
    panelCover2.setLayout(panelCover2Layout);
    panelCover2Layout.setHorizontalGroup(
      panelCover2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(lblWelcome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCover2Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(panelCover2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jLabel1)
          .addGroup(panelCover2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
            .addComponent(btnHaveAnAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(46, 46, 46))
      .addGroup(panelCover2Layout.createSequentialGroup()
        .addGap(109, 109, 109)
        .addComponent(jLabel3)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    panelCover2Layout.setVerticalGroup(
      panelCover2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelCover2Layout.createSequentialGroup()
        .addGap(142, 142, 142)
        .addComponent(lblWelcome)
        .addGap(41, 41, 41)
        .addComponent(jLabel1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel2)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel3)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
        .addComponent(btnHaveAnAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(91, 91, 91))
    );

    javax.swing.GroupLayout jpnWelcomePaneLayout = new javax.swing.GroupLayout(jpnWelcomePane);
    jpnWelcomePane.setLayout(jpnWelcomePaneLayout);
    jpnWelcomePaneLayout.setHorizontalGroup(
      jpnWelcomePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(panelCover2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    jpnWelcomePaneLayout.setVerticalGroup(
      jpnWelcomePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(panelCover2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    jpnMainPane.add(jpnWelcomePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 530));

    jpnRegisterPane.setBackground(new java.awt.Color(255, 255, 255));
    jpnRegisterPane.setForeground(new java.awt.Color(255, 255, 255));
    jpnRegisterPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    lblFirstName.setFont(new java.awt.Font("Carlito", 0, 14)); // NOI18N
    lblFirstName.setForeground(new java.awt.Color(0, 0, 0));
    lblFirstName.setText("First Name");
    jpnRegisterPane.add(lblFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

    lblLastName.setFont(new java.awt.Font("Carlito", 0, 14)); // NOI18N
    lblLastName.setForeground(new java.awt.Color(0, 0, 0));
    lblLastName.setText("Last Name");
    jpnRegisterPane.add(lblLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

    lblEmail.setFont(new java.awt.Font("Carlito", 0, 14)); // NOI18N
    lblEmail.setForeground(new java.awt.Color(0, 0, 0));
    lblEmail.setText("Email");
    jpnRegisterPane.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

    lblPhoneNumber.setFont(new java.awt.Font("Carlito", 0, 14)); // NOI18N
    lblPhoneNumber.setForeground(new java.awt.Color(0, 0, 0));
    lblPhoneNumber.setText("Phone Number");
    jpnRegisterPane.add(lblPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, -1));

    lblPassword.setFont(new java.awt.Font("Carlito", 0, 14)); // NOI18N
    lblPassword.setForeground(new java.awt.Color(0, 0, 0));
    lblPassword.setText("Password");
    jpnRegisterPane.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

    btnRegister.setBackground(new java.awt.Color(255, 255, 255));
    btnRegister.setFont(new java.awt.Font("Carlito", 1, 18)); // NOI18N
    btnRegister.setForeground(new java.awt.Color(0, 0, 0));
    btnRegister.setText("Register");
    btnRegister.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnRegisterActionPerformed(evt);
      }
    });
    jpnRegisterPane.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, 170, 40));

    txtFirstName.setFont(new java.awt.Font("Carlito", 0, 18)); // NOI18N
    jpnRegisterPane.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 250, 40));

    txtEmail.setFont(new java.awt.Font("Carlito", 0, 18)); // NOI18N
    jpnRegisterPane.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 250, 40));

    txtLastName.setFont(new java.awt.Font("Carlito", 0, 18)); // NOI18N
    jpnRegisterPane.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 260, 40));

    txtPhoneNumber.setFont(new java.awt.Font("Carlito", 0, 18)); // NOI18N
    jpnRegisterPane.add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 260, 40));

    lblCreateAccount.setFont(new java.awt.Font("Carlito", 1, 36)); // NOI18N
    lblCreateAccount.setForeground(new java.awt.Color(16, 170, 74));
    lblCreateAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lblCreateAccount.setText("Create Account");
    jpnRegisterPane.add(lblCreateAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 704, -1));

    txtPassword.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtPasswordActionPerformed(evt);
      }
    });
    jpnRegisterPane.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 250, 40));

    jpnMainPane.add(jpnRegisterPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 710, 530));

    getContentPane().add(jpnMainPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 530));

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtPasswordActionPerformed

  private void btnHaveAnAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHaveAnAccountActionPerformed
		
		LoginForm loginFrame = new LoginForm();
		this.setVisible(false);
		loginFrame.setVisible(true);
    // TODO add your handling code here:
  }//GEN-LAST:event_btnHaveAnAccountActionPerformed

  private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
    // TODO add your handling code here:

		SingletonJDBCUtil jdbcUtil = SingletonJDBCUtil.getInstance("vca_app", "localhost", "aether", "12345");

		Connection connection = jdbcUtil.getConnection();
		

		/*
		LoginForm login = new LoginForm();

		SingletonJDBCUtil jdbcUtil = SingletonJDBCUtil.getInstance("vca_app", "localhost", "aether", "12345");
		SingletonUserDAO userDao = SingletonUserDAO.getInstance(jdbcUtil.getConnection());

		String firstName = txtFirstName.getText();
		String lastName = txtLastName.getText();
		String password = txtPassword.getText();
		String email = txtEmail.getText();
		String phoneNumber = txtPhoneNumber.getText();

		try{

			int indice = userDao.insert(firstName, lastName, password, email, phoneNumber);

			if (indice > 0){
				JOptionPane.showMessageDialog(rootPane, "USUARIO AGREGADO CORRECTAMENTE");
			}

		} catch(SQLException e){
			JOptionPane.showMessageDialog(rootPane, "ERROR AL AGREGAR USUARIO: " + e);	
		}

*/
		LocalDateTime fa = LocalDateTime.now();
		String registrosql ="INSERT INTO users (username,first_name,last_name,password,email,backup_email,phone_number,user_type,creation_date) VALUES( ?,  ?,  ?,  ?,  ?,  ?,  ?,  ?,  ?)";

try
		{
			PreparedStatement ps;
			ps = (PreparedStatement) connection.prepareStatement(registrosql);
			ps.setString(1, null);
			ps.setString(2, txtFirstName.getText());
			ps.setString(3, txtLastName.getText());
			ps.setString(4, txtPassword.getText());
			ps.setString(5, txtEmail.getText());
			ps.setString(6, null);
			ps.setString(7, txtPhoneNumber.getText());
			ps.setString(8, null);
			ps.setString(9, fa.toString());
			boolean indice = ps.execute();

			// Remember to commit
			connection.commit();

			if (!indice)
			{
				JOptionPane.showMessageDialog(jpnWelcomePane, "EL REGISTRO SE REALIZO CORRECTAMENTE");
				txtFirstName.setText("");
				txtLastName.setText("");
				txtPassword.setText("");
				txtEmail.setText("");
				txtPhoneNumber.setText("");
			}
		} catch (SQLException e)
		{
			JOptionPane.showMessageDialog(jpnWelcomePane, "ERROR AL AGREGAR DATOS: " + e);
		}

		
		

  }//GEN-LAST:event_btnRegisterActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnHaveAnAccount;
  private javax.swing.JButton btnRegister;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JPanel jpnMainPane;
  private javax.swing.JPanel jpnRegisterPane;
  private javax.swing.JPanel jpnWelcomePane;
  private javax.swing.JLabel lblCreateAccount;
  private javax.swing.JLabel lblEmail;
  private javax.swing.JLabel lblFirstName;
  private javax.swing.JLabel lblLastName;
  private javax.swing.JLabel lblPassword;
  private javax.swing.JLabel lblPhoneNumber;
  private javax.swing.JLabel lblWelcome;
  private com.jesus.view.components.PanelCover panelCover2;
  private javax.swing.JTextField txtEmail;
  private javax.swing.JTextField txtFirstName;
  private javax.swing.JTextField txtLastName;
  private javax.swing.JPasswordField txtPassword;
  private javax.swing.JTextField txtPhoneNumber;
  // End of variables declaration//GEN-END:variables
}
