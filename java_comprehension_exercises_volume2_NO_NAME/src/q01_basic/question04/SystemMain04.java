package q01_basic.question04;

public class SystemMain04 {

	public static void main(String[] args) {

		Member data1 = new Member("Miura Manabu", 28, 2, 1, "PasswOrd");
		Member data2 = new Member("Sato Kensuke", 43, 1, 2, "aaaAAA");

		Member[] members = new Member[2];
		members[0] = data1;
		members[1] = data2;

		MemberManager.showAllMembers(members);

	}

}
