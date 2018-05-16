package servletConfig.interceptor;

import servletConfig.dao.LoginDAO;
import servletConfig.model.UserInfo;

public interface LoginDAOAware {
	public void setLoginDAO(LoginDAO loginDAO);

}
