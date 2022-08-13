class Break_Continue
{
	public static void main(String[] args)
		{
			System.out.println("Break Concept : ");
			int n = 6;
			for(int i = 1 ; i <= 10 ; i++)
				{
					if(i==n)
					{
						break;
					}
					System.out.println(n*i);
				}
			
			System.out.println("Continue Concept : ");
			for(int j = 1 ; j <= 10 ; j++)
				{
					if(j==n)
					{
						continue;
					}
					System.out.println(n*j);
				}
		}
}