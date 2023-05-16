package operators;

public class LogicalOperator {

	public static void main(String[] args) {
		System.out.println((5>3) & (5>1));
		System.out.println((30>50) & (2<3));
		
		System.out.println((5 < 3) || (8 > 5));
		System.out.println(5> 3);
		System.out.println((5 < 3) || (8< 5));
		
		System.out.println(!(5==3));
		System.out.println(!(5 > 3));

	}

}
