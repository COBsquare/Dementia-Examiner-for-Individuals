package TestCases;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class App_TestCases {

	// "User" class test cases
	@Test
	public void test_setgetSpeakerCheck() {
		App.User.setSpeakerCheck(true);

		assertTrue(App.User.isSpeakerCheck() == true);
	}
	@Test
	public void test_setgetMicCheck() {
		App.User.setMicCheck(true);

		assertTrue(App.User.isMicCheck() == true);
	}
	@Test
	public void test_setgetWebcamCheck() {
		App.User.setWebcamCheck(false);

		assertTrue(App.User.isWebcamCheck() == false);
	}
	@Test
	public void test_setgetEducation() {
		App.User.setEducation("literate");

		assertTrue(App.User.getEducation() == "literate");
	}
	@Test
	public void test_setgetNameSurname() {
		App.User.setNameSurname("Kaya Oðuz");

		assertTrue(App.User.getNameSurname() == "Kaya Oðuz");
	}
	@Test
	public void test_setgetAge() {
		App.User.setAge("23");

		assertTrue(App.User.getAge() == "23");

	}
	@Test
	public void test_setgetGender() {
		App.User.setGender("Female");

		assertTrue(App.User.getGender() == "Female");

	}
	@Test
	public void test_setgetProfession() {
		App.User.setProfession("Student");

		assertTrue(App.User.getProfession() == "Student");

	}
	@Test
	public void test_setgetAnswers() {
		ArrayList<String> answers = new ArrayList<String>();
		answers.add("apple");
		answers.add("orange");
		answers.add("banana");

		App.User.setAnswers(answers);

		assertTrue(App.User.getAnswers(1) == "orange");
	}
	@Test
	public void test_addAnswer() {
		ArrayList<String> answers = new ArrayList<String>();
		answers.add("apple");
		answers.add("orange");
		answers.add("banana");

		App.User.setAnswers(answers);
		App.User.addAnswer("strawberry");

		assertTrue(App.User.getAnswers(3) == "strawberry");

	}

}
