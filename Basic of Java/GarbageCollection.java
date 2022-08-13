class GarbageCollection
{
	public  void finalize()
		{
			System.out.println("Object Destroyed !!!");
		}
	public static void main(String[] args)
		{
			GarbageCollection obj1 = new GarbageCollection();
			GarbageCollection obj2 = new GarbageCollection();

			obj1 = null ;
			obj2 = null ;
			System.out.println("Objects Assigned NULL ...");
			System.gc();
		}
}