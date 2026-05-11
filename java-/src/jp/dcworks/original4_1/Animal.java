package jp.dcworks.original4_1;

//　動物の共通の性質を表す親クラス
class Animal {
	protected String name; // 動物の名前

	// コンストラクタ
	Animal(String name) {
		this.name = name;
	}

	// 鳴き声
	public void sound() {
		System.out.println("鳴き声設定なし");
	}

}