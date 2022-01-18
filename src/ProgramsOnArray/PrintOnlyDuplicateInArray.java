package ProgramsOnArray;

import java.util.LinkedHashSet;

public class PrintOnlyDuplicateInArray {

	public static void main(String[] args) {
	 int a[]= {1,3,5,1,6,3,7};
		//step 1:create any set collection and add all the character of given string into set
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		System.out.println(set);
		
		for(Integer n : set) {
			int count=0;
			//step 2:compare each character of set with all the character of given string
			for(int i=0;i<a.length;i++)
			{
				if(n==a[i])
				{
			//step 3:if character mathes increase the count		
					count++;
					
				}
			}
			//step 4:print character of both set and count
			if(count>1)
			{
			System.out.println(n +" "+ count);
			
			}
		}

	}

	}


