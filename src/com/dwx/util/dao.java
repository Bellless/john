package com.dwx.util;
import java.sql.Connection;
import java.sql.DriverManager;
public class dao {
	public static Connection getConnection(){
		Connection conn=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");		//��������
			String url="jdbc:mysql://localhost:3306/db_item";
			String username="root";
			String password="123";
			//�������ݿ�����
			conn=DriverManager.getConnection(url,username,password);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return conn;
	}
}
