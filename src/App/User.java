package App;

import java.util.ArrayList;

public final class User {
	public static String[] questions_literate = {
			"Which year are we in?",
			"Which season are we in?",
			"What is date today? Please give your answer like march twelfth.",
			"What is the current day?",
			"Which month are we in?",
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
			"Could you tell me the direction of the school using compass above?",
			"Now, I will name you three objects. After I tell you them. I would like you to repeat them one by one. Ball, car, man.",
			"Could you tell me the days of week in reverse order. For example: Sunday Saturday, please continue.",
			"Earlier I told you the names of three things. Can you tell me what those were?",
			"You can see two objects on the screen. Can you tell me the names of the objects?",
			"Repeat the phrase: “I would have gone if he had gone”",
			"Can you say 'paper'?",
			"Can you press the 'green' button?",
			"Please copy this picture." };

	private static boolean speakerCheck;
	private static boolean micCheck;
	private static boolean webcamCheck;
	
	private static String education="Not yet entered";
	private static String nameSurname = "Not entered";
	private static String age = "Not entered";
	private static String gender = "Not entered";
	private static String profession = "Not entered";

	public static int orderLiterate[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
	public static int orderIlliterate[] = { 1, 2, 3, 4, 5, 6, 7, 18, 9, 10, 19, 12, 13};
	
	public static ArrayList<String> answers_mmse = new ArrayList<String>();
	public static ArrayList<String> answers_clock = new ArrayList<String>();
	private static ArrayList<Integer> score_mmse = new ArrayList<Integer>();
	private static double score_clock=0; 
	private static double score_polygon=0; 

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
		return answers_mmse.get(index);
	}

	public static void addAnswer_MMSE(String answer) {
		answers_mmse.add(answer);
	}

	public static ArrayList<Integer> getScore_MMSE() {
		return score_mmse;
	}

	public static void addScore_MMSE(int scr) {
		score_mmse.add(scr);
	}

	
	public static final double getScore_clock() {
		return score_clock;
	}

	
	public static final void setScore_clock(double score_clock) {
		User.score_clock = score_clock;
	}

	
	public static final double getScore_polygon() {
		return score_polygon;
	}

	
	public static final void setScore_polygon(double score_polygon) {
		User.score_polygon = score_polygon;
	}
	
}
