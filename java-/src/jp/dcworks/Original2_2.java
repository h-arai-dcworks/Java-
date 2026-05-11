package jp.dcworks;

public class Original2_2 {

	public static void main(String[] args) {
		int a = 6;
		int b = 2;

		System.out.println("足し算 : " + add(a, b)); // 足し算
		System.out.println("引き算 : " + sub(a, b)); // 引き算
		System.out.println("掛け算 : " + mul(a, b)); // 掛け算
		System.out.println("割り算 : " + div(a, b)); // 割り算
	}

	// 足し算
	public static int add(int a, int b) {
		return a + b;
	}

	// 引き算
	public static int sub(int a, int b) {
		return a - b;
	}

	// 掛け算
	public static int mul(int a, int b) {
		return a * b;
	}

	// 割り算（0対策あり）
	public static Integer div(int a, int b) {
		if (b == 0) {
			System.out.println("エラー：0では割れません");
			return null;
		}
		return a / b;
	}
}