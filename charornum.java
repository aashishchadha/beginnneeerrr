class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the component");
		char n = s.next().charAt(0);
		if(n>='a' && n<='z' || n>='A' && n<'Z')
		{
				System.out.println("it is an alphabet");
		}
		else
		{
				System.out.println("it is number");
		}
		}
		}
		
	
