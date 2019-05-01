class FifthProgram{
	public static void main(String[] args) 
	{
		int arr[]={8,5,0,3,9};
		int max=arr[0];
		for(int i=0; i<arr.length; i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.print("Largest Number is: "+max);
	}
}