//Q9.Write a Java Program to print all the Factors of the Given number.  
import java.util.Scanner;
class que9{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		for(int i=1;i<=n/2;i++){
			if(n%i==0){
				System.out.println(i);
			}
		}
	}
}