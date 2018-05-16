package hello;

import com.opensymphony.xwork2.Action;

public class HelloWorldAction implements Action {
	private String name;
	private String msg;
	
	public void setName(String name) {	//받아들이는거 
		this.name = name;
	}
	
	public String getMsg() {	//영역에 저장
		return msg;
	}
	
	public String execute() throws Exception{
 		msg = "hello " + name;
		return SUCCESS;
	}

}
