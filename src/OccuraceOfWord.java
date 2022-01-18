import java.util.LinkedHashSet;

public class OccuraceOfWord {

	public static void main(String[] args) {
		String s = "Welcome to Tyss and to banglaore";
		String[] str=s.split(" ");
		//step 1:create any set collection and add all the word of given string into set
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		System.out.println(set);
		
		for(String ch : set) {
			int count=0;
			//step 2:compare each character of set with all the character of given string
			for(int i=0;i<str.length;i++)
			{
				if(ch.equals(str[i]))
				{
			//step 3:if character mathes increase the count		
					count++;
					
				}
			}
			//step 4:print character of both set and count
			//if(count==1)
			{
			System.out.println(ch +" "+ count);
			}
		}

	}
	


	}


