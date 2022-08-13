class ArrayUpdate
{
	public static void main(String[] args)
	{
		System.out.println("Array Before Update : ");
		int[] arr = {10,20,30,40,50,60,70}; 
        	for(int i=0;i<arr.length;i++)
        	{
                	System.out.print(arr[i]+" ");
        	}
	System.out.println("");
	System.out.println("Array After Update : ");
	arr[2]=0;
	arr[4]=0;
		for(int i=0;i<arr.length;i++)
        	{
                	System.out.print(arr[i]+" ");
        	}
        
	}
}
	