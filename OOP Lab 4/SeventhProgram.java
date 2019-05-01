class SeventhProgram
{
	public static void bubbleSort(int A[],int N)
	{
		int round,i,temp;
		for(round=1;round<=N-1;round++){
			for(i=0; i<=(N-1)-round;i++){
				if(A[i]>A[i+1]){
					temp=A[i];
					A[i]=A[i+1];
					A[i+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		int arr[]={7,6,9,8};
		int i;
		System.out.print("Array Before Sorting: ");
		for(i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		bubbleSort(arr,5);
		System.out.println();
		System.out.print("Array after sorting: ");
		for(i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
}