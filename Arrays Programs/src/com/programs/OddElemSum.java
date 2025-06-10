package com.programs;

import java.util.Scanner;

public class OddElemSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		OddsumElem(ar,n);
	}
	static void OddsumElem(int ar[],int n)
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==1)
			{
				sum+=ar[i];
			}
		}
		System.out.println(sum);
	}

	}

