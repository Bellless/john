package com.dwx.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dwx.bean.items;
import com.dwx.bean.itemsDao;

/**
 * 分页查询商品信息
 */
@WebServlet("/FindServlet")
public class FindServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int currPage=1;
		if(request.getParameter("page")!=null){
			currPage=Integer.parseInt(request.getParameter("page"));
		}
		List<items>list=itemsDao.find(currPage);
		HttpSession sess = request.getSession();
		sess.setAttribute("list", list);
		int pages;//总页数
		int count=itemsDao.findCount();//查询总记录数
		//对总页数进行赋值
		if(count%items.PAGE_SIZE==0){
			pages=count/items.PAGE_SIZE;
		}else{
			pages=count/items.PAGE_SIZE+1;
		}
		StringBuffer sb=new StringBuffer();
		for(int i=1;i<=pages;i++){
			if(i==currPage){
				sb.append("【"+i+"】");
			}else{
				sb.append("<a href='FindServlet?page="+i+"'>"+i+"</a>");
			}
			sb.append("  ");
		}
		sess.setAttribute("bar", sb.toString());
		response.sendRedirect("first.jsp");
	}

}
