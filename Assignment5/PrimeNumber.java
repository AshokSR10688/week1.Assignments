package week1.Assignment5;

public class PrimeNumber {
	private static boolean flag(int Ip_No) {
		if (Ip_No <= 1) {
			return false;
		}

		for (int i = 2; i <= (Ip_No / 2); i++) {
			if (Ip_No % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int inputNumber = 13;
		if (flag(inputNumber)) {
			System.out.println("Prime");
		} else {
			System.out.println("Not a Prime");
		}
	}

}


