class InstanceVariable
	{ 
		String name;
		int age;
		

		public static void main(String[] args)
		{
			InstanceVariable o1 = new InstanceVariable();
			InstanceVariable o2 = new InstanceVariable();
			o1.name = "Shivam";
			o2.age = 22;
			System.out.println("Name is "+o1.name+" and age is "+o2.age);
		}	
	}
	