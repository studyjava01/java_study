/*
	练习：使用方法实现
	获取输入的六个数字中的最大数，并返回到主方法输出
*/
import java.util.Scanner;
public class MethodExercise{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int arr[]=new int[6];
		for(int i=0;i<arr.length;i++){
			System.out.print("请输入第"+i+"个元素的值：");
			arr[i]=input.nextInt();
		}
		System.out.println("该数组元素中最大的值："+GetIntArrayMaxValue(arr));
	}
	public static int GetIntArrayMaxValue(int array[]){
		int intArrayMaxValue=0;
		for(int i=0;i<array.length-1;i++){
			if(array[i]<array[i+1]) intArrayMaxValue=array[i+1];
			else intArrayMaxValue=array[i];
		}
		return intArrayMaxValue;
	}
}