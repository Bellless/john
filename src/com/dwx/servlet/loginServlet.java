package com.dwx.servlet;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dwx.bean.user;
import com.dwx.bean.userDao;

/**
 * 用户登录验证
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
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
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		HttpSession session = request.getSession();
		//判断用户名、密码是否为空
		if(username==""||username.length()==0){
			request.setAttribute("namemsg","用户名为空!");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		if(password==""||password.length()==0){
			request.setAttribute("pwdmsg","密码为空!");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		//判断用户名、密码是否正确
		ResultSet rst=userDao.selectUser(username, password);
		try {
			if(rst.next()){
				if(password.equals(rst.getString("password"))){
					session.setAttribute("user", username); //存储在Session中
					request.getRequestDispatcher("FindServlet").forward(request, response);
				}else{
					request.setAttribute("pwdError","密码不正确!");
					request.getRequestDispatcher("index.jsp").forward(request, response);
				}
			}else{
				request.setAttribute("nameError","用户名不存在!");
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
