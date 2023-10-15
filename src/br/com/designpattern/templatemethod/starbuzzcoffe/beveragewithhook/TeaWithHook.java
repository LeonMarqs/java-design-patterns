package br.com.designpattern.templatemethod.starbuzzcoffe.beveragewithhook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeineBeverageWithHook {

	@Override
	protected boolean customerWantsCondiments() {
		String answer = getUserInput();

		if (answer.toLowerCase().startsWith("y")) {
			return true;
		}

		return false;
	}

	@Override
	void brew() {
		System.out.println("Steeping the tea");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding Lemon");
	}

	private String getUserInput() {
		String answer = null;

		System.out.println("Would you lemon with your tea (y/n)? ");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try {
			answer = in.readLine();
		} catch (IOException e) {
			System.out.println("IO error trying to read your answer");
		}

		if (answer == null) {
			return "no";
		}

		return answer;
	}

}
