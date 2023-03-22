//. . Write a java program to LCM of TWO given numbers using the Prime Factors method. 
import java.util.Scanner;
class que16{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int lcm,gcd=1;
		for(int i=1;i<=n1&&i<=n2;i++){
			if(n1%i==0&&n2%i==0){
				gcd=i;
			}
		}
		lcm=(n1*n2)/gcd;
		System.out.println("LCM using prime factor is "+lcm);
		
	}
}	