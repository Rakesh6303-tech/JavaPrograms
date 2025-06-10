package com.programs;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		System.out.println(SecondLargest(ar));
	}
	static int SecondLargest(int ar [])
	{
		int largest = 0;
		int secondLargest = 0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>largest)
			{
				secondLargest = largest;
				largest = ar[i];
			}
			else if(ar[i]>secondLargest && ar[i]!=largest)
			{
				secondLargest = ar[i];
			}
		}
		return secondLargest;
	}

}
