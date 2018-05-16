package login.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import login.dao.UserDAO;
import login.model.UserInfo;

public class UserAction3 implements Action,Preparable,ModelDriven{
	UserInfo userinfo;
	
	public String execute() throws Exception{
		
		UserDAO userDao = new UserDAO();
		
		if(userDao.save(userinfo)) {
			return SUCCESS;
		}else {
			return ERROR;
		}
	}
	
	
	public UserInfo getUserinfo() {	//영역에 올림
		return userinfo;
	}

	public void prepare() throws Exception { //객체 생성
		userinfo = new UserInfo();
	}
	
	public UserInfo getModel() {
		return userinfo;
	}

}
