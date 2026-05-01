package q01_basic.question02;

public class SystemMain02 {

	public static void main(String[] args) {
		Member data = new Member();
		data.setName("Miura Manabu");
		data.setAge(30);
		data.setRank(1);

		data.showMember();

		data.rankUp();
	}
}
