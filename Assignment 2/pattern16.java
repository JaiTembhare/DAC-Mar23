class pattern16{
	public static void main(String args[]){
		int a=5;
		for(int i=1;i<=a;i++){
			for(int k=a;k>=i;k--){
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++){
					System.out.print("* ");
				}
			System.out.println();
		}
	}
}