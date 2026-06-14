package arrayrecap;

import java.util.Scanner;

public class Maxlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size : ");
	
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("------------------------");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
			max=arr[i];
		}
	}
		System.out.println(max);

	}

}
