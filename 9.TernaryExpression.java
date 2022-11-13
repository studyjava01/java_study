public class TernaryExpression{
	public static void main(String[] args){
		/*
			三元表达式格式：
				关系表达式 ? 表达式1 : 表达式2
				如果关系表达式为真，则运行表达式1
				如果关系表达式为假，则运行表达式2
		*/
		int a=1,b=2,c;
		c=a>b?a:b;
		System.out.println("c="+c); //c=2
	
	System.out.println("----------例子1----------");
	/*
		例子1:两个物品，其中一个物品重120g，另一个物品重200g
		判断两个物品重量是否相等。
	*/
	int x=120,y=200;
	String z;
	z=x==y?"是的":"不是";
	System.out.println("是否一样重："+z);
	
	System.out.println("----------例子2----------");
	/*
		例子2：三人身高分别为180，185，190
		将他们身高进行对比，然后获取最高的身高是多少。
	*/
	int oneHeight=180,twoHeight=185,threeHeight=190;
	int highest_Height_Part_One,highest_Height_Part_Two;
	
	/*
		三元运算符嵌套是需要添加括号的
		由于三元运算符我不常用，这边卡了一下。
		思路是，先设置一个第一部分的变量，
		将三个身高的其中两个(oneHeight和twoHeight)先进行对比，
		得出他们两个的最高值，再用这个最高值去和第三个进行对比。
	*/
	
	highest_Height_Part_One=oneHeight>twoHeight?oneHeight:(highest_Height_Part_One=oneHeight==twoHeight?oneHeight:twoHeight);
	highest_Height_Part_Two=highest_Height_Part_One>threeHeight?highest_Height_Part_One:(highest_Height_Part_Two=highest_Height_Part_One==threeHeight?highest_Height_Part_One:threeHeight);
	System.out.println("最高身高："+highest_Height_Part_Two);
	
	/*
		上面有点乱，简单记录下，
		如果oneHeight>twoHeight，那么highest_Height_Part_One=oneHeight
		否则 嵌套新的如果，
			如果oneHeight==twoHeight，那么highest_Height_Part_One=oneHeight
			否则highest_Height_Part_One=twoHeight，因为只剩下twoHeight>oneHeight的可能性
		如果highest_Height_Part_One>threeHeight，那么highest_Height_Part_Two=highest_Height_Part_One
		否则 嵌套新的如果，
			如果highest_Height_Part_One==threeHeight，那么highest_Height_Part_Two=highest_Height_Part_One
			否则 highest_Height_Part_Two=threeHeight，因为只剩下threeHeight>highest_Height_Part_One的可能性
		
		最后将结果 highest_Height_Part_Two 输出即可。
	*/
	
	}
}