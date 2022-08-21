package LambdaExpressions;

public class LambdaExpressions {

	public static void main(String[] args) {

		// () -> {};

		Shape square = () -> System.out.println("square is drawn");
		square.draw();
		Shape rectangle = () -> System.out.println("rectangle is drawn");
		rectangle.draw();

	}

	public static void display(Shape s) {
		s.draw();
	}

}

interface Shape {
	public void draw();
}
