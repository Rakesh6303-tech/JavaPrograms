package com.programs;

import java.util.Scanner;

public class EvenElemSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		EvensumElem(ar,n);
	}
	static void EvensumElem(int ar[],int n)
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				sum+=ar[i];
			}
		}
		System.out.println(sum);
	}

}
