public class Insertionsort {
    public static void main(String[] args) {
    int[] arr={8,6,3,6,1,9,66,3,231,5};
    int n=arr.length,temp,i,j;
    for(i=1;i<n;i++)
    {
        temp=arr[i];
        for(j=i-1;j>=0;j--)
        {
            if(arr[j]>temp)
            arr[j+1]=arr[j];
            else
            {
                arr[j+1]=temp;
                break;
            }
        }
        arr[j+1]=temp;
    }
        for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
}
