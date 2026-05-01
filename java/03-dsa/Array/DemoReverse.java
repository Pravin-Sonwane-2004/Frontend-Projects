class DemoReverse
{
    public static void reverse(int[] a, int start, int end)
	{
		 while(start<end)
		 {
		   int temp=a[start];
		   a[start]=a[end];
		   a[end]=temp;
		   start++;
		   end--;
		 }
	}

    static void main(String[] args)
   {
	   int [] arr = {0,3,6,9,12,14,18,20,22,25,27};
	   int k=4;
	   reverse(arr,0,k-1);
	   reverse(arr,4,arr.length-1);
	   reverse(arr,0,arr.length-1);
	   
	   for(int i=0;i<arr.length;i++)
	   {
	     System.out.print(arr[i]+" ");
	   }
   }


}