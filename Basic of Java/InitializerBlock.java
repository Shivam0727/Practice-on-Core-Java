class InitializerBlock

	// In Java, the initializer Block is used to initialize instance data members. The initializer block is executed whenever an object is created. The Initializer block is copied into Java compiler and then to every constructor. The initialization block is executed before the code in the constructor.

	{
		{
			System.out.println("Welcome to Core java Learning ...");
			System.out.println("This is Initializer Block ...");
		}
		public InitializerBlock()
		{
			System.out.println("Default Constructor invoked ...");
		}
		public static void main(String[] args)
		{
			InitializerBlock obj = new InitializerBlock();
			System.out.println("This is main() method ...");
		}
	}
