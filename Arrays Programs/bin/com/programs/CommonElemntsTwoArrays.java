package com.normal.programs;

import java.util.Scanner;

public class CommonBothElem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar1 [] = new int [n];
		for(int i=0;i<ar1.length;i++)
		{
			ar1[i]=scan.nextInt();
		}
		int m = scan.nextInt();
		int ar2 [] = new int[m];
		for(int j=0;j<ar2.length;j++)
		{
			ar2[j]=scan.nextInt();
		}
		CommonElements(ar1,ar2);
	}
	static void CommonElements(int ar1 [], int ar2 [])
	{
		int i=0,j=0; // For Two Arrays ar1 and ar2
		while(i<ar1.length && j<ar2.length)  // Upto As Long as Condtion will True
		{
			if(ar1[i]==ar2[j])               // Values Are Equal
			{
				System.out.println(ar1[i]+" ");
				i++;                             // ar1[i] value Moves to Next Element
				j++;                              // ar2[j] value Moves to Next Element

			} 
			else if(ar1[i]>ar2[j])       
			{
				j++;              // ar2[j] value Moves
			}
			else {
				i++;            // ar1[i] value Moves
			}
		}
	}

}
