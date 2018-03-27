import java.util.ArrayList;

public final class User {
	
	private boolean speakerCheck;
	private boolean micCheck;
	private boolean webcamCheck;

	private boolean education;
	
	private String nameSurname="Not entered";
	private String age="Not entered";
	private String gender="Not entered";
	private String profession="Not entered";

	private ArrayList<String> answers=new ArrayList<String>();
	
	public boolean isEducation() {
		return education;
	}

	public void setEducation(boolean education) {
		this.education = education;
	}

	public String getNameSurname() {
		return nameSurname;
	}

	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	
	public ArrayList<String> getAnswers() {
		return answers;
	}

	
	public void setAnswers(ArrayList<String> answers) {
		this.answers = answers;
	}

	public void addAnswer(String answer){
		this.answers.add(answer);
	}

	public boolean isSpeakerCheck() {
		return speakerCheck;
	}

	public void setSpeakerCheck(boolean speakerCheck) {
		this.speakerCheck = speakerCheck;
	}

	public boolean isMicCheck() {
		return micCheck;
	}

	public void setMicCheck(boolean micCheck) {
		this.micCheck = micCheck;
	}

	public boolean isWebcamCheck() {
		return webcamCheck;
	}

	public void setWebcamCheck(boolean webcamCheck) {
		this.webcamCheck = webcamCheck;
	}
	
	
	
}
