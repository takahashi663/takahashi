package day05.q02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
	public int inputId() throws IOException {
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				
		int num = Integer.parseInt(reader.readLine());
		
		return num;
	}
}
