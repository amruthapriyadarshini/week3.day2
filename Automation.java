package week3.day2;

public class Automation implements Language, TestTool {

	public void Selenium() {
		System.out.println("I am Selenium,implemented here");

	}

	public void Java() {
		System.out.println("I am Java,implemented here");

	}

	public static void main(String[] args) {
		Automation automation = new Automation();
		automation.Selenium();
		automation.Java();

	}

}
