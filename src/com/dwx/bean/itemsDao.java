package com.dwx.bean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.dwx.util.dao;
/**
 * 商品操作类
 * @author Mrzhong
 *
 */
public class itemsDao {
	//分页查询所有商品信息
	public static List<items> find(int page){
		//创建List
		List<items> list=new ArrayList<items>();
		//获取数据连接
		Connection conn=dao.getConnection();
		//分页查询语句
		String sql="select * from items order by id asc limit ?,?";
		try{
			PreparedStatement prst=conn.prepareStatement(sql);
			prst.setInt(1, (page-1)*(items.PAGE_SIZE));
			prst.setInt(2, items.PAGE_SIZE);
			ResultSet rst=prst.executeQuery();
			while(rst.next()){
				items it=new items();
				it.setId(rst.getInt("id"));
				it.setName(rst.getString("name"));
				it.setCity(rst.getString("city"));
				it.setPrice(rst.getFloat("price"));
				it.setNumber(rst.getInt("number"));
				it.setPicture(rst.getString("picture"));
				list.add(it);
			}
			rst.close();
			prst.close();
			conn.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return list;
	}
	//查询总记录数
	public static int findCount(){
		int count=0;
		Connection conn=dao.getConnection();
		String sql="select count(*)from items";
		try{
			Statement stmt=conn.createStatement();
			ResultSet rst=stmt.executeQuery(sql);
			if(rst.next()){
				count=rst.getInt(1);
			}
			rst.close();
			stmt.close();
			conn.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return count;
	}
	//添加商品
	public static int addItems(String name,String city,float price,int number){
		int row=0;
		try{
			Connection conn=dao.getConnection();
			String sql="insert into items(name,city,price,number)values(?,?,?,?)";
			PreparedStatement prst=conn.prepareStatement(sql);
			prst.setString(1, name);
			prst.setString(2, city);
			prst.setFloat(3, price);
			prst.setInt(4, number);
			row=prst.executeUpdate();
			prst.close();
			conn.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return row;
	}
}
