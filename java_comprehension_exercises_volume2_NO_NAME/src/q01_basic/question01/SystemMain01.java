package q01_basic.question01;

/**
 * question01出力例
 * 詳細は問題ドキュメントを参照すること

---SHOW DATA---
***MEMBER DATA***
name:Miura Manabu
age:24
rank:1
*****************
***MEMBER DATA***
name:Sato Kensuke
age:36
rank:2
*****************

 * 
 */
public class SystemMain01 {

	public static void main(String[] args) {

		Member system1 = new Member();
		Member system2 = new Member();

		system1.name = "Miura Manabu";
		system1.age = 24;
		system1.rank = 1;

		system2.name = "Sato Kensuke";
		system2.age = 36;
		system2.rank = 2;

		system1.showMember();

	}

}
