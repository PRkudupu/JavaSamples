package Algorithms.Strings;
/*Given s = "Blog",
output ="gloB"
*/
public class ReverseString {

	
	public static String get(String s)
	{
		//convert the string into char array
		char c [] =s.toCharArray();
		int head=0,tail=s.length()-1;
		//Reverse the string
		while(head<tail)
		{
			char temp=c[head];
			c[head]=c[tail];
			c[tail]=temp;
			head++;
			tail--;
		}
	 return new String(c);
	}
	//Pointer approach
	public static String usingPointers(String s)
	{
		//convert the string into char array
		byte [] bytes=s.getBytes();
		int head=0,tail=s.length()-1;
		//Reverse the string
		while(head<tail)
		{
			byte temp=bytes[head];
			bytes[head]=bytes[tail];
			bytes[tail]=temp;
			head++;
			tail--;
		}
	 return new String(bytes);
	}
}
