package jp.dcworks.original3_1cp;

public class Originalcp {
	public static void main(String[] args) {

		//各図形のインスタンス
		Shape a = new Rectangle(3, 4);
		Shape b = new Circle(2);
		Shape c = new Triangle(3);

		//各図形の面積と週の長さを出力
		System.out.println(a.area() + " " + a.perimeter());
		System.out.println(b.area() + " " + b.perimeter());
		System.out.println(c.area() + " " + c.perimeter());

	}

}

