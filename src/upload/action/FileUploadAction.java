package upload.action;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import upload.dao.FileUploadDAO;
import upload.interceptor.FileUploadDAOAware;
import upload.model.UserInfo;

public class FileUploadAction extends ActionSupport 
implements Preparable, ModelDriven,	FileUploadDAOAware{
	private static final long serialVersionUID = 1L;
	private final String UPLOAD_DIR = "C:/java/image/";
	private Log log = LogFactory.getLog(FileUploadAction.class);
	
	File doc;
	String docContentType;
	String docFileName;
	
	UserInfo userInfo;
	File savaedFile;
	FileUploadDAO fileUploadDAO;
	@Override
	public void setFileUploadDAO(FileUploadDAO fileUploadDAO) {
		this.fileUploadDAO = fileUploadDAO;
	}
	@Override
	public Object getModel() {
		return userInfo;
	}
	@Override
	public void prepare() throws Exception {
		userInfo = new UserInfo();
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(fileUploadDAO.insertUserInfo(userInfo)) {
			log.info(">>>>>fileUploadDAO.inserUserInfo 후...");
			if(doc != null && doc.exists()) {
				log.info(">>>>> Fiel Copy 전...");
				savaedFile = new File(UPLOAD_DIR+docFileName);
				FileUtils.copyFile(doc, savaedFile);
				log.info(">>>>FIle Copy 후...");
			}
		}
		return SUCCESS;
	}
	
	public File getDoc() {
		return doc;
	}
	public void setDoc(File doc) {
		this.doc = doc;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public File getSavaedFile() {
		return savaedFile;
	}
	public void setDocContentType(String docContentType) {
		this.docContentType = docContentType;
	}
	public void setDocFileName(String docFileName) {
		this.docFileName = docFileName;
	}
	
	

}



































