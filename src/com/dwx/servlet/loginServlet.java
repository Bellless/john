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
 * �û���¼��֤
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
		//�ж��û����������Ƿ�Ϊ��
		if(username==""||username.length()==0){
			request.setAttribute("namemsg","�û���Ϊ��!");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		if(password==""||password.length()==0){
			request.setAttribute("pwdmsg","����Ϊ��!");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		//�ж��û����������Ƿ���ȷ
		ResultSet rst=userDao.selectUser(username, password);
		try {
			if(rst.next()){
				if(password.equals(rst.getString("password"))){
					session.setAttribute("user", username); //�洢��Session��
					request.getRequestDispatcher("FindServlet").forward(request, response);
				}else{
					request.setAttribute("pwdError","���벻��ȷ!");
					request.getRequestDispatcher("index.jsp").forward(request, response);
				}
			}else{
				request.setAttribute("nameError","�û���������!");
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
