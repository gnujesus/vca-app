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
public class SingletonUserDAO extends DAO {
	
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
}
