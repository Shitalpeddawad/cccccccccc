package Program;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicate
{

	public static void main(String[] args)
	{
     String a="javaeuiouio";
     String ab="";
     String abc="";
     int count=0;
     
   char[] b= a.toCharArray();
   
  LinkedHashSet set=new LinkedHashSet();
  
  for(int i=0;i<b.length;i++)
  {
	  if(set.add(b[i]))
	  {
		  ab=ab+b[i];
	  }
	  else
	  {
		  abc=abc+b[i];
		  count++;
	  }
  }
  
  System.out.println(abc);
  System.out.println(count);
  
 char[] c= abc.toCharArray();
 Arrays.sort(c);
 System.out.println(Arrays.toString(c));
	}
}

  