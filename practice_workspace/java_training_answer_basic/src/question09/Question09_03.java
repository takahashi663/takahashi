package question09;

public class Question09_03 {
	public static void main(String[] args) {
		int point = 80;

		if (point >= 80) {
			System.out.println("テストの点数は優秀です");
		} else if (point >= 50) {
			System.out.println("テストの点数は平均的です");
		} else if (point >= 30) {
			System.out.println("テストの点数は及第です");
		} else {
			System.out.println("赤点のため追試が必要です");
		}

		System.out.println("お疲れ様でした");
	}
}
