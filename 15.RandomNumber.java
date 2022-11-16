import java.util.Random;
import java.util.Scanner;
public class RandomNumber{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		Random rN=new Random();
		int a=rN.nextInt(100)+1,b;//从0到99 +1 则等于从1到100
		for(;;)
		{
			System.out.println("请输入一个数：");
			b=input.nextInt();
			if(b<a) System.out.println("猜小了");
			else if(b>a)System.out.println("猜大了");
			else {System.out.println("猜对了");break;}
		}
	}
}