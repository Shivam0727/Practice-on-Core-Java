class CopyArray
{
	public static void main(String [] args)
	{
		char [] copyFrom = {'J','A','V','A',' ','I','S',' ','F','U','N'};
		char [] copyTo = new char[10];
		copyTo[0]='E';
		copyTo[1]='N';
		copyTo[2]='J';
		copyTo[3]='O';
		copyTo[4]='Y';
		copyTo[5]=' ';
		System.arraycopy(copyFrom,8,copyTo,6,3);
		System.out.println(copyTo);
	}
}