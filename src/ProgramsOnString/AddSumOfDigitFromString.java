package ProgramsOnString;

public class AddSumOfDigitFromString {

	public static void main(String[] args) {
		int sum=0;
		String s="@1$b25";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=48 && s.charAt(i)<=57)
			{
				int n = s.charAt(i)-48;
				sum=sum+n;
			}
		}
		System.out.println("sum is"+sum);

	}

}
