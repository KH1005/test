package interceptor1.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import interceptor1.dao.SumDAO;
import interceptor1.model.NumberForAdd;
import login.model.UserInfo;

public class SumAction implements Action, Preparable, ModelDriven{
	NumberForAdd num;
	private int sum = 0;
	public String execute() throws Exception{
		SumDAO sumDao = new SumDAO();
		sum = sumDao.add(num);
		return SUCCESS;
	}
	
	public int getSum() {
		return sum;
	}

	public Object getModel(){
		return num;
	}
	
	public void prepare() throws Exception{
		num = new NumberForAdd();
	}
	

}
