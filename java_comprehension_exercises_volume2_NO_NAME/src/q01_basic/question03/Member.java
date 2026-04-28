package q01_basic.question03;

class Member {
	String name;
	int age;
	int rank;

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int a) {
		age = a;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int r) {
		rank = r;
	}

	/**
	 * @param name
	 * @param age
	 * @param rank
	 */
	public Member(String name, int age, int rank) {
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

	public Member() {

		this.name = null;
		this.age = 0;
		this.rank = 0;

	}

	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println("namw:" + name);
		System.out.println("age:" + age);
		System.out.println("rank:" + rank);
		System.out.println("**************");
	}

}
