/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.jesus.controller;

import com.jesus.model.SingletonUserDAO;
import com.jesus.utils.SingletonJDBCUtil;
import com.jesus.view.admindashboard.AdminDashboardForm;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;

/**
 * 
 * @author Juan `Aether` Martínez <jotamartinezd at gmail.com>
 */
public class Controller {
	AdminDashboardForm adminDashboardForm;
	DefaultTableModel model;
	SingletonJDBCUtil jdbcUtil = SingletonJDBCUtil.getInstance("vca_app", "localhost", "aether", "12345");
	SingletonUserDAO userDao = SingletonUserDAO.getInstance(jdbcUtil.getConnection());

	Connection connection = jdbcUtil.getConnection();

	PreparedStatement ps;
	ResultSet rs;

	public Controller(AdminDashboardForm adminDashboardForm){
//		cleanTable();
		this.adminDashboardForm = adminDashboardForm;
	}


	public final void see(JTable table) {
		cleanTable();
		model = (DefaultTableModel) table.getModel();
		List<Object> data = (List<Object>) userDao.see();
		Object[] object = new Object[data.size()];
		for (int i = 0; i < data.size(); i++)
		{
			object[i] = data.get(i);
			model.addRow(object);
		}
		this.adminDashboardForm.tblAforos.setModel(model);
	}

	public void cleanTable() {
		for (int i = 0; i < this.adminDashboardForm.tblAforos.getRowCount(); i++)
		{
			model.removeRow(i);
			i = i - 1;
		}
	}

}

