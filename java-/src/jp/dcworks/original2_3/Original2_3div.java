package jp.dcworks.original2_3;

public class Original2_3div {

	// 割り算
	public static Integer div(int a, int b) {
		if (b == 0) {
			System.out.println("エラー：0では割れません");
			return null;
		}
		return a / b;
	}
}
