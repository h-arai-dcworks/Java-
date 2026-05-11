package jp.dcworks.original2_5;

public class Original2_5 {
	public static void main(String[] args) {
		Point p1 = new Point(2, 5);
		Point p2 = new Point(3, 6);
		
		System.out.println(p1.distance(p2));
	}

}

//座標を表すクラス
class Point {
	int x, y;

	//コンストラクタ
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//2点の距離を計算するクラス
	public double distance(Point other) {
		return Math.sqrt((this.x - other.x) * (this.x - other.x)
				+ (this.y - other.y) * (this.y - other.y));
	}

}