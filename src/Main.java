import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
	public static void main(String[] args) {
		String name;

		System.out.printf("Enter your name: ");
		Scanner leer = new Scanner(System.in);

		name = leer.nextLine();

		for (int i = 0; i <= 15; i++) {

			System.out.println("Hello, I am " + name + " , I am printing the number " + i);

			try {
				int segundos = time();
				System.out.println("Waiting for " + segundos + " seconds");
				Thread.sleep(segundos * 1000); // Sleep for waitTimeInSeconds seconds (converted to milliseconds)
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}


	}
	public static int time () {
		Random random = new Random();
		int timeSeconds = random.nextInt(5) + 1;
		return timeSeconds;

	}
}


