package ProgramsOnArray;

public class PrintStringOfMaximumLength {

	public static void main(String[] args) {
		String[] str = {"abc","hi","mango","j","tyss"};
		String max=str[0];
		for(int i=1;i<str.length;i++)
		{
			if(max.length()<str[i].length())
			{
				max=str[i];
			}
		}
		System.out.print(max);
//		for(int i=0;i<str.length;i++)
//		{
//			if(max.length()==str[i].length())
//			{
//				System.out.print(str[i]);
//			}
//		}
		

	}

}
