package question03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question03_02 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = reader.readLine();
		String str2 = reader.readLine();
		String str3 = reader.readLine();
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str1 + str2 + str3);
	}

}
