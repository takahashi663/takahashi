/**
 * 問題
 * Strin型のフィールドname
 * int型のフィールドage
 * String型のフィールドdept
 * 上記3つのフィールドを作成してください。
 */
package question01;
/**
 * 社員クラス
 */
public class Employee {
	String name;
	int age;
	String dept;

	public void show() {
		System.out.println(name +" さんは、" + age + "歳で"+ dept + "です。");
	}
}
