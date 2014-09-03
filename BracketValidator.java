import java.util.*;

class BracketValidator 
{
	public boolean validate(String bracketString)
	{
		Stack<Character> openBrackets = new Stack<Character>();
		for(int i = 0; i < bracketString.length(); i++)
		{
			char c = bracketString.charAt(i);
			if(c == '(' || c == '{' || c == '[')
			{
				openBrackets.push(c);
			}
			else 
			{
				char peek = openBrackets.peek();
				if((c == ')' && peek == '(') || (c == '}' && peek == '{') ||
				(c == ']' && peek == '['))
				{
					openBrackets.pop();
				}
				else
				{
					return false;
				}
			}
		}
		
		return openBrackets.empty();
	}	
}