class CopyDemo
{
	public static void main(String [] args)
	{
		char [] copyFrom = {'j','a','v','a',' ','i','s',' ','f','u','n'};
		char [] copyTo = new char[3];
		System.arraycopy(copyFrom,8,copyTo,0,3);
		System.out.println(copyTo);
	}
}