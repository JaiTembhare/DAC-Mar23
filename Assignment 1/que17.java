//Q.Check whether the Given Number is a Palindrome or NOT. 
import java.util.Scanner;
class que17{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int m=n;
		int rev=0,r;
		do{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}while(n!=0);
		if(m==rev){
			System.out.println("Number is  paleandrome.");
		}else{
			System.out.println("Number is not paleandrome.");
		}
		
	}
}	