package lab71.pkg;

public class ArrayOperation {
	public int getSorted(int arr)
	{
		int x;
		int a=0;
		
		while(arr>0)
		{
			x=arr%10;
			a=a*10+x;
			arr=arr/10;
		}
		return a;
	}
	public void display(int[] arr)
	{
		int l=arr.length;
		for(int i=0;i<l;i++)
			System.out.println(arr[i]+ " ");
	}

}
