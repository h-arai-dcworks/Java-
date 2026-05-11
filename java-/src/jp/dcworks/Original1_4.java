package jp.dcworks;

public class Original1_4 {
	public static void main(String[] args) {

		int[] arr = new int[100];

		// 1〜100を入れる
		for (int i = 0; i < 100; i++) {
			arr[i] = i + 1;
		}

		// 偶数だけ出力
		for (int i = 0; i < 100; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}