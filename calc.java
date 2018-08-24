import java.util.Scanner;

public class calc{

	public static void manin(String [] args){
	
		int num1, num2; //creating variables
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter numerber 1: ");
		num1 = input.nextInt();
		System.out.println("Enter number 2 :");
		num2 = input.nextInt();
		//adding num1 to num2
		System.out.println(" Answer is :"+(num1 + num2));		 
	}
}//close class
