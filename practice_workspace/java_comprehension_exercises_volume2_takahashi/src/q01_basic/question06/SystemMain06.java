package q01_basic.question06;

import java.io.IOException;

public class SystemMain06 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		ConsoleReader cr = new ConsoleReader();
		int inputId = 0;
		String inputPassword = null;
		String name = "Miura Manabu";
		int age = 28;
		int rank = 2;

		System.out.println("---CREATE MEMBER DATA---");
		//TODO ここから実装する
		try {
		System.out.print("input id>>");
		cr.inputNumber();
		}catch(NumberFormatException e) {
		System.out.println("error");
		e.printStackTrace();
		return;
		}catch(IOException e) {	
		System.out.print("input password>>");
		cr.inputString();
	
		}
		Member member = new Member(0,inputPassword,"Miura Manabu",28,2);
		
		member.buyItem();
	}
}
