package seleniumbasicsay2;

public class PrimeNumbers {

	public static void main(String[] args) {


		int i, j, temp = 150;
		System.out.println("Prime number between 1 to 300 are :" );
		for (i = 2; i <= temp; i++) {
		for (j = 2; j < i; j++) {
		if (i != j) {
		if (i % j != 0)
		continue;
		else
		break;
		}
		}
		if (i == j)
		System.out.print(i + ",");
		}
	
	
	
	
	
	}

}
