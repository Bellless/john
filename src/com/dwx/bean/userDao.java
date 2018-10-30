package com.dwx.bean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.dwx.util.dao;
public class userDao {
	public static ResultSet selectUser(String username,String password){
		Connection conn=dao.getConnection();
		String sql="select * from user where username=?";
		ResultSet rst=null;
		try{
			PreparedStatement prst=conn.prepareStatement(sql);
			prst.setString(1, username);
			rst=prst.executeQuery();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return rst;
	}
}
