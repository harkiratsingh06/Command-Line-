class test
{
	public static void main(String[] a)
	{
		int b;
		int s=0;
		for(int i=0;i<a.length;i++)
		{
			b=Integer.parseInt(a[i]);
			s=s+b;
		}
		System.out.println("Sum is "+s);
		
	}
}