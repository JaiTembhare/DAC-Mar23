import java.util.Scanner;
class que13{
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
		System.out.println(store);
	}
}	