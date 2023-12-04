/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.jesus.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.sql.PreparedStatement;

/**
 * 
 * @author Juan `Aether` Martínez <jotamartinezd at gmail.com>
 */
public class SingletonIntersectionDAO extends DAO {
	
	private SingletonIntersectionDAO(Connection connection){
		super(connection, "intersections");
	}

	private static SingletonIntersectionDAO instance;

	public static SingletonIntersectionDAO getInstance(Connection connection){
		if(instance == null){
			instance = new SingletonIntersectionDAO(connection);
		}
		return instance;
	}


	public int insert(String intersectionName, String street, String province) throws SQLException{

		String SQL = "INSERT INTO intersections (name,street,province,creation_date) VALUES (?,?,?,?)";
		LocalDateTime fa = LocalDateTime.now();
			PreparedStatement ps;
			ps = (PreparedStatement) connection.prepareStatement(SQL);
			ps.setString(1, intersectionName);
			ps.setString(2, street);
			ps.setString(3, province);
			ps.setString(4, fa.toString());
			int indice = ps.executeUpdate();
			connection.commit();

			return indice;

	}
		
}
