package login.action;

import com.opensymphony.xwork2.Action;

import login.dao.UserDAO;
import login.model.UserInfo;

public class UserAction2 implements Action{
	UserInfo userInfo;
	
	public String execute() throws Exception{
		
		UserInfo userInfo = new UserInfo();
		
		UserDAO userDao = new UserDAO();
		
		if(userDao.save(userInfo)) {
			return SUCCESS;
		}else {
			return ERROR;
		}
		
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	
	

}
