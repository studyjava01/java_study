public class OperatorPartII{
	public static void main(String[] args){
		System.out.println("\n-----------------1----------------");
		int a=10,b=a--;//10
		/*
			b=a--,就是先将a的值赋给b（b=a=10），然后再执行a=a-1（a=10-1=9）
			所以b=10，a=9
		*/
		System.out.println("b="+b+"\na="+a);
		
		//-------------------------------------------------
		System.out.println("\n-----------------2-----------------");
		int x=10,y=--x;
		/*
			和第一个例子正好相反，
			y=--x，就是先执行x=x-1（x=10-1=9），再将x的值赋给y（y=x=9）
		*/
		System.out.println("y="+y+"\nx="+x);
	}
}