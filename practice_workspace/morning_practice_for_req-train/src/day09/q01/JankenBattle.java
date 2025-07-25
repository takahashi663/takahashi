package day09.q01;

import java.io.IOException;

public class JankenBattle {

	public static Playable doBattle(Playable p1, Playable cp) throws IOException {
		Playable winnerPlayer = null;

		System.out.println("じゃんけんを開始します");

		int p1Choice = p1.doJanken();
		int p2Choice = cp.doJanken();
		int judgeNum = (p1Choice - p2Choice + 3) % 3;
		switch (judgeNum) {
		case 0:
			break;
		case 1:
			winnerPlayer = p1;
			break;
		case 2:
			winnerPlayer = cp;
			break;
		default:
			throw new IllegalStateException("不正な判定です");
		}

		return winnerPlayer;
	}

}
