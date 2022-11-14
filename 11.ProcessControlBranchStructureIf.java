/*
	分支结构：if、switch
	在编程语言里，= 代表赋值，== 才代表相等
*/
import java.util.Scanner;
public class ProcessControlBranchStructureIf{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		/*
			if例子：设有a b两变量，要求输入a b的值，
			并将它们的大小进行对比，并输出a>b、a=b、a<b
		*/
		int a,b;
		System.out.println("---------------if_1---------------");
		System.out.println("a:");
		a=input.nextInt();
		System.out.println("a:");
		b=input.nextInt();
		
		if(a==b)
		{
			System.out.println("a=b");
		}
		else if(a>b)
		{
			System.out.println("a>b");
		}
		else
		{
			System.out.println("a<b");
		}
		
		
		/*
			if例子2：输入一个数赋给变量，要求判断此变量的数为奇数还是偶数
			并输出结果
		*/
		System.out.println("---------------if_2---------------");
		int x;
		System.out.println("x:");
		x=input.nextInt();
		if(x%2==1) System.out.println("x="+x+"\t它是奇数");
		else if(x%2==0) System.out.println("x="+x+"\t它是偶数");/*其实这里只用else就可以了
																 为了方便理解，写一下if*/
	
	
	/*
		if例子3：设置一个变量，要求输入1 2 3 4 5 6 7的任意一个数，
		然后根据输入的数值，判断输出对应的周一，周二，周三······周日
	*/
	System.out.println("---------------if_3---------------");
	int week;
	System.out.println("week:");
	week=input.nextInt();
	if(week==1) System.out.println("week="+week+"\t周一");
	else if(week==2) System.out.println("week="+week+"\t周二");
	else if(week==3) System.out.println("week="+week+"\t周三");
	else if(week==4) System.out.println("week="+week+"\t周四");
	else if(week==5) System.out.println("week="+week+"\t周五");
	else if(week==6) System.out.println("week="+week+"\t周六");
	else if(week==7) System.out.println("week="+week+"\t周日");
	else System.out.println("input errro");
	
	
	/*
		if例子4：设置一个变量，要求输入0-100的任意一个分数，范围0-100
		90以上为优秀，80-90为良，70-79为中，60-69为及格，60以下为不及格
	*/
	System.out.println("---------------if_4---------------");
	float fraction;
	System.out.println("fraction:");
	fraction=input.nextFloat();
	
	if(fraction>100 || fraction <0) System.out.println("input error");/*
																		先进行输入判断，如果输入错误直接输出，这样和例子3相比可以优化效率
																		另外，如果分数高的多，可以从高到低判断，如果低的多可以从低到高判断
																		也有助提高计算机判断效率
																	  */
	else if(fraction>=90) System.out.println("fraction="+fraction+"\t优秀");
	else if(fraction>=80) System.out.println("fraction="+fraction+"\t良");//（由于上面if已经判断大于等于90的是优秀了，所以这里不用&&，只需要>=80就足够了）
	else if(fraction>=70) System.out.println("fraction="+fraction+"\t中");
	else if(fraction>=60) System.out.println("fraction="+fraction+"\t及格");
	else if(fraction<60) System.out.println("fraction="+fraction+"\t不及格");
	}
	
}