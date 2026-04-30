package q01_basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Member {
	int id;
	String password;
	String name;
	int age;
	int rank;

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

	public Member() {

	}

	public Member(int id, String password, String name, int age, int rank) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

	public void buyItem() {
		System.out.println("商品を購入しました。");

	}

	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println("id:" + id);
		System.out.println("password:" + password);
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("rank:" + rank);
		System.out.println("***********");

	}

}

/**
 * 標準入力を制御するクラス
 */
class ConsoleReader {
	public String inputString(String message) throws IOException {
		System.out.println(message);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		return reader.readLine();
	}

	/**
		 * 文字列の標準入力。
		 * 
		 * @return 入力文字列
		 * @throws IOException
		 */
	//TODO ここから実装する

	/**
	 * 整数の標準入力。
	 * 
	 * @return 入力整数
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public int inputNumber(String message) throws IOException, NumberFormatException {
		System.out.println(message);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		return Integer.parseInt(reader.readLine());

	}

}
