/*
In Java, exit() method is in the java.lang.System class. This method is used to take an exit or terminating from a running program. It can take either zero or non-zero value. exit(0) is used for successful termination and exit(1) or exit(-1) is used for unsuccessful termination. The exit() method does not return any value.
*/
import java.util.*; 
import java.lang.*; 

class System_Exit
{ 
    public static void main(String[] args) 
    { 
        int x [] = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50}; 

        for (int i = 0; i <= x.length; i++) 
        { 
            if (x[i] > 40) 
            { 
                System.out.println("Program is Terminated..."); 
                System.exit(0); 
            } 
            else
                System.out.println("x["+i+"] = " + x[i]); 
        } 
    } 
}
	