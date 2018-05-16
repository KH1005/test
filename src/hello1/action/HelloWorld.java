package hello1.action;

public class HelloWorld {
	private String name;
	private String msg;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public String execute() throws Exception{
		msg = "hello "+name;
		return "success";
	}
}
