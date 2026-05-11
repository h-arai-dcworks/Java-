package jp.dcworks.original2_4;

// 計算クラスの動作確認を行うためのメインクラス
public class Original2_4 {
	public static void main(String[] args) {

		Original2_4add add = new Original2_4add(6, 2);
		Original2_4sub sub = new Original2_4sub(6, 2);
		Original2_4mul mul = new Original2_4mul(6, 2);
		Original2_4div div = new Original2_4div(6, 2);

		System.out.println("足し算" + add.add());
		System.out.println("引き算" + sub.sub());
		System.out.println("掛け算" + mul.mul());
		System.out.println("割り算" + div.div());

	}

}
