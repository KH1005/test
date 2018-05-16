package login4.dao;

public class LoginDAO {
	public boolean loginCheck(String id, String password) {
		if("test".equals(id)) {
			return true;
		}else {
			return false;
		}
	}
}
