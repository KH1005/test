package login4.action;

import com.opensymphony.xwork2.Action;

import login4.dao.LoginDAO;

public class LoginAction implements Action{
	String id; 
	String password;
	
	@Override
	public String execute() throws Exception {
		LoginDAO loginDAO = new LoginDAO();
		if(loginDAO.loginCheck(id, password)) {
			return SUCCESS;
		}else {
			return LOGIN;
		}
	}
	
	public String getId() { //sdsds
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
