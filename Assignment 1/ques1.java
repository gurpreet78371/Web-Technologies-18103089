import java.util.*;
public class Ques_first
{
	public static void main(String[] args)
	{

		int[] a= new int[26];
		int[] b = new int[26];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:-");
		String nc = sc.nextLine();
		int sp = nc.length();
		String spl[]=nc.split("\\ ");
		System.out.println("Enter a sub string u want to search:-");
		String nb = sc.nextLine();
		int n2 = nb.length();
		char[] c =new  char[n2];
        int count=0;
		
		for(int i=0;i<n2;i++)
		{
			  a[(int)nb.charAt(i)- 'a']++;
		}
		for(int r=0;r<spl.length;r++)
		{
			String na=spl[r];
			int n1 = na.length();
			int s=0;
		
		for(int i=0;i<n1-n2+1;i++)
		{
			int p=s;
			for(int j=0;j<n2;j++)
			{
				c[j]= na.charAt(p);
				p++;
			}
			
			for(int k=0;k<n2;k++)
			{
				b[(int)c[k]- 'a']++;
			}
			int check=0;
			for(int l=0;l<26;l++)
			{
				if(b[l]!=a[l])
				{
					check++;
					break;
				}
			}
			if(check==0)
			{
				count++;
			}
			s++;
			for(int ds=0;ds<26;ds++)
			{
			 b[ds]=0;
			}
			}
		}
		System.out.println("No of times this sub-string appeared in given string");
		System.out.println(count);
}
}