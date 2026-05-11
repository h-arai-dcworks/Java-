package jp.dcworks;

public class Original1_3 {
	public static void main(String[] args) {

		// 九九の表作成
		for (int i = 1; i <= 9; i++) {

			// 格段の計算
			for (int j = 1; j <= 9; j++) {
				System.out.print(i * j + " ");
			}

			// 段ごとに改行
			System.out.println();
		}
	}
}
