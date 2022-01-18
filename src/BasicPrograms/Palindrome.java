package BasicPrograms;

public class Palindrome {

	public static void main(String[] args) {
		int num=141,rev=0,temp=num;
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(rev==temp)
		{
			System.out.println(temp +"number is palindrome");	}
		else
		{
			System.out.println(temp + "number is not palindrome");
		}

	}

}
