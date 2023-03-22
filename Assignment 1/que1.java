import java.util.Scanner;
class que1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number. ");
		int n = sc.nextInt();
		if(n%2==0){
			System.out.println("Number is Even.");
		}else{
			System.out.println("Number is Odd");
		}
	}
}