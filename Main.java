// Link: https://projecteuler.net/problem=10

class Main {
	public static void main(String[] args) {
		int sum = 2;

		for (int i = 3; i < 10; i++)
		{
			if (isPrime(i))
			{
				sum += i;
			}
		}

		System.out.println(sum);
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