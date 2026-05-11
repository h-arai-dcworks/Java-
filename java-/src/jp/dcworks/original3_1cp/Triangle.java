package jp.dcworks.original3_1cp;

// 三角形のクラス
class Triangle implements Shape {
	private double w;

	Triangle(double w) {
		this.w = w;
	}

	@Override
	public double area() {
		return (Math.sqrt(3) / 4) * w * w;
	}

	@Override
	public double perimeter() {
		return w * 3;
	}

}
