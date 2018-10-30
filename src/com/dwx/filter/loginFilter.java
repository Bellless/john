package com.dwx.filter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * ��¼��֤
 */
public class loginFilter implements Filter {
	 private String sessionKey;
	 private String redirectUrl;
	 private String uncheckedUrls;
    /**
     * Default constructor. 
     */
    public loginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        //1.��ȡ����URL
        String servletPath = httpRequest.getServletPath();    
        //2.���1�л�ȡ��servletPath�Ƿ�Ϊ����Ҫ����URl�е�һ��.����,����
        List<String> urls = Arrays.asList(uncheckedUrls.split(","));
        if (urls.contains(servletPath)) {
        	chain.doFilter(httpRequest, httpResponse);
            return;
        }
        //3.��session�л�ȡSessionKey��Ӧֵ,��ֵ������,���ض���redirectUrl
        Object user = httpRequest.getSession().getAttribute("user");
        if ((user == null)) {
           httpResponse.sendRedirect(httpRequest.getContextPath() + redirectUrl);            
           return;
        }
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		ServletContext servletContext = fConfig.getServletContext();
        //��ȡXML�ļ������ò���
        sessionKey = servletContext.getInitParameter("userSessionKey");
        //System.out.println("sessionKey======" + sessionKey);//������
        redirectUrl = servletContext.getInitParameter("redirectPage");
       //System.out.println("redirectPage======" + redirectUrl);
        uncheckedUrls = servletContext.getInitParameter("uncheckedUrls");
        //System.out.println("uncheckedUrls=====" + uncheckedUrls);
	}
}
