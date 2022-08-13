class Main
	{
		int id1 = 35;
		static int id2 = 35;
		void change()
			{
				System.out.println("id1 using Instance variable is : "+id1+" and id2 using static keyword is "+id2);
			}
		
	}
public class StaticChange
		{
			public static void main(String[] args)
				{
					Main o1 = new Main(); // Main obj; obj.change();
					Main o2 = new Main();
					o1.change();
					//Main.id1 = 35; --> as instance variable is make only one copy of object so if create another object to access that instance variable so it is not possible ... it throw an error
					Main.id2 = 40; // as all object can access same static variable so it is possible
					o2.change();
				}
		}