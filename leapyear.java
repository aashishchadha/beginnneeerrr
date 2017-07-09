class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number");
	int number = s.nextInt();
	if(number % 4 == 0)
	System.out.println("leap year:" +number);
	else
	System.out.println("not a leap year:" +number);
	
	
	
	}
}