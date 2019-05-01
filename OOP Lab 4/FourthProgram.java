class FourthProgram{
	public static void main(String[] args) 
	{
		int x[][]={{1,2,3},{4,5,6},{7,8,9}};
		int y[][]={{9,8,7},{6,5,4},{3,2,1}};
		for(int i=0; i<x.length; i++){
			for(int j=0; j<y.length; j++){
				System.out.print(x[i][j]+y[i][j]+" ");
			}
			System.out.println();
		}
	}
}