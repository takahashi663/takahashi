package day10.q01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class ConsoleReader {

	public int inputPIN() throws IOException {
		int pin = -1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("4ケタの暗証番号を入力して下さい");
		System.out.print("input PIN? >>");
		String inputString = br.readLine();

		/* ここに記述 */
		Pettern pin = Pattern.comp("~\\d{4}");
			
		
		
		/* 記述終了 */

		pin = Integer.parseInt(inputString);
		return pin;
	}

}
