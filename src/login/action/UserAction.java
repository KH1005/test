package login.action;

import com.opensymphony.xwork2.Action;

import login.dao.UserDAO;
import login.model.UserInfo;

public class UserAction implements Action{
	UserInfo userInfo = null;
	private String name;
	private String addr;
	private String tel;
	
	public String execute() throws Exception{
		userInfo = new UserInfo();
		
		userInfo.setName(name);
		userInfo.setAddr(addr);
		userInfo.setTel(tel);
		UserDAO userDao = new UserDAO();
		
		if(userDao.save(userInfo)) {
			return SUCCESS;
		}else {
			return ERROR;
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	

}
