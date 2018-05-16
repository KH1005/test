package checkbox.action;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import checkbox.model.User;

public class CheckBoxAction implements Action, Preparable,ModelDriven<User>{

	User user;
	Log log = LogFactory.getLog(CheckBoxAction.class);
	@Override
	public User getModel() {
		return user;
	}

	@Override
	public void prepare() throws Exception {
		user = new User();
	}

	@Override
	public String execute() throws Exception {
		log.info(">>>>male :"+user.getMale());
		log.info(">>>>female :"+user.getFemale());
		return SUCCESS;
	}

}
