package jp.dcworks.original2_4;

class Original2_4div {
	private int num1;
	private int num2;

	Original2_4div(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public Integer div() {
		if (num2 == 0) {
			System.out.println("エラー：0では割れません");
			return null;
		}
		return this.num1 / this.num2;
	}

}
