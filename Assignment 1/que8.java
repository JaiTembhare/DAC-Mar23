//Q8.Write a Java Program to print the digits of a Given Number.  
import java.util.Scanner;
class que8{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		int store=0;
		do{
			int i=1;
			i= a%10;
			store =store*10+i;
			//System.out.println(i);
			a=a/10;
		}while(a!=0);
		do{
			int i=1;
			i= store%10;
			System.out.print(i+" ");
			store=store/10;
		}while(store!=0);
		
			
		
	}
}