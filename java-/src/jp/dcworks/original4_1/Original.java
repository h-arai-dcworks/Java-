package jp.dcworks.original4_1;

// 動作確認用メインクラス
public class Original {
	public static void main(String[] args) {

		// 各動物のインスタンスを作成
		Animal[] animals = {
				new Dog("dog"),
				new Cat("cat"),
				new Lion("lion")
		};
		for (Animal animal : animals) {
			animal.sound();
		}

	}

}
