package login3.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import login3.dao.LoginDAO;
import login3.interceptor.LoginDAOAware;
import login3.model.UserInfo;

public class LoginAction implements Preparable, Action, ModelDriven, LoginDAOAware{
	UserInfo userInfo;
	LoginDAO dao;
	
	public String execute() throws Exception{
		
		if(dao.loginCheck(userInfo)) {
			return SUCCESS;
		}else {
			return LOGIN;
		}
		
	}
		
	public void prepare() { //깔깔
		userInfo = new UserInfo();
	}
	
	public Object getModel() {
		return userInfo;
	}
	
	public void setLoginDAO(LoginDAO loginDAO) {
		this.dao = loginDAO;
	}
	
}
