class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s = new Scanner(System.in);
	System.out.println("enter the letter you want to check");
	char n = s.next().charAt(0);
	switch(n)
	{
		case 'a':
			System.out.println("letter is a vowel");
		case 'e':
		System.out.println("letter is a vowel");
		break;
		case 'i':
		System.out.println("letter is vowel");
		break;
		case 'o':
		System.out.println("letter is a vowel");
		break;
		case 'u':
		System.out.println("letter is a vowel");
		break;
		default:
		System.out.println("is consonant");
	}
	
	}
}