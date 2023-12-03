/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.jesus.model;

import com.jesus.utils.SingletonJDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import java.sql.SQLException;

/**
 * 
 * 
 * @author Juan `Aether` Martínez <jotamartinezd at gmail.com>
 */
public abstract class DAO {
	Connection connection;
	String table;

	DAO(Connection connection, String table){
		this.connection = connection;
		this.table = table;
	}

}

