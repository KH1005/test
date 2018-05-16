package login2.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import login2.dao.LoginDAO;
import login2.model.UserInfo;

public class LoginAction implements Action, Preparable, ModelDriven{
	
	UserInfo userInfo;
	
	public String execute() throws Exception{
		LoginDAO loginDao = new LoginDAO();
		if(loginDao.loginChk(userInfo)) {
			return SUCCESS;
		}else {
			return LOGIN;
		}
	}
	
	public void prepare() {
		userInfo = new UserInfo();
	}
	
	public Object getModel() {
		return userInfo;
	}
}
