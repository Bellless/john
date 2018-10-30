package com.dwx.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dwx.util.dao;

/**
 * Servlet implementation class deleteItemsServlet
 */
@WebServlet("/deleteItemsServlet")
public class deleteItemsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteItemsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		try{
			Connection conn=dao.getConnection();
			String sql="delete from items where id=?";
			PreparedStatement prst=conn.prepareStatement(sql);
			prst.setInt(1, id);
			prst.executeUpdate();
			prst.close();
			conn.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		response.sendRedirect("FindServlet");
	}
}
