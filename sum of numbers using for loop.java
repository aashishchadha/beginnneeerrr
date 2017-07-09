class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter value");
		int sum = 0;
		int i;
		int n = s.nextInt();
		for (i=0; i<n; i++)
		{
		sum = sum + i;
		}
		System.out.println("the sum is="+sum);
	}
}