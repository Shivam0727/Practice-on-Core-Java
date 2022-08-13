class StaticBlock
	{
		// Static keyword is used for memory management ...
		// Static block executes before the main method while executing program. Statements written inside the static block will execute first. However both are static.

		static
			{
				System.out.println("Hello , I am present in static block-1 and executed before main method ...");
			}
		public static void main(String [] args)
			{
				System.out.println("I am present in Main method and executed after static block ...");
			}
		static
			{
				System.out.println("This is static block 2 which executed after first static block but before main method ...");
			}
	}
		