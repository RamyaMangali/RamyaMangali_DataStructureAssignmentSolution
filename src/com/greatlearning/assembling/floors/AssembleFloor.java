package com.greatlearning.assembling.floors;

import java.util.Scanner;

public class AssembleFloor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number floors in the building : ");
		int n = sc.nextInt();
		int a[] = new int[n + 1];
		for (int i = 1; i < n + 1; i++) {
			System.out.println("Enter the floor size given on day : " + i);
			int m = sc.nextInt();
			a[m] = i;
		}
		
		System.out.println();
		
		int j = n;
		boolean flag;
		System.out.println("The order of construction is as follows ");
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			flag = false;
			System.out.println("\nDay " + i + " :");
			while (j >= 1 && a[j] <= i) {
				flag = true;
				System.out.print(j + " ");
				j--;
			}
			if (flag == true) {
				System.out.println();
			}
		}
      
		sc.close();
		
	}

}
