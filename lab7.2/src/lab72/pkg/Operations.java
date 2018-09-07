package lab72.pkg;

import java.util.ArrayList;

public class Operations {
	public ArrayList<String> functions(String s1, String s2)
	{
		ArrayList<String> a1=new ArrayList<String>();
		
		//add string in alternative positions
		int n=s1.length();
		String[] ch=new String[n];
		String[] part=new String[n];
		String f="";
		for(int i=0;i<n;i++)
		{
			if(i%2!=0)
			{
				ch[i]=s2;
			}
			else
			{
				ch[i]=""+s1.charAt(i);
			}
				f=f+ch[i];
				part[i]=ch[i];
			
		}
			System.out.println("added string:" +f);
			a1.add(f);
		
		
		//reversing the last occurrence
		int c=0;
		int count=0;
		c=n-1;
		String reversed="";
		for(int i=0;i<n;i++)
		{
			if(ch[i].equals(s2))
				count++;
		}
		if(count>1)
		{
			Operations o1=new Operations();
			String rev=o1.reverse(s2);
			for(int i=0;i<n;i++)
			{
				if(ch[i].equals(s2) && (c==1))
				{
					ch[i]=rev;
				}else
				{
					c--;
					reversed+=ch[i];
				}
			}
				a1.add(reversed);
			
		}
		else
		{
			a1.add(s1.concat(s2));
		}
		System.out.println("reversed :" +reversed);
		
		//delete the first occurrence
		int count1=0;
		String s="";
		for(int i=0;i<n;i++)
		{
			if(ch[i].equals(s2))
				count1++;
		}
		if(count1>1)
		{
			for(int i=0;i<n;i++)
			{
				if(ch[i].equals(s2) && (count1==(n/2-1)))
				{
					ch[i]="";
					count1--;
					}
				s+=ch[i];
			
		}
			a1.add(s);
			
		
	}
		else
			a1.add(s1);
		System.out.println("deleted: "+s);
		
		//Divide s2 and add to s1
		int k=s2.length();
		String p1=s2.substring(0,(k/2));
		String p2=s2.substring(k/2,k);
		String p=p1+s1+p2;
		System.out.println("divided and added:" +p);
		a1.add(p);
		
		//replace with *
		
		String d="";
		for(int i=0;i<n;i++)
		{
			if(part[i].contains(s2))
			{
				part[i]="*";
			}
			d+=part[i];
		}
		System.out.println("replaced:" +d);
		a1.add(d);
		return a1;

}
	public String reverse(String s)
	{
		char[] c=s.toCharArray();
		int n=s.length();
		char temp;
		String s1="";
		for(int i=0;i<n/2;i++)
		{
			temp=c[i];
			c[i]=c[n-i-1];
			c[n-i-1]=temp;
		}
		for(int j=0;j<n;j++)
		{
			s1+=c[j];
		}
		return s1;
	}
}
