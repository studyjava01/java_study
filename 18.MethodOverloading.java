/*
	方法重载：要满足以下条件
	1.多个方法在一个类中
	2.多个方法具有相同方法名
	3.多个方法的参数类型不相同 或 类型不同 或 数量不同
	注意：
	1.重载只对应方法的定义，与方法的调用无关。
	2.重载与返回值类型无关，简单说就是不能通过返回值判断多个方法是否相互重载。
*/
public class MethodOverloading{
	public static void main(String[] args){
		int a;
		a=Sum(1,1);
		a=(int)Sum(3.21,6.66);
		a=Sum(333,666,999);
		System.out.println(a);
	}
	
	public static int Sum(int a,int b){//该Sum方法是求两个整数的和，并返回
		return a+b;
	}
	
	public static double Sum(double a,double b){//该Sum方法是求两个双精度浮点数的和，并返回
		return a+b;
	}
	
	public static int Sum(int a,int b,int c){//该Sum方法是求三个整数的和，并返回
		return a+b+c;
	}
}