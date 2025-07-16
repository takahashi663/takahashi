package question05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemMain05 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("年齢を入力してください");
		
		 BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
			
			String str1 = reader1.readLine();
			
			int age = Integer.parseInt(str1);
			
			if (age < 20) {
				System.out.println("20 歳未満なので、お酒の提供ができません。");
			}
			int numberGroup[] = {3,5,7,9};
			
			if (numberGroup[3] == 3) {
				System.out.println("配列numberGroup1 で 4 番目の数値は 3 です");
			} else if(numberGroup[3] == 5){
				System.out.println("配列numberGroup1 で 4 番目の数値は 5 です");
			} else if (numberGroup[3] == 7){
				System.out.println("配列numberGroup1 で 4 番目の数値は 7 です");
			} else {
				System.out.println("配列 numberGroup1 で 4 番目の数値は 3 と 5 と 7 以外の数値です。");
			}
			
			System.out.println("曜日を日本語で入力してください");
			
			 BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
				
			String userDayInput  = reader2.readLine();
			
			switch (userDayInput) {
				case "月曜日" :
					System.out.println("Monday");
					break;
				case "火曜日":
					System.out.println("Tuesday");
					break;
				case "水曜日":
					System.out.println("Wendnesday");
					break;
				case "木曜日":
					System.out.println("Thursday");
					break;
				case"金曜日":
					System.out.println("Friday");
					break;
				case "土曜日":
					System.out.println("Saturday");
					break;
				case "日曜日":
					System.out.println("Sunday");
					break;
			}
			
			System.out.println("数学の試験結果の点数を入力してください");
			
			 BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
				
				String str2 = reader3.readLine();
				
				int math = Integer.parseInt(str2);
				
			System.out.println("科学の試験結果の点数を入力してください");
				
			
				String str3 = reader3.readLine();
				
				int science =Integer.parseInt(str3);
				
				if(math >= 60 && science >= 60) {
					System.out.println("数学と科学ともに合格です");
				}else if(math >= 60 || science >= 60) {
					System.out.println("数学か科学のどちらかが合格です");
				}else {
					System.out.println("どちらも不合格です");
				}
	}

}
