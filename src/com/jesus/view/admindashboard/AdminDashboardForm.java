/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.jesus.view.admindashboard;

import com.jesus.view.components.PieChart;
import com.jesus.view.login.LoginForm;
import com.jesus.view.new_vehicle_count.NewVehicleFormPageOne;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Paint;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.StandardBarPainter;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.RectangleInsets;


/**
 *
 * @author Juan `Aether` Martínez <jotamartinezd at gmail.com>
 */
public class AdminDashboardForm extends javax.swing.JFrame {

	/**
	 * Creates new form AdminDashboardForm
	 */
	public AdminDashboardForm() {

		initComponents();
	
		DefaultCategoryDataset vehicleBarChartDataset = new DefaultCategoryDataset();
		vehicleBarChartDataset.setValue(3, "util", "");
		vehicleBarChartDataset.setValue(48, "mb", "");
		vehicleBarChartDataset.setValue(37, "b", "");
		vehicleBarChartDataset.setValue(26, "cl", "");
		vehicleBarChartDataset.setValue(86, "c2e", "");
		vehicleBarChartDataset.setValue(100, "c3e", "");
		vehicleBarChartDataset.setValue(16, "c3+e", "");
		JFreeChart vehicleBarChart = ChartFactory.createBarChart("Vehicle Concurrency", "Vehicles", "Quantity", vehicleBarChartDataset, PlotOrientation.VERTICAL, true, true, false);

		// Applying theme
		StandardChartTheme theme = (StandardChartTheme) org.jfree.chart.StandardChartTheme.createJFreeTheme();

		String fontName = "Lucida Sans";
		theme.setTitlePaint(Color.decode("#4572a7"));
		theme.setExtraLargeFont(new Font(fontName, Font.PLAIN, 16)); //title
		theme.setLargeFont(new Font(fontName, Font.BOLD, 15)); //axis-title
		theme.setRegularFont(new Font(fontName, Font.PLAIN, 11));
		theme.setRangeGridlinePaint(Color.decode("#C0C0C0"));
		theme.setPlotBackgroundPaint(Color.white);
		theme.setChartBackgroundPaint(Color.white);
		theme.setGridBandPaint(Color.red);
		theme.setAxisOffset(new RectangleInsets(0, 0, 0, 0));
		theme.setBarPainter(new StandardBarPainter());
		theme.setAxisLabelPaint(Color.decode("#666666"));
		theme.apply(vehicleBarChart);

		vehicleBarChart.setBackgroundPaint(Color.WHITE);
		CategoryPlot vehicleBarChartCategoryPlot = vehicleBarChart.getCategoryPlot();

		// Customize category plot colors
		vehicleBarChartCategoryPlot.setRangeGridlinePaint(Color.WHITE);
		vehicleBarChartCategoryPlot.setBackgroundPaint(Color.WHITE);
		BarRenderer renderer = (BarRenderer) vehicleBarChartCategoryPlot.getRenderer();		
		renderer.setSeriesPaint(0, new Color(51,201,140));
		renderer.setSeriesPaint(1, new Color(51,187,201));
		renderer.setSeriesPaint(2, new Color(51,112,201));
		renderer.setSeriesPaint(3, new Color(51,112,163));
		renderer.setSeriesPaint(4, new Color(201,51,189));
		renderer.setSeriesPaint(5, new Color(201,63,51));
		renderer.setSeriesPaint(6, new Color(201,138,51));
		renderer.setSeriesPaint(7, new Color(51,177,113));

		ChartPanel vehicleBarChartPanel = new ChartPanel(vehicleBarChart);

		DefaultPieDataset pieDataset = new DefaultPieDataset();

		pieDataset.setValue("Sur-Norte", 2);
		pieDataset.setValue("Norte-Sur", 5);
		pieDataset.setValue("Este-Oeste", 9);
		pieDataset.setValue("Oeste-Este", 8);

		JFreeChart pieChart = ChartFactory.createPieChart("Intersection Concurrency", pieDataset);
		PiePlot pieChartCategoryPlot = new PiePlot(pieDataset);
		pieChartCategoryPlot.setBackgroundPaint(Color.WHITE);
		theme.apply(pieChart);

		ChartPanel barChartPanel = new ChartPanel(pieChart);

		jpnBarChart.removeAll();
		jpnBarChart.add(vehicleBarChartPanel, BorderLayout.CENTER);
		jpnBarChart.validate();
		jpnPieChart.removeAll();
		jpnPieChart.add(barChartPanel, BorderLayout.CENTER);
		jpnPieChart.validate();

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
    jpnLeftMenu = new javax.swing.JPanel();
    pcLeftMenuCover = new com.jesus.view.components.PanelCover();
    btnAforos = new javax.swing.JButton();
    btnEncuestas = new javax.swing.JButton();
    btnLogout = new javax.swing.JButton();
    btnModoAforador = new javax.swing.JButton();
    lblInTransitText = new javax.swing.JLabel();
    lblInTransitT = new javax.swing.JLabel();
    lblUserOptions = new javax.swing.JLabel();
    btnLogout1 = new javax.swing.JButton();
    jSeparator1 = new javax.swing.JSeparator();
    jpnRightPane = new javax.swing.JPanel();
    jpnStatistics = new javax.swing.JPanel();
    jpnBarChart = new javax.swing.JPanel();
    jpnPieChart = new javax.swing.JPanel();
    jpnTable = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tblAforos = new javax.swing.JTable();
    txtSearchBar = new javax.swing.JTextField();
    txtSearch = new javax.swing.JLabel();
    btnCreateNewAforum = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jpnMainPane.setLayout(new java.awt.BorderLayout());

    jpnLeftMenu.setBackground(new java.awt.Color(204, 102, 0));
    jpnLeftMenu.setPreferredSize(new java.awt.Dimension(200, 0));

    pcLeftMenuCover.setMinimumSize(new java.awt.Dimension(170, 313));
    pcLeftMenuCover.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    btnAforos.setBackground(new java.awt.Color(25, 110, 69));
    btnAforos.setFont(new java.awt.Font("Carlito", 0, 18)); // NOI18N
    btnAforos.setForeground(new java.awt.Color(255, 255, 255));
    btnAforos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jesus/assets/sedan(1).png"))); // NOI18N
    btnAforos.setText("Aforos");
    btnAforos.setBorderPainted(false);
    btnAforos.setContentAreaFilled(false);
    btnAforos.setEnabled(false);
    btnAforos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    btnAforos.setSelected(true);
    btnAforos.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAforosActionPerformed(evt);
      }
    });
    pcLeftMenuCover.add(btnAforos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 200, 40));

    btnEncuestas.setBackground(new java.awt.Color(25, 110, 69));
    btnEncuestas.setFont(new java.awt.Font("Carlito", 0, 18)); // NOI18N
    btnEncuestas.setForeground(new java.awt.Color(255, 255, 255));
    btnEncuestas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jesus/assets/call-center.png"))); // NOI18N
    btnEncuestas.setText("Encuestas");
    btnEncuestas.setBorderPainted(false);
    btnEncuestas.setContentAreaFilled(false);
    btnEncuestas.setHideActionText(true);
    btnEncuestas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    btnEncuestas.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnEncuestasActionPerformed(evt);
      }
    });
    pcLeftMenuCover.add(btnEncuestas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 200, 40));

    btnLogout.setBackground(new java.awt.Color(25, 110, 69));
    btnLogout.setFont(new java.awt.Font("Carlito", 0, 18)); // NOI18N
    btnLogout.setForeground(new java.awt.Color(255, 255, 255));
    btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jesus/assets/logout.png"))); // NOI18N
    btnLogout.setText(" Logout");
    btnLogout.setBorderPainted(false);
    btnLogout.setContentAreaFilled(false);
    btnLogout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    btnLogout.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnLogoutActionPerformed(evt);
      }
    });
    pcLeftMenuCover.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 200, 40));

    btnModoAforador.setBackground(new java.awt.Color(25, 110, 69));
    btnModoAforador.setFont(new java.awt.Font("Carlito", 0, 18)); // NOI18N
    btnModoAforador.setForeground(new java.awt.Color(255, 255, 255));
    btnModoAforador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jesus/assets/smartphone-call.png"))); // NOI18N
    btnModoAforador.setText("Modo aforador");
    btnModoAforador.setBorderPainted(false);
    btnModoAforador.setContentAreaFilled(false);
    btnModoAforador.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    pcLeftMenuCover.add(btnModoAforador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 200, 40));

    lblInTransitText.setBackground(new java.awt.Color(255, 255, 255));
    lblInTransitText.setFont(new java.awt.Font("Carlito", 0, 36)); // NOI18N
    lblInTransitText.setForeground(new java.awt.Color(255, 255, 255));
    lblInTransitText.setText("In  ransit");
    lblInTransitText.setToolTipText("");
    pcLeftMenuCover.add(lblInTransitText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 30));

    lblInTransitT.setFont(new java.awt.Font("Caladea", 1, 54)); // NOI18N
    lblInTransitT.setForeground(new java.awt.Color(255, 255, 255));
    lblInTransitT.setText("T");
    pcLeftMenuCover.add(lblInTransitT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 40, -1));

    lblUserOptions.setFont(new java.awt.Font("Source Han Sans KR Heavy", 0, 14)); // NOI18N
    lblUserOptions.setForeground(new java.awt.Color(255, 255, 255));
    lblUserOptions.setText("User Options");
    pcLeftMenuCover.add(lblUserOptions, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 180, -1));

    btnLogout1.setBackground(new java.awt.Color(25, 110, 69));
    btnLogout1.setFont(new java.awt.Font("Carlito", 0, 18)); // NOI18N
    btnLogout1.setForeground(new java.awt.Color(255, 255, 255));
    btnLogout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jesus/assets/settings(1).png"))); // NOI18N
    btnLogout1.setText(" Settings");
    btnLogout1.setBorderPainted(false);
    btnLogout1.setContentAreaFilled(false);
    btnLogout1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    btnLogout1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnLogout1ActionPerformed(evt);
      }
    });
    pcLeftMenuCover.add(btnLogout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 200, 40));
    pcLeftMenuCover.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 200, 20));

    javax.swing.GroupLayout jpnLeftMenuLayout = new javax.swing.GroupLayout(jpnLeftMenu);
    jpnLeftMenu.setLayout(jpnLeftMenuLayout);
    jpnLeftMenuLayout.setHorizontalGroup(
      jpnLeftMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(pcLeftMenuCover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    jpnLeftMenuLayout.setVerticalGroup(
      jpnLeftMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(pcLeftMenuCover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    jpnMainPane.add(jpnLeftMenu, java.awt.BorderLayout.WEST);

    jpnRightPane.setBackground(new java.awt.Color(51, 255, 51));
    jpnRightPane.setPreferredSize(new java.awt.Dimension(640, 500));
    jpnRightPane.setRequestFocusEnabled(false);
    jpnRightPane.setLayout(new java.awt.BorderLayout());

    jpnStatistics.setBackground(new java.awt.Color(244, 245, 237));
    jpnStatistics.setPreferredSize(new java.awt.Dimension(0, 380));

    jpnBarChart.setBackground(new java.awt.Color(255, 255, 255));
    jpnBarChart.setLayout(new java.awt.BorderLayout());

    jpnPieChart.setBackground(new java.awt.Color(255, 255, 255));
    jpnPieChart.setLayout(new java.awt.BorderLayout());

    javax.swing.GroupLayout jpnStatisticsLayout = new javax.swing.GroupLayout(jpnStatistics);
    jpnStatistics.setLayout(jpnStatisticsLayout);
    jpnStatisticsLayout.setHorizontalGroup(
      jpnStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jpnStatisticsLayout.createSequentialGroup()
        .addGap(14, 14, 14)
        .addComponent(jpnBarChart, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jpnPieChart, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        .addContainerGap())
    );
    jpnStatisticsLayout.setVerticalGroup(
      jpnStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jpnStatisticsLayout.createSequentialGroup()
        .addGap(19, 19, 19)
        .addGroup(jpnStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jpnBarChart, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jpnPieChart, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(17, 17, 17))
    );

    jpnRightPane.add(jpnStatistics, java.awt.BorderLayout.NORTH);

    jpnTable.setBackground(new java.awt.Color(244, 245, 237));
    jpnTable.setPreferredSize(new java.awt.Dimension(1021, 443));

    tblAforos.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "Nombre", "Aforadores", "Supervisores", "Provincia"
      }
    ));
    jScrollPane1.setViewportView(tblAforos);

    txtSearchBar.setFont(new java.awt.Font("Carlito", 0, 18)); // NOI18N
    txtSearchBar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtSearchBarActionPerformed(evt);
      }
    });

    txtSearch.setBackground(new java.awt.Color(0, 0, 0));
    txtSearch.setFont(new java.awt.Font("Carlito", 0, 18)); // NOI18N
    txtSearch.setForeground(new java.awt.Color(0, 0, 0));
    txtSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jesus/assets/magnifying-glass.png"))); // NOI18N
    txtSearch.setText(" Search");

    btnCreateNewAforum.setBackground(new java.awt.Color(255, 255, 255));
    btnCreateNewAforum.setForeground(new java.awt.Color(0, 0, 0));
    btnCreateNewAforum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jesus/assets/plus.png"))); // NOI18N
    btnCreateNewAforum.setText("  Nuevo aforo");
    btnCreateNewAforum.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCreateNewAforumActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jpnTableLayout = new javax.swing.GroupLayout(jpnTable);
    jpnTable.setLayout(jpnTableLayout);
    jpnTableLayout.setHorizontalGroup(
      jpnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jpnTableLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jpnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane1)
          .addGroup(jpnTableLayout.createSequentialGroup()
            .addGroup(jpnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(txtSearch)
              .addComponent(txtSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 457, Short.MAX_VALUE)
            .addComponent(btnCreateNewAforum, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap())
    );
    jpnTableLayout.setVerticalGroup(
      jpnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jpnTableLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jpnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(jpnTableLayout.createSequentialGroup()
            .addComponent(txtSearch)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(btnCreateNewAforum, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
        .addGap(12, 12, 12))
    );

    jpnRightPane.add(jpnTable, java.awt.BorderLayout.CENTER);

    jpnMainPane.add(jpnRightPane, java.awt.BorderLayout.CENTER);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jpnMainPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1188, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jpnMainPane, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void txtSearchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchBarActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtSearchBarActionPerformed

  private void btnAforosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAforosActionPerformed
    // TODO add your handling code here:
		JOptionPane.showMessageDialog(null, "You're already on this window", "!", 0);
  }//GEN-LAST:event_btnAforosActionPerformed

  private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
    // TODO add your handling code here:
		LoginForm loginForm = new LoginForm();
		
		this.setVisible(false);
		loginForm.setVisible(true);
  }//GEN-LAST:event_btnLogoutActionPerformed

  private void btnEncuestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncuestasActionPerformed
    // TODO add your handling code here:
		JOptionPane.showMessageDialog(null, "This functionality is yet to be done", "YET TO DO", 0);
  }//GEN-LAST:event_btnEncuestasActionPerformed

  private void btnLogout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout1ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_btnLogout1ActionPerformed

  private void btnCreateNewAforumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateNewAforumActionPerformed
    // TODO add your handling code here:
		NewVehicleFormPageOne newVehicleForm = new NewVehicleFormPageOne();
		newVehicleForm.setVisible(true);
  }//GEN-LAST:event_btnCreateNewAforumActionPerformed

	/**
	 * @param args the command line arguments
	 */

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnAforos;
  private javax.swing.JButton btnCreateNewAforum;
  private javax.swing.JButton btnEncuestas;
  private javax.swing.JButton btnLogout;
  private javax.swing.JButton btnLogout1;
  private javax.swing.JButton btnModoAforador;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JPanel jpnBarChart;
  private javax.swing.JPanel jpnLeftMenu;
  private javax.swing.JPanel jpnMainPane;
  private javax.swing.JPanel jpnPieChart;
  private javax.swing.JPanel jpnRightPane;
  private javax.swing.JPanel jpnStatistics;
  private javax.swing.JPanel jpnTable;
  private javax.swing.JLabel lblInTransitT;
  private javax.swing.JLabel lblInTransitText;
  private javax.swing.JLabel lblUserOptions;
  private com.jesus.view.components.PanelCover pcLeftMenuCover;
  private javax.swing.JTable tblAforos;
  private javax.swing.JLabel txtSearch;
  private javax.swing.JTextField txtSearchBar;
  // End of variables declaration//GEN-END:variables

}
