/*問題

パッケージ名 day03
クラス名 Lesson4.java

 FizzBuzz問題
	コンソールから任意の整数を入力し、3で割れる場合は「Fizz」、5で割り切れる場合は「Buzz」、
	3と5両方の数字で割り切れる場合「FizzBuzz」とコンソールに出力してください。
	どちらの数字でも割り切れない場合は、数字をそのままコンソールに出力します。
	//（補足：3の倍数は(変数%3==0)と表します。）

【出力例①】
input number? >>30
FizzBuzz

【出力例②】
input number? >>27
Fizz

【出力例③】
input number? >>55
Buzz

【出力例④】
input number? >>13
13
*/
package day03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson4 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str = reader.readLine();
		int num = Integer.parseInt(str);
		
		if(num % 3 == 0 && num % 5 == 0) {
			System.out.println("FizzBuzz");
			
		}else if(num % 5 ==0) {
			System.out.println("Buzz");
			
		}else if(num % 3==0 ) {
			System.out.println("Fizz");
			
		}else {
			System.out.println("その他の数字が出力されました");
		}
		
		
	}

}
