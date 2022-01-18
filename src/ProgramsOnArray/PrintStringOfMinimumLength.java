package ProgramsOnArray;

public class PrintStringOfMinimumLength {

	public static void main(String[] args) {
		String[] str = {"abc","hi","mango","j","tyss"};
		String min=str[0];
		for(int i=1;i<str.length;i++)
		{
			if(min.length()>str[i].length())
			{
				min=str[i];
			}
		}
		System.out.print(min);
//		for(int i=0;i<str.length;i++)
//		{
//			if(min.length()==str[i].length())
//			{
//				System.out.print(str[i]);
//			}
//		}
		

	}


	}


