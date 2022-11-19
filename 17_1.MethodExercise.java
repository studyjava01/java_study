//练习：用方法实现将数组的所有元素都打印为 [33,22,66,11,32,65,95,31] 形式并输出
public class MethodExercise{
	public static void main(String[] args){
		int arr[]={33,22,66,11,32,65,95,31};
		ArrayTraversalPrint(arr);
	}
	public static void ArrayTraversalPrint(int array[]){
		for(int i=0;i<array.length;i++){
			if(i==0) System.out.print("[");
			System.out.print(array[i]);
			if(i==array.length-1) System.out.print("]");
			else System.out.print(",");
		}
	}
}