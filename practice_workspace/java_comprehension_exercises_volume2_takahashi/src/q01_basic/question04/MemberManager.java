package q01_basic.question04;

class MemberManager {

	/**
	 * インスタンス化の禁止
	 */
	private MemberManager() {
		
	}


	//TODO showAllMembersメソッドを実装する
	public static void showAllMembers(Member[] members) {
		for (Member id :members) {
			id.showMember();
		}
		for(Member password :members) {
			password.showMember();
		}
		for(Member name :members) {
			name.showMember();
		}
		for(Member age :members) {
			age.showMember();
		}
		for(Member rank :members) {
			rank.showMember();
		}
	}

}