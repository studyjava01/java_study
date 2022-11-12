public class LogicalOperator{
	public static void main(String[] args){
		/*
			与 或 非
			&& || !
			与=并且，或=或者，非=取反
			（在数字电子技术基础中，
			与=有0则0，或=有1则1，非=取反，
			可以把0当作false，把1当作true 来理解
			又或者，可以把 与 或 非 看作是 乘运算、加运算、相反数）
			
			在编程语言中，假设有一个变量为x
			要表示 10<x<30，则需要用 与 来表达
		*/
		System.out.println("-----------&&-----------");
		int x=16;
		System.out.println("10<x<30:"+(10<x && x<30));//true
		
		System.out.println("-----------||-----------");
		System.out.println("10<x<30:"+(10<x || x<30));//true
		
		System.out.println("-----------!-----------");
		System.out.println("10<x<30:"+!(10<x || x<30));//false
	}
}