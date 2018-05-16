package stream;

import java.io.FileInputStream;
import java.io.InputStream;

import com.opensymphony.xwork2.Action;

public class FileDownloadAction implements Action{
	String dir; //struts.xml에서 넘어오는 값으로 세팅 dir=C:/java/download
	String fileName;	//요청파라미터 이름과 일치할 것 fileName="common.jpg"
	InputStream inputStream;	//이 변수명은 struts.xml의 <param name="inputName">으로 정의됨	
	
	@Override
	public String execute() throws Exception {
		inputStream = new FileInputStream(dir+"/"+fileName);
		return SUCCESS;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}
	
	
	

	
	
	
}
