package smart_engineer;
import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
		int number, sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter any integer Value below 10: ");
		number = sc.nextInt();
		
		while (number <= 10) {
			sum = sum + number;
			number++;
		}
		System.out.format("Sum of the Numbers from the While Loop is: %d ", sum);

	}

}
