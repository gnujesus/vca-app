/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.jesus.model;

import com.jesus.utils.SingletonJDBCUtil;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 * 
 * @author Juan `Aether` Martínez <jotamartinezd at gmail.com>
 */
public class TableLogic {

		SingletonJDBCUtil jdbcUtil = SingletonJDBCUtil.getInstance("vca_app", "localhost", "aether", "12345");

		Connection connection;

	public DefaultTableModel buscarPersonas(String buscar) {

		String[] nombresColumnas =
		{
			"ID", "Nombre", "Código", "Intersección", "Intervalo", "Hora Inicio", "Hora Fin", "Fecha", "Total"
		};//Indica el nombre de las columnas en la tabla

		String[] registros = new String[11];

		DefaultTableModel model = new DefaultTableModel(null, nombresColumnas);

		String sql = "SELECT * FROM vehicle_counts WHERE count_id LIKE '%" + buscar + "%' OR nombre_aforo LIKE '%" + buscar + "%'";

		PreparedStatement ps = null;

		ResultSet rs = null;

		try
		{
			connection = jdbcUtil.getConnection();

			ps = (PreparedStatement) connection.prepareStatement(sql);

			rs = ps.executeQuery();

			while (rs.next())
			{
				registros[0] = rs.getString(1);

				registros[1] = rs.getString(2);

				registros[2] = rs.getString(3);

				registros[3] = rs.getString(4);

				registros[4] = rs.getString(5);

				registros[5] = rs.getString(6);

				registros[6] = rs.getString(7);

				registros[7] = rs.getString(8);

				registros[8] = rs.getString(9);



				model.addRow(registros);
			}
		} catch (SQLException e)
		{

			JOptionPane.showMessageDialog(null, "Error al conectar. " + e.getMessage());

		}

		return model;
	}
}