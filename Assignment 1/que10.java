//Q10.Write a Java Program to find the sum of the digits of a given number  
import java.util.Scanner;
class que10{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int store = 0, sum=0;
		do{
			int i=1;
			i= n%10;
			sum+=i;
			store =store*10+i;

			//System.out.println(i);
			n=n/10;
		}while(n!=0);
		System.out.println(sum);
	}
}