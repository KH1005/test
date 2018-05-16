package servletConfig.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import servletConfig.dao.LoginDAO;
import servletConfig.interceptor.LoginDAOAware;
import servletConfig.model.UserInfo;

public class LoginAction implements Action,Preparable,ModelDriven<UserInfo>,LoginDAOAware
							,SessionAware,ServletRequestAware,RequestAware{

	UserInfo userInfo;
	LoginDAO loginDAO;
	Map	sessionMap;
	Map requestMap;
	HttpServletRequest request;
	Log log = LogFactory.getLog(LoginAction.class);
	
	@Override
	public void setRequest(Map requestMap) {
		this.requestMap = requestMap; 
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	@Override
	public void setSession(Map sessionMap) {
		this.sessionMap = sessionMap;
	}

	@Override
	public void setLoginDAO(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}

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
		if(loginDAO.loginCheck(userInfo)) {
			sessionMap.put("userInfo", userInfo);//세션에 저장
			log.info(">>>>requestURI:"+request.getRequestURI());
			log.info(">>>>requestID:"+requestMap.get("id").toString());
			log.info(">>>>request PWD:"+requestMap.get("password").toString());
			return SUCCESS;
		}else {
			return LOGIN;
		}
	}

}









































