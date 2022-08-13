class CommandLineAurguments
{
    public static void main(String[] args)
    {
        for(int i=0;i< args.length;i++)
        {
            System.out.println(args[i]);
        }
    }
}

// Execute this program as java CommandLineAurguments 10 20 30 Shivam 

/*
The command line argument is the argument that passed to a program during runtime. It is the way to pass argument to the main method in Java. These arguments store into the String type args parameter which is main method parameter.

To access these arguments, you can simply traverse the args parameter in the loop or use direct index value because args is an array of type String.
*/