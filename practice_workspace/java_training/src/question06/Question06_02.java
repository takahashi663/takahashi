package question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_02 {

	public static void main(String[] args) throws IOException {
		
System.out.println("整数を入力してください");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str = reader.readLine();
		
		int num = Integer.parseInt(str);
		
		System.out.println("今年で" +str + "歳になります ");

	}

}
