import java.util.Scanner;
public class Array{
	public static void main(String[] args){
		/*
			数组声明
			1.动态：数据类型[] 变量名=new 数据类型[数组长度];
			2.静态：数据类型[] 变量名={元素0的内容,元素1的内容······};
			
			数组变量名.length 获取数组的长度
		*/
		//例子1：实现对数组的遍历输入，然后再遍历输出
		Scanner input=new Scanner(System.in);
		//int a;
		System.out.println("--------------array1--------------");
		int arr[]=new int[3];
		//遍历输入
		for(int i=0;i<arr.length;i++){
			System.out.println("请输入第"+i+"个元素的值：");
			arr[i]=input.nextInt();
		}
		System.out.println("--------遍历输出--------");
		//遍历输出
		for(int i=0;i<arr.length;i++){
			System.out.println("第"+i+"个元素的值："+arr[i]);
		}
		
		//例子2：输入八个人的身高，判断谁最高，谁最矮
		System.out.println("--------------array2--------------");
		int[] height=new int[8];
		int highest=height[0],shortest=666;
		for(int i=0;i<height.length;i++){
			System.out.println("请输入第"+(i+1)+"个人的身高：");
			height[i]=input.nextInt();
		}
		
		for(int i=0;i<height.length;i++){
			//System.out.println(height[i]);
			if(height[i]>highest) highest=height[i];
			if(height[i]<shortest) shortest=height[i];
		}
		System.out.println("最高："+highest+"最矮："+shortest);
	}
}