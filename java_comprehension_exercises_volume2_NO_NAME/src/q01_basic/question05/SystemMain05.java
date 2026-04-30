package q01_basic.question05;

import q01_basic.question05.Member.MemberManager;
import q01_basic.question05.Member.NonMember;

public class SystemMain05 {

	public static void main(String[] args) {

		AbstMember[] members = new AbstMember[2];
		members[0] = new NonMember("Sato");
		members[1] = new Member("Miura Manabu", 28, 2, 1, "Passw0rd");

		MemberManager.showAllMembers(members);

		for (AbstMember m : members) {
			m.buyItem();
		}

	}
}
