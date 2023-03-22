//Q.Write a Java Program to print all the Prime Factors of the Given Number 
import java.util.Scanner;
class que18{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		for(int i=2;i<n;i++){
			if(n%i==0){
				System.out.println(i);
				n=n/i;
	
			}
		}
		if(n>2){
			System.out.println(n);
		}	
	}	
	
}	