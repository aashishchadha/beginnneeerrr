class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int x,y,z;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number");
	
	x = s.nextInt();
	y = s.nextInt();
	z = s.nextInt();
	
	if(x > y && x > z)
	System.out.println("first is greater"+x);
	else if(y > x && y > z)
	System.out.println("sec is greater"+y);
	else 
	System.out.println("third is greater"+z);

	
	}
}