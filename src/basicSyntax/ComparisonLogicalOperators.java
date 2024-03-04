package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		boolean isGreater = (a > b);
		System.out.println(isGreater);
		
		boolean isSunny = true;
		boolean isWarm = true;
		boolean andResultA = (isSunny && isWarm);
		System.out.println(andResultA);
		
		int x = 5;
		int y = 10;
		boolean andResultB = (x >= 0 && y % 2 == 0);
		System.out.println(andResultB);
		
		boolean hasPermission = false;
		boolean notResult = !hasPermission;
		System.out.println(notResult);
		

	}

}
