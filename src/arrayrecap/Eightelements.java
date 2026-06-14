package arrayrecap;
import java.util.Scanner;
public class Eightelements {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		//main logic
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		System.out.println(sum);	
		}
		sc.close();
	}
}
// length is 8
//2
//2
//2
//2
//2
//2
//2
//2
//sum of one by one element
//2
//4
//6
//8
//10
//12
//14
//total sum is i6
//16
