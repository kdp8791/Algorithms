import java.util.*;

class Anagrams 
{
	public boolean isValid(String word, String secondWord)
	{
		if(word.length() != secondWord.length())
		{
			return false;
		}
		else 
		{
			char[] wordAry = word.toCharArray();
			char[] secondWordAry = secondWord.toCharArray();
			// O(N LOG N)
			Arrays.sort(wordAry);
			// O(M LOG M)
			Arrays.sort(secondWordAry);
			// O(N)
			for(int i = 0; i < wordAry.length; i++)
			{
				if(wordAry[i] != secondWordAry[i])
				{
					return false;
				}
			}
		}
		
		return true;
	}	
}