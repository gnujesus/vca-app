/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.jesus.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 * 
 * @author Juan `Aether` Martínez <jotamartinezd at gmail.com>
 */
public class SingletonUserDAO extends DAO {
	
	PreparedStatement ps;
	ResultSet rs;

	private SingletonUserDAO(Connection connection){
		super(connection, "users");
	}

	private static SingletonUserDAO instance;

	public static SingletonUserDAO getInstance(Connection connection){
		if(instance == null){
			instance = new SingletonUserDAO(connection);
		}
		return instance;
	}

	public int insert(String first_name, String last_name, String password, String email, String phone_number) throws SQLException {
		
		LocalDateTime fa = LocalDateTime.now();
		
		String SQL = "INSERT INTO users (username, first_name, last_name, password, email, backup_email, phone_number, user_type, creation_date) values(?,?,?,?,?,?,?,?,?)";

			PreparedStatement ps;
			ps = (PreparedStatement) connection.prepareStatement(SQL);
			ps.setString(1, null);
			ps.setString(2, first_name);
			ps.setString(3, last_name);
			ps.setString(4, password);
			ps.setString(5, email);
			ps.setString(6, null);
			ps.setString(7, phone_number);
			ps.setString(8, null);
			ps.setString(9, fa.toString());
			int indice = ps.executeUpdate();
			return indice;
	}

	public List seeRegistry(String value) {

		String SQL = "SELECT* from vehicle_count"
						+ "where count_id||nombre_aforo||count_code||fk_intersections||count_interval||time_start||time_end||total||average like '%" + value + "%'";

		List<Object> data = new ArrayList<>();
		try
		{

			ps = this.connection.prepareStatement(SQL);
			rs = ps.executeQuery();

			while (rs.next())
			{
				data.add(rs.getInt(1));
				data.add(rs.getString(2));
				data.add(rs.getInt(3));
				data.add(rs.getInt(4));
				data.add(rs.getInt(5));
				data.add(rs.getString(6));
				data.add(rs.getString(7));
				data.add(rs.getString(8));
				data.add(rs.getInt(9));
				data.add(rs.getInt(10));
				data.add(rs.getInt(11));
			}
		} catch (SQLException ex)
		{
			System.out.println("Error al listar los contactos: " + ex);
		}
		return data;
	}

	public List see() {

		String SQL = "select * from vehicle_count";

		List<Object> data = new ArrayList<>();
		try
		{

			ps = this.connection.prepareStatement(SQL);
			rs = ps.executeQuery();

			while (rs.next())
			{
				data.add(rs.getInt(1));
				data.add(rs.getString(2));
				data.add(rs.getInt(3));
				data.add(rs.getInt(4));
				data.add(rs.getInt(5));
				data.add(rs.getString(6));
				data.add(rs.getString(7));
				data.add(rs.getString(8));
				data.add(rs.getInt(9));
				data.add(rs.getInt(10));
				data.add(rs.getInt(11));
			}
		} catch (SQLException ex)
		{
			System.out.println("Error al listar los contactos: " + ex);
		}
		return data;
	}
	
}
