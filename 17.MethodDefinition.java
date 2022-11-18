import java.util.Scanner;
public class MethodDefinition{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int maxResult;
		System.out.println("请输入a_Input的值：");
		int a_Input=input.nextInt();
		System.out.println("请输入b_Input的值：");
		int b_Input=input.nextInt();
		maxResult=GetMax(a_Input,b_Input);
		if(maxResult==-1) System.out.println("它们相等，值为："+a_Input+"\t"+IsNumber(a_Input));
		else System.out.println("最大值是："+maxResult+"\t"+IsNumber(a_Input));
	}
	
	
	public static int GetMax(int a,int b){ /*
												返回值如果是整数，那就在static后面写上int而不是void
												该GetMax方法是判断两个数的最大数并返回
										   */
		if(a>b) return a;
		else if(a<b) return b;
		else return -1;
	}
	
	
	public static String IsNumber(int number){/*
												该IsNumber方法是判断一个数是奇数还是偶数
												并将结果返回。
											  */
		if(number%2==0) return "该数为偶数";
		else return "该数为奇数";
	}
}