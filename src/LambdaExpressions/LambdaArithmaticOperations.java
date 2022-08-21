package LambdaExpressions;

public class LambdaArithmaticOperations {

	public static void main(String[] args) {

		AE add = (int x, int y) -> x + y;
		System.out.println(add.add(10, 20));

		AE add2 = (int x, int y) -> {
			return x + y;
		};
		System.out.println(add2.add(100, 100));

	}

}

//above interface used to do arithmatic operations
interface AE {
	public int add(int x, int y);

}
