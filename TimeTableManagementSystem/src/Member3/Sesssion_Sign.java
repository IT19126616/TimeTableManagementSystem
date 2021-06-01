package Member3;

import java.util.ArrayList;

public class Sesssion_Sign {
	private String LectureName;
	
	private String SessionSign;
	
	public Sesssion_Sign(String lectureName, String sessionSign) {
		super();
		LectureName = lectureName;
		SessionSign = sessionSign;
	}

	public String getLectureName() {
		return LectureName;
	}

	public void setLectureName(String lectureName) {
		LectureName = lectureName;
	}

	public String getSessionSign() {
		return SessionSign;
	}

	public void setSessionSign(String sessionSign) {
		SessionSign = sessionSign;
	}

	public ArrayList<Sesssion_Sign> getData(int selectedItem) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
