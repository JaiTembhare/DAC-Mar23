import java.util.Scanner;
class que4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter tow number. ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Number before swap are "+a+" & "+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("Number after swap are "+a+" & "+b);
	}
}