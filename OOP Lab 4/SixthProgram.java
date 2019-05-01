import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class SixthProgram{
	public static void main(String[] args) throws IOException {
		boolean isPresent=false;
		Integer index=null;
		int arr[]={6,7,9,3,1};
		System.out.print("Enter an Element: ");
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		String input=buf.readLine();
		Integer num=Integer.valueOf(input);
		for(int a=0;a<arr.length;a++){
			if(arr[a]==num){
				isPresent=true;
				index=a;
			}}
			if(isPresent==true){
				System.out.print("Element is at Index of: "+index);
			}else{
				System.out.print("Element not Found");
			}
		
	}
}