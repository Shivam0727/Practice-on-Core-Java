class TypeCasting
	{
		// Widening(Automatic/Implicit) -> byte->short->int->long->float->double
		// Narrowing(Manual/Explicit)-> double->float->long->int->short->byte
		
		public static void main(String[] args)
			{
				// Implicit
				int i = 200 ;
				long l = i ;
				float f = i ;
				char CH = 'A';
				int x = CH;
				System.out.println("Int value of i : "+i);
				System.out.println("Long value of i=200  : "+l);
				System.out.println("Float value of i=200 : "+f);
				System.out.println("Int value of CH='A' : "+x);

				// Explicit
				double D = 100.04;
				long L = (long)D;
				int I = (int)D;
				int y = 97;
				char ch = (char)y;
				System.out.println("Double value of D : "+D);
				System.out.println("Long Value of D=100.04 : "+L);
				System.out.println("Int value of D=100.04 : "+I);
				System.out.println("Char value of y=97 : "+ch);
			}	
	}