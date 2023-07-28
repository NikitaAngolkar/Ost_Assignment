import java.io.*;
public class JavaTester
{
	public int counter=0;
	public static int staticcounter=0;
	
	public JavaTester()
	{
		counter++;
		staticcounter++;
	}
	
	public static void main(String args[])
	{
		JavaTester tester = new JavaTester();
		JavaTester tester1 = new JavaTester();
		JavaTester tester2 = new JavaTester();
		System.out.println("Counter:"+tester2.counter);	
		System.out.println("Static Counter:"+tester2.staticcounter);
	}
}
