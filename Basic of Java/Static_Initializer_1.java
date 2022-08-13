public class Static_Initializer_1 extends Static_Initializer_2
{
    	static 
		{
			System.out.println("inside Child static block");
        	}

	Static_Initializer_1() 
		{
			System.out.println("inside constructor of child");
	        }

	        {
			System.out.println("inside child initialization block");
	        }

	    public static void main(String[] args) 
		{
        		new Static_Initializer_1();
        		
			System.out.println("inside main");
	        }
}

class Static_Initializer_2
{
	    static 
		{
			System.out.println("inside parent Static block");
	        }
	    
	        {
			System.out.println("inside parent initialisation block");
	        }

		   Static_Initializer_2()
			 {
				System.out.println("inside parent constructor");
		         }
}
	