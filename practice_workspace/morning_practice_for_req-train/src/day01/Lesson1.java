/*問題
パッケージ名 day01
クラス名 Lesson1.java

"出力します"とコンソールに出力してください。
続けて12、 1.6、 "こんにちは"、 trueをそれぞれ変数に代入しコンソールに出力してください。
変数名は任意とします
また上記から変数を１つを選び、代入する値を1行コメントで記入しなさい。（コメント例 〇〇を代入する）

【出力例】
出力します
12
1.6
こんにちは
true
 * 
 */
package day01;

public class Lesson1 {

	public static void main(String[] args) {
		int num1 = 12;
		//num1に12を代入
		double num2 = 1.6;
		String greeting = "こんにちは";
		boolean b = true;
		System.out.println("出力します");
		System.out.println(num1 + "\n" + num2 +"\n" + greeting +"\n" + b);
	}

}
