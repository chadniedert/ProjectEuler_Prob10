// Link: https://projecteuler.net/problem=10

class Main {
	public static void main(String[] args) {
		System.out.println(isPrime(5));
		System.out.println(isPrime(25));
	}

	public static boolean isPrime(int num)
	{
		for (int i = 2; i < num; i++)
		{
			if (num % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}