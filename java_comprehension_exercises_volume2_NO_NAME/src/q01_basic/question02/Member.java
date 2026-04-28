package q01_basic.question02;

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

	public void rankUp() {
		this.rank = this.rank + 1;
		System.out.println(">>>RANK UP>>>");
		System.out.println("newRank:" + rank);

	}

	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println("namw:" + name);
		System.out.println("age:" + age);
		System.out.println("rank:" + rank);
		System.out.println("**************");
	}

}
