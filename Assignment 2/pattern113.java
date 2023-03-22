class pattern113{
	public static void main(String args[]){
		int a=69;
		for(int i=65;i<=a;i++){
			for(int k=a;k>=i;k--){
				System.out.print(" ");
			}
			for(int j=65;j<=i;j++){
					System.out.print((char)i+" ");
				}
			System.out.println();
		}
	}
}