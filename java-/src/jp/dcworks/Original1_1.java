package jp.dcworks;

public class Original1_1 {
	public static void main(String[] args) {

		// 変数宣言と代入
		String str1 = "aaa";
		String str2 = "bbb";
		System.out.println(str1);
		System.out.println(str2);

		//変数の入れ替え
		String change = str1;
		str1 = str2;
		str2 = change;

		System.out.println(str1);
		System.out.println(str2);
	}
}
