package TestCases;

import static org.junit.Assert.*;
import org.junit.Test;
import SpeechRecognition.Evaluation;


public class SpeechRecognition_TestCases {

	@Test
	public void test_setQuestionNumber1() {
		Evaluation e = new Evaluation();
		e.setAnswerToQuestion1("two thousand and eighteen");
		assertTrue(e.answerToQuestion1=="two thousand and eighteen");
	}
	@Test
	public void test_getQuestionNumber1(){
		Evaluation e = new Evaluation();
		e.answerToQuestion1 = "two thousand and eighteen";
		assertTrue(e.getAnswerToQuestion1()=="two thousand and eighteen");
	}
	@Test
	public void test_setQuestionNumber2(){
		Evaluation e = new Evaluation ();
		e.setAnswerToQuestion2("winter");
		assertTrue(e.answerToQuestion2=="winter");
	}
	@Test
	public void test_getQuestionNumber2(){
		Evaluation e = new Evaluation();
		e.answerToQuestion2 = "winter";
		assertTrue(e.getAnswerToQuestion2()=="winter");
	}
	@Test
	public void test_setQuestionNumber3(){
		Evaluation e = new Evaluation();
		e.setAnswerToQuestion3("january second");
		assertTrue(e.answerToQuestion3=="january second");
	}
	@Test
	public void test_getQuestionNumber3(){
		Evaluation e = new Evaluation();
		e.answerToQuestion3= "january second";
		assertTrue(e.getAnswerToQuestion3()== "january second");
	}
	@Test
	public void test_setQuestionNumber4(){
		Evaluation e = new Evaluation();
		e.setAnswerToQuestion4("sunday");
		assertTrue(e.answerToQuestion4=="sunday");
	}
	@Test
	public void test_getQuestionNumber4(){
		Evaluation e = new Evaluation();
		e.answerToQuestion4 = "sunday";
		assertTrue(e.getAnswerToQuestion4()== "sunday");
	}
	@Test
	public void test_setQuestionNumber5(){
		Evaluation e = new Evaluation();
		e.setAnswerToQuestion5("january");
		assertTrue(e.answerToQuestion5=="january");
	}
	@Test
	public void test_getQuestionNumber5(){
		Evaluation e = new Evaluation();
		e.answerToQuestion5 = "january";
		assertTrue(e.getAnswerToQuestion5()== "january");
	}
	@Test
	public void test_setQuestionNumber8(){
		Evaluation e = new Evaluation();
		e.setAnswerToQuestion8("north");
		assertTrue(e.answerToQuestion8=="north");
	}
	@Test
	public void test_getQuestionNumber8(){
		Evaluation e = new Evaluation();
		e.answerToQuestion8 = "north";
		assertTrue(e.getAnswerToQuestion8()== "north");
	}
	@Test
	public void test_setQuestionNumber9(){
		Evaluation e = new Evaluation();
		e.setAnswerToQuestion9("ball car man");
		assertTrue(e.answerToQuestion9=="ball car man");
	}
	@Test
	public void test_getQuestionNumber9(){
		Evaluation e = new Evaluation();
		e.answerToQuestion9 = "ball car man";
		assertTrue(e.getAnswerToQuestion9()== "ball car man");
	}
	@Test
	public void test_setQuestionNumber10(){
		Evaluation e = new Evaluation();
		e.setAnswerToQuestion10("ninety three eighty six seventy nine seventy two sixty five");
		assertTrue(e.answerToQuestion10=="ninety three eighty six seventy nine seventy two sixty five");
	}
	@Test
	public void test_getQuestionNumber10(){
		Evaluation e = new Evaluation();
		e.answerToQuestion10 = "ninety three eighty six seventy nine seventy two sixty five";
		assertTrue(e.getAnswerToQuestion10()== "ninety three eighty six seventy nine seventy two sixty five");
}
	@Test
	public void test_setQuestionNumber11(){
		Evaluation e = new Evaluation();
		e.setAnswerToQuestion11("ball car man");
		assertTrue(e.answerToQuestion11=="ball car man");
	}
	@Test
	public void test_getQuestionNumber11(){
		Evaluation e = new Evaluation();
		e.answerToQuestion11 = "ball car man";
		assertTrue(e.getAnswerToQuestion11()== "ball car man");
}
	@Test
	public void test_setQuestionNumber12(){
		Evaluation e = new Evaluation();
		e.setAnswerToQuestion12("wristwatch pencil");
		assertTrue(e.answerToQuestion12=="wristwatch pencil");
	}
	@Test
	public void test_getQuestionNumber12(){
		Evaluation e = new Evaluation();
		e.answerToQuestion12 = "wristwatch pencil";
		assertTrue(e.getAnswerToQuestion12()== "wristwatch pencil");
}
	@Test
	public void test_setQuestionNumber13(){
		Evaluation e = new Evaluation();
		e.setAnswerToQuestion13("no ifs ands or buts");
		assertTrue(e.answerToQuestion13=="no ifs ands or buts");
	}
	@Test
	public void test_getQuestionNumber13(){
		Evaluation e = new Evaluation();
		e.answerToQuestion13 = "no ifs ands or buts";
		assertTrue(e.getAnswerToQuestion13()== "no ifs ands or buts");
}
	@Test
	public void test_setQuestionNumber14(){
		Evaluation e = new Evaluation();
		e.setAnswerToQuestion14("paper");
		assertTrue(e.answerToQuestion14=="paper");
	}
	@Test
	public void test_getQuestionNumber14(){
		Evaluation e = new Evaluation();
		e.answerToQuestion14 = "paper";
		assertTrue(e.getAnswerToQuestion14()== "paper");
}
	@Test
	public void test_setQuestionNumber20(){
		Evaluation e = new Evaluation();
		e.setAnswerToQuestion20("sunday is preceded by saturday saturday is preceded by friday");
		assertTrue(e.answerToQuestion20=="sunday is preceded by saturday saturday is preceded by friday");
	}
	@Test
	public void test_getQuestionNumber20(){
		Evaluation e = new Evaluation();
		e.answerToQuestion20 = "sunday is preceded by saturday saturday is preceded by friday";
		assertTrue(e.getAnswerToQuestion20()== "sunday is preceded by saturday saturday is preceded by friday");
}
	@Test
	public void test_setQuestionNumber21(){
		Evaluation e = new Evaluation();
		e.setAnswerToQuestion21("i would have gone if he had gone");
		assertTrue(e.answerToQuestion21=="i would have gone if he had gone");
	}
	@Test
	public void test_getQuestionNumber21(){
		Evaluation e = new Evaluation();
		e.answerToQuestion21 = "i would have gone if he had gone";
		assertTrue(e.getAnswerToQuestion21()== "i would have gone if he had gone");
}
}


