package App;

import java.util.ArrayList;

public final class User {
	public static String[] questions_literate = {
			"Which year are we in?",
			"Which season are we in?",
			"What is date today? Please give your answer like march twelfth.",
			"What is the current day?",
			"Which month are we in?",
			"",
			"",
			"Could you tell me the direction of the school using compass above?",
			"Now, I will name you three objects. After I tell you them. I would like you to repeat them one by one. Ball, car, man.",
			"I would like you to count backward from hundred by sevens.",
			"Earlier I told you the names of three things. Can you tell me what those were?",
			"You can see two objects on the screen. Can you tell me the names of the objects?",
			"Repeat the phrase: ‘No ifs, ands, or buts.’",
			"Can you say 'paper'?",
			"Can you press the 'green' button?",
			"Can you type 'Hello World!' in the text box?",
			"Please read this and do what it says.",
			"Make up and write a sentence about anything. This sentence must contain a noun and a verb.",
			"Please copy this picture." };

	public static String[] questions_illiterate = {
			"Which year are we in?",
			"Which season are we in?",
			"What is date today? Please give your answer like march twelfth.",
			"What is the current day?",
			"Which month are we in?",
			"",
			"",
			"Could you tell me the direction of the school using compass above?",
			"Now, I will name you three objects. After I tell you them. I would like you to repeat them one by one. Ball, car, man.",
			"Could you tell me the days of week in reverse order. For example: Sunday Saturday, please continue.",
			"Earlier I told you the names of three things. Can you tell me what those were?",
			"You can see two objects on the screen. Can you tell me the names of the objects?",
			"Repeat the phrase: “I would have gone if he had gone”",
			"Can you say 'paper'?",
			"Can you press the 'green' button?",
			"",
			"Please copy this picture." };

	private static boolean speakerCheck;
	private static boolean micCheck;
	private static boolean webcamCheck;

	private static String education;
	private static String nameSurname = "Not entered";
	private static String age = "Not entered";
	private static String gender = "Not entered";
	private static String profession = "Not entered";

	public static ArrayList<String> answers = new ArrayList<String>();
	private static ArrayList<Integer> score = new ArrayList<Integer>();

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
