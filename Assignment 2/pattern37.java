class pattern18{
	public static void main(String args[]){
		int a=5;
		for(int i=a;i>=1;i--){
			for(int k=a;k>=i;k--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
					System.out.print(i+" ");
				}
			System.out.println();
		}
	}
}