public class WhileLoop{
	public static void main(String[] args){
		/*
			已知珠穆朗玛峰高8844.43米，
			如果有一张纸，厚度有0.1毫米，
			假设可以无限折叠，那么折叠多少次后，
			才可以到达珠穆朗玛峰的高度？
		*/
		int sum=1,count=0;
		while(true) /*
						直接设置死循环，在下面设置如果判断跳出
						前提是要有跳出循环的把握，否则会瞬间占用大量资源。
		
					*/
		{
			sum=sum*2;
			count++;
			System.out.println(sum);
			if(sum>=88444300) break;
		}
		System.out.println("折叠了："+count+"次");
	
	
		/*
			do while和while的区别在于
			do while不管是否达到运行条件，都至少运行一次。
		*/
		int i=5;
		do
		{
			System.out.println("i="+i);
			
		}
		while(i<5);
	}
}