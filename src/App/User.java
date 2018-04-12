package App;

import java.util.ArrayList;

public final class User {
	public static String[] questions_literate={};
	public static String[] questions_illiterate={};

	private static boolean speakerCheck;
	private static boolean micCheck;
	private static boolean webcamCheck;

	private static String education;
	private static String nameSurname = "Not entered";
	private static String age = "Not entered";
	private static String gender = "Not entered";
	private static String profession = "Not entered";

	public static ArrayList<String> answers = new ArrayList<String>();
	private static ArrayList<Integer> score=new ArrayList<Integer>();

	public static boolean isSpeakerCheck() {
		return speakerCheck;
	}

	public static void setSpeakerCheck(boolean speaker) {
		speakerCheck = speaker;
	}

	public static boolean isMicCheck() {
		return micCheck;
	}

	public static void setMicCheck(boolean mic) {
		micCheck = mic;
	}

	public static boolean isWebcamCheck() {
		return webcamCheck;
	}

	public static void setWebcamCheck(boolean webcam) {
		webcamCheck = webcam;
	}

	public static String getEducation() {
		return education;
	}

	public static void setEducation(String edu) {
		education = edu;
	}

	public static String getNameSurname() {
		return nameSurname;
	}

	public static void setNameSurname(String nameSur) {
		nameSurname = nameSur;
	}

	public static String getAge() {
		return age;
	}

	public static void setAge(String ag) {
		age = ag;
	}

	public static String getGender() {
		return gender;
	}

	public static void setGender(String gen) {
		gender = gen;
	}

	public static String getProfession() {
		return profession;
	}

	public static void setProfession(String prof) {
		profession = prof;
	}

	public static String getAnswers(int index) {
		return answers.get(index);
	}

	public static void setAnswers(ArrayList<String> a) {
		answers = a;
	}

	public static void addAnswer(String answer) {
		answers.add(answer);
	}

	public static void displayInfo() {
		System.out.println("User Info-----------------");
		System.out.println("Name Surname: " + App.User.getNameSurname());
		System.out.println("Age: " + App.User.getAge());
		System.out.println("Gender: " + App.User.getGender());
		System.out.println("Profession: " + App.User.getProfession());
		System.out.println("Education: " + App.User.getEducation());
	}


	public static ArrayList<Integer> getScore() {
		return score;
	}


	public static void setScore(ArrayList<Integer> score) {
		User.score = score;
	}

	public static void addScore(int scr) {
		score.add(scr);
	}


}
