package jp.dcworks.original4_1;
// Lionクラス（Animalを継承）

class Lion extends Animal {

	// コンストラクタ
	Lion(String name) {
		super(name);
	}

	@Override
	public void sound() {
		System.out.println(name + ":" + "ガオー");
	}

}