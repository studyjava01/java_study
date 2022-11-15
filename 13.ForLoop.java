public class ForLoop{
	public static void main(String[] args){
		/*
			使用for循环输出1-5，然后再实现输出5-1
		*/
		System.out.println("-----------for1-----------");
		int i;
		for(i=0;i<5;i++) System.out.println(i+1);
		System.out.println("");
		for(i=5;i>0;i--) System.out.println(i);
		
		
		System.out.println("-----------for2-----------");
		/*
			使用for循环，求1-5的累加总和
			1 2 3 4 5 求累加总和
			（1+2=3 3+3=6 6+4=10 10+5=15）
		*/
		int sum=0,accumulation;
		for (i=1;i<=5;i++) 
		{
			System.out.println(sum+"+"+i+"="+(sum=sum+i));
		}
		
		
		System.out.println("-----------for2-----------");
		/*
			求1-100之间的偶数累加和
		*/
		sum=0;
		for(i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+"+"+sum+"="+(sum=sum+i));
			}
		}
		
		
		System.out.println("-----------for3-----------");
		/*
			使用for循环实现输出所有的水仙花数
		*/
		int bits,ten,hundred;
		sum=0;
		for (i=100;i<=999;i++)
		{
			/*
			百位=i/100取整（int类型保留整数），
			十位=(i-百位乘100)/10即可
			个位=i%10
			*/
			hundred=i/100;
			ten=(i-hundred*100)/10;
			bits=i%10;
			//System.out.println(hundred+" "+ten+" "+bits);
			if(hundred*hundred*hundred+ten*ten*ten+bits*bits*bits==i) 
			{
				System.out.println("子仙花数："+i);
				sum=sum+1;
			}
		}
		System.out.println("水仙花数总数："+sum+"个");
	}
}