class pattern19{
	public static void main(String args[]){
		int a=65;
		for(int i=a;i<=69;i++){
			for(int k=69;k>=i;k--){
				System.out.print(" ");
			}
			for(int j=a;j<=i;j++){
					System.out.print((char)j+" ");
				}
			System.out.println();
		}
	}
}