package com.cg.plp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.cg.plp.exception.WalletException;


	public class DBUtil  {
		static String url="jdbc:mysql://localhost:3306/jpa";
		
		public static Connection getConnection() throws WalletException
		{
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				return DriverManager.getConnection(url,"root","root");
				 
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				throw new WalletException(e.getMessage());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				throw new WalletException(e.getMessage());
			}
		}

	}

