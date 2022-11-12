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
			
		*/
		System.out.println("-----------&&-----------");
		//要表示 10<x<30，则需要用 与 来表达
		int x=16;
		System.out.println("10<x<30:"+(10<x && x<30));//true
		
		System.out.println("-----------||-----------");
		//要表示 10<x 或 x>30 满足一个即可，则需要用 或 来表达
		System.out.println("10<x<30:"+(10<x || x>30));//true
		
		System.out.println("-----------!-----------");
		//要将逻辑返回值取反，则需要用 非 来表达
		System.out.println("10<x<30:"+!(10<x || x<30));//false
		
		System.out.println("-----------^-----------");
		//异或 ^，不同为1（true）相同为0（false）
		System.out.println("1^0:"+(1^0));//true
		
		//同或即是异或+非，也就是对异或取反即是同或，所以不再演示。
	
	
	System.out.println("-----------& | 和&& ||的区别-----------");
	/*
		关于& | 和&& ||的关系：
			使用单符号的逻辑运算符时&，比如0（flase）&1（true）：
				如果&左边已经为false，那么在与中，结果必然是false，
				但是它执行完左边，仍然会执行右边。
			使用双符号的短路逻辑运算符&&，比如0（flase）&&1（true）
				如果&&左边已经为false，那么在与中，结果必然是false，
				它执行完左边已经知道了结果，所以不会再运行右边。
			| 和 ||的关系同理。
	*/
	int a=10,b=20;
	System.out.println("a++>100 & b++>100 :"+(a++>100 & b++>100));
	System.out.println("a="+a); //11
	System.out.println("b="+b); //21
	System.out.println("");
	a=10;b=20; //初始化
	System.out.println("a++>100 && b++>100 :"+(a++>100 && b++>100));
	System.out.println("a="+a); //11
	System.out.println("b="+b); /*
									b=20 这是因为左边a++>100已经为false，
									所以在&&中，右边的b++>100不会运行
								*/
	}
}
