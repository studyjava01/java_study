public class TypeConversion{
	public static void main(String[] args){
		/*
			占用字节大小比较：byte<short or char<int<long<float<double
			从小类型向大类型转换=自动类型转换
			从大类型向小类型转换=强制类型转换
		*/
		
		//小类型转换为大类型——自动类型转换
		byte b=1;
		int i=b;
		System.out.println(b);
		
		//大类型转换为小类型——强制类型转换
		double d=3.333333333;
		float f=(float) d;
		/*
			从大类型转换到小类型，通过输出对比会发现
			超出字节的数据会丢失，所以不推荐使用强制数据转换
		*/
		System.out.println("float="+f);
		System.out.println("double="+d);
	}
}