package BasicPrograms;

public class Prime {

	public static void main(String[] args) {
		int i,number=1,count;
		while(number<=50)
		{
			count=0;
			i=1;
			while(i<=number)
			{
				if(number%i==0)
				{
					count++;
				}
				i++;
			}
			if(count==2)
			{
				System.out.print(number+" ");
			}
			number++;
		}
		

	}

}
