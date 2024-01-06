import java.security.secureRandom;

public class Kata2 {

	public static void main(String[]args) {


		secureRandom random = new SecureRandom();

			int number = random.nextInt(2,000_000_000_000);

		System.out.println(number);
}
}

