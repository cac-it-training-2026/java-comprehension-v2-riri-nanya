package q01_basic.question07;

import java.util.ArrayList;
import java.util.List;

/**
 * 整数リストを制御するクラス
 * 
 */
class NumberList {

	private List<Integer> numbers = new ArrayList<>();

	/**
	 * 整数のList
	 * 
	 */

	/**
	 * 1から引数までの整数をListに代入する
	 * 
	 * @param limit（Listの最終要素）
	 */
	public void addFromOneTo(Integer limit) {
		for (int i = 1; i <= limit; i++) {
			numbers.add(i);
		}

		//TODO ここから実装する

	}

	/**
	 * Listの各要素整数を合計する
	 * 
	 * @return Listの要素の合計値
	 */
	public Integer calcSumOfList() {
		Integer sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		//TODO ここから実装する

		return sum;

	}

	/**
	 * Listの各要素を2倍にする
	 * 
	 */
	public void doubleListEachValue() {
		for (int i = 0; i < numbers.size(); i++) {
			numbers.set(i, numbers.get(i) * 2);
			//TODO ここから実装する
		}
	}

	/**
	 * Listの要素の前半部分を削除する
	 * 要素数が奇数の場合、中央値は残す
	 */
	public void removeIndexOfFirstHalf() {
		int half = numbers.size() / 2;
		numbers.subList(0, half).clear();

	}
	//TODO ここから実装する

	/**
	 * @return numbers
	 */
	public List<Integer> getNumbers() {
		return numbers;
	}

	/**
	 * @param numbers セットする numbers
	 */
	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}

}

class ConsoleReader {

	int inputNumber(int numbers) {
		System.out.print("input number>>");

		return numbers;
	}

}
