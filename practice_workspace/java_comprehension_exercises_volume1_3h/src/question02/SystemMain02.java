package question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemMain02 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("名前を入力してください");
		
		BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
		
		String name = reader1.readLine();
		
		
		System.out.println("あなたの名前は" + name + "です");
		
		
		System.out.println("年齢を入力してください");
		
		BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
		
		String temporaryAge = reader2.readLine();
		
		int age = Integer.parseInt(temporaryAge);
		
		
		System.out.println("あなたの年齢は" + age + "歳です");
		
		
		
		System.out.println("好きな食べ物と飲み物を入力してください");
		
		BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
		
		String food = reader3.readLine();
		String drink = reader3.readLine();
		
		System.out.println("あなたの好きな食べ物は" + food + "です");
		System.out.println("あなたの好きな飲み物は" + drink + "です");
		
		
	}

}
