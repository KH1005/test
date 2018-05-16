package login3.dao;

import login3.model.UserInfo;

public class LoginDAO {
	public boolean loginCheck(UserInfo userInfo) {
		if("test".equals(userInfo.getId())) {
			userInfo.setName("홍길동");
			return true;
		}else {
			return false;
		}
	}

}
