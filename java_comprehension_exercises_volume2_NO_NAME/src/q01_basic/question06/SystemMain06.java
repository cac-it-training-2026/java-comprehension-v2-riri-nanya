package q01_basic.question06;

import java.io.IOException;

public class SystemMain06 {

	public static void main(String[] args) {

		ConsoleReader cr = new ConsoleReader();
		int inputId = 0;
		String inputPassword = null;
		String name = "Miura Manabu";
		int age = 28;
		int rank = 2;

		System.out.println("---CREATE MEMBER DATA---");

		try {
			inputId = cr.inputNumber("input id>>");
			inputPassword = cr.inputString("input password>>");

		} catch (IOException e) {
			e.printStackTrace();
			return;
		} catch (NumberFormatException e) {
			System.out.println("error");
			e.printStackTrace();
			return;

			// TODO: handle exception
		}

		Member data = new Member(inputId, inputPassword, name, age, rank);

		data.showMember();

	}

}
