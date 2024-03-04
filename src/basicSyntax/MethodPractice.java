package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		
		print(sumNumbers(a,b));
		print(differenceNumbers(a,b));
		print(productNumbers(a,b));
		print(quotientNumbers(a,b));
	}
	
	 public static int sumNumbers(int num1, int num2) {
	    int sum = num1 + num2;
	
	    return sum;
	}
	 
	 public static int differenceNumbers(int num1, int num2) {
	    int difference = num1 - num2;
		
		return difference;
	}
	 
	 public static int productNumbers(int num1, int num2) {
	    int product = num1 * num2;
		
		return product;
	}
	 
	 public static int quotientNumbers(int num1, int num2) {
	    int quotient = num1 / num2;
		
		return quotient;
	}
	 
	public static void print(int num) {
		System.out.println("計算結果は" + num + "です。");
	}

}
