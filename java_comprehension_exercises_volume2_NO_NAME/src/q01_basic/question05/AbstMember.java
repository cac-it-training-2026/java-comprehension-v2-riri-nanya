package q01_basic.question05;

/**
 * 会員、非会員の基盤クラス
 * Memberクラス、NonMemberクラスに継承する
 * 
 */

abstract class AbstMember {

	protected String name;

	public abstract void buyItem();

	public abstract void showMember();
}

class Member extends AbstMember {

	int age;
	int rank;
	int id;
	String password;

	public Member() {

	}

	@Override
	public void buyItem() {
		System.out.println(name + "purchased the item at 50% off");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public Member(String name, int age, int rank, int id, String password) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

	@Override
	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println("id:" + id);
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("rank:" + rank);
	}

	class NonMember extends AbstMember {

		public NonMember(String name) {
			this.name = name;
		}

		@Override
		public void buyItem() {
			System.out.println(name + "purchased the item at a fixed price");

		}

		@Override
		public void showMember() {
			System.out.println(name + "is a non-member");

		}
	}

	class MemberManager extends AbstMember {
		private MemberManager() {

		}

		public static void showAllMembers(AbstMember[] members) {
			for (AbstMember m : members) {
				m.showMember();
			}
		}

		@Override
		public void buyItem() {
			// TODO 自動生成されたメソッド・スタブ

		}

		@Override
		public void showMember() {
			// TODO 自動生成されたメソッド・スタブ

		}

	}

	/**
	 * name protected access
	 */

	/**
	 * 商品を購入する（メッセージ出力）
	 * 抽象メソッド
	 */

	/**
	 * メンバー情報を表示する（メッセージ出力）
	 * 抽象メソッド
	 * 
	 */

	/**
	 * @return name
	 */

	/**
	 * @param name セットする name
	 */

}
