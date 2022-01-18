import java.util.LinkedHashSet;

public class FindThePositionOfCharacterInGivenString {

	public static void main(String[] args) {
		String str = "Tester";
		String s = str.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		System.out.println(set);
		
		for(Character ch : set) {
			int count=0;
			//step 2:compare each character of set with all the character of given string
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
			//step 3:if character mathes increase the count		
					System.out.println(ch+" "+(i+1));
					break;
					
				}
			}

	}

}
}
