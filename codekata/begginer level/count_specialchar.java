

import java.io.*;
import java.util.*;
class count_specialchar{
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int i,count=0;
	String s="";
	s+=sc.nextLine();
int l=s.length();
for(i=0;i<l;i++)
{
	if(s.charAt(i)>='A'&&s.charAt(i)<='Z'||s.charAt(i)>='a'&&s.charAt(i)<='z')
	{
	    continue;
	}
	else
	{
	    count++;
	}
	
    
}
	
	System.out.print(count);
	}
}
