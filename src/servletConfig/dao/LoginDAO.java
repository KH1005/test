package servletConfig.dao;

import servletConfig.model.UserInfo;

public class LoginDAO {
	public boolean loginCheck(UserInfo userInfo) {
		if("test".equals(userInfo.getId())) {
			userInfo.setName("김지훈");
			return true;
		}else {
			return false;
		}
	}
}
