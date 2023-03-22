import java.util.Scanner;
class que5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number. ");
		int n = sc.nextInt();
		if(n>0){
			System.out.print("Number is positive.");
		}
		else if(n==0){
			System.out.print("Number is neutral.");
		}
		else{
			System.out.print("Number is Negative.");	
		}
	}
}