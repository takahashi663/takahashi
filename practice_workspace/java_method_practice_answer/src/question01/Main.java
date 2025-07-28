/**
 * Employeeクラスのフィールド3つにそれぞれ値を代入してください。
 * コンソール上に出力する値は、Employeeクラスのフィールドを使用すること
 * 
 * name : 田中太郎
 * age：30
 * dept：システム開発部
 * 
 * ▼出力例
 * 山田太郎さんは、30歳でシステム開発部所属です。
 */
package question01;

public class Main {
	
	 public static void main(String[] args) {
		
		 Employee emp = new Employee();
		 
		 emp.name = "田中太郎";
		 
		 emp.age = 33;
		 
		 emp.dept = "システム開発部";
		 
		 System.out.println(emp.name + "さんは、" + emp.age + "歳で" + emp.dept + "所属です。");
		 
	}
	
}
