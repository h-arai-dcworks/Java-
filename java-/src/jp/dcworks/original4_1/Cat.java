package jp.dcworks.original4_1;
// Catクラス（Animalを継承）

class Cat extends Animal {

	// コンストラクタ
	Cat(String name) {
		super(name);
	}

	@Override
	public void sound() {
		System.out.println(name + ":" + "ニャーニャー");
	}
}