package chain.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import chain.dao.MemberDAO;
import chain.model.UserInfo;
import login4.dao.LoginDAO;

public class MemberAction implements Action, Preparable, ModelDriven<UserInfo>{
	UserInfo userInfo;

	@Override
	public UserInfo getModel() {
		return userInfo;
	}

	@Override
	public void prepare() throws Exception {
		userInfo = new UserInfo();
	}

	@Override
	public String execute() throws Exception {
		MemberDAO memberDAO = new MemberDAO();
		if(memberDAO.save(userInfo)) {
			return SUCCESS;
		}else {
			return LOGIN;
		}
	}
	
}
