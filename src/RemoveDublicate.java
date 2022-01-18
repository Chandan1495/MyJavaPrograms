import java.util.LinkedHashSet;

public class RemoveDublicate {

	public static void main(String[] args) {
		String s = "chandan";
		//step 1:create any set collection and add all the character of given string into set
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		
		for(Character ch:set) {
			System.out.print(ch);
			
		}

	}

}
