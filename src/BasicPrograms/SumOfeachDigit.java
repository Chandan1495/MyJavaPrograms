package BasicPrograms;

public class SumOfeachDigit {

	public static void main(String[] args) {
		int num=147,sum=0,rem;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.print(sum);

	}

}
