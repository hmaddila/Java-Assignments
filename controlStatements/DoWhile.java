package controlStatements;

import java.util.Scanner;

public class DoWhile 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i=0;
		int count;
		System.out.println("Enter the number of even num: "); 
		Scanner sc=new Scanner(System.in);
		count= sc.nextInt();
		System.out.println("First " +count+" even numbers \n");    
		do 
		{    
		System.out.println(i);    
		i = i + 2;    
		}
		while(i<=count);		
		}    
		
	}
