import java.util.*;
public class reverse
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence:");
        String a=sc.nextLine();
		String w[]=a.split(" ");
		System.out.println("After reversing:");
		for(int i=w.length-1;i>=0;i--)
		{
			System.out.print(w[i]+" ");
		}
    }
}