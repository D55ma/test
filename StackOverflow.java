// Java Program to Illustrate Error
// Stack overflow error via infinite recursion

// Class 1
class StackOverflow {

	// method of this class
	public static void test(int i)
	{
		// No correct as base condition leads to
		// non-stop recursion.
		if (i == 5)
			i=i/0;
		else {
			test(i++);
		}
	}
}

// Class 2
// Main class
public class GFG {

	// Main driver method
	public static void main(String[] args)
	{
	StackOverflow s1=new StackOverflow();
		s1.test(5);
	}
}
