public class OperatorPartI{
	public static void main(String[] args){
		System.out.println("\n-----------------1-----------------");
		char a='a';
		int b=30;
		int c=a+b; //字符串与数值相加时，会把字符转换为ascii码，然后和数值相加
		System.out.println("a+b="+c); //'a'的ascii码=97，97+30=127，c=127
		
		//-------------------------------------------------
		System.out.println("\n-----------------2-----------------");
		int d=1,e=1;
		System.out.println(d+e+"test");	//输出：2test
		System.out.println("test"+d+e);	//输出：test11
		System.out.println("test"+(d+e)); //输出：test2
		/*
			这个例子说明，当文本先被输出时，若文本后面要输出多个数值相加，
			则需要在数值相加的式子中添加括号，以确保优先级
		*/
		
		//-------------------------------------------------
		System.out.println("\n-----------------3-----------------");
		int i=0;
		System.out.println("i++=" + i++);//输出：0
		System.out.println("i--=" + i--);//输出：1
		System.out.println("++i=" + ++i);//输出：1
		System.out.println("--i=" + --i);//输出：0
		/*
			i初始值为0，运行输出i++时，先输出i，然后再进行i=i+1操作。0
			23行，此时i=1，运行输出i--时，先输出i，然后在进行i=i-1操作。1
			24行，此时i=0，运行输出++i时，先进行i=i+1操作，然后再输出i。1
			25行，此时i=1，运行输出--i时，先进行i=i-1操作，然后再输出i。0
		*/
		
		//-------------------------------------------------
		System.out.println("\n-----------------4-----------------");
		int x=10;
		int y=x++ + x++ + x++; 
		/*
			10+11+12=33
			这是因为x++为赋值给x（x=x），
			然后再+1（x=x+1），因此，
			第一个x++ x=10
			第二个x++ x=11
			第三个x++ x=12
			运行完三个x++相加时，才是x=13
		*/
		System.out.println("y="+y+"\nx="+x);
	}
}