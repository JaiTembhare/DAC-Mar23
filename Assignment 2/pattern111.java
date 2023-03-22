class pattern111{
	public static void main(String args[]){
		int a=5;
		for(int i=a;i>=1;i--){
			for(int k=1;k<=i;k++){
				System.out.print(" ");
			}
			for(int j=a;j>=i;j--){
					System.out.print("* ");
				}
			System.out.println();
		}
	}
}