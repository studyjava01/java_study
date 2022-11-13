/*
	使用java的输入函数方法：
	1.导入包 import java.util.Scanner;
	2.创建对象 Scanner 对象名 = new Scanner(System.in);
	3.接收数据 以整数型为例，int 变量名 = 对象名.nextInt();
*/

import java.util.Scanner;
public class ScannerInput{
	public static void main(String[] args){
		Scanner intInput=new Scanner(System.in);
		System.out.println("请输入整数：");
		int intText=intInput.nextInt();
		System.out.println("输入的整数为："+intText);
	
	System.out.println("---------例子1---------");
	/*
		例子：输入两个数并求和
	*/
	int a,b;
	System.out.println("a:");
	a=intInput.nextInt();
	System.out.println("b:");
	b=intInput.nextInt();
	System.out.println("a+b="+(a+b));
	}
}
