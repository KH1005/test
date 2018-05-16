package hello2.action;

import com.opensymphony.xwork2.Action;

public class HelloWorld implements Action{
	private String msg;
	private String name;
	private String retMsg;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getRetMsg() {
		return retMsg;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public String execute() throws Exception{
		
		if(name==null || "".equals(name)) {
			retMsg = "ENTER NAME!!";
			return INPUT;
		}
		msg = "hello "+name;
		return SUCCESS;
	}
	
	

}
