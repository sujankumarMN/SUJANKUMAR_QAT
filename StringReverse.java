import java.io.*;
import java.util.*;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<>();
		try
		{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of elements of a String:");
		int n=sc.nextInt();
		System.out.println("Enter string elements:");
		for(int i=0;i<n;i++)
		{
			list.add(sc.next());
			
		}
		System.out.println("Reversed String=");
		for(int i=list.size()-1;i>=0;i--)
		{
			System.out.print(list.get(i)+" ");
		}
		}
		catch(InputMismatchException e)
		{
			e.printStackTrace();
			System.out.println("wrong input");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("out of bound");
		}
		

	}

}
