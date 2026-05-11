package jp.dcworks.original3_1cp;

//長方形クラス
class Rectangle implements Shape {
	double w;
	double h;

	Rectangle(double w, double h) {
		this.w = w;
		this.h = h;
	}

	@Override
	public double area() {
		return w * h;
	}

	@Override
	public double perimeter() {
		return (w + h) * 2;
	}

}
