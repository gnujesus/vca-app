/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.jesus.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * 
 * @author Juan `Aether` Martínez <jotamartinezd at gmail.com>
 */

// Self-explanatory, but uses Singleton

public class SingletonJDBCUtil {
	
	// Variable declaration
	private static String dbUrl;
	private static String user;
	private static String password;

	private Connection connection;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	// Constructor
	private SingletonJDBCUtil(String database, String ip, String user, String password){

		// Dynamic database url
		this.dbUrl = String.format("jdbc:mysql://%s/%s", ip, database);

		this.user = user;
		this.password = password;

		// 							 dbUrl =  jdbc:mysql://localhost:3306/testdatabase
		// (ALTERNATIVE) dbUrl = jdbc:mysql://localhost/testdatabase
	}
	
	// Create instance variable 
	private static SingletonJDBCUtil instance;

	// Returns instance
	public static SingletonJDBCUtil getInstance(String database, String ip, String user, String password)	{


		// If there's no instance of SingletonJDBUtil, create it
		if(instance == null){
			instance = new SingletonJDBCUtil(database, ip, user, password);
		}

		// Return the instance
		return instance;	
	}

	// Tester to see the current values of the fields
	public static String print() {
		String printer = String.format("%s, %s, %s", dbUrl, user, password);

		return printer;
	}


	// Connect to the database
	public Connection getConnection(){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Type casting not necessary since DriverManager.getConnection return Connection type object
			connection = (Connection) DriverManager.getConnection(dbUrl, user, password);

			connection.setAutoCommit(false);

			System.out.println("Connection successful");

		} catch(ClassNotFoundException | SQLException e){
			System.out.println("Error in the connection \n");
			e.printStackTrace();
		}

		return connection;
	}

	public void closeConnection(){
		try{
			connection.close();

			// I don't remember how do you write it in english lmao
			System.out.println("Connection closed successfully");
		} catch(SQLException e){
			System.out.println("Error closing the connection");
			e.printStackTrace();
		}
	}
	
	private void closeStatement(){
		try{
			stmt.close();

			// I don't remember how do you write it in english lmao
			System.out.println("Statement closed successfully");
		} catch(SQLException e){
			System.out.println("Error closing the statement");
			e.printStackTrace();
		}
	}


	public void closeResultSet(){
		try{
			rs.close();

			// I don't remember how do you write it in english lmao
			System.out.println("ResultSet closed successfully");
		} catch(SQLException e){
			System.out.println("Error closing the ResultSet");
			e.printStackTrace();
		}
	}

}
