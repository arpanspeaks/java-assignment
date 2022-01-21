package week_1.assignment_2;

public class Rectangle {
	private double length;
	private double bredth;

	public Rectangle() {
	}

	public Rectangle(double length, double bredth) {
		this.length = length;
		this.bredth = bredth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public double getBredth() {
		return bredth;
	}

	public void setBredth(double bredth) {
		this.bredth = bredth;
	}

	public double getAreaOfRectangle() {
		return length * bredth;
	}

	private double getPerimeterOfRectangle() {
		return 2 * (length + bredth);
	}

	private double getDiagonalOfRectangle() {
		return Math.sqrt(length * length + bredth * bredth);
	}

	public void getInfoOfRectangle() {
		System.out.println(
			String.format("Length: %.2f \nBredth: %.2f \nArea: %.2f \nPerimeter: %.2f \nDiagonal: %.2f",
			length, bredth, getAreaOfRectangle(), getPerimeterOfRectangle(), getDiagonalOfRectangle())
		);
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", bredth=" + bredth + "]";
	}

}
