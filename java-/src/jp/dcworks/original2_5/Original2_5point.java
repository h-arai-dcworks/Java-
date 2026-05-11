package jp.dcworks.original2_5;
//座標を表すクラス
class Original2_5point{
	int x, y;

	//コンストラクタ
	Original2_5point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//2点の距離を計算するクラス
	public double distance(Point other) {
		return Math.sqrt((this.x - other.x) * (this.x - other.x)
				+ (this.y - other.y) * (this.y - other.y));
	}

}