package jp.dcworks.original3_1cp;

// 円のクラス
class Circle implements Shape {
	private double r;

	Circle(double r) {
		this.r = r;
	}

	@Override
	public double area() {
		return r * r * Math.PI;
	}

	@Override
	public double perimeter() {
		return 2 * r * Math.PI;
	}

}
