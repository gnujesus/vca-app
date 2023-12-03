/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.jesus.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.sql.PreparedStatement;
import java.util.Date;

/**
 * 
 * @author Juan `Aether` Martínez <jotamartinezd at gmail.com>
 */
public class SingletonVehicleCountDAO extends DAO {
	
	private SingletonVehicleCountDAO(Connection connection){
		super(connection, "vehicle_count");
	}

	private static SingletonVehicleCountDAO instance;

	public static SingletonVehicleCountDAO getInstance(Connection connection){
		if(instance == null){
			instance = new SingletonVehicleCountDAO(connection);
		}
		return instance;
	}

	public int insert(int countCode, String count_name, int count_interval, String time_start, String time_end, Date date) throws SQLException{

		String SQL= "INSERT INTO vehicle_counts(count_code, nombre_aforo, fk_intersections, count_interval, time_start, time_end, date, node, total, average) VALUES(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps;
			ps = (PreparedStatement) connection.prepareStatement(SQL);
			ps.setString(1, String.valueOf(countCode));
			ps.setString(2, String.valueOf(count_name));
			ps.setString(3, null);
			ps.setString(4, String.valueOf(count_interval));
			ps.setString(5, String.valueOf(time_start));
			ps.setString(6, String.valueOf(time_end));
			ps.setString(7, date.toString());
			ps.setString(8, null);
			ps.setString(9, null);
			ps.setString(10, null);
			int indice = ps.executeUpdate();

			return indice;

	}

}
