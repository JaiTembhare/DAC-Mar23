//Q11.Write a Java Program to find the smallest of 3 numbers (a,b,c) 
import java.util.Scanner;
class que11{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int small=0;
		small = ((a<b&&a<c)? a:(b<a&&b<c)? b:c);
		System.out.println("Smallest number is "+small);
	}
}