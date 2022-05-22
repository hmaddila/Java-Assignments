package controlStatements;

import java.util.*;
public class Continue
{  
    public static void main(String[] args) 
    {  
	    int j=0;
        do
	    {
	       if (j==5)
	       {
		      j++;
		      continue;
	       }
	       System.out.print(j+ " ");
	       j++;
           }while(j<10);
    }  
}  
