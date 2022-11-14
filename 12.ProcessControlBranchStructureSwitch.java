
import java.util.Scanner;
public class ProcessControlBranchStructureSwitch{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		/*
			使用switch实现对一年四个季度的定位。
		*/
		int x;
		System.out.println("请输入月份：");
		x=input.nextInt();
		switch(x)
		{
			case 1:
			case 2:
			case 3:
			System.out.println("第一季度");break;
			case 4:
			case 5:
			case 6:
			System.out.println("第二季度");break;
			case 7:
			case 8:
			case 9:
			System.out.println("第三季度");break;
			case 10:
			case 11:
			case 12:
			System.out.println("第四季度");break;
			default:
			System.out.println("input error");break;
		}
		
	}
	
}