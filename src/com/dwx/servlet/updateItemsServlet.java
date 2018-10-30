package com.dwx.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dwx.bean.itemsDao;
import com.dwx.util.dao;

/**
 * Servlet implementation class updateItemsServlet
 */
@WebServlet("/updateItemsServlet")
public class updateItemsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateItemsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		int number=Integer.parseInt(request.getParameter("number"));
		try{
			Connection conn=dao.getConnection();
			String sql="update items set number=? where id=? name=? city=?";
			PreparedStatement prst=conn.prepareStatement(sql);
			prst.setInt(1, number);
			prst.setInt(2, id);
			prst.setString(1,"city");
			prst.setString(2,"name");
			prst.executeUpdate();
			prst.close();
			conn.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		response.sendRedirect("FindServlet");
	}
}
