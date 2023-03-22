//. Write a Java Program to find the LCM of two given numbers. 
import java.util.Scanner;
class que15{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int lcm=(n1>n2?n1:n2);
		while(true){
			if(lcm%n1==0&&lcm%n2==0){
			System.out.println("lowest common multiple is "+lcm);
			break;
			}
			++lcm;
		}	
	}
}	