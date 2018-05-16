package servletConfig.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import servletConfig.dao.LoginDAO;

public class LoginDAOInterceptor implements Interceptor{
	
	LoginDAO loginDAO;
	@Override
	public void destroy() {
		loginDAO = null;
	}

	@Override
	public void init() {
		loginDAO = new LoginDAO();
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Object action = invocation.getAction();
		if(action instanceof LoginDAOAware) {
			LoginDAOAware loginDAOAware = (LoginDAOAware)action;
			loginDAOAware.setLoginDAO(loginDAO);
		}
		return invocation.invoke();
	}

}
