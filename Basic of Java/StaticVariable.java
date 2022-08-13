class StaticVariable
	{ 
		static String name;
		static int age;

		public static void main(String[] args)
		{
			StaticVariable obj = new StaticVariable();
			
			obj.name = "Shivam";
			obj.age = 22;
			System.out.println("Name is "+name+" and age is "+age);
		}	
	}
	