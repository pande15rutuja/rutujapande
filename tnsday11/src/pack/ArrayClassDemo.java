package pack;

import java.util.Arrays;

public class ArrayClassDemo {
	public static void main(String[] args) {
		//get the array
		int intArr[]= {69,20,12,40,35};
		System.out.println(Arrays.toString(intArr));
		for(int i=0;i<intArr.length;i++)
		{
			System.out.print(intArr[i]+" ");
		}
		System.out.println();
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		
		System.out.println(Arrays.binarySearch(intArr, 12));
		
		System.out.println(Arrays.binarySearch(intArr,2, 4,35));
		//compare
		System.out.println(Arrays.toString(intArr));
		int intArr1[]= {69,20,12,40,35};
		System.out.println(Arrays.toString(intArr1));
		if(Arrays.compare(intArr, intArr1)==0)
		{
			System.out.println("Both the arrays are same");
		}
		else
		{
			System.out.println("both thw arrays are different");
		
		}
		//copy of an array
		
		int intArr2[]=Arrays.copyOf(intArr1, 2);
		System.out.println(Arrays.toString(intArr2));
		int inArr3[]=Arrays.copyOfRange(intArr, 1, 4);
		System.out.println(Arrays.toString(inArr3));
		
		//fill method
		Arrays.fill(inArr3, 7);
		System.out.println(Arrays.toString(inArr3));
		
		
	}
	
	
}


