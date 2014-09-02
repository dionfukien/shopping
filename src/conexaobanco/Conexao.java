/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conexaobanco;

import java.sql.Connection; // conexão SQL para java
import java.sql.DriverManager; // driver de conexão SQL para Java
import java.sql.SQLException; // classe para tratamento de exceções

/**
 *
 * @author Dion
 */

public class Conexao{

	private final String Dd = "xe";
	private final String ConnString = "jdbc:oracle:thin:@10.1.2.4:1521/" + Dd;
	private final String User = "aleaguado";
	private final String Pass = "aleaguado";
	private Connection connection;
	
	private static  Conexao instance;

	public static Conexao getInstance(){
		if (instance == null){
                    instance = new Conexao();
		}
		return instance;
	}
	
	public Connection getConnection() throws SQLException{
		if (connection == null){
                    connection = DriverManager.getConnection(ConnString,User,Pass);
		}
		return connection;
	}
}