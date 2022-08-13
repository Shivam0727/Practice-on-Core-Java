class NestedIf
	{
		public static void main(String[] args)
		{
			int age = 22;
			if(age>18)
				{
					if(age>21)
						{
							System.out.println("You are eligible for marriage ...");
						}
					System.out.println("You are eligible for Vote ...");
				}
			else
				{
					System.out.println("You are student , keep studing !!!");
				}
		}
	}