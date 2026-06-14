package arrayrecap;


import java.util.Scanner;

public class Reversearray {

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
	
		//main logic
		int i=0;
		int j=n-1;
	
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		for (int k=0;k<n;k++) {
			System.out.println(arr[k]+" ");
		}
	}

}
