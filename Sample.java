package com.vikram;
import java.util.*;

public class Sample {
	public static int primeNumber(int n)
	{
	   if (n == 0 || n == 1)
	       return 0;
	   else if (n == 2)
	       return 1;
	   else if (n % 2 == 0)
	       return 0;
	   else
	   {
	       for (int i = 3; i < n; i += 2)
	       {
	           if (n % i == 0)
	               return 0;
	       }
	       return 1;
	   }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(primeNumber(n)==1)
			System.out.println("yes");
		else {
			System.out.println("no");
		}
		

	}

}
