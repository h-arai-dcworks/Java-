package jp.dcworks.original4_1;

// Dogクラス（Animalを継承）
class Dog extends Animal {

	// コンストラクタ
	Dog(String name) {
		super(name);
	}

	@Override
	public void sound() {
		System.out.println(name + ":" + "ワンワン");
	}
}
