public class Bubblesort
{
	public static void main(String[] args) {
		//Bubble sort
		int[] arr={8,6,3,6,1,9,66,3,231,5};
		int n=arr.length,temp;
		for(int i=0;i<n-1;i++)
		{
		    for(int j=0;j<n-1-i;j++)
		    {
		        if(arr[j]>arr[j+1])
		        {
		            temp=arr[j];
		            arr[j]=arr[j+1];
		            arr[j+1]=temp;
		        }
		    }
		}
		for(int i=0;i<n;i++)
		System.out.print(arr[i]+" ");
	}
}
