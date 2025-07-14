package question09;

public class Question09_03 {

	public static void main(String[] args) {
		int point = 89;
		
		if(point >= 80) {
			System.out.println("テストの点数は優秀です");
			System.out.println("お疲れ様でした");
			
		} else if (50 <= point && point < 80) {
			System.out.println("テストの点数は平均的です");
			System.out.println("お疲れ様でした");
			
		}else if (50 > point && point >=30) {
			System.out.println("テストの点数が及第です");
			System.out.println("お疲れ様でした");
			
		}else {
			System.out.println("赤点のため追試が必要です ");
			System.out.println("お疲れ様でした");
		}
	}

}
