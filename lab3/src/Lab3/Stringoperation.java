package Lab3;

public class Stringoperation {
	String name;
	int choice;
	
	public static void main(String[] args) {
		operation("niki",3);
	}
	
	
	
	
	public static void operation(String name,int choice)
	{
		switch(choice)
		{
		case 1:
			addstring(name);
			break;
		case 2:
			oddposition(name);
			break;
		case 3:
			removeduplicate(name);
			break;
		case 4:
			uppercase(name);
			break;
		
		}
	}
	public static void addstring(String name)
	{
		
		System.out.println(name+name);
	}
	public static void oddposition(String name)
	{
		
		char[] ch=name.toCharArray();
		for(int i=0;i<name.length();i++)
		{
		if(i%2==0)
			ch[i]='#';
		}
         System.out.println(ch);
	}
	public static void removeduplicate(String name)
	{
		char[] ch=name.toCharArray();
		int len=name.length();
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(ch[i]==ch[j])
				{
					int temp=j;
					for(int k=temp;k<len-1;k++)
					{
						ch[k]=ch[k+1];
					}
					j--;
					len--;
				}
			}
		}
		for(int p=0;p<len;p++)
			System.out.println(ch[p]);
		
	}
	public static void uppercase(String name)
	{
		char[] ch=name.toCharArray();
		int len=name.length();
		for(int i=0;i<len;i++)
		{
			if(i%2==0)
			{
				ch[i]=Character.toUpperCase(ch[i]);
			}
		}
		System.out.println(ch);
		
	}
	

}
