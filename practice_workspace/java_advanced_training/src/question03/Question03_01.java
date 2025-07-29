package question03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question03_01 {

	public static void main(String[] args) throws IOException {
System.out.println("サイズを入力してください");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str = reader.readLine();
		
	    double size = Double.parseDouble(str);
		
		System.out.println("サイズが"+ size + "の靴を購入します ");


	}

}
