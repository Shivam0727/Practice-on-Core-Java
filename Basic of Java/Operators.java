class Operators
{
public static void main(String [] args)
    {
	System.out.println("Arithmatic-Operation");
        int a, b, c;
        a=10;
        b=2;
        c=a+b;
        System.out.println("Addtion: "+c);
        c=a-b;
        System.out.println("Substraction: "+c);
        c=a*b;
        System.out.println("Multiplication: "+c);
        c=a/b;
        System.out.println("Division: "+c);
        b=3;
        c=a%b;
        System.out.println("Remainder: "+c);

	
	System.out.println("Increment-Decrement Operation");
        a=++a;
        System.out.println("Pre-Increment Operator: "+a);
        a=--a;
        System.out.println("Pre-decrement Operator: "+a); 
 	a=a++;
        System.out.println("Post-Increment Operator: "+a);
        a=a--;
        System.out.println("Post-decrement Operator: "+a);


	System.out.println("Relational-Operation");
	int x=40;
        int y=30;
        System.out.println("x == y = " + (x == y) );
        System.out.println("x != y = " + (x != y) );
        System.out.println("x > y = " + (x > y) );
        System.out.println("x < y = " + (c < y) );
        System.out.println("y >= x = " + (y >= x) );
        System.out.println("y <= x = " + (y <= x) ); 


	System.out.println("Logical-Operation");
	boolean p = true;
        boolean q = false;
        System.out.println("p && q = " + (p&&q));
        System.out.println("p || q = " + (p||q) );
	System.out.println("!(p && q) = " + !(p && q));  


	System.out.println("Bitwise-Operation");   
	int l = 50; 
        int m = 25; 
        int n = 0;
        n = l & m;        
        System.out.println("l & m = " + n );
        n = l | m;        
        System.out.println("l | m = " + n );
        n = l ^ m;        
        System.out.println("l ^ m = " + n );
        n = ~l;           
        System.out.println("~l = " + n );
        n = l << 2;      
        System.out.println("l << 2 = " + n );
        n = l >> 2;       
        System.out.println("l >>2  = " + n );
        n = l >>> 2;     
        System.out.println("l >>> 2 = " + n ); 


	System.out.println("Assignment-Operation");
    	int r = 30;
   	int s = 10;
   	int t = 0;
      	t = r + s;
	System.out.println("t = r + s = " + t );
	t += r ;
	System.out.println("t += r  = " + t );
      	t -= r ;
	System.out.println("t -= r = " + t );
      	t *= r ;
	System.out.println("t *= r = " + t );


	System.out.println("Assignment-Operation");
      	r = 20;
      	t = 25;
      	t /= r ;
	System.out.println("t /= r = " + t );
      	r = 20;
      	t = 25;
      	t %= r ;
	System.out.println("t %= r  = " + t );
      	t <<= 2 ;
	System.out.println("t <<= 2 = " + t );
      	t >>= 2 ;
	System.out.println("t >>= 2 = " + t );
      	t >>= 2 ;
	System.out.println("t >>= 2 = " + t );
      	t &= r ;
	System.out.println("t &= r  = " + t );
      	t ^= r ;
	System.out.println("t ^= r   = " + t );
      	t |= r ;
	System.out.println("t |= r   = " + t );  


	System.out.println("Miscelleneous-Operation");
      	int i , j;
      	i = 20;
      	j = (i == 1) ? 30: 40;
	System.out.println( "Value of j is : " +  j );
      	j = (i == 20) ? 30: 40;
	System.out.println( "Value of j is : " + j ); 

 
	System.out.println("Instanceof-Operation");
	String U = "Studytonight";
	boolean ch = U instanceof String;
	System.out.println( ch );

    }
}
    