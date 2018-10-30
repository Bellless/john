package com.dwx.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dwx.bean.itemsDao;

/**
 * Servlet implementation class addItemsServlet
 */
@WebServlet("/addItemsServlet")
public class addItemsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addItemsServlet() {
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
		String name=request.getParameter("name");
		String city=request.getParameter("city");
		String price=request.getParameter("price");
		String number=request.getParameter("number");
		if(name==""){
			request.setAttribute("nerror", "��Ʒ����Ϊ��!");
			request.getRequestDispatcher("add_items.jsp").forward(request, response);
		}
		if(city==""){
			request.setAttribute("cerror", "����Ϊ��!");
			request.getRequestDispatcher("add_items.jsp").forward(request, response);
		}if(price==""){
			request.setAttribute("perror", "�۸�Ϊ��!");
			request.getRequestDispatcher("add_items.jsp").forward(request, response);
		}if(number==""){
			request.setAttribute("numerror", "����Ϊ��!");
			request.getRequestDispatcher("add_items.jsp").forward(request, response);
		}
		int row=itemsDao.addItems(name, city,Float.parseFloat(price),Integer.parseInt(number));
		if(row>0){
			PrintWriter out=response.getWriter();
			out.print("<script language='javascript'>alert('��ӳɹ���');window.location.href='add_items.jsp';</script>");
		}
	}

}
