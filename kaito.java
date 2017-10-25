import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class kaito{

	public static void main (String [] args){

		Scanner input = new Scanner(System.in);
		int[] numbers = {22, 44, 11};

		printSortedArray(numbers);

	}

	public static boolean verifyPassword(String password, String checkPassword){

		if (password.equals(checkPassword) && password.length() > 10){
			return true;
				
		} else if (password.length() < 10){
			return false;
			
		} else if (!password.equals(checkPassword)){
			return false;
		 } else {
			return false;
		}

		/* Put this code in main method
		if(verifyPassword(password, checkPassword) == true){
			System.out.println("Password accepted");
		} else {
			System.out.println("Password not valid");
		} */

	}

	public static boolean verifyEmail(String email){

		if (email.contains("@") && email.contains(".") && (email.length() >= 9)){
			return true;
		} else {
			return false;
		}

		/* put this code in main method
		 if ((verifyEmail(email)) == true){
                          System.out.println("Email okay");
                  } else {
                          System.out.println("Email not okay");
                  } */


	}	

	public static  int generateRandom(int min, int max){

		Random rand = new Random();

		int  number = rand.nextInt(max) + min;

		return number;

	}

	public static void printSortedArray(int[] numbers){
 
                 Arrays.sort(numbers);
 
                 for(int i = 0; i < numbers.length; i++){
                         System.out.println(numbers[i]);
                 }

	}
}
