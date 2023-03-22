//. Write a Java Program to find the GCD of two given numbers. 
import java.util.Scanner;
class que14{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int gcd=1;
		for(int i=1;i<=a&&i<=b;i++){
			if(a%i==0&&b%i==0){
				gcd=i;
			
			}
		}
		System.out.println("Gratest common diviser is "+gcd);
	}
}	