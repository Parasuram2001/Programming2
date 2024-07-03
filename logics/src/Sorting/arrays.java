package Sorting;
import java.util.Arrays;
public class arrays {
	public void print(int[] a)
	{
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrays a1=new arrays();
		//int[] arr= {1,1,0,1,0,1,1,0,1};
		//int[] arr= {1,2,0,1,1,0,3,0,4};
		//int[] arr= {0,0,0,1,1,1,1,1,1};
		int[] arr= {0,0,0,0,1,1,1,2,3,4};
		a1.print(arr);
		
		

	}

}
