import java.util.*;
class Ly
{
	public static void main(String args[])
	{

		int i=0,cw=0;
		String name,nl="";
		System.out.println("enter the name");
		Scanner sc=new Scanner(System.in);
		name =sc.nextLine();
		int l=name.length();
		for(i=0;i<l;i++)
		{
			if(name.charAt(i)==' ')
			{
				nl=nl+"ly";
				cw++;
			}
			nl=nl+name.charAt(i);
		}
		nl=nl+"ly";
		cw++;
		System.out.println(nl);
		System.out.println("No of Words"+" "+cw);
	}
}

		
		