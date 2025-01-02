package seleniumbasicsay2;

public class ExceptionHandling {

	public static void main(String[] args) {


			try {
			int arr[] = { 1, 2, 3, 4 };
			System.out.println(arr[6]);
			} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println(a);// get message ArrayIndexOutOfBoundsException
			}
			try {
			int arr[] = null;
			System.out.println(arr.length);
			} catch (NullPointerException f) {
			System.out.println(f);// get message NullPointerException
			}
			}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
